package com.neworin.threadvsrunnable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

class DaemonThreadDemo implements Runnable {
	@Override
	public void run() {
		System.out.println("进入守护线程" + Thread.currentThread().getName());
		writeToFile();
		System.out.println("退出守护线程" + Thread.currentThread().getName());
	}

	private void writeToFile() {
		File fileName = new File("d:" + File.separator + "daemon.txt");
		try {
			OutputStream oStream = new FileOutputStream(fileName, true);
			int count = 0;
			while (count < 999) {
				oStream.write(("\r\nword" + count).getBytes());
				System.out.println("守护线程" + Thread.currentThread().getName() + "向文件中写入了word" + count++);
				Thread.sleep(1000);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class DaemonThread {

	public static void main(String[] args) {
		System.out.println("进入主线程" + Thread.currentThread().getName());
		DaemonThreadDemo daemonThreadDemo = new DaemonThreadDemo();
		Thread thread = new Thread(daemonThreadDemo);
		thread.setDaemon(true);
		thread.start();

		// sc.next() 会监听输入，执行时都会造成堵塞,等待用户在命令行输入数据，回车确认后解除阻塞
		Scanner scanner = new Scanner(System.in);
		scanner.next();

		System.out.println("退出守护线程" + Thread.currentThread().getName());
	}

}

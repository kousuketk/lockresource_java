package Semaphore;

import java.util.concurrent.Semaphore;

public class Semaphores {

  static int smphNum = 4;
  static Semaphore semaphore = new Semaphore(smphNum);

  static class atmThread extends Thread {
    String name = "";

    atmThread(String name) {
      this.name = name;
    }

    public void run() {
      try {
        System.out.println(name + ":acquiring lock...");
        System.out.println(name + ":available Semaphore permits now:" + semaphore.availablePermits());
        semaphore.acquire();
        System.out.println(name + ":got the permit!");

        try {
          for(int i = 0; i < smphNum; i++) {
            System.out.println(name + ":is performing operation" + i + ", available Semaphore permits:" + semaphore.availablePermits());
            Thread.sleep(1000);
          }
        } finally {
          System.out.println(name + ":releasing lock...");
          semaphore.release();
          System.out.println(name + ":available Semaphore permits now:" + semaphore.availablePermits());
        }
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

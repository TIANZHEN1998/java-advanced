package com.soft1841.thread.TICKET;

/**售票线程2
 * 实现runnable类接口的方法实现    缺陷：数据可以共享，线程部同步
 * Created by 田震 on 2019/4/9 8:21
 */
public class TicketThreadTest2 {
    public static void main (String[] args) {
        TicketThread2 tt=new TicketThread2();
        Thread thread1=new Thread(tt);
        thread1.start();
        Thread thread2=new Thread(tt);
        thread2.start();
        Thread thread3=new Thread(tt);
        thread3.start();

    }
}
class  TicketThread2 implements Runnable{
  private int tickets=10;

    @Override
    public void run () {
        while (tickets>0){
            System.out.println(Thread.currentThread().getName()+"已开通售票通道，当前票数为： "+ --tickets);
        }
    }
}

class MyThread implements Runnable{
        public void run(){
        for(int i=1;i<=3;i++){
        System.out.println("I am New Thread"+ i);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
          
            e.printStackTrace();
        }
    }}}
public class RunnableDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread obj1=new MyThread();
        Thread t1=new Thread(obj1);
        t1.start();
        Thread t2=new Thread(new MyThread());
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }        
    }
 
}

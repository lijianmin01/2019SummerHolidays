public class 线程的创建 {
     public static void main(String[] a){
         System.out.println("Hello World~");
     }
     //通过继承Thread类创建线程
//    class MyThread extends Thread{
//         public void run(){
//             for(int i=0;i<100;i++){
//                 System.out.println(""+i);
//             }
//         }
//     }

}
/*Java中的线程
* 进程：一个程序的执行
* 线程：程序中单个顺序的流程制称为线程
* 一个进程中可以有多个线程
*   在操作系统中可以查看线程数
*   如：在Windows中，在任务管理器，右键，选择列，选中“线程数”
* 一个进程中的多个线程
*   分享CPU（并发的或者以时间片的方式）
*   共享内存（如多个线程访问同一对象）
*
* -线程体——————run()方法来实现的
* -线程启动后，系统就自动调用run()方法
* -通常，run()方法执行一个时间较长的操作
*   如一个循环
*   显示一系列的图片
*   下载一个文件
* */

package Thread;

public class Application {

    public static void main(String[] args) {

        //Create a runnable object
        Printer printer=new Printer();
        //Create thread object
        Thread thread=new Thread(printer);

        //Make the thread a daemon thread
        thread.setDaemon(true);
        //Start Thread
        thread.start();

        for (int i = 0; i <100 ; i++) {
            System.out.println("Main Thread " + i);

        }

    }

}

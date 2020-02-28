
// concurrency(two or more parts run at same time) is built into Java, very robust and simple
// The basic building block of concurrency is a thread
// A Multithreaded program contains two or more parts that can run concurrently
// Multithreading is a specialized form of multitasking

// Sandbox code from brother Tuckett

import java.util.Random;

//taking a regular class and making it a thread, by having it implement the runnable interface
//using the runnable makes any class a thread...DoingSomething really becomes a thread with this implementation
public class DoingSomething implements Runnable {

    private String name;
    private int number;
    private int sleep;
    private int rand;

    //constructor (a block of code similar to a method that's called when an instance of an object is created
    public DoingSomething(String name, int number, int sleep) {

        this.name = name;
        this.number = number;
        this.sleep = sleep;

        //random number generator
        Random random = new Random();
        this.rand = random.nextInt(400);
    }

    public void run() {
        //   \n\n carriage return
        System.out.println("\n\nExecuting with these parameters: Name =" + name + " Number = "
                + number + " Sleep = " + sleep + " Rand Num = " + rand + "\n\n");
        for (int count = 1; count < rand; count++) {
            // if it's divisible print
            if (count % number == 0) {
                System.out.print(name + " is sleeping. ");
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
            }
        }
        // tell it when we are done
        System.out.println("\n\n" + name + " is done.\n\n");
    }
}


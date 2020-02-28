//Sandbox code from Brother Tuckett

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDoingSomething {

    public static void main(String[] args) {

        // use executor service and create a fixed thread pool of four
        ExecutorService myService = Executors.newFixedThreadPool(4);

        DoingSomething ds1 = new DoingSomething("Kelly", 5, 300);
        DoingSomething ds2 = new DoingSomething("Tommy", 4, 500);
        DoingSomething ds3 = new DoingSomething("Alysa", 3, 250);
        DoingSomething ds4 = new DoingSomething("Chloe", 2, 100);
        DoingSomething ds5 = new DoingSomething("Emma", 1, 50);

        // execute objects
        myService.execute(ds1);
        myService.execute(ds2);
        myService.execute(ds3);
        myService.execute(ds4);
        myService.execute(ds5);

        // at the end of the process we shut down
        myService.shutdown();
    }
}


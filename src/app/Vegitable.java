package app;

public class Vegitable implements Runnable{


    String[] varr;

    public Vegitable(String[] varr) {
        this.varr = varr;
    }

    @Override
    public void run() {




        System.out.println("It is info from thread two");
        for(String i:varr){
            System.out.println(i);
        }

    }
}

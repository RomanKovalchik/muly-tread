package app;

public class Fruit implements Runnable{

    String[] farr;

    public Fruit(String[] farr) {
        this.farr = farr;
    }

    @Override
    public void run() {

        for(String i:farr){
            System.out.println("This output from thread one");
            System.out.println(i);
        }

    }
}

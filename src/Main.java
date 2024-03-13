import app.Fruit;
import app.Vegitable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        String[] vaggy = {"Картошка", "Капуста", "Морковка", "Лук", "Брокколи"};
        String [] fru = {"Яблоки", "Груши", "Арбуз", "Сливы"};

        Vegitable v = new Vegitable(vaggy);

        Thread vtr = new Thread(v);
        vtr.start();
        Fruit f = new Fruit(fru);

        Thread ftr = new Thread(f);
        ftr.start();


    }
}
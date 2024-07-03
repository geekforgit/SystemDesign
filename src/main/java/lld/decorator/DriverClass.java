package lld.decorator;

public class DriverClass {
    public static void main(String[] args) {
        BasePizaa margheritaWithCheese = new CheeseTopping(new Margherita());
        System.out.println("MargheritaWithCheese Price: "+ margheritaWithCheese.cost());
        BasePizaa margheritaWithDoubleCheese = new CheeseTopping(new CheeseTopping(new Margherita()));
        System.out.println("margheritaWithDoubleCheese Price: "+ margheritaWithDoubleCheese.cost());
    }
}

package lld.decorator;

public class CheeseTopping extends Toppings{
    BasePizaa basePizaa;
    public CheeseTopping(BasePizaa basePizaa){
        this.basePizaa=basePizaa;

    }
    @Override
    int cost() {
        return basePizaa.cost()+50;
    }
}

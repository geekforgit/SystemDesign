package lld.decorator;

public class MushroomTopping extends Toppings{
    BasePizaa basePizaa;
    public MushroomTopping(BasePizaa basePizaa){
        this.basePizaa=basePizaa;
    }
    @Override
    int cost() {
        return basePizaa.cost()+100;
    }
}

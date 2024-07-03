package lld.observerpattern.observer;

import lld.observerpattern.observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
    StockObservable stockObservable;
    String userName;
    public MobileAlertObserver(StockObservable stockObservable,String userName){
        this.stockObservable=stockObservable;
        this.userName=userName;
    }
    @Override
    public void update() {
        sendMessage(userName);
    }

    private void sendMessage(String userName) {
        System.out.println("Message sent to :"+userName+" ,Current stock of iphone is: "+stockObservable.getStockCount());
    }
}

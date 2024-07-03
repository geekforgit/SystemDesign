package lld.observerpattern.observer;

import lld.observerpattern.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {
    StockObservable stockObservable;
    String email;
    public EmailAlertObserver(StockObservable stockObservable,String email){
        this.stockObservable=stockObservable;
        this.email=email;
    }
    @Override
    public void update() {
        sendMessage(email);
    }

    private void sendMessage(String email) {
        System.out.println("Email sent to :"+email+" ,Current stock of iphone is: "+stockObservable.getStockCount());
    }
}

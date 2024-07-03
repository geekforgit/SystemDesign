package lld.observerpattern;

import lld.observerpattern.observable.IphoneObservable;
import lld.observerpattern.observable.StockObservable;
import lld.observerpattern.observer.EmailAlertObserver;
import lld.observerpattern.observer.MobileAlertObserver;
import lld.observerpattern.observer.NotificationAlertObserver;

public class DriverClassObserverPattern {
    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneObservable();
        NotificationAlertObserver notificationAlertObserver1= new EmailAlertObserver(stockObservable,"gkjha@live.com");
        NotificationAlertObserver notificationAlertObserver2= new MobileAlertObserver(stockObservable,"jhag");

        stockObservable.addObserver(notificationAlertObserver1);
        stockObservable.addObserver(notificationAlertObserver2);

        stockObservable.setStockCount(10);
        stockObservable.setStockCount(100);
    }

}

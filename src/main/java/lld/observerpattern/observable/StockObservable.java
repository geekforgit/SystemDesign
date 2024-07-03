package lld.observerpattern.observable;

import lld.observerpattern.observer.NotificationAlertObserver;

public interface StockObservable {
    void addObserver(NotificationAlertObserver notificationAlertObserver);
    void removeObserver(NotificationAlertObserver notificationAlertObserver);
    void notifyObserver();
    void setStockCount(int newStockCount);
    int  getStockCount();

}

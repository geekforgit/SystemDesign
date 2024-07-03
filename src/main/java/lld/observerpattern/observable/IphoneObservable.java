package lld.observerpattern.observable;

import lld.observerpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements  StockObservable{
    List<NotificationAlertObserver> notificationAlertObserverList= new ArrayList<>();
    int stockCount = 0;
    @Override
    public void addObserver(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void removeObserver(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifyObserver() {
        notificationAlertObserverList.stream().forEach(n->n.update());
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount==0)
            notifyObserver();
        stockCount+=newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}

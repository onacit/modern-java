package modernjavainaction.chap17.rxjava;

import io.reactivex.Observable;
import modernjavainaction.chap17.TempInfo;

import static modernjavainaction.chap17.rxjava.TempObservable.getTemperature;

public class Main {

    public static void main(String[] args) {
        Observable<TempInfo> observable = getTemperature("New York");
        observable.subscribe(new TempObserver());

        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

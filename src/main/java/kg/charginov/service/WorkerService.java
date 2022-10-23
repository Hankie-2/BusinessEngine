package kg.charginov.service;

import kg.charginov.markers.AccessToDatabase;
import kg.charginov.markers.AccessToMoney;
import kg.charginov.markers.AccessToSocialMedia;
import kg.charginov.model.Request;

public interface WorkerService {

    void changeRows(AccessToDatabase worker);

    void takeMoney(AccessToMoney worker);

    void addNews(AccessToSocialMedia worker);

    void giveMoney(AccessToMoney worker, Request request);

}

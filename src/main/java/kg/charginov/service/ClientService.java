package kg.charginov.service;

import kg.charginov.model.Client;
import kg.charginov.model.User;

public interface ClientService {

    void requestMoney(User client, int money);

}

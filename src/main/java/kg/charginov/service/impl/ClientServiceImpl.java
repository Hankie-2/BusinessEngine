package kg.charginov.service.impl;

import kg.charginov.model.Client;
import kg.charginov.model.User;
import kg.charginov.service.ClientService;

public class ClientServiceImpl implements ClientService {

    @Override
    public void requestMoney(User client, int money) {
        System.out.println(client.getFullName() + " запрашивает запрос на пополнение на сумму " + money);
    }
}

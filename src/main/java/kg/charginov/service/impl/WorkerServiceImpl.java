package kg.charginov.service.impl;

import kg.charginov.markers.AccessToDatabase;
import kg.charginov.markers.AccessToMoney;
import kg.charginov.markers.AccessToSocialMedia;
import kg.charginov.model.Request;
import kg.charginov.service.WorkerService;

public class WorkerServiceImpl  implements WorkerService {

    @Override
    public void changeRows(AccessToDatabase worker) {
        System.out.println(worker + " изменяет базу данных.");
    }

    @Override
    public void takeMoney(AccessToMoney worker) {
        System.out.println(worker+ " берет деньги из бюджета.");
    }

    @Override
    public void addNews(AccessToSocialMedia worker) {
        System.out.println(worker + " заливает новую информацию в соц. сеть.");
    }

    @Override
    public void giveMoney(AccessToMoney worker, Request request) {
        request.getClient().setMoney(request.getMoney()+request.getClient().getMoney());
        System.out.println(worker +" пополнят сумму клиента " + request.getClient().getFullName() + " на сумму " + request.getMoney());
    }
}

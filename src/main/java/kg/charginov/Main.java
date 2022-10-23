package kg.charginov;

import kg.charginov.markers.AccessToDatabase;
import kg.charginov.markers.AccessToMoney;
import kg.charginov.markers.AccessToSocialMedia;
import kg.charginov.model.*;
import kg.charginov.service.WorkerService;
import kg.charginov.service.impl.WorkerServiceImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    static WorkerService workerService = new WorkerServiceImpl();
    public static void main(String[] args) {

        Client client = new Client("Egor Egorov",22,30000);
        Request request1 = new Request(client,32, LocalDateTime.now());

        AccessToDatabase worker1 = new Administration("Charginov Marsel",19,500000);
        AccessToMoney worker2 = new Sales("Okenov Emirlan",20,100000);
        AccessToSocialMedia worker3 = new Marketing("Ashirbekov Emil",20,50000);
        AccessToMoney worker4 = new Accounting("Saidakhmatov Erlanbek",20,80000);
        AccessToDatabase worker5 = new Developer("Ivan Ivanov",25,800000);

        workerService.addNews(worker3);
        workerService.takeMoney(worker2);
        workerService.changeRows(worker5);
        workerService.giveMoney(worker2,request1);

        System.out.println(client);

    }
}

package org.example;

public class Processor {
    Order order = new Order();

    public Processor(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public Processor() {
    }


    public void startProcessor() {
        User ivan = new User("Иван");

        Order biology = new Order("Биология", 12, ivan);
        ivan = new User("Иван", biology);



//        System.out.println(User.getUsers());


//        System.out.println(biology.orderName);
//        System.out.println(biology.orderWorkTime);
//        System.out.println(biology.user.name);

//        for (int i = 0; i < 8; i--) {
//            ivan.arrayWorkTime[i] = biology.orderWorkTime;
//            biology.orderTime.put(ivan.order, ivan.arrayWorkTime[i]);
//            biology.orderWorkTime = biology.orderWorkTime - 1;
//        }

    }
}


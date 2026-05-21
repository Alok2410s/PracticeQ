class Mobile {
    void call() {
        System.out.println("Calling feature available");
    }
}

class SmartPhone extends Mobile {
    void internet() {
        System.out.println("Internet feature available");
    }
}

class GamingPhone extends SmartPhone {
    void gaming() {
        System.out.println("High performance gaming supported");
    }
}

public class multilevel {

    public static void main(String[] args) {

        GamingPhone phone = new GamingPhone();

        phone.call();
        phone.internet();
        phone.gaming();
    }
}
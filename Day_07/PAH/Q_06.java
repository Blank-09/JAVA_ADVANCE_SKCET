import java.util.*;

interface Notification {
    void notificationBySms();
    void notificationByEmail();
    void notificationByCourier();
}

class Icici implements Notification {
    public void notificationBySms() {
        System.out.println("ICICI - Notification by SMS");
    }

    public void notificationByEmail() {
        System.out.println("ICICI - Notification by Email");
    }

    public void notificationByCourier() {
        System.out.println("ICICI - Notification by Courier");
    }
}

class Hdfc implements Notification {
    public void notificationBySms() {
        System.out.println("HDFC - Notification by SMS");
    }

    public void notificationByEmail() {
        System.out.println("HDFC - Notification by Email");
    }

    public void notificationByCourier() {
        System.out.println("HDFC - Notification by Courier");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int code = sc.nextInt();
        int type = sc.nextInt();
        
        Notification notify;
        
        if (code == 1) {
            notify = new Icici();
        } else if (code == 2) {
            notify = new Hdfc();
        } else {
            System.out.println("Invalid Input");
            return;
        }
        
        if (type == 1) 
            notify.notificationBySms();
        else if (type == 2)
            notify.notificationByEmail();
        else if (type == 3)
            notify.notificationByCourier();
        else 
            System.out.println("Invalid Input");

    }
}

abstract class Notification {

    abstract void send();

    void message() {
        System.out.println("Notification System");
    }
}

// Interface
interface Alert {
    void alert();
}

// Child class
class EmailNotification extends Notification implements Alert {

    void send() {
        System.out.println("Sending Email Notification");
    }

    public void alert() {
        System.out.println("Email Alert Activated");
    }
}

class SMSNotification extends Notification {

    void send() {
        System.out.println("Sending SMS Notification");
    }
}

public class Nov16 {
    public static void main(String[] args) {

        EmailNotification e = new EmailNotification();

        e.message();
        e.send();
        e.alert();

        SMSNotification s = new SMSNotification();

        s.message();
        s.send();
    }
}

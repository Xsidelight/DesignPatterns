package DelegatePattern;

public class MobileApp {

    public static final String number = "123456789";

    public static void main(String[] args) {
        MobileController androidMobileController = new MobileController(new AndroidMobile());
        MobileController iosMobileController = new MobileController(new IOSMobile());

        androidMobileController.dial(number);
        iosMobileController.dial(number);
    }
}

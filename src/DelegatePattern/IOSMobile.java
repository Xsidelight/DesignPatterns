package DelegatePattern;

public class IOSMobile implements Mobile {
    @Override
    public void dial(String number) {
        System.out.println("Calling on IOSMobile: " + number);
    }
}

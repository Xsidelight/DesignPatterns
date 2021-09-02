package DelegatePattern;

public class AndroidMobile implements Mobile {
    @Override
    public void dial(String number) {
        System.out.println("Calling on AndroidMobile: " + number);
    }
}

package DelegatePattern;

public class MobileController implements Mobile {
    private final Mobile mobile;

    public MobileController(Mobile mobile) {
        this.mobile = mobile;
    }


    @Override
    public void dial(String number) {
        mobile.dial(number);
    }
}

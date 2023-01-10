public class PriorityMessengerDecorator extends MessengerDecorator{

    public PriorityMessengerDecorator(DebtMessenger messenger) {
        super(messenger);
    }

    @Override
    public void message() {
        super.message(); //do the base function
        System.out.println("This message is urgent!"); //...and decorate

    }
}

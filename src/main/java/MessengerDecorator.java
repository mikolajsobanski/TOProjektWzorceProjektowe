public class MessengerDecorator implements DebtMessenger {
    private final DebtMessenger wrapped;

    MessengerDecorator(DebtMessenger messenger) {
        this.wrapped = messenger;
    }

    @Override
    public void message() {
        wrapped.message();
    }
}

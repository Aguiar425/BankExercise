public class Debit extends Account{

    private Client client = new Client();

    public Debit(int plafond, Client client) {
        super(plafond, client);
    }

    public Debit() {
    }

    public void withdraw(int valueToWithdraw){
        int plafond = getPlafond();
        plafond -= valueToWithdraw;
    }

    @Override
    public void pay(int valueToPay) {
        if(client.isHasCredit() ==false || client.isHasDebit() == false){
            System.out.println("Client needs one credit account and one debit account");
        }
        int plafond = getPlafond();
        if (plafond < 0) {
            System.out.println("Insufficient funds");
        } else {
            plafond -= valueToPay;
        }
    }
}

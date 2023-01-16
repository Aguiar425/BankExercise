public class Credit extends Account {

    private int fee;
    private Client client = new Client();

    public Credit (int plafond, Client client) {
        super(plafond, client);
        this.fee = 5;
    }

    public Credit() {
        this.fee = 5;
    }

    @Override
    public void pay(int valueToPay) {
        if (client.isHasCredit() == false || client.isHasDebit() == false) {
            System.out.println("Client needs one credit account and one debit account");
        }
        int plafond = getPlafond();
        if (plafond < -100) {
            System.out.println("Insufficient funds");
        }
        if (plafond < 0) {
            plafond = plafond - (valueToPay + fee);
        } else {
            plafond -= valueToPay;
        }
    }
}

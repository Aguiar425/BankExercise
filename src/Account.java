public abstract class Account {

    private int plafond =0;
    private int accountNumber = 0;
    private Client client = new Client();


    public Account(int plafond, Client client) {
        this.plafond = plafond;
        this.client = client;
        accountNumber++;
    }

    public Account() {
        this.plafond = 0;
    }

    public void deposit(int valueToDeposit){
        if(client.isHasCredit() ==false || client.isHasDebit() == false){
            System.out.println("Client needs one credit account and one debit account");
        }
        plafond += valueToDeposit;
    }

    public abstract void pay(int valueToPay);


    //BEGINNING OF GETTERS AND SETTERS

    public int getPlafond() {
        return plafond;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

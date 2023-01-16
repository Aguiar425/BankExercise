public class Client {

    private String name;
    private int clientNumber = 0;
    private boolean hasDebit=false;
    private boolean hasCredit=false;
    private Account[] accounts = new Account[20];
/*  private Account credit = new Credit();
    private Account debit = new Debit();*/

    public Client(String name) {
        this.name = name;
        clientNumber++;
    }

    public Client() {
    }

   /* public void askForCredit(){
        if(hasCredit == true){
            System.out.println("Client already has a Credit account");
        }else{
            System.out.println("Credit account created");
            Account credit = new Credit();
            hasCredit = true;
        }
    }

    public void askForDebit(){
        if(hasDebit == true){
            System.out.println("Client already has a Debit account");
        }else{
            System.out.println("Debit account created");
            Account debit = new Debit();
            hasDebit = true;
        }
    }*/

    public void joinCredit(int accountNumber){
        accounts[accountNumber-1] = new Credit();
    }

    public void joinDebit(int accountNumber){
        accounts[accountNumber-1] = new Debit();
    }

    public void Deposit(int accountNumber, int toDeposit){
        accounts[accountNumber-1].deposit(toDeposit);
        System.out.println("Client " + clientNumber + " deposited " + toDeposit +" euros on account number " + accountNumber);
    }


    //BEGINNING OF GETTERS AND SETTERS

    public boolean isHasDebit() {
        return hasDebit;
    }

    public boolean isHasCredit() {
        return hasCredit;
    }

    public void setHasDebit(boolean hasDebit) {
        this.hasDebit = hasDebit;
    }

    public void setHasCredit(boolean hasCredit) {
        this.hasCredit = hasCredit;
    }

    public String getName() {
        return name;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }
}

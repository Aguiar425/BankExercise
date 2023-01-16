public class Main {
    public static void main(String[] args) {

        Client client = new Client("Teste");
        Client client2 = new Client("Ze");
        Client client3 = new Client("Quim");
        Client client4 = new Client("Miguel");
        Client client5 = new Client("Antonio");
        Client client6 = new Client("Joao");

        Bank santander = new Bank("Santander");
        Bank millennium = new Bank("Millennium");


        // First use setClients method on a Bank object

        santander.setClients(1);
        millennium.setClients(1);

        //santander.createDebit(1);
        santander.createCredit(1);
        santander.createCredit(1);
        //santander.createDebit(1);


/*        santander.createDebit(1);
        santander.createDebit(1);

        millennium.createDebit(1);
        millennium.createDebit(1);


        client.joinCredit(1);
        client.joinDebit(2);
        client.Deposit(1,10);*/
    }
}
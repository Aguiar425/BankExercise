public class Bank {

    private String name;
    private Client[] clients = new Client[5];

    public Bank(String name) {
        this.name = name;
    }

    public void createCredit(int clientNumber){
        if(clients[clientNumber-1].isHasCredit() == true){
            System.out.println("Client " + clientNumber +" already has a Credit account on bank : " +name);
        }else{
            System.out.println("Credit account created for client number "+ clientNumber + " on bank " +name);
            //Credit credit = new Credit();
            clients[clientNumber-1].joinDebit(clientNumber);

            clients[clientNumber-1].setHasCredit(true);
        }
    }

    public void createDebit(int clientNumber){
        if(clients[clientNumber-1].isHasDebit() == true){
            System.out.println("Client " + clientNumber +" already has a Debit account on bank : " +name);
        }else{
            System.out.println("Debit account created for client number" + clientNumber + " on bank " +name);
            //Debit debit = new Debit();
            clients[clientNumber-1].joinCredit(clientNumber);
            clients[clientNumber-1].setHasDebit(true);
        }
    }

    public void setClients(int clientNumber){
        if(clientNumber > clients.length){
            System.out.println("Maximum number of clients reached");
            return;
        }
        clients[clientNumber-1] = new Client();
        System.out.println("Client number " + clientNumber+ " has been registered to this bank : " + name);
    }
}

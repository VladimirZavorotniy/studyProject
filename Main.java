public class Main{


  public Main(){
    accountOne = new CheckingAccount("Ivan", 100, "1");
    accountTwo = new CheckingAccount("Oleg", 200, "2");
  }

  public static void main(String[] args){
    Main instance = new Main();


System.out.println("Your balance" + instance.accountOne.getBalance());

System.out.println("сумма перевода" + instance.accountOne.setBalance(170));

System.out.println("your intarestrate" + instance.accountOne.getMonlthlyInterest());
  }

}
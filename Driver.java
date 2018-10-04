public class Driver{
  public static void main(String[]args){
    BankAccount a = new BankAccount(6291, 300.00, "herro");
    System.out.println("Your Balance is: " + a.getBalance());
    a.newPassword("oof");
    System.out.println("Your new password is:" + onePassword);
    System.out.print(a);
    a.deposit(30.00);
    System.out.print(a);
    a.withdraw(100.00);
    System.out.print(a);
    a.withdraw(9999999.00);
    System.out.print(a);
  }
}
    
      

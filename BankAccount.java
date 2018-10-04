public class BankAccount{
  private int oneID;
  private double oneBalance;
  private String onePassword;
  public BankAccount(int accountID, double balance, String password) {
    oneID = accountID;
    oneBalance = balance;
    onePassword = password;
  }
  
  public String toString() {
    System.out.println(accountID + "  " + balance);
  }
  
  public double getBalance() {
    return oneBalance;
  }
  
  public int getAccountID() {
    return oneID;
  }
  
  
    

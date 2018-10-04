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
    return accountID + "  " + balance;
  }
  
  public double getBalance() {
    return oneBalance;
  }
  
  public int getAccountID() {
    return oneID;
  }
  
  public void setPassword(String newPass){
    onePassword = newPass;
  }
  
  public boolean deposit(double amount) {
    if (amount > 0.0) {
      oneBalance = oneBalance + amount;
      return true;
    }
    else return false;
  }
  public boolean withdraw(double amount) {
    if (amount > 0.0 && amount < oneBalance) {
      oneBalance = oneBalance - amount;
      return true;
    }
    else return false;
  }
}
    
  
  
    

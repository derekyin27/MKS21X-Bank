public class BankAccount{
  private int oneID;
  private double oneBalance;
  private String onePassword;
  private boolean authenticate(String password);
    
  public BankAccount(double balance, int accountID, String password) {
    oneID = accountID;
    oneBalance = balance;
    onePassword = password;
  }
  
  public String toString() {
    return oneID + "  " + oneBalance;
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
  public boolean transferTo(BankAccount other, double amount, String password){
    if (other.password.equals(onePassword)){
      if (amount > 0) {
        if (this.withdraw(amount) < this.getBalance()) {
          this.withdraw(amount) && other.deposit(amount)
        }
      }
    }
  }
        
}
    
  
  
    

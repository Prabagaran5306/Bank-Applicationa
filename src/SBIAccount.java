import java.util.UUID;

public class SBIAccount implements BankInterface{
    private String name;
    private String accountNo;
    private int balance;
    private String password;
    private double rateOfTnterest;

    public String getName() {
        return name;
    }

    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfTnterest = 6.6;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfTnterest() {
        return rateOfTnterest;
    }

    public void setRateOfTnterest(double rateOfTnterest) {
        this.rateOfTnterest = rateOfTnterest;
    }

    //Above code is used by getter and setter (Alt+Insert)//

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "Paisa hi Paisa "+amount;
    }

    @Override
    public String withdraw(int amount, String enteredPassword) {
        if(enteredPassword.equals(this.password)){
          if(balance<amount){
              return "insufficient balance";
          }
          else{
              balance -= amount;
              return "Money Deducted";
          }
        }
        else{
            return "Invalid password";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfTnterest*time)/100.0;
    }
}

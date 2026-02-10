class BankAccount {
double balance;
BankAccount(double balance) {
this.balance = balance;
}
void deposit(double account) {
balance += amount;
System.out.println("Deposited:" + amount);
}
void withdraw(double amount) {
balance -= amount;
System.out.println("Withdraw:" + amount);
}
}
class SavingAccount extends BankAccount{
SavingAccount(double balance) {
super(balance);
}
void withdraw(double amount) {
if(balance - amount < 100){
System.out.println("Withdrawal denied! Minimum balance of 100 required");
}else{
balance -= amount;
System.out.println("Withdraw:" + amount);
}
}
}
class Main{
public static void main(String[]args) {
SavingAccount sa = new
SavingAccount(500);
sa.deposit(200);
sa.withdraw(550);
System.out.println("Balence:"+sa.balance);
}
}
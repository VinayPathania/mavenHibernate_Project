package Evaluation1;

public interface AccountDao {
    String findById(int id);
    String save(Account account);
    String deleteAccountById(int id);
    String withdraw(double amount,int accountId);
    String deposit(double amount,int accountId);
}

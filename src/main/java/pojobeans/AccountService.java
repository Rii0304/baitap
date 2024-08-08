package pojobeans;

public interface AccountService {
    void transferMoney(long fromAccountID, long toAccountID, double amount);
    void depositMoney(long accountID, double amount) throws Exception;
    Account getAccount(long accountID);
}

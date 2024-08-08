package pojobeans;

public class AccountServiceImpl implements AccountService{
    private  AccountRepository accountRepository;

//    public AccountServiceImpl(AccountRepositoryImpl accountRepository) {
//    }

    public void setAccountRepository(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public void transferMoney(long fromAccountID, long toAccountID, double amount) {
        Account sourceAccount = accountRepository.find(fromAccountID);
        Account targetAccount = accountRepository.find(toAccountID);
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        targetAccount.setBalance(targetAccount.getBalance() + amount);
        accountRepository.update(sourceAccount);
        accountRepository.update(targetAccount);
    }

    @Override
    public void depositMoney(long accountID, double amount) throws Exception {
        Account account = accountRepository.find(accountID);
        account.setBalance(account.getBalance() + amount);
        accountRepository.update(account);
    }

    @Override
    public Account getAccount(long accountID) {
        return accountRepository.find(accountID);
    }
}

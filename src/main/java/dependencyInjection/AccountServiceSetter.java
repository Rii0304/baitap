package dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojobeans.Account;
import pojobeans.AccountRepository;
import pojobeans.AccountRepositoryImpl;
import pojobeans.AccountService;
@Service("accountService")
public class AccountServiceSetter implements AccountService {

    public AccountServiceSetter(AccountRepositoryImpl accountRepository) {
    }

    private AccountRepository accountRepository;
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

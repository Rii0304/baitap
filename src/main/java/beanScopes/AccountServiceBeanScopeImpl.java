package beanScopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojobeans.Account;
import pojobeans.AccountService;
@Service("accountService")
public class AccountServiceBeanScopeImpl implements AccountService{
    @Autowired
    private AccountRepositoryBeanScopeImpl accountRepository2;

    @Override
    public void transferMoney(long fromAccountID, long toAccountID, double amount) {

    }

    @Override
    public void depositMoney(long accountID, double amount) throws Exception {

    }

    @Override
    public Account getAccount(long accountID) {
        return null;
    }
}

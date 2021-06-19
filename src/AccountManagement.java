import java.util.List;

public class AccountManagement {
    List<AccountUser> accountUserList;
    public static final AccountManagement accountManagement=new AccountManagement();
    public static AccountManagement getInstance(){
        return accountManagement;
    }

}

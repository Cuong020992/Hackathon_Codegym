import java.util.List;

public class AccountManagement implements GerenalManagement<AccountUser> {
    List<AccountUser> accountUserList;
    ScannerAccount scannerAccount = ScannerAccount.getInstance();
    public static final AccountManagement accountManagement = new AccountManagement();

    public static AccountManagement getInstance() {
        return accountManagement;
    }

    @Override
    public void display(List<AccountUser> list) {
        for (AccountUser accountUser : list) {
            System.out.println(accountUser.toString());
        }
    }

    @Override
    public void add() {
        AccountUser accountUser = scannerAccount.creat(accountUserList);
        accountUserList.add(accountUser);
    }

    @Override
    public void edit(AccountUser accountUser) {
        scannerAccount.editPassword(accountUser);
        scannerAccount.editName(accountUser);
        scannerAccount.editAge(accountUser);
        scannerAccount.editGender(accountUser);
        scannerAccount.editAddress(accountUser);
        scannerAccount.editPhoneNumber(accountUser);
    }

    @Override
    public void delete(AccountUser accountUser) {

    }

    @Override
    public List<AccountUser> find(String st) {
        return null;
    }
}

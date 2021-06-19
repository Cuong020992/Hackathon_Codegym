import java.util.List;

public class AccountManagement implements GerenalManagement<UserAccount> {
    List<UserAccount> accountUserList;
    ScannerAccount scannerAccount = ScannerAccount.getInstance();
    public static final AccountManagement accountManagement = new AccountManagement();

    public static AccountManagement getInstance() {
        return accountManagement;
    }

    @Override
    public void display(List<UserAccount> list) {
        for (UserAccount accountUser : list) {
            System.out.println(accountUser.toString());
        }
    }

    @Override
    public void add() {
        UserAccount accountUser = scannerAccount.creat(accountUserList);
        accountUserList.add(accountUser);
    }

    @Override
    public void edit(UserAccount accountUser) {
        scannerAccount.editPassword(accountUser);
        scannerAccount.editName(accountUser);
        scannerAccount.editAge(accountUser);
        scannerAccount.editGender(accountUser);
        scannerAccount.editAddress(accountUser);
        scannerAccount.editPhoneNumber(accountUser);
    }

    @Override
    public void delete(UserAccount accountUser) {

    }

    @Override
    public List<UserAccount> find(String st) {
        return null;
    }
}

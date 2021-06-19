import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ScannerAccount {
    Scanner sc = new Scanner(System.in);

    public boolean checkExistAccount(String userName, List<AccountUser> list) {
        for (AccountUser accountUser : list) {
            if (accountUser.getUserName().equalsIgnoreCase(userName)) {
                return true;
            }
        }
        return false;
    }

    ;

    public int inputNum() {
        int num = -1;
        while (num < 0) {
            try {
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Sai kiểu dữ liệu,vui lòng nhập lại!");
            } finally {
                sc.nextLine();
            }
        }
        return num;
    }

    public AccountUser creat(List<AccountUser> list) {
        boolean checkExist = true;
        String userName = null;
        do {
            System.out.println("Tên đăng nhập:");
            userName = sc.nextLine();
            checkExist = checkExistAccount(userName, list);
            if (checkExist == true) {
                System.out.println("Tên đăng nhập đã tồn tại!");
            }
        } while (checkExist == true);
        System.out.println("Mật khẩu:");
        String passwork = sc.nextLine();
        System.out.println("Họ tên :");
        String fullName = sc.nextLine();
        System.out.println("Nhập tuổi:");
        int age = inputNum();
        System.out.println("Giới tính");
        String gender = null;
        boolean checkGender = true;
        while (checkGender == true) {
            System.out.println("Giới tính(Nam/Nữ):");
            gender = sc.nextLine();
            checkGender = !gender.equalsIgnoreCase("Name") && !gender.equalsIgnoreCase("Nữ");
            if (checkGender == true) {
                System.out.println("Gioi tính không phù hợp,vui lòng nhập lại!");
            }
        }
        System.out.println("Địa chỉ :");
        String address = sc.nextLine();
        System.out.println("Số điện thoại :");
        String phoneNumber = sc.nextLine();
        return new AccountUser(userName, passwork, fullName, age, gender, address, phoneNumber);

    }

    public void editPassword(AccountUser accountUser) {
        System.out.println("Mật nhập :");
        String password = sc.nextLine();
        System.out.println("Bạn có muốn tiếp tục đổi mật khẩu?(Nhập vào Y để tiếp tục)");
        String choice = sc.nextLine();
        if (choice.equals("Y")) {
            accountUser.setPassword(password);
        }
    }
    public void editName(AccountUser accountUser){
        System.out.println("Nhập họ tên mới :");
        String name=sc.nextLine();
        accountUser.setFullname(name);
    }
    public void editAge(AccountUser accountUser){
        System.out.println("Nhập tuổi:");
        int age=inputNum();
        accountUser.setAge(age);
    }
    public void editGender(AccountUser accountUser){
        System.out.println("Giới tính:");
        String gender=null;
        boolean checkGender = true;
        while (checkGender == true) {
            System.out.println("Giới tính(Nam/Nữ):");
            gender = sc.nextLine();
            checkGender = !gender.equalsIgnoreCase("Name") && !gender.equalsIgnoreCase("Nữ");
            if (checkGender == true) {
                System.out.println("Gioi tính không phù hợp,vui lòng nhập lại!");
            }
        }
        accountUser.setGender(gender);
    }
    public void editAddress(AccountUser accountUser){
        System.out.println("Nhập địa chỉ:");
        String address=sc.nextLine();
        accountUser.setAddress(address);
    }
    public void editPhoneNumber(AccountUser accountUser){
        System.out.println("Nhập số điện thoại");
        String phoneNumber=sc.nextLine();
        accountUser.setPhoneNumber(phoneNumber);
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerEvent {
    Scanner sc = new Scanner(System.in);
    public static final ScannerEvent scannerEvent = new ScannerEvent();

    public static ScannerEvent getInstance() {
        return scannerEvent;
    }


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

    public Event creat(UserAccount accountUser) {
        System.out.println("Tên sư kiện:");
        String name = sc.nextLine();
        System.out.println("Thời gian:");
        String time = sc.nextLine();
        System.out.println("Địa chỉ :");
        String address = sc.nextLine();
        System.out.println("Thể loại");
        String sport = sc.nextLine();
        System.out.println("Mô tả");
        String des = sc.nextLine();
        System.out.println("Số người cần tìm :");
        int maxPerson = inputNum();
        return new Event(accountUser.getUserName(), name, time, address, sport, des, maxPerson);
    }

    public void editName(Event event){
        System.out.println("Nhập tên");
        String name=sc.nextLine();
        event.setName(name);
    }
    public void editTime(Event event){
        System.out.println("Thời gian");
        String time=sc.nextLine();
        event.setTime(time);
    }
    public void editAddress(Event event){
        System.out.println("Địa chỉ:");
        String address=sc.nextLine();

    }
}

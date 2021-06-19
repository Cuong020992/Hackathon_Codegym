import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AccountUser {
    private String userName;
    private String password;
    private String fullname;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;
    private String[] listsothich;
    private List<Event> eventList=new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getListsothich() {
        return listsothich;
    }

    public void setListsothich(String[] listsothich) {
        this.listsothich = listsothich;
    }

    public AccountUser(String userName, String password, String fullname, int age, String gender, String address, String phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public AccountUser() {
    }

    @Override
    public String toString() {
        return "AccountUser{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", listsothich=" + Arrays.toString(listsothich) +
                '}';
    }
}

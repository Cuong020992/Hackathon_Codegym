import java.util.ArrayList;
import java.util.List;

public class Event {
    private String id;
    private String name;
    private String time;
    private String address;
    private String sport;
    private String des;
    private int maxPerson;
    private List<UserAccount> quantity=new ArrayList<>();
    private String status=quantity.size()+"/"+maxPerson;

    public Event() {
    }

    public Event(String id, String name, String time, String address, String sport, String des,int maxPerson) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.address = address;
        this.sport = sport;
        this.des = des;
        this.maxPerson=maxPerson;
    }

    public List<UserAccount> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<UserAccount> quantity) {
        this.quantity = quantity;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", address='" + address + '\'' +
                ", sport='" + sport + '\'' +
                ", des='" + des + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

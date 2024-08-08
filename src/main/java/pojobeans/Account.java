package pojobeans;

import javax.xml.crypto.Data;
import java.util.Date;

public class Account {
    private long id;
    private String ownerName;
    private double balance;
    private Date accessTime;
    private  boolean looked;
    public long getId() {
        return id;
    }

    public boolean isLooked() {
        return looked;
    }

    public void setLooked(boolean looked) {
        this.looked = looked;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }
}

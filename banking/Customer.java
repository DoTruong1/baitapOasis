import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<Account>();

    public Long getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Account> getAccountList() {
        return this.accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
    
    public void addAccount(Account account) {
        this.accountList.add(account);
    }
    public void removeAccount(Account account) {
        this.accountList.remove(account);
    }

    public String getCustomerInfo() {

        return "";
    }
    public Customer() {}
    
    public Customer(Long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }
    
    
}

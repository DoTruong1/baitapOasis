import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {
    private List<Customer> customers = new ArrayList<Customer>();    
    
    public void readCustomerList(InputStream text) throws IOException {
        List<String> doc = new BufferedReader(new InputStreamReader(text,
          StandardCharsets.UTF_8)).lines().collect(Collectors.toList());
        for (String line : doc) {
            String id = line.substring(line.lastIndexOf(" ") + 1, line.length());
            if (id.length() == 9) {
                Customer customer = new Customer(Long.valueOf(id), line.substring(0, line.lastIndexOf(" ")));
                customers.add(customer);
            } else {
                String accountType = line.substring(line.indexOf(" ") + 1, line.lastIndexOf(" "));
                //get account ID
                Long accountId = Long.valueOf(line.substring(0, 10));
                //get account balance.
                Double balance = Double.valueOf(line.substring(line.lastIndexOf(" ") + 1, line.length() - 1));
                // get lastest customer
                System.out.println(accountId + " " + accountType + " " + balance);
                Customer customer = customers.get(customers.size() - 1);
                if (accountType.equals("CHECKING")) {
                    Account account = new CheckingAccount(accountId, balance);
                    customer.addAccount(account);
                } else {
                    Account account = new SavingAccount(accountId, balance);
                    customer.addAccount(account);
                }
            }
        }

    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public String getCustomersInfoByIdOrder() {
        String ans = "";
        for (int i = 0; i < customers.size(); i++) {
            for (int j  = 0; j < customers.size() - i - 1; j++) {
                if (customers.get(j).getIdNumber() > customers.get(j+1).getIdNumber()) {
                    Customer temp = customers.get(j);
                    customers.set(j, customers.get(j+1));
                    customers.set(j+1, temp);
                }
            }
        }
        for (Customer customer : customers) {
            ans += "Số CMND: " + Long.toString(customer.getIdNumber()) + ". " 
                +  "Họ tên: "+ customer.getFullName()+ ".\n";
        }
        return ans;
    }

    public String getCustomersInfoByNameOrder() {

        return "";
    }

    public static void main(String[] args) throws IOException {
        try {
            InputStream inputStream = new FileInputStream("/home/truongdo/code/java/text.txt");
            Bank bank = new Bank();
            bank.readCustomerList(inputStream);
            System.out.println(bank.getCustomersInfoByIdOrder());
            //List<Customer> customers = bank.getCustomers();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

import org.example.Account;
import org.junit.Assert;
import org.junit.Test;

public class BankAccountTesting {
    @Test
    public void whenUserDepositMoneyHeHaveMoreMoney(){
        Account account=new Account("Justyna","Bolek");
        account.deposit(100);
        Assert.assertEquals(200, account.getBalance(), 0.0);                    //porównanie
    }
}

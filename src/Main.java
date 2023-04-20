import java.lang.ref.PhantomReference;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> products = new HashMap();
        products.put("Бананочипсы",100);
        products.put("Конфета",30);
        products.put("Вода",25);
        Account account = new Account(24);


        VendingMachine.printInfo(products,account);




    }

}
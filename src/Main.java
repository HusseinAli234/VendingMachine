import java.lang.ref.PhantomReference;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> products = new HashMap();
        products.put("Бананочипсы",100);
        products.put("Конфета",30);
        products.put("Вода",25);
        products.put("Хлеб",30);
        products.put("Мороженое",10);
        products.put("Леденец",5);
        Account account = new Account(100);
        VendingMachine.printInfo(products,account);




    }

}
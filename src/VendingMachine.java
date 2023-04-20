import java.util.*;

public class VendingMachine {
    static Scanner scn = new Scanner(System.in);
    public static void action(Map<String,Integer> products,Account account)
    {
        printInfo(products,account);
    }

    public static void printInfo(Map<String,Integer> products,Account account)
    {
        String action = "";
        if(account.getCash() < 25)
        {
                printProducts(products);
                System.out.println("Долларов на счету :" + account.getCash());
                System.out.println("Ничего не купишь, кидай еще");

                System.out.println(">a - Закинуть денег");
                System.out.println(">q - Выйти");

                while(!action.equalsIgnoreCase("q") && !action.equalsIgnoreCase("a"))
                {
                    action = scn.nextLine().toLowerCase();
                }

            switch (action)
                {
                    case "a":
                        account.topUp();
                        break;
                    case "q":
                            System.exit(0);



                }
                action = "";

        }
        System.out.println("В автомате доступны:");
        printProducts(products);
        System.out.println("Долларов на счету :" + account.getCash());
        System.out.println(">a - Закинуть денег");
        System.out.println(">q - Выйти");
        Has

        while(!action.equalsIgnoreCase("q") && !action.equalsIgnoreCase("a"))
        {
            action = scn.nextLine().toLowerCase();
        }

        switch (action)
        {
            case "a":
                account.topUp();
                break;
            case "q":
                System.exit(0);


        }

    }
    public static void printProducts(Map<String,Integer> products)
    {
        Iterator iter = products.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println("[" + entry.getKey() + "] : " + entry.getValue());
        }
    }
}

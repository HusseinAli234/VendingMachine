import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {
    private  static Scanner scn = new Scanner(System.in);
    private int cash;


    public Account(int cash)
    {
        this.cash = cash;
    }
    public void buyProduct(int cost)
    {
        this.cash-=cost;
    }

    public void topUp()
    {
        try
        {
            System.out.print("Введите насколько хотите пополнить счет:");
            int refill = scn.nextInt();
            if (refill < 0)
            {
                    throw new IncorrectReplenishmentException();
            }
            this.cash +=refill;
            System.out.printf("Вы пополнили счет на %d долларов%n",refill);
        }
        catch (InputMismatchException | IncorrectReplenishmentException e)
            {
                System.out.println(e.toString());
                scn.next();
                topUp();
            }
    }

    public int getCash()
    {
        return cash;
    }
}

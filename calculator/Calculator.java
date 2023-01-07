import java.util.Random;

public class Calculator
{
    private int a;
    private int b;
    private Random rng = new Random();
    // instance variables - replace the example below with your own
    public Calculator (int number_a,int number_b)
    {
        this.a = number_a;
        this.b = number_b;
    }
    public int sum ()
    {
        return a + b;
    }
    public int sot()
    {
        return a - b;
    }
    public int div()
    {
        return a % b;
    }
    public int mol()
    {
        return a*b;
    }

    public int random () 
    { 
         int randomInt0to9 = rng.nextInt(10);
         System.out.println("Random Number is " + randomInt0to9);
         return randomInt0to9;
        
    }
    
    public int palyGame(int number_a)
    {
        return number_a + random();
        
    }
}

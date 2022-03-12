import java.util.Random;
import java.util.Scanner;

public class practiceGuess {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random r=new Random();
        int secret=r.nextInt(100)+1;
        int min=1;
        int max=100;
        System.out.println(secret);
        for (int i=1;i<5;i++)
        {
            String s= scanner.next();
            int num=Integer.parseInt(s);
            if (num>secret){
                max=num;
                System.out.println("You loose");
            } else if (num<secret){
                min=num;
                System.out.println("You loose");
            }else
            {
                System.out.println("you win");
                break;
            }
        }
    }
}

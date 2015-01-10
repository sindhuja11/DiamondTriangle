import java.util.Scanner;

/**
 * Created by Administrator on 10/01/15.
 */
public class DiamondWithname {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        Diamondwiththename diamond=new Diamondwiththename();
        diamond.PrintDiamondWithName(n);
    }
}
class Diamondwiththename
{

    public void PrintDiamondWithName(int n) {
        int star=1;
        star=(n-1)*2;
        int stars[]=new int[n];
        stars[0]=1;
        int count=3;
        for(int loop=1;loop<n;loop++)
        {
            stars[loop]=count;
            System.out.println(stars[loop]);
            count=count+2;
        }
        int tab[]=new int[n];
        tab[0]=star;
        int counter=n-1;
        for(int loop2=1;loop2<n;loop2++)
        {
            tab[loop2]=stars[counter];
            System.out.println(tab[loop2]);
            counter--;
        }

        int tabcount=n-1,starcount=0;
        for(int lines=0;lines<n-1;lines++)

        {
            for(int tabspace=0;tabspace<stars[tabcount]/2;tabspace++)
            {

                System.out.print(" ");
            }
            for(int starprint=0;starprint<stars[starcount];starprint++)
            {
                System.out.print("*");
            }
            for(int tabspace=0;tabspace<stars[tabcount]/2;tabspace++)
            {
                System.out.print(" ");
            }
            System.out.println();
            tabcount--;
            starcount++;

        }
        System.out.println("Sindhuja");
        starcount=n-2;
        tabcount=1;
        for(int lines=1;lines<n;lines++)

        {
            for(int tabspace=0;tabspace<stars[tabcount]/2;tabspace++)
            {

                System.out.print(" ");
            }
            for(int starprint=0;starprint<stars[starcount];starprint++)
            {
                System.out.print("*");
            }
            for(int tabspace=0;tabspace<stars[tabcount]/2;tabspace++)
            {
                System.out.print(" ");
            }
            System.out.println();
            tabcount++;
            starcount--;

        }
    }

}

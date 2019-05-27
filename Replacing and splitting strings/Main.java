import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      str = sc.nextLine();
      int parts = sc.nextInt();
      String st[] = str.split(" ", parts);
      for(String s : st)
        System.out.println(s);
    }
}
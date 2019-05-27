import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int cas = sc.nextInt();
      switch(cas)
      {
        case 1:
          int side = sc.nextInt();
          System.out.println(side * side);
          break;
        case 2:
          int len = sc.nextInt();
          int bre = sc.nextInt();
          System.out.println(len * bre);
          break;
        case 3:
          int base = sc.nextInt();
          int height = sc.nextInt();
          System.out.println(0.5 * base * height);
          break;
        case 4:
          int rad = sc.nextInt();
          System.out.println(3.14 * rad * rad);
          break;
      }
    }
}
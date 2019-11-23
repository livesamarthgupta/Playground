import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int count = 0;
    while(n != 0)
    {
      n /= 10;
      count++;
    }
    if(temp < 0)
      count++;
    char str[] = new char[count];
    count--;
    while(temp != 0)
    {
      if(temp < 0)
      {
        str[0] = '-';
        temp = -temp;
      }
      str[count] = (char)(temp % 10 + 48);
      temp /= 10;
      count--;
    }
    System.out.print(str);
        
  }
}
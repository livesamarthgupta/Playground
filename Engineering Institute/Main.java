//import required packages
import java.util.Scanner;

class Faculty
{
  int sal;
  public void salary(int sal)
  {
    if(sal <= 0)
      System.out.println("null");
    else
    {
      this.sal = sal;
      System.out.println("Base Salary: " + this.sal);
    }
  }
}
class CSE extends Faculty
{
	int sal;
  public void salary(int sal)
  {
    if(sal <= 0)
      System.out.println("null");
    else
    {
      this.sal = sal + 3000;
      System.out.println("CSE Faculty: " + this.sal);
    }
  }
}
class IT extends Faculty
{
  int sal;
  public void salary(int sal)
  {
    if(sal <= 0)
      System.out.println("null");
    else
    {
      this.sal = sal + 5000;
      System.out.println("IT Faculty: " + this.sal);
    }
  }
}
class ECE extends Faculty
{
  int sal;
  public void salary(int sal)
  {
    if(sal <= 0)
      System.out.println("null");
    else
    {
      this.sal = sal + 4500;
      System.out.println("ECE Faculty: " + this.sal);
    }
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int sal = sc.nextInt();
    Faculty obj = new Faculty();
    CSE obj2 = new CSE();
    IT obj3 = new IT();
    ECE obj4 = new ECE();
    obj.salary(sal);
    obj2.salary(sal);
    obj3.salary(sal);
    obj4.salary(sal);
  }
}
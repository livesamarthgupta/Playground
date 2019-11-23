import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      String arr[] = str.split(",");
      TreeSet s = new TreeSet();
      for(String st : arr)
        s.add(st);
      int ind = 1;
      while(s.isEmpty() == false)
      {
        System.out.println(s);
        s.remove(s.last());
      }
      System.out.println(s);
    }
}
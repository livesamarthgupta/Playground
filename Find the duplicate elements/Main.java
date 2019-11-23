import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet s = new TreeSet();
      String str = br.readLine();
      String arr[] = str.split(",");
      System.out.println("Duplicate Entry is:");
      for(String st : arr)
      {
        if(s.contains(st))
          System.out.println(st);
        else
          s.add(st);
      }
      System.out.println("TreeSet is : " + s);
    }
}
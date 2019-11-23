import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Set<String> s = new LinkedHashSet<>();
      String str = br.readLine();
      String arr[] = str.split(",");
      for(String st : arr)
        s.add(st);
      System.out.println(s);
    }
}
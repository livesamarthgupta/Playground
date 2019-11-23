import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	String str = br.readLine();
      	String arr[] = str.split(",");
      	LinkedList<String> ls = new LinkedList<String>();
      	for(int i = 0; i < arr.length; i++)
          	ls.add(arr[i]);
      	System.out.println(ls);
      	System.out.println("Size of the linked list: " + ls.size());
     	System.out.println("Is LinkedList empty? " + ls.isEmpty());
      	String check = br.readLine();
      	System.out.println("Does LinkedList contains " + check + "?");
      	System.out.println(ls.contains(check));
    }
}
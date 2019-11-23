import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      List<String> list = new ArrayList<>();
      int choice = -1;
      do
      {
        System.out.println("Choose any one:");
        System.out.println("1.Insert");
        System.out.println("2.delete");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        choice = Integer.parseInt(br.readLine());
        switch(choice)
        {
          case 1:
            String str = br.readLine();
            String arr[] = str.split(",");
            for(int i = 0; i < arr.length; i++)
              list.add(arr[i]);
            break;
          case 2:
            int index = Integer.parseInt(br.readLine());
            System.out.println("Enter the index value to be deleted:" + index);
            list.remove(index);
            break;
          case 3:
            System.out.println(list);
            break;
          case 4:
            choice = 4;
            break;
         }
    	}while(choice != 4);
    }
}
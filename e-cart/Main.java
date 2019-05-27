//import required packages here
import java.util.Scanner;

class Item
{
  private int price;
  public int getPrice()
  {
	return price;
  }
  public void setPrice(int price)
  {
    this.price = price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  public String getProduct()
  {
	return product;
  }
  public void setProduct(String product)
  {
	this.product = product;
  }
  public int getQuantity()
  {
	return quantity;
  }
  public void setQuantity(int quantity)
  {
	this.quantity = quantity;
  }
  
}

class Bill
{
  private int total;
  public void showBill(Item i, Customer c)
  {
    total = i.getPrice() * c.getQuantity();
    System.out.println("Total Price is : " + total);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner sc = new Scanner(System.in);
    String item = sc.nextLine();
    int price = sc.nextInt();
    int quantity = sc.nextInt();
    c.setProduct(item);
    i.setPrice(price);
    c.setQuantity(quantity);
    obj.showBill(i , c);
  }
}
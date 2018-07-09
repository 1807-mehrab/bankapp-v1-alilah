//import bankapp-v1-alilah;
import java.io.*;
import java.util.Scanner;

public class Bank {

  public static void main(String[] args){
      double balance ;
      Account person1 = new Account(500, 12345, "Makelele");
      Account person2 = new Account(250, 54321, "Nemar");
      String fileName = "history.txt";
    //
      Scanner sin = new Scanner(System.in);
      System.out.println("enter the amount you desire to deposit ");
      balance = sin.nextDouble();
      //double newBal balance = person1.deposit(1234, 20.00);
      System.out.println("enter your pin number ");
      int pin = sin.nextInt();
      double newBal = person1.deposit(pin, balance);

      System.out.println("your account balance is: " +newBal);


      try(ObjectOutputStream os =
            new ObjectOutputStream(new FileOutputStream(fileName))){
              os.writeObject(person1);
        }catch(IOException ex){
          ex.printStackTrace();
        }


        try(ObjectInputStream is =
            new ObjectInputStream(new FileInputStream(fileName))){
              Object acc = is.readObject();
             System.out.println(acc);
            }catch (FileNotFoundException ex){ ex.printStackTrace();
            }catch (IOException ex){ ex.printStackTrace();
            }catch (ClassNotFoundException ex){ ex.printStackTrace();}

   }
}

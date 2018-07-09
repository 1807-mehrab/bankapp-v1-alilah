//import bankapp-v1-alilah;
import java.io.*;

public class Bank {

  public static void main(String[] args){
      double balance ;
      Account person1 = new Account(500, 12345, "Makelele");
      Account person2 = new Account(250, 54321, "Nemar");
      String fileName = "history.txt";
    //

      balance = person1.deposit(1234, 20.00);
      System.out.println("your account balance is: " +balance);

      try(ObjectOutputStream os =
            new ObjectOutputStream(new FileOutputStream(fileName))){
              os.writeObject(person1);
        }catch(IOException ex){
          ex.printStackTrace();
        }


        try(ObjectInputStream is =
            new ObjectInputStream(new FileInputStream(fileName))){
              Object p = is.readObject();
              System.out.println(p);
            }catch (FileNotFoundException ex){ ex.printStackTrace();
            }catch (IOException ex){ ex.printStackTrace();
            }catch (ClassNotFoundException ex){ ex.printStackTrace();}

   }
}

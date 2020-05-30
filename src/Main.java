import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 7_USER
 */
public class Main {
    
    
    public static ArrayList<User> userlist = new ArrayList<User>();
    public static ArrayList<Administrator> adminlist = new ArrayList<Administrator>();
    public static ArrayList<DisplayMessageListForm> usermessagelist= new ArrayList<DisplayMessageListForm>();
    public static ArrayList<Book> booklist = new ArrayList<Book>();
    public static ArrayList<Booking> bookinglist = new ArrayList<Booking>();
    public static ArrayList<Reservation> reservationlist = new ArrayList<Reservation>();
    public static ArrayList<Review> reviewlist = new ArrayList<Review>();
    public static ArrayList<Category> categorylist= new ArrayList<Category>();
    
    
    public static void main(String args[])
            
            
    {
        
   
   User user1 = new User("nikos","1234","nik@gmail.com", "path1");
   
   userlist.add(user1);
     
   Administrator admin1 = new Administrator("giorgos", "12345", "giorgos@gmail.com");
   
   adminlist.add(admin1);
   
   HomePage page1 = new HomePage();
   
   page1.setVisible(true);
   
   
   
        
    }
   
   public static User get_user(String username)
           
   {
       User temp=null;
       
       for(User u: Main.userlist)
           
       {
           
           if(u.get_username().equals(username))
           {
               temp = u;
           }
       }
       
       return temp;
   }
   
   
   
   public static Administrator get_admin(String username)
           
   {
       Administrator temp=null;
       
       for(Administrator a: Main.adminlist)
           
       {
           
           if(a.get_username().equals(username))
           {
               temp = a;
           }
       }
       
       return temp;
   }
    
    public void delete_book(Book b)
    {
        Main.booklist.remove(b);
    } 
   public void cancel_reservation(Reservation r)
    {
        Main.reservationlist.remove(r);
    } 
   public void verify_reservation(Reservation r)
    {
        Main.reservationlist.add(r);
    }
    
    public static Book get_book(String title)
      
   {
       Book temp= null;
       
       for(Book b : Main.booklist)
       {
           if(b.get_title().equals(title))
           {
               temp = b;
           }
       }
       
       return temp;
   }
    public static Category get_category(String name)
   {
       Category temp= null;
       
       for(Category c : Main.categorylist)
       {
           if(c.get_name().equals(name))
           {
               temp = c;
           }
       }
       
       return temp;
   }

   
    
}



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Administrator {
    
    private String admname;
    private String password;
    private String email;
    ArrayList<Book> adbook = new ArrayList<Book>();
    ArrayList<Category> categ = new ArrayList<Category>();
    public Administrator(String admname, String password, String email)
            
    {
        adbook = Main.booklist;
   this.admname = admname;
    this.password = password;
    this.email = email;
}
    
    
    public String get_admname()
            
    {
        return admname;
    }
    
    public String get_password()
            
    {
     return password;   
    }
    
    
    public String get_email()

    {
    return email;
    }
// LITOURGIES POU AFORUN TON USER
 User search_User(String s){

    User temp = new User();
    for(User b: Main.userlist)
         
     {
         
         if(b.get_username().equals(s))
         {
            temp = b;
         }
    
     }

return temp; 

}
    
public void delete_user(User u)
{
    Main.userlist.remove(u);
    
}   

    
// LITOURGIES EPE3ERGASIAS KATIGORION
public void add_categ(Category m ){

    
categ.add(m);

}

public void del_categ(Category m ){

    
categ.remove(m);

}
 

// LITOURGIES EPEKSERGASIA BIBLION


public void add_book(Book m ){
   Main.booklist.add(m); 

}
public void del_book(Book m ){
   Main.booklist.remove(m); 

}
  
public void riset(Category m ){

      adbook = Main.booklist;


} 
  ArrayList<Book> search_book_title_Adm(String s)
           
   {
       
       ArrayList<Book> temp = new ArrayList<Book>();
       
       
     for(Book b: Main.booklist)
         
     {
         
         if(b.get_title().equals(s))
         {
             temp.add(b);
         }
     }
     adbook=temp;
          return adbook; 
   }
  
  
  
  
    ArrayList<Book> search_book_by_category(String s)
           
   {
       
       ArrayList<Book> temp = new ArrayList<Book>();
       
       
     for(Book b: Main.booklist)
         
     {
         
         if(b.get_category().equals(s))
         {
             temp.add(b);
         }
     }
     adbook=temp;
          return adbook; 
   }
    
    
    
    
     public void Sort_by_rating(){
 
       Collections.sort(adbook , new Comparator<Book>() {
           @Override
           public int compare(Book t, Book t1) {
return t.get_average_rating().compareTo(t1.get_average_rating());
           
           }
       });
    

}
     
    
 // LITOURGIES GIA RESERVATIONS 
public void verify_reservetion(Reservation m,User u){
 
    Main.reservationlist.remove(m); 
    

}

 public void cansel_reservetions(Reservation m,User u){
 
    Main.reservationlist.remove(m); 
    

}     
 
  ArrayList<Book> Filter_by_booktitle(String s)
           
   {
      Book booko = new Book();
       ArrayList<Reservation> temp = new ArrayList<Reservation>();
       
       ArrayList<Book> tempBook = new ArrayList<Book>();
     for(Reservation b: Main.reservationlist)
         
     {
       
         if(b.getbook().get_title().equals(s))
         {
            booko = b.getbook();
         }
         tempBook.add(booko);
     }
             
          return tempBook; 
   }
  
  
 
 public void Sort_by_date_riserved(){
  Reservation temp = new Reservation();
       Collections.sort(Main.reservationlist,new Comparator<Reservation>() {
           @Override
           public int compare(Reservation t, Reservation t1) {
     em = t.get_date().compareTo(t1.get_date());
           
           }
       });
 
 
 
  
}


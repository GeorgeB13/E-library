public class Administrator {
    
    private String username;
    private String password;
    private String email;
     ArrayList<Category> categ = new ArrayList<Category>();
    
    public Administrator(String username, String password, String email)
            
    {
    this.username = username;
    this.password = password;
    this.email = email;
    }
    
    
    public String get_username()
            
    {
        return username;
    }
    
    public String get_password()
            
    {
        return password;   
    }
    
    
    public String get_email()

    {
        return email;
    }


    public void delete_user(User u)
    {
        Main.userlist.remove(u);
    }   
    
    public void delete_category(Category c)
    {
        Main.categorylist.remove(c);
    } 
    
    
    public void send_message(Message m,User u)
    {
         ArrayList<Message> temp = new ArrayList<Message>();
            
         temp.add(m);
    }
     ArrayList<Book> search_book_title_Adm(String s)
           
   {
       
       ArrayList<Book> temp = new ArrayList<Book>();
       
       int flag = 0;
     for(Book b: Main.booklist)
         
     {
         
         if(b.get_title().equals(s))
         {
             temp.add(b);
         }
     }
          return temp; 
   }
    

public void add_categ(Category m ){

    
categ.add(m);

}

public void del_categ(Category m ){

    
categ.remove(m);

}


public void add_book(Book m ){
   Main.booklist.add(m); 

}
public void del_book(Book m ){
   Main.booklist.remove(m); 

}
public void searh_book(String m ){
   Main.booklist.remove(m); 

}
  ArrayList<Book> search_book_by_title(String s)
           
   {
       
       ArrayList<Book> temp = new ArrayList<Book>();
       
       int flag = 0;
     for(Book b: Main.booklist)
         
     {
         
         if(b.get_title().equals(s))
         {
             temp.add(b);
         }
     }
          return temp; 
   }
  
    ArrayList<Book> search_book_by_category(String s)
           
   {
       
       ArrayList<Book> temp = new ArrayList<Book>();
       
       int flag = 0;
     for(Book b: Main.booklist)
         
     {
         
         if(b.get_category().equals(s))
         {
             temp.add(b);
         }
     }
          return temp; 
   }
public void verify_reservetion(Reservation m,User u){
 
    Main.reservationlist.remove(m); 
    

}   
        
}

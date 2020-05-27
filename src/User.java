import java.util.*;
public class User {
    
    private String username;
    private String password;
    private String email;
    private String photopath;
    
    public User(String username, String password, String email, String photopath)
    {
        this.username = username;
        this.password = password;
        this.email = email;
        this.photopath = photopath;
        
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
    
   public String get_photo_path()
           
   {
       
    return photopath;   
   }
   
   ArrayList<Book> search_book_title(String s)
           
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
}

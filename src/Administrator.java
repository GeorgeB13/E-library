/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 7_USER
 */
public class Administrator {
    
    private String username;
    private String password;
    private String email;
    
    
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
        
        
}

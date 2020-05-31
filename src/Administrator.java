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
    
    public void delete_category(Category c)
    {
        Main.categorylist.remove(c);
    } 
    
    
    public void send_message(Message m,User u)
    {
         ArrayList<Message> temp = new ArrayList<Message>();
            
         temp.add(m);
    }
        
        
}

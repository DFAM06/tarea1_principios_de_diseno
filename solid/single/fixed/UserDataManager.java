public class UserDataManager {
    
    private String username;
    private String password;
    private CredentialsValidator validator;
    

    public UserDataManager(String username, String password, CredentialsValidator validator) {
        this.username = username;
        this.password = password;
        this.validator = validator;
        
    }

    public boolean registerUser() {
        return validator.validateUsername(username) && validator.validatePassword(password);
            
    }

    public boolean loginUser() {
        return validator.validateUsername(username) && validator.validatePassword(password);
          
    }
}
    

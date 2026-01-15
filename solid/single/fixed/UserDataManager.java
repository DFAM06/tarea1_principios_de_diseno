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

class CredentialsValidator{

    public boolean validateUsername(String username) {
        return username.length() >= 5 && username.matches("[a-zA-Z_0-9]+");
    }

    public boolean validatePassword(String password) {
        return password.length() >= 8 && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    }

}
    
class Main{
    public static void main(String[] args) {
        UserDataManager userManager = new UserDataManager("john_doe", "Password123", new CredentialsValidator());

        if (userManager.registerUser()){
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }

        if (userManager.loginUser()) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
     
    }
}

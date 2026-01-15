public class UserDataManager {
    
    private CredentialsValidator validator;
    

    public UserDataManager(CredentialsValidator validator) {
        this.validator = validator;
        
    }

    public void registerUser(String username, String password) {
        if (validator.validateUsername(username) && validator.validatePassword(password)) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void loginUser(String username, String password) {
        if (validator.validateUsername(username) && validator.validatePassword(password)) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
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
        UserDataManager userManager = new UserDataManager(new CredentialsValidator());

        userManager.registerUser("john_doe", "Password123");
     
        userManager.loginUser("john_doe", "Password123");
    }
}

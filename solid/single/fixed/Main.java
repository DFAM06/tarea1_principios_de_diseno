public class Main{
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


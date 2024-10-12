package backend.backend.dto;



public class LoginUserDto {
    private String username;
    private String password;
    private String email; // Ajoutez cette ligne si elle est nécessaire

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() { // Ajoutez cette méthode
        return email;
    }

    public void setEmail(String email) { // Ajoutez cette méthode
        this.email = email;
    }
}

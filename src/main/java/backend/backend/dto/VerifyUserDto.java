package backend.backend.dto;

public class VerifyUserDto {
	 private String email;
	    private String verificationCode; // Assurez-vous que cette variable est définie

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getVerificationCode() { // Ajoutez cette méthode
	        return verificationCode;
	    }

	    public void setVerificationCode(String verificationCode) { // Ajoutez cette méthode
	        this.verificationCode = verificationCode;
	    }
}

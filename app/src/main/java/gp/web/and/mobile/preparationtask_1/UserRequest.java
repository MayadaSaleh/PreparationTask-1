package gp.web.and.mobile.preparationtask_1;

/**
 * Created by Mayada on 4/9/2018.
 */

public class UserRequest {

    private String email;

    private String password;


    public UserRequest(String mail, String pass) {
        email = mail;
        password = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ClassPojo [email = " + email + ", password = " + password + "]";
    }
}

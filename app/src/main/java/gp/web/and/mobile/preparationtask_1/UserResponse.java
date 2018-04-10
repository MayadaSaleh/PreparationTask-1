package gp.web.and.mobile.preparationtask_1;

/**
 * Created by Mayada on 4/9/2018.
 */

public class UserResponse {
    private String message;

    private String error;

    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClassPojo [message = " + message + ", error = " + error + ", status = " + status + "]";
    }
}

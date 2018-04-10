package gp.web.and.mobile.preparationtask_1;

import android.view.View;

import com.facebook.login.LoginResult;

import org.json.JSONObject;

/**
 * Created by Mayada on 4/9/2018.
 */

public interface Contract {

    interface MyView {

        String getMail();
        String getPassword();
        void initView();
        void getUserDetailsusingFBView(JSONObject json_object);
        void getValidationResult(String s);

    }

    interface MyModel {
        String getValidEmailPattern();
        String getValidPasswordPattern();
        String getloginDatafromJson(String mail, String password);
    }

    interface MyPresenter {
        void checkValidation();
        void getUserDetailsusingFBPresenter(LoginResult loginResult);
        String checkjson(String mail, String password);
    }


}



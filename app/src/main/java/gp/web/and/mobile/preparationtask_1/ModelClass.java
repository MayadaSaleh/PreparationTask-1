package gp.web.and.mobile.preparationtask_1;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mayada on 4/9/2018.
 */

public class ModelClass implements Contract.MyModel {
    String users = "loading";


    @Override
    public String getValidEmailPattern() {
        return "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    }


    @Override
    public String getValidPasswordPattern() {
        return null;
    }

    @Override
    public String getloginDatafromJson(final String mail, final String password) {
        if (users == "loading") {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Api.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            Api api = retrofit.create(Api.class);
            UserRequest userRequest = new UserRequest(mail, password);
            final Call<UserResponse> call = api.getUsers(userRequest);
            call.enqueue(new Callback<UserResponse>() {
                @Override
                public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                    users = "true";
                }

                @Override
                public void onFailure(Call<UserResponse> call, Throwable t) {
                    users = "false";
                }
            });
        }
        return users;
    }
}

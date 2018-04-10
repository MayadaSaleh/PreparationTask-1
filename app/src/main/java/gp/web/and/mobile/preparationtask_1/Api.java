package gp.web.and.mobile.preparationtask_1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Mayada on 4/4/2018.
 */

public interface Api {

    String BASE_URL = "https://private-d3105-tamini.apiary-mock.com/Tamini/";

    @POST("login")
    Call<UserResponse> getUsers(@Body UserRequest userRequest);

}

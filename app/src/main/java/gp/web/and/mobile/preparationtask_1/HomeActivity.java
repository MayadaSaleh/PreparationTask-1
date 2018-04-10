package gp.web.and.mobile.preparationtask_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends Activity {

    @BindView(R.id.fb_name)
    TextView fb_name;

    @BindView(R.id.fb_mail)
    TextView fb_mail;

    JSONObject response, profile_pic_data, profile_pic_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);


        Intent intent = getIntent();
        String jsondata = intent.getStringExtra("userProfile");
        String mail=intent.getStringExtra("mail");
        String password=intent.getStringExtra("password");

        try {

            if (jsondata !=null) {
                response = new JSONObject(jsondata);
                fb_mail.setText(response.get("email").toString());
                fb_name.setText(response.get("name").toString());
//           profile_pic_data = new JSONObject(response.get("picture").toString());
//            profile_pic_url = new JSONObject(profile_pic_data.getString("data"));
//            Picasso.with(this).load(profile_pic_url.getString("url")).into(user_picture);
            }else if(mail !=null && password !=null){
                fb_mail.setText(mail);
                fb_name.setText(password);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

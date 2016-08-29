package loginscreen.solution.example.com.loginscreen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class LoginWelcomeActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent in=new Intent(LoginWelcomeActivity.this,MainActivity.class);
        in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

        startActivity(in);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_welcome);

        SharedPreferences retrieveUserData = getSharedPreferences(MainActivity.USER_ACCOUNT_DATA, MODE_PRIVATE);

        String name = retrieveUserData.getString("name", null);
        String email = retrieveUserData.getString("email", null);
        String phone = retrieveUserData.getString("phone", null);

        TextView printName = (TextView) findViewById(R.id.tv_name);
        TextView printEmail = (TextView) findViewById(R.id.tv_email);
        TextView printPhone = (TextView) findViewById(R.id.tv_phone);

        printName.setText(name);
        printEmail.setText(email);
        printPhone.setText(phone);
    }

}

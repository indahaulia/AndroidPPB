package polinema.ac.id.dtschapter03_starter;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgotPasswod_11684 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_passwod11684);
    }
    public void postSendRequest(View view){
        Intent i = new Intent(ForgotPasswod_11684.this, ResetPassword_11684.class);
        startActivity(i);
    }
}
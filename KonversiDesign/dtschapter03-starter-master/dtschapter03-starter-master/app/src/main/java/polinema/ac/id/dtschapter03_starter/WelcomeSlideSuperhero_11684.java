package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeSlideSuperhero_11684 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_superhero11684);
    }
    public void clickGetStarted (View view){
        Intent i = new Intent(WelcomeSlideSuperhero_11684. this, WelcomeSlideSuperhero_11684.class);
        startActivity(i);

    }

    public void clickLogin(View view){
        Intent i =new Intent(WelcomeSlideSuperhero_11684.this, WelcomeBack_11684.class);
        startActivity(i);
    }
}
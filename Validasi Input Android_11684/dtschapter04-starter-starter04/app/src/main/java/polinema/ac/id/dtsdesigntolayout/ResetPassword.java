package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    // Deklarasi EditText
    EditText rset_code;
    EditText restPassword;
    EditText restRepeatPassword;
    final int MAX_PASSWORD_LENGTH = 15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        // Binding EditText
        rset_code = findViewById(R.id.edt_txt_code);
        restPassword = findViewById(R.id.edt_new_password);
        restRepeatPassword = findViewById(R.id.edt_confirm_password);
    }
    public void postChangePassword(View view) {
        // Validasi kosong
        if(TextUtils.isEmpty(rset_code.getText().toString().trim()) &&
                TextUtils.isEmpty(restPassword.getText().toString().trim()) &&
                TextUtils.isEmpty(restRepeatPassword.getText().toString().trim()))
        {
            Toast.makeText(view.getContext(),"Code dan Password Tidak boleh kosong!",Toast.LENGTH_LONG).show();
        }
        // Cek inputan new dan confirm
        else if(TextUtils.isEmpty(rset_code.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Code Tidak Boleh Kosong!",Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(restPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Password Tidak boleh kosong!",Toast.LENGTH_LONG).show();
        }
        else if (restPassword.getText().length() > MAX_PASSWORD_LENGTH){
            Toast.makeText(view.getContext(),"Password Lebih Dari 15 Karakter",Toast.LENGTH_LONG).show();
        }
        else if (!restPassword.getText().toString().equals(restRepeatPassword.getText().toString())){
            Toast.makeText(view.getContext(),"Password tidak cocok",Toast.LENGTH_LONG).show();
        }
        else{
        Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
        startActivity(i);
        }

    }
}

package com.udinus.sqlite_11684;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText xnim;
    EditText xnama;
    Button tblAdd;
    Button tblView;
    DatabaseHelper BantuDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BantuDB = new DatabaseHelper(this);
        xnim = (EditText)findViewById(R.id.xnim);
        xnama = (EditText)findViewById(R.id.xnama);
        tblAdd = (Button)findViewById(R.id.tblAdd);
        tblView = (Button)findViewById(R.id.tblView);
        viewAll();
        tblAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                boolean isInterted =
                        BantuDB.insertData(xnim.getText().toString(),xnama.getText().toString());
                if (isInterted == true)
                    Toast.makeText(MainActivity.this, "Data Tersimpan", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "Data Gagal Tersimpan", Toast.LENGTH_LONG).show();
            }

        });
    }

    public void viewAll(){
        tblView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick (View v){
                        Cursor res = BantuDB.getAllData();
                        if (res.getCount() == 0){
                            //show message
                            showMessage ("Error", "Nothing Found");
                            return;
                        }
                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()){
                            buffer.append("Nim :"+ res.getString(0)+"\n");
                            buffer.append("Nama Mahasiswa :"+res.getString(1)+"\n");
                        }

                        //show All Data
                        showMessage ("Mahasiswa :", buffer.toString());

                    }
                });
    }

    public void showMessage(String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}
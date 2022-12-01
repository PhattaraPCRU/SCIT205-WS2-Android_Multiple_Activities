package pcru.phattara.androidmultipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NextPage1(View view) {
        Button btn_next = (Button) findViewById(R.id.button1);
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void NextPage2(View view) {
        Button btn_next = (Button) findViewById(R.id.button2);
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
public void NextPageIntro(View view) {
        Button btn_next = (Button) findViewById(R.id.btn_intro);
        Intent intent = new Intent(this, MainActivityIntro.class);
        startActivity(intent);
    }
}
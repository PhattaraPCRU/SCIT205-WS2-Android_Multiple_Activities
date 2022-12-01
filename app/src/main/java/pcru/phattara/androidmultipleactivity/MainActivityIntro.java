package pcru.phattara.androidmultipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intro);
    }
    public void BackPage1(View view) {
        Button btn_back = (Button) findViewById(R.id.buttonBack);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
package pcru.phattara.androidmultipleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void BackPage1(View view) {
//        finish();
        Button btn_back = (Button) findViewById(R.id.button1);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

package mobile.lecture.minsky.mymultitouchapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        setContentView(new MultiTouchView(this, null));
        setContentView(new MyImageView(this));
    }
}

package example.weian.project2_usingtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* load activity_main.xml */
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.my_textview);

        String message = "this is project 2!";
        mTextView.setText(message);
    }
}

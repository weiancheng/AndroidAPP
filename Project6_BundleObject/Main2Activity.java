package example.weian.project6_bundleobject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = this.getIntent().getExtras();

        int height = bundle.getInt("height");
        int width = bundle.getInt("width");
        int length = bundle.getInt("length");

        int area = height * width * length;

        mTextView = (TextView)findViewById(R.id.textView2);
        String msg = "Your area is " + area;
        mTextView.setText(msg);
    }
}

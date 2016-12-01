package example.weian.project7_backtoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView mTextView;
    private Button mButton;

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

        final Intent intent = this.getIntent();

        mButton = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Main2Activity.this.setResult(RESULT_OK, intent);
                Main2Activity.this.finish();
            }
        });
    }
}

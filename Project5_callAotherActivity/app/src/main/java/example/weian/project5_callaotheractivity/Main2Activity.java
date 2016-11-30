/* Ex3-9 */
package example.weian.project5_callaotheractivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextView = (TextView)findViewById(R.id.activity2_textview);
        String msg = "This is Activity2.";
        mTextView.setText(msg);
    }
}

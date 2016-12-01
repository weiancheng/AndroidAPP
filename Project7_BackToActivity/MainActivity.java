/**
 * Ex3-11
 */
package example.weian.project7_backtoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private EditText height_et, width_et, length_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height_et = (EditText)findViewById(R.id.height_editText);
        width_et = (EditText)findViewById(R.id.width_editText);
        length_et = (EditText)findViewById(R.id.length_editText);

        mButton = (Button)findViewById(R.id.calculate_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int height = Integer.parseInt(height_et.getText().toString());
                final int width = Integer.parseInt(width_et.getText().toString());
                final int length = Integer.parseInt(length_et.getText().toString());

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main2Activity.class);

                Bundle bundle = new Bundle();
                bundle.putInt("height", height);
                bundle.putInt("width", width);
                bundle.putInt("length", length);

                int result = RESULT_CANCELED;
                intent.putExtras(bundle);
                startActivityForResult(intent, result);
            }
        });
    }
}

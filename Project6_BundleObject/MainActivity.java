/* Ex3-10 */
package example.weian.project6_bundleobject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText height_edittext;
    private EditText width_edittext;
    private EditText length_edittext;

    private Button calculate_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height_edittext = (EditText)findViewById(R.id.h_editText);
        width_edittext = (EditText)findViewById(R.id.width_editText);
        length_edittext = (EditText)findViewById(R.id.length_editText);

        calculate_btn = (Button)findViewById(R.id.c_button);
        calculate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int height = Integer.parseInt(height_edittext.getText().toString());
                final int width = Integer.parseInt(width_edittext.getText().toString());
                final int length = Integer.parseInt(length_edittext.getText().toString());

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main2Activity.class);

                Bundle bundle = new Bundle();
                bundle.putInt("height", height);
                bundle.putInt("width", width);
                bundle.putInt("length", length);

                intent.putExtras(bundle);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }
}

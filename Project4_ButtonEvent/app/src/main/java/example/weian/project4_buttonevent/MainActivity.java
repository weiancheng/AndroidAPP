/* EX3-7 */
package example.weian.project4_buttonevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private Button hello_button, world_button, exit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.my_text_view);
        hello_button = (Button) findViewById(R.id.hello_button);
        world_button = (Button) findViewById(R.id.world_button);
        exit_button = (Button) findViewById(R.id.exit_button);

        hello_button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Hello";
                mTextView.setText(msg);
            }
        });

        world_button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "World";
                mTextView.setText(msg);
            }
        });

        exit_button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(1);
            }
        });
    }
}

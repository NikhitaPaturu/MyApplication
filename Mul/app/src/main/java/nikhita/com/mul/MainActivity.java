package nikhita.com.mul;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by meghana on 2/28/2016.
 */
public class MainActivity extends Activity
{
    EditText et;
    Button b;
    TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        et = (EditText) findViewById(R.id.tableno);
        b = (Button) findViewById(R.id.b1);
        tv = (TextView) findViewById(R.id.main);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = et.getText().toString();
                int tno = Integer.parseInt(data);
                String res = "";
                for (int i = 1; i <= 10; i++)
                {
                     res = res + tno + " X " + i + " = " + (tno * i)+"\n";
                }
                tv.setText(res);
            }
        });
    }
}

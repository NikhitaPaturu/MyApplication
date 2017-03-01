package nikhita.com.cal1;

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
  EditText et1,et2;
    Button bt1,bt2,bt3,bt4;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        et1 = (EditText) findViewById(R.id.no1);
        et2 = (EditText) findViewById(R.id.no2);
        bt1 = (Button) findViewById(R.id.b1);
        bt2 = (Button) findViewById(R.id.b2);
        bt3 = (Button) findViewById(R.id.b3);
        bt4 = (Button) findViewById(R.id.b4);
        t1 = (TextView) findViewById(R.id.tv1);
        t2=(TextView)findViewById(R.id.tv2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data1 = et1.getText().toString();
                String data2 = et2.getText().toString();
                int tno1 = Integer.parseInt(data1);
                int tno2 = Integer.parseInt(data2);
                int res = tno1 + tno2;
                t2.setText(""+res);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data1 = et1.getText().toString();
                String data2 = et2.getText().toString();
                int tno1 = Integer.parseInt(data1);
                int tno2 = Integer.parseInt(data2);
                int res = tno1 - tno2;
                t2.setText(""+res);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data1 = et1.getText().toString();
                String data2 = et2.getText().toString();
                int tno1 = Integer.parseInt(data1);
                int tno2 = Integer.parseInt(data2);
                int res = tno1 * tno2;
                t2.setText(""+res);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String data1 = et1.getText().toString();
                String data2 = et2.getText().toString();
                int tno1 = Integer.parseInt(data1);
                int tno2 = Integer.parseInt(data2);
                int res = tno1 / tno2;
                t2.setText(""+res);
            }
        });
    }

}

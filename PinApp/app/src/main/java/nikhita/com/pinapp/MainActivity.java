package nikhita.com.pinapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by meghana on 2/29/2016.
 */
public class MainActivity extends Activity
{
    EditText et;
    Button b1,b2;
    int  count= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        et = (EditText) findViewById(R.id.no);
        b1 = (Button) findViewById(R.id.check);
        b2 = (Button) findViewById(R.id.reset);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String data1 = et.getText().toString();
                int e = Integer.parseInt(data1);

                if (e == 1234) {

                    Toast.makeText(MainActivity.this, "Valid USER", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Invalid USER", Toast.LENGTH_LONG).show();
                    count = count + 1;

                    if (count <= 3) {
                        Toast.makeText(MainActivity.this, "Limit is there", Toast.LENGTH_LONG).show();
                    } else {
                        if (count == 3) {
                            Toast.makeText(MainActivity.this, "Limit exceeded,please RESET", Toast.LENGTH_LONG).show();
                        }

                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View v)

                {
                    et.setText("");
                 }


        });
    }
}

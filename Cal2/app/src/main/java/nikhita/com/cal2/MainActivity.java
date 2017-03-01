package nikhita.com.cal2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by meghana on 2/28/2016.
 */
public class MainActivity extends Activity
{
    EditText et1, et2, et3;
    Button b1;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        et1 = (EditText) findViewById(R.id.no1);
        et2 = (EditText) findViewById(R.id.sign);
        et3 = (EditText) findViewById(R.id.no2);
        b1 = (Button) findViewById(R.id.submit);
        tv1 = (TextView) findViewById(R.id.res);
        tv2 = (TextView) findViewById(R.id.ress);


        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String s=et2.getText().toString();
                String s1;
                if(s.equals("+")|| s.equals("-")|| s.equals("*")|| s.equals("/")) {
                    if (s.equals("+")) {
                        String data1 = et1.getText().toString();
                        String data2 = et3.getText().toString();
                        int e1 = Integer.parseInt(data1);
                        int e3 = Integer.parseInt(data2);
                        int r = e1 + e3;
                         s1=String.valueOf(r);
                        tv2.setText(s1);

                    }
                    if (s.equals("-")) {
                        String data1 = et1.getText().toString();
                        String data2 = et3.getText().toString();
                        int e1 = Integer.parseInt(data1);
                        int e3 = Integer.parseInt(data2);
                        int r = e1 - e3;
                        s1= String.valueOf(r);
                        tv2.setText(s1);

                    }
                    if (s.equals("*"))
                    {
                        String data1 = et1.getText().toString();
                        String data2 = et3.getText().toString();
                        int e1 = Integer.parseInt(data1);
                        int e3 = Integer.parseInt(data2);
                        int r = e1 * e3;
                        s1=String.valueOf(r);
                        tv2.setText(s1);
                    }
                    if (s.equals("/")) {
                        String data1 = et1.getText().toString();
                        String data2 = et3.getText().toString();
                        int e1 = Integer.parseInt(data1);
                        int e3 = Integer.parseInt(data2);
                        int r = e1 / e3;
                        s1=String.valueOf(r);
                        tv2.setText(s1);
                    }
                }



            }
        });


    }
}


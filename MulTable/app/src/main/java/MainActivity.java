package
import nikhita.com.multable.
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by meghana on 2/26/2016.
 */
public class MainActivity extends Activity
{
    EditText et;
    Button b;
    TextView tv[] = new TextView[10];
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        et = (EditText)findViewById(R.id.t_no);
        b = (Button)findViewById(R.id.b1);
        tv[0] = (TextView)findViewById(R.id.tv1);

        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String data = et.getText().toString();
                int tno = Integer.parseInt(data);
                for (int i=1;i<=10;i++)
                {
                    String res = (tno+" X "+i+" = "+(tno*i))+"/n";
                    tv[i-1].setText(res);
                }
            }
        });
    }
}

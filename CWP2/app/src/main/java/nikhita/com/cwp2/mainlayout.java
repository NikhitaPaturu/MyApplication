package nikhita.com.cwp2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by meghana on 2/16/2016.
 */public class MainActivity extends Activity
{
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        View v = findViewById(R.id.b1);
        b = (Button)v;

        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Toast.makeText(MainActivity.this,"Please Dont click me",Toast.LENGTH_LONG).show();
            }
        });
    }
} {
}

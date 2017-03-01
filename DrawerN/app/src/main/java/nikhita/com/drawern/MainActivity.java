package nikhita.com.drawern;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources r= getResources();
        String items[]= r.getStringArray(R.array.items_name);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,items);
        ListView lv=(ListView)findViewById(R.id.lv1);
        lv.setAdapter(aa);
    }
}

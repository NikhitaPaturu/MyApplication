package nikhita.com.navigationdrawer;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by meghana on 3/22/2016.
 */
public class MainActivity extends Activity
{
 @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources r= getResources();
        String items[]= r.getStringArray(R.array.items);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,items);
        ListView lv=(ListView)findViewById(R.id.lv1);
        lv.setAdapter(aa);
    }
}

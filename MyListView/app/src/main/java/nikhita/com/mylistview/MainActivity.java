package nikhita.com.mylistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv;
        lv = (ListView)findViewById(R.id.lv1);

        ImageView iv = new ImageView(this);
        iv.setImageResource(R.drawable.pc);
        lv.addHeaderView(iv);


        Button b = new Button(this);
        b.setText("Contact Us");
        lv.addFooterView(b);

        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.contact_us);
            }
        });

        final String items[] = {"C","C++","Java","Android"};

        ArrayAdapter aa = new ArrayAdapter(this,R.layout.design_list_view,items);

        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this, items[position - 1], Toast.LENGTH_SHORT).show();
            }
        });
    }
}


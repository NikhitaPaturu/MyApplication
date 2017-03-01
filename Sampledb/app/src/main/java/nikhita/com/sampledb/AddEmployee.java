package nikhita.com.sampledb;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by meghana on 3/30/2016.
 */
public class AddEmployee extends Activity {

    EditText et1, et2, et3;
    SQLiteDatabase db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addemployee);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        try {
            int id = Integer.parseInt(et1.toString());
            String name = et2.toString();
            double sal = Double.parseDouble(et3.toString());
            boolean res =  MainActivity.mdb.insert(id, name, sal);
            if(res)
            {
                Toast.makeText(this,"data inserted sucessfully",Toast.LENGTH_LONG).show();
            }
            else
                Toast.makeText(this,"data not inserted",Toast.LENGTH_LONG).show();
        } catch (Exception e)
        {
            Log.e("Data ", "" + e);
        }

    }


}
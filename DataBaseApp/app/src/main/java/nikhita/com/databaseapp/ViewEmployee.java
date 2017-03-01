package nikhita.com.databaseapp;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by meghana on 2/29/2016.
 */
public class ViewEmployee extends Activity
{
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_employee_layout);
        ll = (LinearLayout)findViewById(R.id.ll1);
        try
        {
            SQLiteDatabase db = MainActivity.mdb.getWritableDatabase();
            String qry = "select * from employee";
            Cursor c = db.rawQuery(qry, null);
            c.moveToFirst();
            do
            {
                int idno = c.getInt(0);
                String name = c.getString(1);
                double sal = c.getDouble(2);

                TextView tv = new TextView(this);
                tv.setText(idno+" - "+name+" - "+sal);
                tv.setTextSize(20);
                tv.setTextColor(Color.WHITE);
                ll.addView(tv);
            }
            while (c.moveToNext());
        }
        catch (Exception e)
        {
            Log.e("Read Data", "" + e);
            Toast.makeText(ViewEmployee.this, "Reading Problem", Toast.LENGTH_SHORT).show();
        }


    }
}

package nikhita.com.databaseapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by meghana on 2/29/2016.
 */
public class NewEmployee extends Activity
{
    EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_employee_layout);

        et1 = (EditText)findViewById(R.id.e_id);
        et2 = (EditText)findViewById(R.id.e_name);
        et3 = (EditText)findViewById(R.id.e_sal);
    }

    public void addEmployee(View v)
    {
        try
        {
            String idno = et1.getText().toString().trim();
            int id = Integer.parseInt(idno);
            String name = et2.getText().toString().trim();
            String salary = et3.getText().toString().trim();
            double sal = Double.parseDouble(salary);

           boolean res=MainActivity.mdb.insertData(id,name,sal);
            if(res)
            {
                Toast.makeText(NewEmployee.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                et1.setText("");
                et2.setText("");
                et3.setText("");
            }
            else
            {
                Toast.makeText(NewEmployee.this, "Data not Inserted", Toast.LENGTH_SHORT).show();
            }

        }
        catch (Exception e)
        {
            Log.e("Invlaid", "" + e);
            Toast.makeText(NewEmployee.this, "Invalid Input", Toast.LENGTH_SHORT).show();
        }

    }


}

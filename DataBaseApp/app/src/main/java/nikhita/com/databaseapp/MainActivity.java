package nikhita.com.databaseapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by meghana on 2/29/2016.
 */
public class MainActivity extends Activity
{
    static MyDatabase mdb;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        mdb = new MyDatabase(this);
    }

    public void openNewEmployee(View v)
    {
        startActivity(new Intent(this,NewEmployee.class));
    }
    public void openViewEmployee(View v)
    {
        startActivity(new Intent(this,ViewEmployee.class));
    }
}

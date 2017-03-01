package nikhita.com.sampledb;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
   static MyDatabase mdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mdb = new MyDatabase(this);
    }
    public void addEmployee(View v)
    {
        startActivity(new Intent(MainActivity.this,AddEmployee.class));
    }
}

package nikhita.com.mypizzaapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void orderM()
    {
        AlertDialog.Builder ad= new AlertDialog.Builder(this);
        ad.setIcon(android.R.drawable.btn_star_big_on);
        ad.setTitle("order your pizza");
        final  String items[]={"VegPizza","NonVegPizza"};
        ArrayAdapter aa= new ArrayAdapter(MainActivity.this,R.layout.spinner_layout,items);
        Spinner spin1=(Spinner)findViewById(R.id.spinner);
        spin1.setAdapter(aa);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id)
            {
                AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
                ad.setIcon(android.R.drawable.btn_star_big_on);
                ad.setTitle("VEG PIZZA's");
                ad.setIcon(R.drawable.pizza);
                LinearLayout l1 = (LinearLayout) findViewById(R.id.l1);
                ad.setView(l1);
            }
            public void display(View v) {
                CheckBox cb = (CheckBox) v;
                int id = cb.getId();
                Intent i = new Intent(MainActivity.this,R.layout.OrderActivity.class);
                switch (id) {
                    case R.id.cb1:
                    {
                        if (cb.isChecked())
                        {


                        } else
                        {

                        }
                        break;
                    }
                    case R.id.cb2: {
                        if (cb.isChecked()) {

                        } else {

                        }
                        break;
                    }
                    case R.id.cb3: {
                        if (cb.isChecked()) {

                        } else {

                        }
                    }
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ad.setCancelable(false);
        ad.show();




    }
}

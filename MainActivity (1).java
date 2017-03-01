package bala.com.alertdialoghw;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
EditText et1,et2;
    String username="bala";
    String password="sri";
    int count=0;

    String uname,pswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.ed1);
        uname = et1.getText().toString();
        et2 = (EditText) findViewById(R.id.ed2);
        pswd = et2.getText().toString();
    }

        public void loginvalidate()
    {
        if(uname.equals(username)&&pswd.equals(password))

        {
            AlertDialog.Builder ad=new AlertDialog.Builder(this);
            ad.setIcon(android.R.drawable.btn_star);
            ad.setTitle("enter OTP number");
            final EditText et=new EditText(this);
            et.setHint("OTP Number");
            ad.setView(et);
            ad.setCancelable(false);
            ad.setPositiveButton("submit",new DialogInterface.OnClickListener()
            {
                @Override
            public void onClick(DialogInterface dialog,int which) {
                    String otp = et.getText().toString().trim();
                    int otpnum = Integer.parseInt(otp);
                    if (otpnum == 1236) {
                        Intent i = new Intent(MainActivity.this, WelcomeActivity.class);
                        startActivity(i);
                    } else
                    {
                        otp = "";
                        Toast.makeText(MainActivity.this, "Reenter otp number ", Toast.LENGTH_LONG).show();
                        count = count + 1;
                        if (count == 3) {
                            dialog.cancel();
                            ;
                        }

                    }
                }
            });

         }
        else
        {
            Toast.makeText(MainActivity.this,"Invalid username or password",Toast.LENGTH_LONG).show();
        }



    }


    }


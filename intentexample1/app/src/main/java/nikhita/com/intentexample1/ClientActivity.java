package nikhita.com.intentexample1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by meghana on 3/9/2016.
 */
public class ClientActivity extends Activity {
    String uname,pswd;
    String username="client";
    String pd="login";
    EditText user,password;

  @Override
    protected  void onCreate(Bundle savedInstanceState)
  {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.client_layout);

  }
    public  void clientB(View v)
    {
       user=(EditText)findViewById(R.id.et1);
        uname=user.getText().toString().trim();
        password=(EditText)findViewById(R.id.et2);
        pswd=password.getText().toString().trim();
        if((uname.equals(username))&&(pswd.equals(pd))) {
            Intent i = new Intent(this, ClientWelcome.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this,"Invalid user",Toast.LENGTH_LONG).show();

        }
    }
}

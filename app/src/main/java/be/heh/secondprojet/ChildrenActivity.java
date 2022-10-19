package be.heh.secondprojet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ChildrenActivity extends Activity {

    EditText et_children_Login;
    EditText et_children_Pwd;
    EditText et_children_Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children);

        //Nos contenus XML :
        et_children_Login = (EditText) findViewById(R.id.et_children_login);
        et_children_Pwd = (EditText) findViewById(R.id.et_children_pwd);
        et_children_Email = (EditText) findViewById(R.id.et_children_email);
    }

    public void onChildrenClickManager(View v){
        switch(v.getId()){
            case R.id.bt_children_main:
                if(et_children_Login.getText().toString().isEmpty() || et_children_Pwd.getText().toString().isEmpty() || et_children_Email.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Veuillez compléter les champs !",
                    Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intxt = new Intent(this, MainActivity.class);
                    intxt.putExtra("login", et_children_Login.getText().toString());
                    intxt.putExtra("pwd", et_children_Pwd.getText().toString());
                    intxt.putExtra("email", et_children_Email.getText().toString());
                    startActivity(intxt);
                    finish();
                }
                break;

            case R.id.bt_children_liste:
                Intent navListe = new Intent(this, Activity_list.class);
                startActivity(navListe);
                break;
        }
    }
}
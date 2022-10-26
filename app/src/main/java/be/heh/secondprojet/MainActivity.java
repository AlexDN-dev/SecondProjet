package be.heh.secondprojet;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    SharedPreferences prefs_datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //récupération du login, password et email
        prefs_datas = PreferenceManager.getDefaultSharedPreferences(getApplication());
        //n’affiche pas de message lors du premier lancement de l’application
        if(!prefs_datas.getAll().isEmpty())
        {
            Toast.makeText(getApplicationContext(), "votre login est : "
                                    + prefs_datas.getString("login", "NULL")+ "\n"
                                    + "votre password est : " + prefs_datas.getString("pwd", "NULL")+ "\n"
                                    + "votre email est : " + prefs_datas.getString("email", "NULL") + "\n",
                            Toast.LENGTH_SHORT)
                    .show();
        }
    }

    public void onMainClickManager(View v){
        Intent navChildren = new Intent(this, ChildrenActivity.class);
        startActivity(navChildren);

        switch(v.getId()){
            case R.id.bt_main_children :
                Toast.makeText(getApplicationContext(),
                        "clic sur le bt Enfant",
                        Toast.LENGTH_SHORT)
                        .show();
                break;
        }
    }
}
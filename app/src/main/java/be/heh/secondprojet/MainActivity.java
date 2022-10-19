package be.heh.secondprojet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extratxt = this.getIntent().getExtras();
        if(extratxt != null)
        {
            Toast.makeText(getApplicationContext(), "votre login est : "
                            + (extratxt.getString("login")) + "\n"
                            + "votre password est : " + (extratxt.getString("pwd")) + "\n"
                            + "votre email est : " + (extratxt.getString("email") + "\n" ), Toast.LENGTH_SHORT)
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
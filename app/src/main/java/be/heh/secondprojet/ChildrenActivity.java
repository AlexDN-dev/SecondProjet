package be.heh.secondprojet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ChildrenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children);
    }

    public void onChildrenClickManager(View v){
        switch(v.getId()){
            case R.id.bt_children_main:
                Toast.makeText(getApplicationContext(),"clic sur le bt Main", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
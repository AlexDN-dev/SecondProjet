package be.heh.secondprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Activity_file extends Activity {
    TextView tv_file_datas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);

        tv_file_datas = (TextView) findViewById(R.id.tv_file_datas);
        tv_file_datas.setText("Contenu du fichier texte : \n");
        try {
            FileInputStream ins = openFileInput("monfichier.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
            StringBuilder out = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                out.append(line);
            }
            reader.close();
            ins.close();
            String[] items = out.toString().split("#");
            String[] context = {"Login", "Password", "Email"};
            int i = 0;
            int j = 0;
            for (String item : items) {
                tv_file_datas.setText(tv_file_datas.getText().toString() + Integer.toString(i + 1) + ". " + context[j] + " = " + item + "\n");
                j++;
                if(j == 3){
                    i++;
                    j=0;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
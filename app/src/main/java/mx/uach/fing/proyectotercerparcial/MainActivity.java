package mx.uach.fing.proyectotercerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private Button _btn_link2;
    private Button _a324795;
    private Button _a339079;

    String _url = "https://fairygarbage.github.io/CV/";
    String _url324795 = "https://migueleduardosanchez.github.io/";
    String _url339079 = "https://c-basstian.github.io/ccvv/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        _btn_link2 = findViewById(R.id.btn_link2);
        _btn_link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link2 = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW, _link2);
                startActivity(i);
            }
        });

        _a324795 = findViewById(R.id.a324795);
        _a324795.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Uri _link1 = Uri.parse(_url324795);
                Intent i = new Intent(Intent.ACTION_VIEW, _link1);
                startActivity(i);
            }
        });

        _a339079 = findViewById(R.id.a339079);
        _a339079.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Uri _link3 = Uri.parse(_url339079);
                Intent i = new Intent(Intent.ACTION_VIEW, _link3);
                startActivity(i);
            }
        });
    }

}
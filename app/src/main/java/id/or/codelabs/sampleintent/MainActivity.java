package id.or.codelabs.sampleintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSub1;
    private Button btnSub2;
    private Button btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSub1 = (Button)findViewById(R.id.btn_activity_sub_1);
        btnSub2 = (Button)findViewById(R.id.btn_activity_sub_2);
        btnDial = (Button)findViewById(R.id.btn_activity_dial);

        btnSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sub1Activity.class);
                startActivity(intent);
            }
        });

        btnSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sub2Activity.class);
                intent.putExtra(Sub2Activity.KEY_DATA, "Training Aplikasi Android");
                startActivityForResult(intent, 0);
            }
        });

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:082121212093"));
                startActivity(intent);
            }
        });
    }
}

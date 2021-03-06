package ie.ncirl.student.pintpricerv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mLogin,mRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLogin = (Button) findViewById(R.id.login);


        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomerLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mRegister = (Button) findViewById(R.id.register);


        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomerRegisterActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}

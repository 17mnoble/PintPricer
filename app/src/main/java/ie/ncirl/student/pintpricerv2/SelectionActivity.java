package ie.ncirl.student.pintpricerv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.firebase.auth.FirebaseAuth;

public class SelectionActivity extends AppCompatActivity {
    //initializing variables
    private Button mLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        mLogout = (Button) findViewById(R.id.logout);
        mLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(SelectionActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        Spinner locationSpinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> locationAdaptor = new ArrayAdapter<String>(SelectionActivity.this,
        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.location_array));
        locationAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        locationSpinner.setAdapter(locationAdaptor);

        Spinner drinkSpinner = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> drinkAdaptor = new ArrayAdapter<String>(SelectionActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.drink_type_array));
        drinkAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        drinkSpinner.setAdapter(drinkAdaptor);

    }
}

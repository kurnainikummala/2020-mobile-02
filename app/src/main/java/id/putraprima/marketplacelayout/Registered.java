package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registered extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);
    }
    public void postProfile (View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
    public void backLogin (View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

}

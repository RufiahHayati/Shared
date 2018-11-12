package comw.example.rplrus26.shared;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class Shared_Preferences extends AppCompatActivity {

    public static final String data = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sharedPreferences = getSharedPreferences("Login", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "");

        if (username.equals("")) {
            Intent intent = new Intent(Shared_Preferences.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

        else if (username == username) {
            Intent intent = new Intent(Shared_Preferences.this, Tampil.class);
            startActivity(intent);
            finish();
        }
    }
}

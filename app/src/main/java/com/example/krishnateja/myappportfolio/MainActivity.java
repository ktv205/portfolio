package com.example.krishnateja.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        int id = view.getId();
        String toastMessage = "This button will launch ";
        switch (id) {
            case R.id.spotify_streamer_button:
                toastMessage = toastMessage + getString(R.string.spotify_streamer);
                break;
            case R.id.scores_app_button:
                toastMessage = toastMessage + getString(R.string.scores_app);
                break;
            case R.id.library_app_button:
                toastMessage = toastMessage + getString(R.string.library_app);
                break;
            case R.id.build_it_bigger_button:
                toastMessage = toastMessage + getString(R.string.build_it_bigger);
                break;
            case R.id.xyz_reader_button:
                toastMessage = toastMessage + getString(R.string.xyz_reader);
                break;
            case R.id.my_own_app_button:
                toastMessage = toastMessage + getString(R.string.my_own_app);
                break;
            default:
                toastMessage = "something went wrong";
                break;
        }
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();

    }
}

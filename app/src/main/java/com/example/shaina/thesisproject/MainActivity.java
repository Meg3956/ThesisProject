package com.example.shaina.thesisproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //PermissionUtils.requestPermission(this, );
        GPSTracker gps = new GPSTracker(this);
        if (gps.canGetLocation()) {
            gps.getLatitude();
            gps.getLongitude();
        } else {
            gps.showSettingsAlert();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSavedSpots(View view) {
        Intent intent = new Intent(this, SavedSpotsActivity.class);
        startActivity(intent);
    }

    //Create AlertDialog to allow user option of customizing saved spots info
 /*   AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    builder.setMessage(R.string.dialog_message).setTitle(R.string.dialog_title);

    //Add buttons to the AlertDialog
    builder.setPositiveButton(R.string.dialog_yes_btn, new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int id) {
            // User clicked OK button
        }
    });
builder.setNegativeButton(R.string.dialog_no_btn, new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int id) {
            // User cancelled the dialog
        }
    });
    AlertDialog dialog = builder.create();
*/

} //end MainActivity

package monty.tscf;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import monty.tscf.Fragments.BaseNavActivity;
import monty.tscf.Fragments.introfragment;

/**
 * Created by monty on 15/9/16.
 */
public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 5 seconds
                    sleep(3 * 1000);

                    // After 5 seconds redirect to another intent
                    Intent i = new Intent(Splash.this, introfragment.class);
                    startActivity(i);

                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();
    }

}

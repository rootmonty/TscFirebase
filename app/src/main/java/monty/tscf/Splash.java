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

        Intent intent = new Intent(this, introfragment.class);
        startActivity(intent);
        finish();
    }

}

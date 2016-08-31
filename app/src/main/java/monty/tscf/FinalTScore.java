package monty.tscf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

/**
 * Created by monty on 22/8/16.
 */
public class FinalTScore extends AppCompatActivity {

    Firebase tscore;
    TextView tv;
    Button b1, b2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finaltscore);
        Firebase.setAndroidContext(this);
        tv = (TextView) findViewById(R.id.tv);
        b1 = (Button) findViewById(R.id.back);
        b2 = (Button) findViewById(R.id.getvalue);
        tscore = new Firebase("https://tscf-b4925.firebaseio.com/Tscore");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tscore.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String tsc = dataSnapshot.getValue(String.class);
                        tv.setText(tsc);
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {
                        System.out.println("The read failed: " + firebaseError.getMessage());
                    }
                });
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FinalTScore.this, MainActivity.class));
            }
        });


    }
}

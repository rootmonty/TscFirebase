package monty.tscf;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

import org.json.JSONObject;

import java.util.Random;

/**
 * Created by monty on 12/8/16.
 */
public class Feedback extends AppCompatActivity {

    EditText q1, q2, q3, q4, q5, q6, q7;
    Button b1, b2;
    StudentDetails studentDetails;
    // String details;
    Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
        Firebase.setAndroidContext(this);

        q1 = (EditText) findViewById(R.id.etq1);
        q2 = (EditText) findViewById(R.id.etq2);
        q3 = (EditText) findViewById(R.id.etq3);
        q4 = (EditText) findViewById(R.id.etq4);
        q5 = (EditText) findViewById(R.id.etq5);
        q6 = (EditText) findViewById(R.id.etq6);
        q7 = (EditText) findViewById(R.id.etq7);

        b1 = (Button) findViewById(R.id.bsubmit);
        b2 = (Button) findViewById(R.id.bback);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Random r = new Random();
                // r=r % 10;
                studentDetails = new StudentDetails();
                studentDetails.setAnswer1(q1.getText().toString());
                studentDetails.setAnswer2(q2.getText().toString());
                studentDetails.setAnswer3(q3.getText().toString());
                studentDetails.setAnswer4(q4.getText().toString());
                studentDetails.setAnswer5(q5.getText().toString());
                studentDetails.setAnswer6(q6.getText().toString());
                studentDetails.setAnswer7(q7.getText().toString());
                // details = q1.getText().toString() + q2.getText().toString() + q3.getText().toString() + q4.getText().toString();
                mRef = new Firebase("https://tscf-b4925.firebaseio.com/");
                //  Object obj = new Object();
                //  obj = (Object) details;
                // mRef.child("#" + r.toString()).setValue(studentDetails);
                mRef.push().child("Detail").setValue(studentDetails);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1.setText(null);
                q2.setText(null);
                q3.setText(null);
                q4.setText(null);
                q5.setText(null);
                q6.setText(null);
                q7.setText(null);
                // q4.setText(null);


                startActivity(new Intent(Feedback.this, FinalTScore.class));
                //finish();
            }
        });

    }

}

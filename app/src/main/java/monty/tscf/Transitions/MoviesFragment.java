package monty.tscf.Transitions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import monty.tscf.*;


public class MoviesFragment extends Fragment {

    TextView tv;
    Button b1, b2;
    Firebase tscore;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_movies, container, false);
        tv = (TextView) rootView.findViewById(R.id.tv);
        b1 = (Button) rootView.findViewById(R.id.back);
        b2 = (Button) rootView.findViewById(R.id.getvalue);
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
                //startActivity(new Intent(MoviesFragment.this, monty.tscf.MainActivity.class));

            }
        });

        return rootView;
    }

}

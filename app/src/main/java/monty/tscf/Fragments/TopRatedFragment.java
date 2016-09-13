package monty.tscf.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import monty.tscf.R;
import monty.tscf.RecyclerViews.CardAdapter;


public class TopRatedFragment extends Fragment {

    public static final String TAG = "TAG";
    RecyclerView recyclerView2;
    Button button2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.cardviewrecycler, container, false);
        recyclerView2 = (RecyclerView) rootView.findViewById(R.id.my_recycler_view2);

        CardAdapter cardAdapter = new CardAdapter(getContext());
        recyclerView2.setAdapter(cardAdapter);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));

        // button2 = (Button) rootView.findViewById(R.id.button);
       /*
       //OLD CODE Till the use of static layout inflation
       //NEW CODE LIES ABOVE

        final EditText q1, q2, q3, q4, q5, q6, q7;

        final Button b1, b2;
        final StudentDetails studentDetails;
        studentDetails = new StudentDetails();
        // String details;
        final Firebase mRef;
        mRef = new Firebase("https://tscf-b4925.firebaseio.com/");
        //Firebase.setAndroidContext(this);

        q1 = (EditText) rootView.findViewById(R.id.etq1);
        q2 = (EditText) rootView.findViewById(R.id.etq2);
        q3 = (EditText) rootView.findViewById(R.id.etq3);
        q4 = (EditText) rootView.findViewById(R.id.etq4);
        q5 = (EditText) rootView.findViewById(R.id.etq5);
        q6 = (EditText) rootView.findViewById(R.id.etq6);
        q7 = (EditText) rootView.findViewById(R.id.etq7);

        b1 = (Button) rootView.findViewById(R.id.bsubmit);
        b2 = (Button) rootView.findViewById(R.id.bback);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Random r = new Random();
                // r=r % 10;

                studentDetails.setAnswer1(q1.getText().toString());
                studentDetails.setAnswer2(q2.getText().toString());
                studentDetails.setAnswer3(q3.getText().toString());
                studentDetails.setAnswer4(q4.getText().toString());
                studentDetails.setAnswer5(q5.getText().toString());
                studentDetails.setAnswer6(q6.getText().toString());
                studentDetails.setAnswer7(q7.getText().toString());
                // details = q1.getText().toString() + q2.getText().toString() + q3.getText().toString() + q4.getText().toString();

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
                Fragment fragnew = new GamesFragment();
                Log.i(TAG, "This is working till here");
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                Log.i(TAG, "Fragment Created ");
                fragmentTransaction.replace(R.id.teacher, fragnew)
                        .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
                Log.i(TAG, "WTF is wrong here");

                //startActivity(new Intent(TopRatedFragment.this, FinalTScore.class));
                //finish();
            }
        });
        */


        return rootView;
    }
}

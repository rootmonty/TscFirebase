package monty.tscf.Transitions;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

import monty.tscf.R;

/**
 * Created by monty on 4/9/16.
 */
public class CardViewholder extends RecyclerView.ViewHolder {

    TextView ques;
    // RatingBar ratingBar;
    // RadioGroup radioGroup;
    TextView changes;
    EditText change;
    //Buttons for collecting the rating
    // Button b1,b2,b3,b4,b5;
    TextView tv1, tv2, tv3, tv4, tv5;
    // RadioButton radioButton;
    Button feed;
    Firebase mref;
    FireObject obj;
    FirePOJO value = new FirePOJO();
    int id;

    public CardViewholder(final View itemView) {
        super(itemView);

        ques = (TextView) itemView.findViewById(R.id.setQuestion);
        // ratingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);
        changes = (TextView) itemView.findViewById(R.id.change);
        change = (EditText) itemView.findViewById(R.id.feed);
        //radioGroup=(RadioGroup) itemView.findViewById(R.id.radioGroup);
        //radioButton = (RadioButton) itemView.findViewById(radioGroup.getCheckedRadioButtonId());
        // Buttons typecast for the rating
        tv1 = (TextView) itemView.findViewById(R.id.one);
        tv2 = (TextView) itemView.findViewById(R.id.two);
        tv3 = (TextView) itemView.findViewById(R.id.three);
        tv4 = (TextView) itemView.findViewById(R.id.four);
        tv5 = (TextView) itemView.findViewById(R.id.five);
        feed = (Button) itemView.findViewById(R.id.getfeed);

        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mref = new Firebase("https://tscf-b4925.firebaseio.com/database/");
                // value.setRating(Math.round(ratingBar.getRating()));
                // value.setRating(radioButton.getText().toString());
                value.setEditfeed(String.valueOf(change.getText().toString().trim()));
                //obj.addValue(value);
                mref.push().child("New Database").setValue(value);
                // ratingBar.setRating(0);
                changes.setVisibility(View.INVISIBLE);
                change.setVisibility(View.INVISIBLE);
            }
        });

        View.OnClickListener clicklistener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.one:
                        tv1.setFocusableInTouchMode(true);
                        // tv1.setBackgroundColor(Color.BLUE);
                        value.setRating(tv1.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.two:
                        tv2.setFocusableInTouchMode(true);
                        //  tv2.setBackgroundColor(Color.BLUE);
                        value.setRating(tv2.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.three:
                        tv3.setFocusableInTouchMode(true);
                        // tv3.setBackgroundColor(Color.BLUE);
                        value.setRating(tv3.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.four:
                        tv4.setFocusableInTouchMode(true);
                        // tv4.setBackgroundColor(Color.BLUE);
                        value.setRating(tv4.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.five:
                        tv5.setFocusableInTouchMode(true);
                        // tv5.setBackgroundColor(Color.BLUE);
                        value.setRating(tv5.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setRating("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getRating(), Toast.LENGTH_SHORT).show();
                changes.setVisibility(View.VISIBLE);
                change.setVisibility(View.VISIBLE);

            }
        };

        tv1.setOnClickListener(clicklistener);
        tv2.setOnClickListener(clicklistener);
        tv3.setOnClickListener(clicklistener);
        tv4.setOnClickListener(clicklistener);
        tv5.setOnClickListener(clicklistener);

       /*
        switch(id)

        {
            case R.id.one : b1.setOnClickListener(clicklistener);
                                break;
            case R.id.two : b2.setOnClickListener(clicklistener);
                                break;
            case R.id.three : b1.setOnClickListener(clicklistener);
                                break;
            case R.id.four : b1.setOnClickListener(clicklistener);
                                break;
            case R.id.five : b1.setOnClickListener(clicklistener);
                                break;

        }

         */


        //ratingBar.setRating(var);
       /*
        feed.setOnClickListener(new View.OnClickListener() {

        @Override
            public void onClick(View view) {

            }
        });
        */

    }
}

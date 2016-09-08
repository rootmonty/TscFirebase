package monty.tscf.Transitions;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import com.firebase.client.Firebase;

import monty.tscf.R;

/**
 * Created by monty on 4/9/16.
 */
public class CardViewholder extends RecyclerView.ViewHolder {

    TextView ques;
    RatingBar ratingBar;
    TextView changes;
    EditText change;
    Button feed;
    Firebase mref;
    FirePOJO value = new FirePOJO();

    public CardViewholder(View itemView) {
        super(itemView);

        ques = (TextView) itemView.findViewById(R.id.setQuestion);
        ratingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);
        changes = (TextView) itemView.findViewById(R.id.change);
        change = (EditText) itemView.findViewById(R.id.feed);
        feed = (Button) itemView.findViewById(R.id.getfeed);
        //ratingBar.setRating(var);
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changes.setVisibility(View.VISIBLE);
                change.setVisibility(View.VISIBLE);
            }
        });
        feed.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mref = new Firebase("https://tscf-b4925.firebaseio.com/");
                value.setRating(Math.round(ratingBar.getRating()));
                value.setEditfeed(String.valueOf(change.getText().toString().trim()));
                mref.push().child("NewDetail").setValue(value);
                ratingBar.setRating(0);
                changes.setVisibility(View.INVISIBLE);
                change.setVisibility(View.INVISIBLE);
                return false;
            }
        });
    }
}

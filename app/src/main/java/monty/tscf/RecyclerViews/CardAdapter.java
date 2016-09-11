package monty.tscf.RecyclerViews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import monty.tscf.R;

/**
 * Created by monty on 4/9/16.
 */
public class CardAdapter extends RecyclerView.Adapter<CardViewholder> {

    String[] ques = {"How would you grade the Teachers",
            "How Did You Find The Study Material",
            "How Was The Coaching Infrastructure",
            "How Innovative Were The Teachers",
            "Ease Of Travel To The Class",
            "Previous Years' Results",
            "Extra-Curricular Activities",
            "Counselling During Admission",
            "Clear Your Doubts Sessions",
            "How Were The Tests Conducted",
            "How Were The Seminars",
            "How Were The Powerpoint Presentations",
            "Quality of tests in regular time intervals",
            "Syllabus coverage in tests",
    "Test results/feedback on time",
    "Doubt clearance after tests",
    "Remedial classes after tests"};

    Context context;
    LayoutInflater inflater;
    // Firebase mref;
    // FireObject values;
    // FirePOJO valuenew;

    public CardAdapter(Context context) {

        this.context = context;
        inflater = LayoutInflater.from(context);
        //  mref = new Firebase("https://tscf-b4925.firebaseio.com/database/");


    }


   /* View.OnClickListener clicklistener1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //changes.setVisibility(view.VISIBLE);
            //TASK TO DO : SHOW THE HIDDEN EDITTEXT AND QUESTION
            //Meanwhile TOAST

            Toast.makeText(context ,"Display hidden fragment",Toast.LENGTH_SHORT).show();


        }
    };
    */
/*
    View.OnLongClickListener clicklistener2 = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View view) {
            Toast.makeText(context,"Brings invisible segment Back", Toast.LENGTH_SHORT).show();
            return false;
        }
    };

    */

    @Override
    public CardViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.cardview, parent, false);
        CardViewholder cardholder = new CardViewholder(view);
        return cardholder;
    }

    @Override
    public void onBindViewHolder(CardViewholder holder, int position) {

        holder.ques.setText(ques[position]);
        //holder.ratingBar.getRating();
        // holder.radioGroup.getCheckedRadioButtonId();
        holder.changes.setText("How would you like to change");
        //  value.setRating(holder.b);
        holder.change.getText();
        //  valuenew.setEditfeed(holder.change.getText().toString().trim());
        //  mref.push().child(String.valueOf(position) + "Card").setValue(valuenew);



    }

    @Override
    public int getItemCount() {
        return ques.length;
    }
}

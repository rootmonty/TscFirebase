package monty.tscf.Transitions;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.firebase.client.Firebase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import monty.tscf.R;

/**
 * Created by monty on 4/9/16.
 */
public class CardAdapter extends RecyclerView.Adapter<CardViewholder> {

    String[] ques = {" Rate the Staff", "How well was the Study Material", "How were the exercises", "How did you find" +
            "the tests", "How well were the concepts taught", "Give rating to the Utilities Provider",
            "Overall rating for the Teachers"};

    Context context;
    LayoutInflater inflater;
    Firebase mref;
    FireObject value;
    FirePOJO longvalue;

    public CardAdapter(Context context) {

        this.context = context;
        inflater = LayoutInflater.from(context);

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
        holder.ratingBar.getRating();
        holder.changes.setText("How would you like to change");
        holder.change.getText();

    }

    @Override
    public int getItemCount() {
        return ques.length;
    }
}

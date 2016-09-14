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


    public CardAdapter(Context context) {

        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CardViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.cardview, parent, false);
        CardViewholder cardholder = new CardViewholder(view);
        return cardholder;
    }

    @Override
    public void onBindViewHolder(CardViewholder holder, int position) {

        if (holder.itemView == null)
        holder.ques.setText(ques[position]);
        else {
            holder.ques.setText(ques[position]);
            holder.tv1.setBackgroundResource(R.color.standardwhite);
            holder.tv2.setBackgroundResource(R.color.standardwhite);
            holder.tv3.setBackgroundResource(R.color.standardwhite);
            holder.tv5.setBackgroundResource(R.color.standardwhite);
            holder.tv4.setBackgroundResource(R.color.standardwhite);

        }

      /*holder.tv1.setOnClickListener(clicklistener);
        holder.tv2.setOnClickListener(clicklistener);
        holder.tv3.setOnClickListener(clicklistener);
        holder.tv4.setOnClickListener(clicklistener);
        holder.tv5.setOnClickListener(clicklistener);
        */

    }

    @Override
    public int getItemCount() {
        return ques.length;
    }


    public long getItemId(int position) {
        return super.getItemId(position);
    }

}

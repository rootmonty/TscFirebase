package monty.tscf.RecyclerViews;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import monty.tscf.R;

/**
 * Created by monty on 4/9/16.
 */
public class CardAdapter extends RecyclerView.Adapter<CarViewholder> {

    public static int CARD_VAL = 1;
    public static int BUTTON_VAL = 2;
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
    // View iview;

    public CardAdapter(Context context) {

        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CarViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        CarViewholder viewholder;
        View iview;
        if (viewType == CARD_VAL) {
            iview = inflater.inflate(R.layout.cardview, parent, false);
            viewholder = new GenericViewholder(iview);
            return viewholder;
        } else {
            iview = inflater.inflate(R.layout.button, parent, false);
            viewholder = new ButtonViewHolder(iview);
            return viewholder;

        }
    }

    @Override
    public void onBindViewHolder(CarViewholder holder, int position) {
        if (getItemViewType(position) == BUTTON_VAL || position == getItemCount()) {
            Log.i("DEBUG", "hun" + getItemViewType(position));

            ButtonViewHolder buttonViewHolder = (ButtonViewHolder) holder;
            Log.i("DEBUG", "" + getItemViewType(position));

            Log.i("DEBUG", "hun" + getItemViewType(position));

            buttonViewHolder.bottombutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Button Clicked", Toast.LENGTH_LONG).show();
                }
            });
        }

        if (getItemViewType(position) == CARD_VAL && position < getItemCount()) {
            Log.i("DEBUG", "" + getItemViewType(position));

            GenericViewholder genericViewholder = (GenericViewholder) holder;
            // if (genericViewholder.itemView == null)
            //  genericViewholder.ques.setText(ques[position]);
            //  else {
            genericViewholder.ques.setText(ques[position]);
            genericViewholder.tv1.setBackgroundResource(R.color.standardwhite);
            genericViewholder.tv2.setBackgroundResource(R.color.standardwhite);
            genericViewholder.tv3.setBackgroundResource(R.color.standardwhite);
            genericViewholder.tv5.setBackgroundResource(R.color.standardwhite);
            genericViewholder.tv4.setBackgroundResource(R.color.standardwhite);

            // }
        }
        // else
        // holder.bottomb.setText("SUBMIT");


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

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemViewType(int position) {
        return (position <= ques.length - 1) ? CARD_VAL : BUTTON_VAL;


    }

}


package monty.tscf.RecyclerViews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import monty.tscf.R;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    String[] name = {"YOGITHA ", " NEHA APTE ", "NEHA LAD", "RUCHI",
            "NEELAM", "BHUMIKA"};
    // RatingBar ratingBar;
    Context context;
    LayoutInflater inflater;

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getLayoutPosition();

            Toast.makeText(context, "It Will take you to " + position + " Form ", Toast.LENGTH_LONG).show();

        }
    };

    public RecyclerAdapter(Context context) {

        Toast.makeText(context, "Under STAFF TAB,Tap on Image to make the Layout Visible " +
                "and Tap on feedback button to submit the response.The message will now" +
                "vanish", Toast.LENGTH_LONG).show();
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list, parent, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.staff.setText(name[position]);
        // holder.tv2.setOnClickListener(clickListener);
        // holder.tv2.setTag(holder);
        // holder.imageView.setOnClickListener(clickListener);
        // holder.imageView.setTag(holder);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }
}

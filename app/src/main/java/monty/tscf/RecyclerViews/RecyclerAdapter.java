package monty.tscf.RecyclerViews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import monty.tscf.R;


public class RecyclerAdapter extends RecyclerView.Adapter<CarViewholder> {

    public final static int CARD_VAL = 1;
    public static final int BUTTON_VAL = 2;
    String[] name = {"YOGITHA ", " NEHA APTE ", "NEHA LAD", "RUCHI",
            "NEELAM", "BHUMIKA"};
    // RatingBar ratingBar;
    Context context;
    LayoutInflater inflater;


    public RecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CarViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        switch (viewType) {
            case CARD_VAL:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
                return new RecyclerViewHolder(v);
            case BUTTON_VAL:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.button, parent, false);
                return new ButtonViewHolder(v);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(CarViewholder holder, int position) {

        if (getItemViewType(position) == CARD_VAL && position < getItemCount()) {
            RecyclerViewHolder recyclerViewHolder = (RecyclerViewHolder) holder;
            recyclerViewHolder.staff.setText(name[position]);
        } else {
            final ButtonViewHolder buttonViewHolder = (ButtonViewHolder) holder;
            buttonViewHolder.bottombutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    buttonViewHolder.comment.getText();
                    buttonViewHolder.comment.setText("");
                    Toast.makeText(view.getContext(), " DATA Sent with the Comment", Toast.LENGTH_SHORT).show();
                }
            });

        }
        // holder.staff.setText(name[position]);
        // holder.tv2.setOnClickListener(clickListener);
        // holder.tv2.setTag(holder);
        // holder.imageView.setOnClickListener(clickListener);
        // holder.imageView.setTag(holder);

    }

    @Override
    public int getItemCount() {
        return name.length + 1;
    }

    @Override
    public int getItemViewType(int position) {
        return (position < getItemCount() - 1) ? CARD_VAL : BUTTON_VAL;
    }
}

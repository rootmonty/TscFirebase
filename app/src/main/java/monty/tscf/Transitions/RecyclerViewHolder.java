package monty.tscf.Transitions;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import monty.tscf.R;


/**
 * Created by monty on 1/9/16.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView tv1;
    Button tv2;
    ImageView imageView;
    //RatingBar ratingBar;

    public RecyclerViewHolder(final View itemView) {
        super(itemView);

        tv1 = (TextView) itemView.findViewById(R.id.list_title);
        tv2 = (Button) itemView.findViewById(R.id.list_desc);
        imageView = (ImageView) itemView.findViewById(R.id.list_avatar);
        // ratingBar = (RatingBar) itemView.findViewById(R.id.rate);


    }

}

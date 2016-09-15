package monty.tscf.RecyclerViews;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import monty.tscf.R;

/**
 * Created by monty on 15/9/16.
 */
public class ButtonViewHolder extends CarViewholder {

    Button bottombutton;

    public ButtonViewHolder(View itemView) {
        super(itemView);
        bottombutton = (Button) itemView.findViewById(R.id.button);

    }
}

package monty.tscf.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import monty.tscf.LoginActivity;
import monty.tscf.R;

/**
 * Created by monty on 15/9/16.
 */
public class introfragment extends Fragment {

    ImageView v1, v2, v3, v4;
    Animation animation;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.maindrawerpage, container, false);

        v1 = (ImageView) root.findViewById(R.id.imageView);
        v2 = (ImageView) root.findViewById(R.id.imageView2);
        v3 = (ImageView) root.findViewById(R.id.imageView3);
        v4 = (ImageView) root.findViewById(R.id.imageView4);
        View.OnClickListener clicklistener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
                animation = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);
                animation.setDuration(2000);
                view.startAnimation(animation);
            }
        };
        v1.setOnClickListener(clicklistener);
        v2.setOnClickListener(clicklistener);
        v3.setOnClickListener(clicklistener);
        v4.setOnClickListener(clicklistener);

        return root;

    }
}

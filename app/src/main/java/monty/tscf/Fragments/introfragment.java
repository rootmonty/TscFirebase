package monty.tscf.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import monty.tscf.LoginSection.LoginActivity;
import monty.tscf.R;

/**
 * Created by monty on 15/9/16.
 */
public class introfragment extends AppCompatActivity {

    ImageView v1, v2, v3, v4;
    Animation animation;

    @Nullable
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maindrawerpage);

        v1 = (ImageView) findViewById(R.id.imageView);
        v2 = (ImageView) findViewById(R.id.imageView2);
        v3 = (ImageView) findViewById(R.id.imageView3);
        v4 = (ImageView) findViewById(R.id.imageView4);
        View.OnClickListener clicklistener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(introfragment.this, LoginActivity.class);
                startActivity(intent);
                animation = AnimationUtils.loadAnimation(introfragment.this, R.anim.fade_in);
                animation.setDuration(2000);
                view.startAnimation(animation);
            }
        };
        v1.setOnClickListener(clicklistener);
        v2.setOnClickListener(clicklistener);
        v3.setOnClickListener(clicklistener);
        v4.setOnClickListener(clicklistener);

    }
}

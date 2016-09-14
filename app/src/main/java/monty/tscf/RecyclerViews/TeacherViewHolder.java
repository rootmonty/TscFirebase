package monty.tscf.RecyclerViews;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

import monty.tscf.R;
import monty.tscf.POJO.Teacher;

public class TeacherViewHolder extends RecyclerView.ViewHolder {

    TextView TeacherName;
    TextView q1, q2, q3, q4, q5, q6;
    TextView b01, b02, b03, b04, b05;
    TextView b11, b12, b13, b14, b15;
    TextView b21, b22, b23, b24, b25;
    TextView b31, b32, b33, b34, b35;
    TextView b41, b42, b43, b44, b45;
    TextView b51, b52, b53, b54, b55;
    TextView Elaborate;
    EditText ElaborateAns;
    Button submit;
    Firebase mref;
    Teacher value = new Teacher();


    public TeacherViewHolder(View itemView) {
        super(itemView);
        mref = new Firebase("https://tscf-b4925.firebaseio.com/teacherfeedback/");
        TeacherName = (TextView) itemView.findViewById(R.id.staffname);
        q1 = (TextView) itemView.findViewById(R.id.q1);
        q2 = (TextView) itemView.findViewById(R.id.q2);
        q3 = (TextView) itemView.findViewById(R.id.q3);
        q4 = (TextView) itemView.findViewById(R.id.q4);
        q5 = (TextView) itemView.findViewById(R.id.q5);
        q6 = (TextView) itemView.findViewById(R.id.q6);
        Elaborate = (TextView) itemView.findViewById(R.id.elaborate);
        ElaborateAns = (EditText) itemView.findViewById(R.id.elaborateans);
        submit = (Button) itemView.findViewById(R.id.submitbut);
        b01 = (TextView) itemView.findViewById(R.id.b1);
        b02 = (TextView) itemView.findViewById(R.id.b2);
        b03 = (TextView) itemView.findViewById(R.id.b3);
        b04 = (TextView) itemView.findViewById(R.id.b4);
        b05 = (TextView) itemView.findViewById(R.id.b5);
        b11 = (TextView) itemView.findViewById(R.id.b11);
        b12 = (TextView) itemView.findViewById(R.id.b12);
        b13 = (TextView) itemView.findViewById(R.id.b13);
        b14 = (TextView) itemView.findViewById(R.id.b14);
        b15 = (TextView) itemView.findViewById(R.id.b15);
        b21 = (TextView) itemView.findViewById(R.id.b21);
        b22 = (TextView) itemView.findViewById(R.id.b22);
        b23 = (TextView) itemView.findViewById(R.id.b23);
        b24 = (TextView) itemView.findViewById(R.id.b24);
        b25 = (TextView) itemView.findViewById(R.id.b25);
        b31 = (TextView) itemView.findViewById(R.id.b31);
        b32 = (TextView) itemView.findViewById(R.id.b32);
        b33 = (TextView) itemView.findViewById(R.id.b33);
        b34 = (TextView) itemView.findViewById(R.id.b34);
        b35 = (TextView) itemView.findViewById(R.id.b35);
        b41 = (TextView) itemView.findViewById(R.id.b41);
        b42 = (TextView) itemView.findViewById(R.id.b42);
        b43 = (TextView) itemView.findViewById(R.id.b43);
        b44 = (TextView) itemView.findViewById(R.id.b44);
        b45 = (TextView) itemView.findViewById(R.id.b45);
        b51 = (TextView) itemView.findViewById(R.id.b51);
        b52 = (TextView) itemView.findViewById(R.id.b52);
        b53 = (TextView) itemView.findViewById(R.id.b53);
        b54 = (TextView) itemView.findViewById(R.id.b54);
        b55 = (TextView) itemView.findViewById(R.id.b55);

        submit = (Button) itemView.findViewById(R.id.submitbut);


        View.OnClickListener clicklistener1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b1:
                        if (b04.getBackground() != null || b02.getBackground() != null || b03.getBackground() != null
                                || b05.getBackground() != null) {
                            b04.setBackgroundResource(R.color.standardwhite);
                            b02.setBackgroundResource(R.color.standardwhite);
                            b03.setBackgroundResource(R.color.standardwhite);
                            b05.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b01.setBackgroundResource(R.drawable.fill);
                        // tv1.setBackgroundColor(Color.BLUE);
                        value.setAns1(b01.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.b2:
                        if (b04.getBackground() != null || b01.getBackground() != null || b03.getBackground() != null
                                || b05.getBackground() != null) {
                            b04.setBackgroundResource(R.color.standardwhite);
                            b01.setBackgroundResource(R.color.standardwhite);
                            b03.setBackgroundResource(R.color.standardwhite);
                            b05.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b02.setBackgroundResource(R.drawable.fill);
                        //  tv2.setBackgroundColor(Color.BLUE);
                        value.setAns1(b02.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b3:
                        if (b04.getBackground() != null || b02.getBackground() != null || b01.getBackground() != null
                                || b05.getBackground() != null) {
                            b04.setBackgroundResource(R.color.standardwhite);
                            b02.setBackgroundResource(R.color.standardwhite);
                            b01.setBackgroundResource(R.color.standardwhite);
                            b05.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b03.setBackgroundResource(R.drawable.fill);
                        value.setAns1(b03.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b4:
                        if (b01.getBackground() != null || b02.getBackground() != null || b03.getBackground() != null
                                || b05.getBackground() != null) {
                            b01.setBackgroundResource(R.color.standardwhite);
                            b02.setBackgroundResource(R.color.standardwhite);
                            b03.setBackgroundResource(R.color.standardwhite);
                            b05.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b04.setBackgroundResource(R.drawable.fill);
                        value.setAns1(b04.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b5:
                        if (b04.getBackground() != null || b02.getBackground() != null || b03.getBackground() != null
                                || b01.getBackground() != null) {
                            b04.setBackgroundResource(R.color.standardwhite);
                            b02.setBackgroundResource(R.color.standardwhite);
                            b03.setBackgroundResource(R.color.standardwhite);
                            b01.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b05.setBackgroundResource(R.drawable.fill);
                        value.setAns1(b05.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setAns1("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getAns1(), Toast.LENGTH_SHORT).show();

            }
        };
        View.OnClickListener clicklistener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b11:
                        if (b14.getBackground() != null || b12.getBackground() != null || b13.getBackground() != null
                                || b15.getBackground() != null) {
                            b14.setBackgroundResource(R.color.standardwhite);
                            b12.setBackgroundResource(R.color.standardwhite);
                            b13.setBackgroundResource(R.color.standardwhite);
                            b15.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b11.setBackgroundResource(R.drawable.fill);
                        value.setAns2(b11.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.b12:
                        if (b14.getBackground() != null || b11.getBackground() != null || b13.getBackground() != null
                                || b15.getBackground() != null) {
                            b14.setBackgroundResource(R.color.standardwhite);
                            b11.setBackgroundResource(R.color.standardwhite);
                            b13.setBackgroundResource(R.color.standardwhite);
                            b15.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b12.setBackgroundResource(R.drawable.fill);
                        value.setAns2(b12.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b13:
                        if (b14.getBackground() != null || b12.getBackground() != null || b11.getBackground() != null
                                || b15.getBackground() != null) {
                            b14.setBackgroundResource(R.color.standardwhite);
                            b12.setBackgroundResource(R.color.standardwhite);
                            b11.setBackgroundResource(R.color.standardwhite);
                            b15.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b13.setBackgroundResource(R.drawable.fill);
                        value.setAns2(b13.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b14:
                        if (b11.getBackground() != null || b12.getBackground() != null || b13.getBackground() != null
                                || b15.getBackground() != null) {
                            b11.setBackgroundResource(R.color.standardwhite);
                            b12.setBackgroundResource(R.color.standardwhite);
                            b13.setBackgroundResource(R.color.standardwhite);
                            b15.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b14.setBackgroundResource(R.drawable.fill);
                        value.setAns2(b14.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b15:
                        if (b14.getBackground() != null || b12.getBackground() != null || b13.getBackground() != null
                                || b11.getBackground() != null) {
                            b14.setBackgroundResource(R.color.standardwhite);
                            b12.setBackgroundResource(R.color.standardwhite);
                            b13.setBackgroundResource(R.color.standardwhite);
                            b11.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b15.setBackgroundResource(R.drawable.fill);
                        value.setAns2(b15.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setAns2("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getAns2(), Toast.LENGTH_SHORT).show();

            }
        };

        View.OnClickListener clicklistener3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b21:
                        if (b24.getBackground() != null || b22.getBackground() != null || b23.getBackground() != null
                                || b25.getBackground() != null) {
                            b24.setBackgroundResource(R.color.standardwhite);
                            b22.setBackgroundResource(R.color.standardwhite);
                            b23.setBackgroundResource(R.color.standardwhite);
                            b25.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b21.setBackgroundResource(R.drawable.fill);
                        value.setAns3(b21.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.b22:
                        if (b24.getBackground() != null || b24.getBackground() != null || b23.getBackground() != null
                                || b25.getBackground() != null) {
                            b24.setBackgroundResource(R.color.standardwhite);
                            b21.setBackgroundResource(R.color.standardwhite);
                            b23.setBackgroundResource(R.color.standardwhite);
                            b25.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b22.setBackgroundResource(R.drawable.fill);
                        value.setAns3(b22.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b23:
                        if (b24.getBackground() != null || b22.getBackground() != null || b21.getBackground() != null
                                || b25.getBackground() != null) {
                            b24.setBackgroundResource(R.color.standardwhite);
                            b22.setBackgroundResource(R.color.standardwhite);
                            b21.setBackgroundResource(R.color.standardwhite);
                            b25.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b23.setBackgroundResource(R.drawable.fill);
                        value.setAns3(b23.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b24:
                        if (b21.getBackground() != null || b22.getBackground() != null || b23.getBackground() != null
                                || b25.getBackground() != null) {
                            b21.setBackgroundResource(R.color.standardwhite);
                            b22.setBackgroundResource(R.color.standardwhite);
                            b23.setBackgroundResource(R.color.standardwhite);
                            b25.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b24.setBackgroundResource(R.drawable.fill);
                        value.setAns3(b24.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b25:
                        if (b24.getBackground() != null || b22.getBackground() != null || b23.getBackground() != null
                                || b21.getBackground() != null) {
                            b24.setBackgroundResource(R.color.standardwhite);
                            b22.setBackgroundResource(R.color.standardwhite);
                            b23.setBackgroundResource(R.color.standardwhite);
                            b21.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b25.setBackgroundResource(R.drawable.fill);
                        value.setAns3(b25.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setAns3("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getAns3(), Toast.LENGTH_SHORT).show();

            }
        };

        View.OnClickListener clicklistener5 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b41:
                        if (b44.getBackground() != null || b42.getBackground() != null || b43.getBackground() != null
                                || b45.getBackground() != null) {
                            b44.setBackgroundResource(R.color.standardwhite);
                            b42.setBackgroundResource(R.color.standardwhite);
                            b43.setBackgroundResource(R.color.standardwhite);
                            b45.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b41.setBackgroundResource(R.drawable.fill);
                        value.setAns5(b41.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.b42:
                        if (b44.getBackground() != null || b41.getBackground() != null || b43.getBackground() != null
                                || b45.getBackground() != null) {
                            b44.setBackgroundResource(R.color.standardwhite);
                            b41.setBackgroundResource(R.color.standardwhite);
                            b43.setBackgroundResource(R.color.standardwhite);
                            b45.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b42.setBackgroundResource(R.drawable.fill);
                        value.setAns5(b42.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b43:
                        if (b44.getBackground() != null || b42.getBackground() != null || b41.getBackground() != null
                                || b45.getBackground() != null) {
                            b44.setBackgroundResource(R.color.standardwhite);
                            b42.setBackgroundResource(R.color.standardwhite);
                            b41.setBackgroundResource(R.color.standardwhite);
                            b45.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b43.setBackgroundResource(R.drawable.fill);
                        value.setAns5(b43.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b44:
                        if (b41.getBackground() != null || b42.getBackground() != null || b43.getBackground() != null
                                || b45.getBackground() != null) {
                            b41.setBackgroundResource(R.color.standardwhite);
                            b42.setBackgroundResource(R.color.standardwhite);
                            b43.setBackgroundResource(R.color.standardwhite);
                            b45.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b44.setBackgroundResource(R.drawable.fill);
                        value.setAns5(b44.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b45:
                        if (b44.getBackground() != null || b42.getBackground() != null || b43.getBackground() != null
                                || b41.getBackground() != null) {
                            b44.setBackgroundResource(R.color.standardwhite);
                            b42.setBackgroundResource(R.color.standardwhite);
                            b43.setBackgroundResource(R.color.standardwhite);
                            b41.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b45.setBackgroundResource(R.drawable.fill);
                        value.setAns5(b45.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setAns5("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getAns5(), Toast.LENGTH_SHORT).show();

            }
        };

        View.OnClickListener clicklistener6 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b51:
                        if (b54.getBackground() != null || b52.getBackground() != null || b53.getBackground() != null
                                || b55.getBackground() != null) {
                            b54.setBackgroundResource(R.color.standardwhite);
                            b52.setBackgroundResource(R.color.standardwhite);
                            b53.setBackgroundResource(R.color.standardwhite);
                            b55.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b51.setBackgroundResource(R.drawable.fill);
                        value.setAns6(b51.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.b52:
                        if (b54.getBackground() != null || b51.getBackground() != null || b53.getBackground() != null
                                || b55.getBackground() != null) {
                            b54.setBackgroundResource(R.color.standardwhite);
                            b51.setBackgroundResource(R.color.standardwhite);
                            b53.setBackgroundResource(R.color.standardwhite);
                            b55.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b52.setBackgroundResource(R.drawable.fill);
                        value.setAns6(b52.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b53:
                        if (b54.getBackground() != null || b52.getBackground() != null || b51.getBackground() != null
                                || b55.getBackground() != null) {
                            b54.setBackgroundResource(R.color.standardwhite);
                            b52.setBackgroundResource(R.color.standardwhite);
                            b51.setBackgroundResource(R.color.standardwhite);
                            b55.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b53.setBackgroundResource(R.drawable.fill);
                        value.setAns6(b53.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b54:
                        if (b51.getBackground() != null || b52.getBackground() != null || b53.getBackground() != null
                                || b55.getBackground() != null) {
                            b51.setBackgroundResource(R.color.standardwhite);
                            b52.setBackgroundResource(R.color.standardwhite);
                            b53.setBackgroundResource(R.color.standardwhite);
                            b55.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b54.setBackgroundResource(R.drawable.fill);
                        value.setAns6(b54.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b55:
                        if (b54.getBackground() != null || b52.getBackground() != null || b53.getBackground() != null
                                || b54.getBackground() != null) {
                            b54.setBackgroundResource(R.color.standardwhite);
                            b52.setBackgroundResource(R.color.standardwhite);
                            b53.setBackgroundResource(R.color.standardwhite);
                            b55.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b55.setBackgroundResource(R.drawable.fill);
                        value.setAns6(b55.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setAns6("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getAns6(), Toast.LENGTH_SHORT).show();

            }
        };

        View.OnClickListener clicklistener4 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b31:
                        if (b34.getBackground() != null || b32.getBackground() != null || b33.getBackground() != null
                                || b35.getBackground() != null) {
                            b34.setBackgroundResource(R.color.standardwhite);
                            b32.setBackgroundResource(R.color.standardwhite);
                            b33.setBackgroundResource(R.color.standardwhite);
                            b35.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b31.setBackgroundResource(R.drawable.fill);
                        value.setAns4(b31.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.b32:
                        if (b34.getBackground() != null || b31.getBackground() != null || b33.getBackground() != null
                                || b35.getBackground() != null) {
                            b34.setBackgroundResource(R.color.standardwhite);
                            b31.setBackgroundResource(R.color.standardwhite);
                            b33.setBackgroundResource(R.color.standardwhite);
                            b35.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b32.setBackgroundResource(R.drawable.fill);
                        value.setAns4(b32.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b33:
                        if (b34.getBackground() != null || b32.getBackground() != null || b31.getBackground() != null
                                || b35.getBackground() != null) {
                            b34.setBackgroundResource(R.color.standardwhite);
                            b32.setBackgroundResource(R.color.standardwhite);
                            b31.setBackgroundResource(R.color.standardwhite);
                            b35.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b33.setBackgroundResource(R.drawable.fill);
                        value.setAns4(b33.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b34:
                        if (b33.getBackground() != null || b32.getBackground() != null || b31.getBackground() != null
                                || b35.getBackground() != null) {
                            b33.setBackgroundResource(R.color.standardwhite);
                            b32.setBackgroundResource(R.color.standardwhite);
                            b31.setBackgroundResource(R.color.standardwhite);
                            b35.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b34.setBackgroundResource(R.drawable.fill);
                        // tv4.setBackgroundColor(Color.BLUE);
                        value.setAns4(b34.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b35:
                        if (b34.getBackground() != null || b32.getBackground() != null || b33.getBackground() != null
                                || b31.getBackground() != null) {
                            b34.setBackgroundResource(R.color.standardwhite);
                            b32.setBackgroundResource(R.color.standardwhite);
                            b33.setBackgroundResource(R.color.standardwhite);
                            b31.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b35.setBackgroundResource(R.drawable.fill);
                        // tv5.setBackgroundColor(Color.BLUE);
                        value.setAns4(b35.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setAns4("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getAns4(), Toast.LENGTH_SHORT).show();

            }
        };

        b01.setOnClickListener(clicklistener1);
        b02.setOnClickListener(clicklistener1);
        b03.setOnClickListener(clicklistener1);
        b04.setOnClickListener(clicklistener1);
        b05.setOnClickListener(clicklistener1);
        b11.setOnClickListener(clicklistener2);
        b12.setOnClickListener(clicklistener2);
        b13.setOnClickListener(clicklistener2);
        b14.setOnClickListener(clicklistener2);
        b15.setOnClickListener(clicklistener2);
        b21.setOnClickListener(clicklistener3);
        b22.setOnClickListener(clicklistener3);
        b23.setOnClickListener(clicklistener3);
        b24.setOnClickListener(clicklistener3);
        b25.setOnClickListener(clicklistener3);
        b31.setOnClickListener(clicklistener4);
        b32.setOnClickListener(clicklistener4);
        b33.setOnClickListener(clicklistener4);
        b34.setOnClickListener(clicklistener4);
        b35.setOnClickListener(clicklistener4);
        b41.setOnClickListener(clicklistener5);
        b42.setOnClickListener(clicklistener5);
        b43.setOnClickListener(clicklistener5);
        b44.setOnClickListener(clicklistener5);
        b45.setOnClickListener(clicklistener5);
        b51.setOnClickListener(clicklistener6);
        b52.setOnClickListener(clicklistener6);
        b53.setOnClickListener(clicklistener6);
        b54.setOnClickListener(clicklistener6);
        b55.setOnClickListener(clicklistener6);
//
        View.OnClickListener submission = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setElaborate(Elaborate.getText().toString());
                value.setElaborateans(ElaborateAns.getText().toString());
                value.setTeachername(TeacherName.getText().toString());
                mref.push().child("Teacher feedback").setValue(value);
                Toast.makeText(view.getContext(), "Your Teacher Submission is Done", Toast.LENGTH_LONG).show();
            }
        };
        submit.setOnClickListener(submission);


    }
}

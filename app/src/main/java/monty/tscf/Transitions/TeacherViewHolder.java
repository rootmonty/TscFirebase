package monty.tscf.Transitions;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

import monty.tscf.R;

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
                        b02.setTextColor(Color.BLACK);
                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        b01.setTextColor(Color.BLUE);
                        b01.setFocusableInTouchMode(true);
                        // tv1.setBackgroundColor(Color.BLUE);
                        value.setAns1(b01.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.b2:
                        b01.setTextColor(Color.BLACK);
                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        b02.setTextColor(Color.BLUE);
                        b02.setFocusableInTouchMode(true);
                        //  tv2.setBackgroundColor(Color.BLUE);
                        value.setAns1(b02.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b3:
                        b01.setTextColor(Color.BLACK);
                        b02.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        b03.setTextColor(Color.BLUE);
                        b03.setFocusableInTouchMode(true);
                        // tv3.setBackgroundColor(Color.BLUE);
                        value.setAns1(b03.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b4:
                        b01.setTextColor(Color.BLACK);
                        b02.setTextColor(Color.BLACK);
                        b03.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLUE);
                        b04.setFocusableInTouchMode(true);
                        // tv4.setBackgroundColor(Color.BLUE);
                        value.setAns1(b04.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b5:
                        b01.setTextColor(Color.BLACK);
                        b02.setTextColor(Color.BLACK);
                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLUE);
                        b05.setFocusableInTouchMode(true);
                        // tv5.setBackgroundColor(Color.BLUE);
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
                        b12.setTextColor(Color.BLACK);
                        b13.setTextColor(Color.BLACK);
                        b14.setTextColor(Color.BLACK);
                        b15.setTextColor(Color.BLACK);
                        b11.setTextColor(Color.BLUE);
                        b11.setFocusableInTouchMode(true);
                        // tv1.setBackgroundColor(Color.BLUE);
                        value.setAns2(b11.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.b12:
                        b11.setTextColor(Color.BLACK);
                        b13.setTextColor(Color.BLACK);
                        b14.setTextColor(Color.BLACK);
                        b15.setTextColor(Color.BLACK);
                        b12.setTextColor(Color.BLUE);
                        b12.setFocusableInTouchMode(true);
                        //  tv2.setBackgroundColor(Color.BLUE);
                        value.setAns2(b12.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b13:
                        b11.setTextColor(Color.BLACK);
                        b12.setTextColor(Color.BLACK);
                        b14.setTextColor(Color.BLACK);
                        b15.setTextColor(Color.BLACK);
                        b13.setTextColor(Color.BLUE);
                        b13.setFocusableInTouchMode(true);
                        // tv3.setBackgroundColor(Color.BLUE);
                        value.setAns2(b13.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b14:
                        b11.setTextColor(Color.BLACK);
                        b12.setTextColor(Color.BLACK);
                        b13.setTextColor(Color.BLACK);
                        b15.setTextColor(Color.BLACK);
                        b14.setTextColor(Color.BLUE);
                        b14.setFocusableInTouchMode(true);
                        // tv4.setBackgroundColor(Color.BLUE);
                        value.setAns2(b14.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b15:
                        b11.setTextColor(Color.BLACK);
                        b12.setTextColor(Color.BLACK);
                        b13.setTextColor(Color.BLACK);
                        b14.setTextColor(Color.BLACK);
                        b15.setTextColor(Color.BLUE);
                        b15.setFocusableInTouchMode(true);
                        // tv5.setBackgroundColor(Color.BLUE);
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
                        b22.setTextColor(Color.BLACK);
                        b23.setTextColor(Color.BLACK);
                        b24.setTextColor(Color.BLACK);
                        b25.setTextColor(Color.BLACK);
                        b21.setTextColor(Color.BLUE);
                        b21.setFocusableInTouchMode(true);
                        // tv1.setBackgroundColor(Color.BLUE);
                        value.setAns3(b01.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.b22:
                        b21.setTextColor(Color.BLACK);
                        b23.setTextColor(Color.BLACK);
                        b24.setTextColor(Color.BLACK);
                        b25.setTextColor(Color.BLACK);
                        b22.setTextColor(Color.BLUE);
                        b22.setFocusableInTouchMode(true);
                        //  tv2.setBackgroundColor(Color.BLUE);
                        value.setAns3(b22.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b23:
                        b21.setTextColor(Color.BLACK);
                        b22.setTextColor(Color.BLACK);
                        b24.setTextColor(Color.BLACK);
                        b25.setTextColor(Color.BLACK);
                        b23.setTextColor(Color.BLUE);
                        b23.setFocusableInTouchMode(true);
                        // tv3.setBackgroundColor(Color.BLUE);
                        value.setAns3(b23.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b24:
                        b21.setTextColor(Color.BLACK);
                        b22.setTextColor(Color.BLACK);
                        b23.setTextColor(Color.BLACK);
                        b25.setTextColor(Color.BLACK);
                        b24.setTextColor(Color.BLUE);
                        b24.setFocusableInTouchMode(true);
                        // tv4.setBackgroundColor(Color.BLUE);
                        value.setAns3(b24.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b25:
                        b21.setTextColor(Color.BLACK);
                        b22.setTextColor(Color.BLACK);
                        b23.setTextColor(Color.BLACK);
                        b24.setTextColor(Color.BLACK);
                        b25.setTextColor(Color.BLUE);
                        b25.setFocusableInTouchMode(true);
                        // tv5.setBackgroundColor(Color.BLUE);
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
                        b42.setTextColor(Color.BLACK);
                        b43.setTextColor(Color.BLACK);
                        b44.setTextColor(Color.BLACK);
                        b45.setTextColor(Color.BLACK);
                        b41.setTextColor(Color.BLUE);
                        b41.setFocusableInTouchMode(true);
                        // tv1.setBackgroundColor(Color.BLUE);
                        value.setAns5(b41.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.b42:
                        b41.setTextColor(Color.BLACK);
                        b43.setTextColor(Color.BLACK);
                        b44.setTextColor(Color.BLACK);
                        b45.setTextColor(Color.BLACK);
                        b42.setTextColor(Color.BLUE);
                        b42.setFocusableInTouchMode(true);
                        //  tv2.setBackgroundColor(Color.BLUE);
                        value.setAns5(b42.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b43:
                        b41.setTextColor(Color.BLACK);
                        b42.setTextColor(Color.BLACK);
                        b44.setTextColor(Color.BLACK);
                        b45.setTextColor(Color.BLACK);
                        b43.setTextColor(Color.BLUE);
                        b43.setFocusableInTouchMode(true);
                        // tv3.setBackgroundColor(Color.BLUE);
                        value.setAns5(b43.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b44:
                        b41.setTextColor(Color.BLACK);
                        b42.setTextColor(Color.BLACK);
                        b43.setTextColor(Color.BLACK);
                        b45.setTextColor(Color.BLACK);
                        b44.setTextColor(Color.BLUE);
                        b44.setFocusableInTouchMode(true);
                        // tv4.setBackgroundColor(Color.BLUE);
                        value.setAns5(b44.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b45:
                        b41.setTextColor(Color.BLACK);
                        b42.setTextColor(Color.BLACK);
                        b43.setTextColor(Color.BLACK);
                        b44.setTextColor(Color.BLACK);
                        b45.setTextColor(Color.BLUE);
                        b45.setFocusableInTouchMode(true);
                        // tv5.setBackgroundColor(Color.BLUE);
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
                        b52.setTextColor(Color.BLACK);
                        b53.setTextColor(Color.BLACK);
                        b54.setTextColor(Color.BLACK);
                        b55.setTextColor(Color.BLACK);
                        b51.setTextColor(Color.BLUE);
                        b51.setFocusableInTouchMode(true);
                        // tv1.setBackgroundColor(Color.BLUE);
                        value.setAns6(b51.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.b52:
                        b51.setTextColor(Color.BLACK);
                        b53.setTextColor(Color.BLACK);
                        b54.setTextColor(Color.BLACK);
                        b55.setTextColor(Color.BLACK);
                        b52.setTextColor(Color.BLUE);
                        b52.setFocusableInTouchMode(true);
                        //  tv2.setBackgroundColor(Color.BLUE);
                        value.setAns6(b52.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b53:
                        b51.setTextColor(Color.BLACK);
                        b52.setTextColor(Color.BLACK);
                        b54.setTextColor(Color.BLACK);
                        b55.setTextColor(Color.BLACK);
                        b53.setTextColor(Color.BLUE);
                        b53.setFocusableInTouchMode(true);
                        // tv3.setBackgroundColor(Color.BLUE);
                        value.setAns6(b53.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b54:
                        b51.setTextColor(Color.BLACK);
                        b52.setTextColor(Color.BLACK);
                        b53.setTextColor(Color.BLACK);
                        b55.setTextColor(Color.BLACK);
                        b54.setTextColor(Color.BLUE);
                        b54.setFocusableInTouchMode(true);
                        // tv4.setBackgroundColor(Color.BLUE);
                        value.setAns6(b54.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b55:
                        b51.setTextColor(Color.BLACK);
                        b52.setTextColor(Color.BLACK);
                        b53.setTextColor(Color.BLACK);
                        b54.setTextColor(Color.BLACK);
                        b55.setTextColor(Color.BLUE);
                        b55.setFocusableInTouchMode(true);
                        // tv5.setBackgroundColor(Color.BLUE);
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
                        b32.setTextColor(Color.BLACK);
                        b33.setTextColor(Color.BLACK);
                        b34.setTextColor(Color.BLACK);
                        b35.setTextColor(Color.BLACK);
                        b31.setTextColor(Color.BLUE);
                        b31.setFocusableInTouchMode(true);
                        // tv1.setBackgroundColor(Color.BLUE);
                        value.setAns4(b31.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.b32:
                        b31.setTextColor(Color.BLACK);
                        b33.setTextColor(Color.BLACK);
                        b34.setTextColor(Color.BLACK);
                        b35.setTextColor(Color.BLACK);
                        b32.setTextColor(Color.BLUE);
                        b32.setFocusableInTouchMode(true);
                        //  tv2.setBackgroundColor(Color.BLUE);
                        value.setAns4(b32.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b33:
                        b31.setTextColor(Color.BLACK);
                        b32.setTextColor(Color.BLACK);
                        b34.setTextColor(Color.BLACK);
                        b35.setTextColor(Color.BLACK);
                        b33.setTextColor(Color.BLUE);
                        b33.setFocusableInTouchMode(true);
                        // tv3.setBackgroundColor(Color.BLUE);
                        value.setAns4(b33.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b34:
                        b31.setTextColor(Color.BLACK);
                        b32.setTextColor(Color.BLACK);
                        b33.setTextColor(Color.BLACK);
                        b35.setTextColor(Color.BLACK);
                        b34.setTextColor(Color.BLUE);
                        b34.setFocusableInTouchMode(true);
                        // tv4.setBackgroundColor(Color.BLUE);
                        value.setAns4(b34.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.b35:
                        b31.setTextColor(Color.BLACK);
                        b32.setTextColor(Color.BLACK);
                        b33.setTextColor(Color.BLACK);
                        b34.setTextColor(Color.BLACK);
                        b35.setTextColor(Color.BLUE);
                        b35.setFocusableInTouchMode(true);
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

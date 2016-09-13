package monty.tscf.RecyclerViews;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

import monty.tscf.POJO.Staff;
import monty.tscf.R;

/**
 * Created by monty on 13/9/16.
 */
public class RecyclerViewHolder2 extends RecyclerView.ViewHolder {

    TextView staff;
    Button tv2;
    //Adding buttons for the rating questions feedback
    //imageview onclick should toast a message about the opening of activity for feedback
    //feedback should submit the data
    Button b1, b2, b3;
    ImageView imageView;
    //RatingBar ratingBar;
    LinearLayout linearLayout;
    Firebase mref;
    Staff value = new Staff();
    //Adding questions
    TextView q1, q2, q3;

    public RecyclerViewHolder2(View itemView) {
        super(itemView);
        mref = new Firebase("https://tscf-b4925.firebaseio.com/stafffeedback/");
        staff = (TextView) itemView.findViewById(R.id.list_title);
        tv2 = (Button) itemView.findViewById(R.id.list_desc);
        imageView = (ImageView) itemView.findViewById(R.id.list_avatar);
        staff.setTextColor(Color.BLACK);
        q1 = (TextView) itemView.findViewById(R.id.staffq1);
        q2 = (TextView) itemView.findViewById(R.id.staffq2);
        q3 = (TextView) itemView.findViewById(R.id.staffq3);
        // ratingBar = (RatingBar) itemView.findViewById(R.id.rate);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.invisiblelinearlayout);
        linearLayout.setVisibility(View.INVISIBLE);


        View.OnClickListener clicklistener0 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Layout is made visible", Toast.LENGTH_SHORT).show();
                linearLayout.setVisibility(View.VISIBLE);
            }
        };

        View.OnClickListener clicklistener1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.stb01:
                        if (b1 == null) {
                            b1 = (Button) view.findViewById(R.id.stb01);
                            b1.setBackgroundResource(R.drawable.fill);
                        } else if (b1.getBackground() != null) {
                            b1 = null;
                            b1 = (Button) view.findViewById(R.id.stb01);
                            b1.setBackgroundResource(R.drawable.fill);
                        }

                        value.setA1(b1.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.stb02:
                        if (b1 == null) {
                            b1 = (Button) view.findViewById(R.id.stb02);
                            b1.setBackgroundResource(R.drawable.fill);
                        } else if (b1.getBackground() != null) {
                            b1 = null;
                            b1 = (Button) view.findViewById(R.id.stb02);
                            b1.setBackgroundResource(R.drawable.fill);
                        }
                        value.setA1(b1.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb03:
                        if (b1 == null) {
                            b1 = (Button) view.findViewById(R.id.stb03);
                            b1.setBackgroundResource(R.drawable.fill);
                        } else if (b1.getBackground() != null) {
                            b1 = null;
                            b1 = (Button) view.findViewById(R.id.stb03);
                            b1.setBackgroundResource(R.drawable.fill);
                        }
                        value.setA1(b1.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb04:
                        if (b1 == null) {
                            b1 = (Button) view.findViewById(R.id.stb04);
                            b1.setBackgroundResource(R.drawable.fill);
                        } else if (b1.getBackground() != null) {
                            b1 = null;
                            b1 = (Button) view.findViewById(R.id.stb04);
                            b1.setBackgroundResource(R.drawable.fill);
                        }
                        value.setA1(b1.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb05:
                        if (b1 == null) {
                            b1 = (Button) view.findViewById(R.id.stb05);
                            b1.setBackgroundResource(R.drawable.fill);
                        } else if (b1.getBackground() != null) {
                            b1 = null;
                            b1 = (Button) view.findViewById(R.id.stb05);
                            b1.setBackgroundResource(R.drawable.fill);
                        }

                        value.setA1(b1.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setA1("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getA1(), Toast.LENGTH_SHORT).show();

            }
        };

        View.OnClickListener clicklistener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.stb11:
                        if (b2 == null) {
                            b2 = (Button) view.findViewById(R.id.stb11);
                            b2.setBackgroundResource(R.drawable.fill);
                        } else if (b2.getBackground() != null) {
                            b2 = null;
                            b2 = (Button) view.findViewById(R.id.stb11);
                            b2.setBackgroundResource(R.drawable.fill);
                        }

                        value.setA1(b1.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.stb12:
                        if (b2 == null) {
                            b2 = (Button) view.findViewById(R.id.stb12);
                            b2.setBackgroundResource(R.drawable.fill);
                        } else if (b2.getBackground() != null) {
                            b2 = null;
                            b2 = (Button) view.findViewById(R.id.stb12);
                            b2.setBackgroundResource(R.drawable.fill);
                        }
                        value.setA1(b1.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb13:
                        if (b2 == null) {
                            b2 = (Button) view.findViewById(R.id.stb13);
                            b2.setBackgroundResource(R.drawable.fill);
                        } else if (b2.getBackground() != null) {
                            b2 = null;
                            b2 = (Button) view.findViewById(R.id.stb13);
                            b2.setBackgroundResource(R.drawable.fill);
                        }
                        value.setA1(b1.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb14:
                        if (b2 == null) {
                            b2 = (Button) view.findViewById(R.id.stb14);
                            b2.setBackgroundResource(R.drawable.fill);
                        } else if (b2.getBackground() != null) {
                            b2 = null;
                            b2 = (Button) view.findViewById(R.id.stb14);
                            b2.setBackgroundResource(R.drawable.fill);
                        }
                        value.setA1(b1.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb15:
                        if (b2 == null) {
                            b2 = (Button) view.findViewById(R.id.stb15);
                            b2.setBackgroundResource(R.drawable.fill);
                        } else if (b2.getBackground() != null) {
                            b2 = null;
                            b2 = (Button) view.findViewById(R.id.stb15);
                            b2.setBackgroundResource(R.drawable.fill);
                        }

                        value.setA1(b1.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setA1("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getA1(), Toast.LENGTH_SHORT).show();

            }
        };

        View.OnClickListener clicklistener3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.stb21:
                        if (b3 == null) {
                            b3 = (Button) view.findViewById(R.id.stb21);
                            b3.setBackgroundResource(R.drawable.fill);
                        } else if (b3.getBackground() != null) {
                            b3 = null;
                            b1 = (Button) view.findViewById(R.id.stb21);
                            b3.setBackgroundResource(R.drawable.fill);
                        }

                        value.setA1(b1.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.stb22:
                        if (b3 == null) {
                            b3 = (Button) view.findViewById(R.id.stb22);
                            b3.setBackgroundResource(R.drawable.fill);
                        } else if (b3.getBackground() != null) {
                            b3 = null;
                            b3 = (Button) view.findViewById(R.id.stb02);
                            b3.setBackgroundResource(R.drawable.fill);
                        }
                        value.setA1(b3.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb23:
                        if (b3 == null) {
                            b3 = (Button) view.findViewById(R.id.stb23);
                            b3.setBackgroundResource(R.drawable.fill);
                        } else if (b3.getBackground() != null) {
                            b3 = null;
                            b3 = (Button) view.findViewById(R.id.stb23);
                            b3.setBackgroundResource(R.drawable.fill);
                        }
                        value.setA1(b1.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb24:
                        if (b3 == null) {
                            b3 = (Button) view.findViewById(R.id.stb24);
                            b3.setBackgroundResource(R.drawable.fill);
                        } else if (b3.getBackground() != null) {
                            b3 = null;
                            b3 = (Button) view.findViewById(R.id.stb24);
                            b3.setBackgroundResource(R.drawable.fill);
                        }
                        value.setA1(b1.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb25:
                        if (b3 == null) {
                            b3 = (Button) view.findViewById(R.id.stb25);
                            b3.setBackgroundResource(R.drawable.fill);
                        } else if (b3.getBackground() != null) {
                            b3 = null;
                            b3 = (Button) view.findViewById(R.id.stb25);
                            b3.setBackgroundResource(R.drawable.fill);
                        }

                        value.setA1(b3.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setA1("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getA1(), Toast.LENGTH_SHORT).show();

            }
        };

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setStaffname(staff.getText().toString());
                value.setQ1(q1.getText().toString());
                value.setQ2(q2.getText().toString());
                value.setQ3(q3.getText().toString());
                mref.child("Staff").push().setValue(value);
                Toast.makeText(view.getContext(), "Your Staff Submission is Done", Toast.LENGTH_SHORT).show();
                linearLayout.setVisibility(View.INVISIBLE);
            }
        });
        imageView.setOnClickListener(clicklistener0);
        b1.setOnClickListener(clicklistener1);
        b2.setOnClickListener(clicklistener1);
        b3.setOnClickListener(clicklistener1);


    }

}


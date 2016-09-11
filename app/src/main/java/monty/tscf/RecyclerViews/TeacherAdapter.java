package monty.tscf.RecyclerViews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import monty.tscf.R;

/**
 * Created by monty on 10/9/16.
 */
public class TeacherAdapter extends RecyclerView.Adapter<TeacherViewHolder> {

    String[] teachers = {"Hitesh Vakharia",
            "Kekul Vakharia",
            "Janki Barodia(French)",
            " Kanika Maheshwari(French) ",
            "  Priti Vora(Maths) ",
            "  Sonal Jain (Maths) ",
            "  Manoj Mishra (History) ",
            "  Juliet Sequeira (Social Science) ",
            "  Vandana Nagar(English/History) ",
            "  Aarti Ganatra(English/Social Sciences) ",
            "   Tushar Bhatt(English Grammar) ",
            "   Pravin Parab (Sanskrit/Marathi) ",
            "  Shashi Singh(Hindi) ",
            "  Sejal Bhave(Hindi/Marathi) ",
            "  Shabina Sayyad(Science) ",
            "   Ruddhi Salvi (Science) ",
            "   Harshil Jariwala(Science) "
    };
    Context context;
    LayoutInflater inflater;

    public TeacherAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public TeacherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.teacher, parent, false);
        TeacherViewHolder teacherViewHolder = new TeacherViewHolder(view);
        return teacherViewHolder;
    }

    @Override
    public void onBindViewHolder(TeacherViewHolder holder, int position) {
        holder.TeacherName.setText(teachers[position]);
    }

    @Override
    public int getItemCount() {
        return teachers.length;
    }
}

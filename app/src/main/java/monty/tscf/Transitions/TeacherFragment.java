package monty.tscf.Transitions;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import monty.tscf.R;

/**
 * Created by monty on 10/9/16.
 */
public class TeacherFragment extends android.support.v4.app.Fragment {


    RecyclerView recyclerView2;
    LinearLayoutManager linearLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.teacherrecycler, container, false);

        recyclerView2 = (RecyclerView) rootview.findViewById(R.id.teacher_recycler);

        TeacherAdapter adapter = new TeacherAdapter(rootview.getContext());
        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setAdapter(adapter);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(linearLayoutManager);


        return rootview;
    }
}

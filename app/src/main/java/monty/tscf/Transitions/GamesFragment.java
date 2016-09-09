package monty.tscf.Transitions;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;

import monty.tscf.R;

public class GamesFragment extends android.support.v4.app.Fragment {

    RecyclerView recyclerView;
    // Button submit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_games, container, false);
        recyclerView = (RecyclerView) rootview.findViewById(R.id.my_recycler_view);
        // submit = (Button) rootview.findViewById(R.id.button1);
        RecyclerAdapter adapter = new RecyclerAdapter(getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        //Layout manager for Recycler view

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return rootview;

    }


}

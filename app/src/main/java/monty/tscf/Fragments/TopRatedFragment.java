package monty.tscf.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import monty.tscf.R;
import monty.tscf.RecyclerViews.CardAdapter;


public class TopRatedFragment extends Fragment {

    public static final String TAG = "TAG";
    RecyclerView recyclerView2;
    Button button2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.cardviewrecycler, container, false);
        recyclerView2 = (RecyclerView) rootView.findViewById(R.id.my_recycler_view2);

        CardAdapter cardAdapter = new CardAdapter(getContext());
        recyclerView2.setAdapter(cardAdapter);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}

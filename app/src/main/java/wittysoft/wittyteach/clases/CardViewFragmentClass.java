package wittysoft.wittyteach.clases;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wittysoft.wittyteach.R;

/**
 * A placeholder fragment containing a simple view.
 */
public  class CardViewFragmentClass extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;
    View rootView;


    public CardViewFragmentClass() {
    }

    public void selectAdapter(int page) {

            mAdapter = new CardAdapterClass();


    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static CardViewFragmentClass newInstance(int sectionNumber) {
        Log.d("mensaje",String.valueOf(sectionNumber));
        CardViewFragmentClass fragment = new CardViewFragmentClass();
        fragment.selectAdapter(sectionNumber);
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.recycler_view, container, false);


            mRecyclerView = (RecyclerView)rootView.findViewById(R.id.recycler_view);
            mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
//
            mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}



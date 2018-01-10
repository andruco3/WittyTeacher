package wittysoft.wittyteach.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wittysoft.wittyteach.R;

/**
 * A placeholder fragment containing a simple view.
 */
public  class CardViewFragmentHome extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;
    View rootView;


    public CardViewFragmentHome() {
    }

    public void selectAdapter(int page) {

            mAdapter = new CardAdapterHome();


    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static CardViewFragmentHome newInstance(int sectionNumber) {
        Log.d("mensaje",String.valueOf(sectionNumber));
        CardViewFragmentHome fragment = new CardViewFragmentHome();
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
//
            mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}



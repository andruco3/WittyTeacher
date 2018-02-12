package wittysoft.wittyteach;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import wittysoft.wittyteach.clases.CardViewFragmentClass;
import wittysoft.wittyteach.home.CardAdapterHome;
import wittysoft.wittyteach.home.CardViewFragmentHome;
import wittysoft.wittyteach.view.profes.CardAdapterTeacher;
import wittysoft.wittyteach.view.profes.CardViewFragmentTeacher;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapterTeacher;
    RecyclerView.Adapter mAdapterHome;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(mSectionsPagerAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

//        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
//        mRecyclerView.setHasFixedSize(true);
//
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);
//
//        mAdapterTeacher = new CardAdapterTeacher();
//        mAdapterHome = new CardAdapterHome();
//        mRecyclerView.setAdapter(mAdapterTeacher);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        final BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                if (prevMenuItem != null) {
//                    prevMenuItem.setChecked(false);
//                }
//                else
//                {
//                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
//                }

                bottomNavigationView.getMenu().getItem(position).setChecked(true);
//                prevMenuItem = bottomNavigationView.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.navigation_home:
                                Log.d("mensaje",String.valueOf(item.getItemId()));
                                mViewPager.setCurrentItem(0);
                                break;
                            case R.id.navigation_class:
                                mViewPager.setCurrentItem(1);
                                Log.d("mensaje",String.valueOf(item.getItemId()));
                                break;
                            case R.id.navigation_search:
                                Log.d("mensaje",String.valueOf(item.getItemId()));
                                mViewPager.setCurrentItem(3);
                                break;
                            case R.id.navigation_profes:
                                Log.d("mensaje",String.valueOf(item.getItemId()));
                                mViewPager.setCurrentItem(2);
                                break;
                        }
                        return true;
                    }
                });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment implements View.OnClickListener {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        RecyclerView mRecyclerView;
        RecyclerView.LayoutManager mLayoutManager;
        RecyclerView.Adapter mAdapter;
        View rootView;
        private Spinner spinner1;

        public EditText etPlannedDate;
        public EditText etPlannedTime;

        public PlaceholderFragment() {
        }

        public void selectAdapter(int page) {

            if(page==1 )
                mAdapter = new CardAdapterTeacher();
            else if(page==2)
                mAdapter = new CardAdapterHome();
            else
                mAdapter = new CardAdapterTeacher();

        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.etPlannedDate:
                    showDatePickerDialog(etPlannedDate);
                    break;
                case R.id.etPlannedTime:
                    showTimePickerDialog(etPlannedTime);
                    break;

            }
        }


        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            Log.d("mensaje",String.valueOf(sectionNumber));
            PlaceholderFragment fragment = new PlaceholderFragment();
            fragment.selectAdapter(sectionNumber);
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            rootView = inflater.inflate(R.layout.search_class, container, false);
            EditText etPlannedDate = (EditText) rootView.findViewById(R.id.etPlannedDate);
            EditText etPlannedTime = (EditText) rootView.findViewById(R.id.etPlannedTime);
            etPlannedDate.setOnClickListener(this);
            etPlannedTime.setOnClickListener(this);
            spinner1 = (Spinner) rootView.findViewById(R.id.spinner);
            spinner1.setOnItemSelectedListener(new ItemSelectedListener());
//            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
//            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

            //mRecyclerView = (RecyclerView)rootView.findViewById(R.id.recycler_view);
//            mRecyclerView.setHasFixedSize(true);
//
//            mRecyclerView.setAdapter(mAdapter);

            return rootView;
        }



        private void showDatePickerDialog(final EditText editText) {
            DatePickerFragment newFragment = DatePickerFragment.newInstance(new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                    // +1 because january is zero
                    final String selectedDate = day + " / " + (month+1) + " / " + year;
                    EditText etPlannedDate = (EditText) rootView.findViewById(R.id.etPlannedDate);
                    etPlannedDate.setText(selectedDate);
                }
            });
            newFragment.show(getActivity().getSupportFragmentManager(), "datePicker");
        }

        private void showTimePickerDialog(final EditText editText) {
            TimePickerFragment newFragment = TimePickerFragment.newInstance(new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                    final String selectedDate = hourOfDay + " : " + (minute) ;
                    EditText etPlannedDate = (EditText) rootView.findViewById(R.id.etPlannedTime);
                    etPlannedDate.setText(selectedDate);

                }


            });
            newFragment.show(getActivity().getSupportFragmentManager(), "datePicker");
        }

        public class ItemSelectedListener implements AdapterView.OnItemSelectedListener {

            //get strings of first item
            String firstItem = String.valueOf(spinner1.getSelectedItem());

            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                if (firstItem.equals(String.valueOf(spinner1.getSelectedItem()))) {
                    // ToDo when first item is selected
                } else {
                    Toast.makeText(parent.getContext(),
                            "You have selected : " + parent.getItemAtPosition(pos).toString(),
                            Toast.LENGTH_LONG).show();
                    // Todo when item is selected by the user
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg) {

            }

        }
    }




      /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            if(position == 0)
                return CardViewFragmentHome.newInstance(position + 1);
            else if(position == 1)
                return CardViewFragmentClass.newInstance(position + 1);
            else if(position == 2)
                return CardViewFragmentTeacher.newInstance(position + 1);
            else
                return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
            }
            return null;
        }
    }
}

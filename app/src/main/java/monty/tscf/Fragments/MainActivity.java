package monty.tscf.Fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.firebase.client.Firebase;

import java.util.ArrayList;
import java.util.List;

import monty.tscf.R;

public class MainActivity extends AppCompatActivity {

    // private Toolbar toolbar;
    private TabLayout tabLayout;
    // private ViewPager viewPager;
    private ViewPager viewPager;
    //private TabsPagerAdapter mAdapter;
    //private ActionBar actionBar;
    // Tab titles
    //private String[] tabs = {"Generic Info", "Select Teacher", "GET Tscore"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Firebase.setAndroidContext(this);
        // toolbar = (Toolbar) findViewById(R.id.toolbar);

        // if(getSupportActionBar() != null) {
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // }

        //viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        // Initilization

        //actionBar = getActionBar();
        //mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

		/* viewPager.setAdapter(mAdapter);
        getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
		//actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
		}
          */
        /**
         * on swiping the viewpager make respective tab selected
         * */
        /* viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				actionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
		*/

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TopRatedFragment(), "GENERAL");
        adapter.addFragment(new GamesFragment(), "STAFF");
        adapter.addFragment(new TeacherFragment(), "Teachers");
        adapter.addFragment(new MoviesFragment(), "TSCORE");
        viewPager.setAdapter(adapter);
    }
    /*
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// on tab selected
		// show respected fragment view
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}
	*/

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}

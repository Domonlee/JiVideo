package xvideo.ji.com.jivideo;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import xvideo.ji.com.jivideo.fragment.MainFragment;
import xvideo.ji.com.jivideo.fragment.TestFragment;

public class MainActivity extends ActionBarActivity {
    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private TestFragment mTestFragment;
    private MainFragment mMainFragment;
    private ListView mLeftMenuLv;
    private String[] strs = {"1", "2", "3", "4"};
    private ArrayAdapter mArrayAdapter;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        findviewById();

        initToolbar();

        initMenu();

        init();
    }

    private void initMenu() {
        mArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, strs);
        mLeftMenuLv.setAdapter(mArrayAdapter);
    }

    private void initToolbar() {
        mToolbar.setTitle("JiVideo");

        setSupportActionBar(mToolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //创建返回键，实现打开关闭监听
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.open, R.string.close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                Toast.makeText(mContext, "open", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                Toast.makeText(mContext, "close", Toast.LENGTH_LONG).show();
            }
        };

        mDrawerToggle.syncState();
        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }

    private void init() {
        mTestFragment = new TestFragment();
        mMainFragment = new MainFragment();


        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, mTestFragment).
                add(R.id.fragment_container, mMainFragment).hide(mTestFragment).commit();

    }


    private void findviewById() {
        mToolbar = (Toolbar) findViewById(R.id.custom_toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.custom_drawerlayout);
        mLeftMenuLv = (ListView) findViewById(R.id.leftmenu_lv);
    }


}

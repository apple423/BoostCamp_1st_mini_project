package com.example.han.boostcamp1;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    ViewPager viewPager;
    ImageButton messageButton;
    ImageButton messengerButton;
    EditText toolbarEditText;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        messageButton = (ImageButton) findViewById(R.id.action_messege);
        messageButton.setOnClickListener(this);
        toolbarEditText = (EditText) findViewById(R.id.toolbar_EditText);
        messengerButton = (ImageButton) findViewById(R.id.action_messenger);
        messengerButton.setOnClickListener(this);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),4);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                switch (position){

                    case 0 : tabLayout.getTabAt(0).setIcon(R.drawable.ic_timeline_blue);
                             tabLayout.getTabAt(1).setIcon(R.drawable.ic_people_grey);
                             tabLayout.getTabAt(2).setIcon(R.drawable.ic_alarm_grey);
                             tabLayout.getTabAt(3).setIcon(R.drawable.ic_3bar_grey);
                             break;
                    case 1 : tabLayout.getTabAt(0).setIcon(R.drawable.ic_timeline_grey);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_people_blue);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_alarm_grey);
                        tabLayout.getTabAt(3).setIcon(R.drawable.ic_3bar_grey);
                        break;

                    case 2 : tabLayout.getTabAt(0).setIcon(R.drawable.ic_timeline_grey);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_people_grey);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_alarm_blue);
                        tabLayout.getTabAt(3).setIcon(R.drawable.ic_3bar_grey);
                        break;

                    case 3 : tabLayout.getTabAt(0).setIcon(R.drawable.ic_timeline_grey);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_people_grey);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_alarm_grey);
                        tabLayout.getTabAt(3).setIcon(R.drawable.ic_3bar_blue);
                        break;



                }

            }

            @Override
            public void onPageSelected(int position) {



            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_timeline_blue);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_people_grey);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_alarm_grey);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_3bar_grey);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

       /* android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_frame, new MainFragment());
        fragmentTransaction.commit();*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button_white, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(id){
            case R.id.action_messege:
                Toast.makeText(this,"메세지 버튼",Toast.LENGTH_SHORT).show();
                break;


        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {

        int id = v.getId();

        Log.d("id",Integer.toString(id));
        switch(id){
            case R.id.action_messege:
                Toast.makeText(v.getContext(),"메세지 버튼",Toast.LENGTH_LONG).show();
                break;

            case R.id.action_messenger:
                Toast.makeText(v.getContext(),"메세지 버튼",Toast.LENGTH_LONG).show();
                break;


        }



    }
}
package com.example.ellsasa.mydemo;

import android.content.ClipData;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView textView = (TextView)findViewById(R.id.texttt);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RelativeLayout.LayoutParams pp = new RelativeLayout.LayoutParams(getApplicationContext().getResources().getDisplayMetrics().widthPixels,
                        getApplicationContext().getResources().getDisplayMetrics().heightPixels);
                TextView tt = (TextView) findViewById(R.id.imagett);
                tt.setLayoutParams(pp);
            }
        });


//        final ImageView view = (ImageView)findViewById(R.id.closeB);
//        final ImageView v2 = (ImageView)findViewById(R.id.imagecover);
//        final RelativeLayout r = (RelativeLayout)findViewById(R.id.allRe);
//
//        r.addView(view);
//        r.addView(v2);
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//
//                r.removeView(v2);
//                r.removeView(view);
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        menu.add(R.id.menuid,1,100, "美剧").setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.add(R.id.menuid,2,200, "TED").setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.add(R.id.menuid,3,300, "电影").setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.add(R.id.menuid,4,400, "测试").setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.add(R.id.menuid,4,400,"csss").setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
//        menu.add(R.id.menuid,5,500, "namem").setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
//        menu.add(R.id.menuid,6,600,"cccc").setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
//        menu.add(R.id.menuid,62,6020,"233").setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == 2) {
//            ItemFragment itemFragment = new ItemFragment();
////            getSupportFragmentManager().beginTransaction().add(R.id.id_content, itemFragment).commit();
//            getFragmentManager().beginTransaction().add(R.id.id_content,itemFragment).commit();
//        }

        return super.onOptionsItemSelected(item);
    }
}

package com.example.welcome.activity;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

import com.example.welcome.R;
import com.example.welcome.activity.base.MyBaseActivity;


public class StartActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        initView();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start, menu);
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


    @Override
    protected void initView() {
        Button button = (Button) findViewById(R.id.button_begin);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_begin:
                View view = View.inflate(StartActivity.this,R.layout.popup_layout,null);
                PopupWindow popupWindow = new PopupWindow(view, ActionBar.LayoutParams.MATCH_PARENT,200,true);
                popupWindow.showAsDropDown(v);
//                popupWindow.showAtLocation(v, Gravity.BOTTOM,0,300);
                popupWindow.update();
                break;
            default:
                break;
        }
    }
}

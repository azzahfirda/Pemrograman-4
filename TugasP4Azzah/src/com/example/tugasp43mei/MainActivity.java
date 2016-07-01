package com.example.tugasp43mei;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

public class MainActivity extends Activity {

	 /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);

	        ListView list = (ListView)findViewById(R.id.main_listview);

	        adapterlistview adapter = new adapterlistview(10, getBaseContext());
	        list.setAdapter(adapter);
	    }
	}
    

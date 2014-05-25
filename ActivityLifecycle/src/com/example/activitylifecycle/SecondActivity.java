package com.example.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

public class SecondActivity extends ActionBarActivity {
	String logTag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Log.i(logTag, "I am in onCreate of Second activity");
		setContentView(R.layout.activity_second);
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.i(logTag, "I am in onStart of Second activity");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.i(logTag, "I am in onResume of Second activity");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
	
		Log.i(logTag, "I am in onPause of Second activity");
		
	}
	@Override
	protected void onStop() {
		
		super.onStop();
		
		Log.i(logTag, "I am in onStop of Second activity");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i(logTag, "I am in onRestart of Second activity");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(logTag, "I am in onDestroy of Second activity");
	
	}

}

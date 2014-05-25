package com.example.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class FirstActivity extends ActionBarActivity {

	Button button;
	String logTag;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		logTag = getResources().getString(R.string.log);
		Log.i(logTag, "I am in onCreate of First activity");
		
		setContentView(R.layout.activity_first);
		button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				startActivity(new Intent(FirstActivity.this, SecondActivity.class));
			}
		});
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.i(logTag, "I am in onStart of First activity");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.i(logTag, "I am in onResume of First activity");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
	
		Log.i(logTag, "I am in onPause of First activity");
		
	}
	@Override
	protected void onStop() {
		
		super.onStop();
		
		Log.i(logTag, "I am in onStop of First activity");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i(logTag, "I am in onRestart of First activity");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(logTag, "I am in onDestroy of First activity");
	
	}
	
	

}

package com.kneppers.apps;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.View;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends Activity implements GestureDetector.OnGestureListener, 
GestureDetector.OnDoubleTapListener {
	
	private TextView RedBallHopping;
	private GestureDetectorCompat gestureDetector;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
		
		public void Peanut(View view) {
			TextView textView = (TextView) findViewById(R.id.button1);
		
		RedBallHopping = (TextView) findViewById(R.id.textView1);
		this.gestureDetector = new GestureDetectorCompat(this,this);
		//gestureDector is an object from the class GestureDetectorCompat!!
		gestureDetector.setOnDoubleTapListener(this); // calling a method on it
		
			}
	
	@Override
	public boolean onSingleTapConfirmed(MotionEvent e) {
		// TODO Auto-generated method stub
		RedBallHopping.setText("onSingleTapConfirmed");
		return true;
	}


	@Override
	public boolean onDoubleTap(MotionEvent e) {
		// TODO Auto-generated method stub
		RedBallHopping.setText("onDoubleTap");
		return true;
	}


	@Override
	public boolean onDoubleTapEvent(MotionEvent e) {
		// TODO Auto-generated method stub
		RedBallHopping.setText("onDoubleTapEvent");
		return true;
	}


	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		RedBallHopping.setText("onDown");
		return true;
	}


	@Override
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		RedBallHopping.setText("onShowPress");
		
	}


	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		RedBallHopping.setText("onSingleTapUp");
		return true;
	}


	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
		// TODO Auto-generated method stub
		RedBallHopping.setText("onScroll");
		return true;
	}


	@Override
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		RedBallHopping.setText("onLongPress");
		
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
		// TODO Auto-generated method stub
		RedBallHopping.setText("onFling");
		return true;
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		this.gestureDetector.onTouchEvent(event);
		return super.onTouchEvent(event);
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}}

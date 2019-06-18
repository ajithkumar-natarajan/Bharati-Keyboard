package com.bharatiscript.bharativirtualkeyboard;

import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.animation.ObjectAnimator;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;

public class IntroActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private LinearLayout linear1;
	private ImageView imageview1;
	
	private ObjectAnimator animate = new ObjectAnimator();
	private TimerTask samayam;
	private Intent inte = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.intro);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
	}
	private void initializeLogic() {
		samayam = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						samayam.cancel();
						finish();
					}
				});
			}
		};
		_timer.schedule(samayam, (int)(3000));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}

}
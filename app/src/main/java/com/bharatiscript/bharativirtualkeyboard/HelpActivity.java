package com.bharatiscript.bharativirtualkeyboard;

import android.os.*;
import android.widget.*;
import android.util.*;

import java.util.*;

import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

public class HelpActivity extends AppCompatActivity {
	
	
	private String bhh = "";
	
	private LinearLayout linear3;
	private LinearLayout linear4;
	private TextView textview1;
	private LinearLayout linear5;
	private Button button1;
	
	private Intent inr = new Intent();
	private AlertDialog.Builder dia;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.help);
		initialize(_savedInstanceState);
//		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		button1 = (Button) findViewById(R.id.button1);
		dia = new AlertDialog.Builder(this);
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dia.setTitle("Bharati Script");
				dia.setMessage("• Bharati is a simple and unified script for Indian languages.\n• It is designed by identifying the simplest glyphs for each sound and borrowing that from various existing Indian scripts or English often to make that character look familiar\n• Bharati characters are designed such that the phonetics of the character is reflected in its shape, and will therefore be easier to learn. \n•Scripts currently supported are: •Devanagari, Tamil, Gujarati, Telugu, Gurmukhi, Kannada, Oriya, Bengali and Malayalam.\n• This script is developed by Prof. V. Srinivasa Chakravarthy, Indian Institute of Technology - Madras.\n\n• Credits for the application to R. Siva Sanjay.");
				dia.setPositiveButton("Learn Bharati", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						inr.setAction(Intent.ACTION_VIEW);
						inr.setData(Uri.parse("https://youtu.be/YHFHUAPrCWM"));
						startActivity(inr);
					}
				});
				dia.setNeutralButton("Go to website", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						inr.setAction(Intent.ACTION_VIEW);
						inr.setData(Uri.parse("https://bharatiscript.com"));
						startActivity(inr);
					}
				});
				dia.create().show();
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
	}
//	private void initializeLogic() {
//	}
}
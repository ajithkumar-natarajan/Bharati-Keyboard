package com.bharatiscript.bharativirtualkeyboard;

import android.os.*;
import android.widget.*;
import android.graphics.*;
import android.util.*;

import java.util.*;

import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.os.Vibrator;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AdapterView;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v4.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;

public class MainActivity extends AppCompatActivity {
	
	
	private String gaja = "";
	private String khacha = "";
	private String ghajha = "";
	private double dot = 0;
	private double Lara = 0;
	private String lara = "";
	private double temo = 0;
	private String temp = "";
	private String naamaha = "";
	private String tem = "";
	private String tempo = "";
	private String A = "";
	private String lastchar = "";
	
	private ArrayList<String> Lang = new ArrayList<>();
	private ArrayList<String> language = new ArrayList<>();
	
	private LinearLayout linear10;
	private ScrollView vscroll3;
	private LinearLayout linear11;
	private LinearLayout vowels_1;
	private LinearLayout vowels_2;
	private LinearLayout kacha;
	private LinearLayout yara;
	private LinearLayout spaces;
	private EditText edittext3;
//	private TextView textview4;
	private LinearLayout option_holder;
	private EditText edittext2;
	private EditText edittext1;
	private Button button42;
	private TextView textview1;
	private Button button41;
	private TextView textview2;
	private Spinner spinner1;
	private Button button43;
	private Button a;
	private Button aa;
	private Button ii;
	private Button ee;
	private Button u;
	private Button uu;
	private Button ru;
	private Button ak;
	private Button ae;
	private Button aae;
	private Button ai;
	private Button o;
	private Button oo;
	private Button au;
	private Button am;
	private Button ah;
	private Button asp;
	private Button k;
	private Button ch;
	private Button t;
	private Button th;
	private Button p;
	private Button n;
	private Button nn;
	private Button voi;
	private Button m;
	private Button y;
	private Button r;
	private Button l;
	private Button v;
	private Button s;
	private Button h;
	private Button back;
	private Button av;
	private Button in;
	private Button underli;
	private Button space;
	private Button d_under;
	private Button ng;
	private Button ent;
	
	private Vibrator jigelu;
	private Intent inte = new Intent();
	private AlertDialog.Builder using;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		}
		else {
			initializeLogic();
		}
	}
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		vscroll3 = (ScrollView) findViewById(R.id.vscroll3);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		vowels_1 = (LinearLayout) findViewById(R.id.vowels_1);
		vowels_2 = (LinearLayout) findViewById(R.id.vowels_2);
		kacha = (LinearLayout) findViewById(R.id.kacha);
		yara = (LinearLayout) findViewById(R.id.yara);
		spaces = (LinearLayout) findViewById(R.id.spaces);
		edittext3 = (EditText) findViewById(R.id.edittext3);
//		textview4 = (TextView) findViewById(R.id.textview4);
		option_holder = (LinearLayout) findViewById(R.id.option_holder);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		button42 = (Button) findViewById(R.id.button42);
		textview1 = (TextView) findViewById(R.id.textview1);
		button41 = (Button) findViewById(R.id.button41);
		textview2 = (TextView) findViewById(R.id.textview2);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		button43 = (Button) findViewById(R.id.button43);
		a = (Button) findViewById(R.id.a);
		aa = (Button) findViewById(R.id.aa);
		ii = (Button) findViewById(R.id.ii);
		ee = (Button) findViewById(R.id.ee);
		u = (Button) findViewById(R.id.u);
		uu = (Button) findViewById(R.id.uu);
		ru = (Button) findViewById(R.id.ru);
		ak = (Button) findViewById(R.id.ak);
		ae = (Button) findViewById(R.id.ae);
		aae = (Button) findViewById(R.id.aae);
		ai = (Button) findViewById(R.id.ai);
		o = (Button) findViewById(R.id.o);
		oo = (Button) findViewById(R.id.oo);
		au = (Button) findViewById(R.id.au);
		am = (Button) findViewById(R.id.am);
		ah = (Button) findViewById(R.id.ah);
		asp = (Button) findViewById(R.id.asp);
		k = (Button) findViewById(R.id.k);
		ch = (Button) findViewById(R.id.ch);
		t = (Button) findViewById(R.id.t);
		th = (Button) findViewById(R.id.th);
		p = (Button) findViewById(R.id.p);
		n = (Button) findViewById(R.id.n);
		nn = (Button) findViewById(R.id.nn);
		voi = (Button) findViewById(R.id.voi);
		m = (Button) findViewById(R.id.m);
		y = (Button) findViewById(R.id.y);
		r = (Button) findViewById(R.id.r);
		l = (Button) findViewById(R.id.l);
		v = (Button) findViewById(R.id.v);
		s = (Button) findViewById(R.id.s);
		h = (Button) findViewById(R.id.h);
		back = (Button) findViewById(R.id.back);
		av = (Button) findViewById(R.id.av);
		in = (Button) findViewById(R.id.in);
		underli = (Button) findViewById(R.id.underli);
		space = (Button) findViewById(R.id.space);
		d_under = (Button) findViewById(R.id.d_under);
		ng = (Button) findViewById(R.id.ng);
		ent = (Button) findViewById(R.id.ent);
		jigelu = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		using = new AlertDialog.Builder(this);
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		kacha.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		edittext3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				String Bentel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఋ","ఏ","ఐ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","శ","ష","స","హ","ా","ి","ీ","ు","ూ","ృ","ే","ై","ో","ౌ","్"},ben[]={"অ","আ","ই","ঈ","উ","ঊ","ঋ","এ","ঐ","ও","ঔ","ং","ঃ","ক","খ","গ","ঘ","ঙ","চ","ছ","জ","ঝ","ঞ","ট","ঠ","ড","ঢ","ণ","ত","থ","দ","ধ","ন","প","ফ","ব","ভ","ম","য","র","ল","শ","ষ","স","হ","া","ি","ী","ু","ূ","ৃ","ে","ৈ","ো","ৌ","্"};
				String Hintel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఋ","ఏ","ఐ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","వ","శ","ష","స","హ","ళ","ఱ","ా","ి","ీ","ు","ూ","ృ","ే","ై","ో","ౌ","్"},hin[]={"अ","आ","इ","ई","उ","ऊ","ऋ","ए","ऐ","ओ","औ","ं","ः","क","ख","ग","घ","ङ","च","छ","ज","झ","ञ","ट","ठ","ड","ढ","ण","त","थ","द","ध","न","प","फ","ब","भ","म","य","र","ल","व","श","ष","स","ह","ळ","ऱ","ा","ि","ी","ु","ू","ृ","े","ै","ो","ौ","्"};
				String Tamtel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఎ","ఏ","ఐ","ఒ","ఓ","ఔ","ం","ః","క","ఙ","చ","జ","ఞ","ట","ణ","త","న","ప","మ","య","ర","ల","వ","శ","ష","స","హ","ళ","ఱ","ా","ి","ీ","ు","ూ","ె","ే","ై","ొ","ో","ౌ","్"},tam[]={"அ","ஆ","இ","ஈ","உ","ஊ","எ","ஏ","ஐ","ஒ","ஓ","ஔ","ஂ","ஃ","க","ங","ச","ஜ","ஞ","ட","ண","த","ந","ப","ம","ய","ர","ல","வ","ஶ","ஷ","ஸ","ஹ","ள","ற","ா","ி","ீ","ு","ூ","ெ","ே","ை","ொ","ோ","ௌ","்"};
				String kantel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఋ","ఎ","ఏ","ఐ","ఒ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","వ","శ","ష","స","హ","ళ","ఱ","ా","ి","ీ","ు","ూ","ృ","ె","ే","ై","ొ","ో","ౌ","్"},kan[]={"ಅ","ಆ","ಇ","ಈ","ಉ","ಊ","ಋ","ಎ","ಏ","ಐ","ಒ","ಓ","ಔ","ಂ","ಃ","ಕ","ಖ","ಗ","ಘ","ಙ","ಚ","ಛ","ಜ","ಝ","ಞ","ಟ","ಠ","ಡ","ಢ","ಣ","ತ","ಥ","ದ","ಧ","ನ","ಪ","ಫ","ಬ","ಭ","ಮ","ಯ","ರ","ಲ","ವ","ಶ","ಷ","ಸ","ಹ","ಳ","ಱ","ಾ","ಿ","ೀ","ು","ೂ","ೃ","ೆ","ೇ","ೈ","ೊ","ೋ","ೌ","್"};
				String Maltel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఋ","ఎ","ఏ","ఐ","ఒ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","వ","శ","ష","స","హ","ళ","ఱ","ழ","ా","ి","ీ","ు","ూ","ృ","ె","ే","ై","ొ","ో","ౌ","్"},mal[]={"അ","ആ","ഇ","ഈ","ഉ","ഊ","ഋ","എ","ഏ","ഐ","ഒ","ഓ","ഔ","ം","ഃ","ക","ഖ","ഗ","ഘ","ങ","ച","ഛ","ജ","ഝ","ഞ","ട","ഠ","ഡ","ഢ","ണ","ത","ഥ","ദ","ധ","ന","പ","ഫ","ബ","ഭ","മ","യ","ര","ല","വ","ശ","ഷ","സ","ഹ","ള","റ","ഴ","ാ","ി","ീ","ു","ൂ","ൃ","െ","േ","ൈ","ൊ","ോ","ൌ","്"};
				String gur[]={"ਅ","ਆ","ਇ","ਈ","ਉ","ਊ","ਏ","ਐ","ਓ","ਔ","ਂ","ਃ","ਕ","ਖ","ਗ","ਘ","ਙ","ਚ","ਛ","ਜ","ਝ","ਞ","ਟ","ਠ","ਡ","ਢ","ਣ","ਤ","ਥ","ਦ","ਧ","ਨ","ਪ","ਫ","ਬ","ਭ","ਮ","ਯ","ਰ","ਲ","ਵ","ਸ਼","ਸ","ਹ","ਲ਼","ਾ","ਿ","ੀ","ੁ","ੂ","ੇ","ੈ","ੋ","ੌ","੍"},Gurtel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఏ","ఐ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","వ","ష","స","హ","ళ","ా","ి","ీ","ు","ూ","ే","ై","ో","ౌ","్"};
				 String guj[]={"અ","આ","ઇ","ઈ","ઉ","ઊ","ઋ","એ","ઐ","ઓ","ઔ","ં","ઃ","ક","ખ","ગ","ઘ","ઙ","ચ","છ","જ","ઝ","ઞ","ટ","ઠ","ડ","ઢ","ણ","ત","થ","દ","ધ","ન","પ","ફ","બ","ભ","મ","ય","ર","લ","વ","શ","ષ","સ","હ","ળ","ા","િ","ી","ુ","ૂ","ૃ","ે","ેૈ","ો","ૌ","્"},Gujtel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఋ","ఏ","ఐ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","వ","శ","ష","స","హ","ళ","ా","ి","ీ","ు","ూ","ృ","ే","ై","ో","ౌ","్"};
				
				String od[]={"ଅ","ଆ","ଇ","ଈ","ଉ","ଊ","ଋ","ଏ","ଐ","ଓ","ଔ","ଂ","ଃ","କ","ଖ","ଗ","ଘ","ଙ","ଚ","ଛ","ଜ","ଝ","ଞ","ଟ","ଠ","ଡ","ଢ","ଣ","ତ","ଥ","ଦ","ଧ","ନ","ପ","ଫ","ବ","ଭ","ମ","ଯ","ର","ଲ","ଵ","ଶ","ଷ","ସ","ହ","ଳ","ୟ","ା","ି","ୀ","ୁ","ୂ","ୃ","େ","ୈ","ୋ","ୌ","୍"},Odtel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఋ","ఏ","ఐ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","వ","శ","ష","స","హ","ళ","య","ా","ి","ీ","ు","ూ","ృ","ే","ై","ో","ౌ","్"};
				String tamgun[]={"ா","ி","ீ","ு","ூ","ெ","ே","ை","ொ","ோ","ௌ","்","ஂ","ஃ"},malgun[]={"ാ","ി","ീ","ു","ൂ","െ","േ","ൈ","ൊ","ോ","ൌ","്","ം","ഃ"};
				temp = _charSeq;
				if (spinner1.getSelectedItemPosition() == 0) {
					for(int i=0;i<Hintel.length;i++)
					{ temp=temp.replace(Hintel[i],hin[i]);}
				}
				if (spinner1.getSelectedItemPosition() == 1) {
					for(int i=0;i<tam.length;i++)
					{ temp=temp.replace(Tamtel[i],tam[i]);}
				}
				if (spinner1.getSelectedItemPosition() == 2) {
					temp = _charSeq;
				}
				if (spinner1.getSelectedItemPosition() == 3) {
					for(int i=0;i<kan.length;i++)
					{ temp=temp.replace(kantel[i],kan[i]);}
				}
				if (spinner1.getSelectedItemPosition() == 4) {
					for(int i=0;i<Maltel.length;i++)
					{ temp=temp.replace(Maltel[i],mal[i]);}
					for(int i=0;i<malgun.length;i++)
					{ temp=temp.replace(tamgun[i],malgun[i]);}
					
				}
				if (spinner1.getSelectedItemPosition() == 5) {
					for(int i=0;i<Bentel.length;i++)
					{ temp=temp.replace(Bentel[i],ben[i]);}
				}
				if (spinner1.getSelectedItemPosition() == 6) {
					for(int i=0;i<Gurtel.length;i++)
					{ temp=temp.replace(Gurtel[i],gur[i]);}
				}
				if (spinner1.getSelectedItemPosition() == 7) {
					for(int i=0;i<guj.length;i++)
					{ temp=temp.replace(Gujtel[i],guj[i]);}
				}
				if (spinner1.getSelectedItemPosition() == 8) {
					for(int i=0;i<Odtel.length;i++)
					{ temp=temp.replace(Odtel[i],od[i]);}
				}
				edittext1.setText(temp);
				/*
*/
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (!edittext1.isEnabled()) {
					try{
						if (false) {
							int hello=1/0;
						}
						jigelu.vibrate((long)(25));
						dot = "కచటతప".lastIndexOf(_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())));
						if (-1 < dot) {
							voi.setEnabled(true);
							asp.setEnabled(true);
							av.setEnabled(true);
							voi.setText(gaja.substring((int)(dot), (int)(dot + 1)));
							asp.setText(khacha.substring((int)(dot), (int)(dot + 1)));
							av.setText(ghajha.substring((int)(dot), (int)(dot + 1)));
							voi.setAlpha((float)(1));
							asp.setAlpha((float)(1));
							av.setAlpha((float)(1));
							if (spinner1.getSelectedItemPosition() == 1) {
								voi.setEnabled(false);
								asp.setEnabled(false);
								av.setEnabled(false);
								asp.setText("•");
								voi.setText("i");
								av.setText("i •");
								voi.setAlpha((float)(0.5d));
								asp.setAlpha((float)(0.5d));
								av.setAlpha((float)(0.5d));
								if (_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())).equals("చ")) {
									voi.setEnabled(true);
									voi.setAlpha((float)(1));
								}
							}
						}
						else {
							voi.setEnabled(false);
							asp.setEnabled(false);
							av.setEnabled(false);
							asp.setText("•");
							voi.setText("i");
							av.setText("i •");
							underli.setEnabled(false);
							d_under.setEnabled(false);
							voi.setAlpha((float)(0.5d));
							asp.setAlpha((float)(0.5d));
							av.setAlpha((float)(0.5d));
							underli.setAlpha((float)(0.5d));
							d_under.setAlpha((float)(0.5d));
						}
						if (_charSeq.length() == 0) {
							voi.setEnabled(false);
							asp.setEnabled(false);
							av.setEnabled(false);
							voi.setAlpha((float)(0.5d));
							asp.setAlpha((float)(0.5d));
							av.setAlpha((float)(0.5d));
						}
						if (-1 < "రలసన".lastIndexOf(_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())))) {
							underli.setEnabled(true);
							underli.setAlpha((float)(1));
							Lara = "రలసన".lastIndexOf(_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())));
							if (!(spinner1.getSelectedItemPosition() == 1)) {
								if (_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())).equals("న")) {
									underli.setEnabled(false);
									underli.setAlpha((float)(0.5d));
								}
							}
							if (spinner1.getSelectedItemPosition() == 5) {
								if (_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())).equals("ల")) {
									underli.setEnabled(false);
									underli.setAlpha((float)(0.5d));
								}
								if (_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())).equals("ర")) {
									underli.setEnabled(false);
									underli.setAlpha((float)(0.5d));
								}
							}
							if (spinner1.getSelectedItemPosition() == 6) {
								if (_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())).equals("స")) {
									underli.setEnabled(false);
									underli.setAlpha((float)(0.5d));
								}
								if (_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())).equals("ర")) {
									underli.setEnabled(false);
									underli.setAlpha((float)(0.5d));
								}
							}
							if ((spinner1.getSelectedItemPosition() == 8) || (spinner1.getSelectedItemPosition() == 7)) {
								if (_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())).equals("ర")) {
									underli.setEnabled(false);
									underli.setAlpha((float)(0.5d));
								}
							}
						}
						else {
							underli.setEnabled(false);
							underli.setAlpha((float)(0.5d));
						}
						if (-1 < "లస".lastIndexOf(_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())))) {
							d_under.setEnabled(true);
							d_under.setAlpha((float)(1));
							if (!((spinner1.getSelectedItemPosition() == 1) || (spinner1.getSelectedItemPosition() == 4))) {
								if (_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())).equals("ల")) {
									d_under.setEnabled(false);
									d_under.setAlpha((float)(0.5d));
								}
							}
						}
						else {
							d_under.setAlpha((float)(0.5d));
							d_under.setEnabled(false);
						}
						char ch=_charSeq.charAt(_charSeq.length()-1);
						lastchar=ch+"";
						if(ch>='క'&&ch<='హ')
						{
							temo = 100;
							a.setText(lastchar.concat(""));
							aa.setText(lastchar.concat("ా"));
							ii.setText(lastchar.concat("ి"));
							ee.setText(lastchar.concat("ీ"));
							u.setText(lastchar.concat("ు"));
							uu.setText(lastchar.concat("ూ"));
							ru.setText(lastchar.concat("ృ"));
							ak.setText(lastchar.concat("్"));
							ae.setText(lastchar.concat("ె"));
							aae.setText(lastchar.concat("ే"));
							ai.setText(lastchar.concat("ై"));
							o.setText(lastchar.concat("ొ"));
							oo.setText(lastchar.concat("ో"));
							au.setText(lastchar.concat("ౌ"));
							am.setText(lastchar.concat("ం"));
							ah.setText(lastchar.concat("ః"));
						}else{
							temo = 10;
							a.setText("అ");
							aa.setText("ఆ");
							ii.setText("ఇ");
							ee.setText("ఈ");
							u.setText("ఉ");
							uu.setText("ఊ");
							ru.setText("ఋ");
							ak.setText("్");
							ae.setText("ఎ");
							aae.setText("ఏ");
							ai.setText("ఐ");
							o.setText("ఒ");
							oo.setText("ఓ");
							au.setText("ఔ");
							am.setText("ం");
							ah.setText("ః");
						}
						
						if (_charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())).equals("ழ") || _charSeq.substring((int)(_charSeq.length() - 1), (int)(_charSeq.length())).equals("ன")) {
							temo = 100;
							a.setText(lastchar);
							aa.setText(lastchar.concat("ா"));
							ii.setText(lastchar.concat("ி"));
							ee.setText(lastchar.concat("ீ"));
							u.setText(lastchar.concat("ு"));
							uu.setText(lastchar.concat("ூ"));
							ak.setText(lastchar.concat("்"));
							ae.setText(lastchar.concat("ெ"));
							aae.setText(lastchar.concat("ே"));
							ai.setText(lastchar.concat("ை"));
							o.setText(lastchar.concat("ொ"));
							oo.setText(lastchar.concat("ோ"));
							au.setText(lastchar.concat("ௌ"));
							am.setText(lastchar.concat("ஂ"));
							ah.setText(lastchar.concat("ஃ"));
							if (spinner1.getSelectedItemPosition() == 1) {
								ru.setText(lastchar);
							}
							else {
								ru.setText("ഴൃ");
							}
						}
						lastchar = "";
					}catch(Exception excp){
						if ((_charSeq.length() == 0) || false) {
							a.setText("అ");
							aa.setText("ఆ");
							ii.setText("ఇ");
							ee.setText("ఈ");
							u.setText("ఉ");
							uu.setText("ఊ");
							ru.setText("ఋ");
							ak.setText("్");
							ae.setText("ఎ");
							aae.setText("ఏ");
							ai.setText("ఐ");
							o.setText("ఒ");
							oo.setText("ఓ");
							au.setText("ఔ");
							am.setText("ం");
							ah.setText("ః");
							voi.setEnabled(false);
							asp.setEnabled(false);
							av.setEnabled(false);
							asp.setText("•");
							voi.setText("i");
							av.setText("i •");
							underli.setEnabled(false);
							d_under.setEnabled(false);
							voi.setAlpha((float)(0.5d));
							asp.setAlpha((float)(0.5d));
							av.setAlpha((float)(0.5d));
							underli.setAlpha((float)(0.5d));
							d_under.setAlpha((float)(0.5d));
							temo = 10;
						}
					}
					edittext3.setText(_charSeq);
				}
				edittext2.setSelection(edittext2.getText().length());
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (edittext1.isEnabled()) {
					String Bentel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఋ","ఏ","ఐ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","శ","ష","స","హ","ా","ి","ీ","ు","ూ","ృ","ే","ై","ో","ౌ","్"},ben[]={"অ","আ","ই","ঈ","উ","ঊ","ঋ","এ","ঐ","ও","ঔ","ং","ঃ","ক","খ","গ","ঘ","ঙ","চ","ছ","জ","ঝ","ঞ","ট","ঠ","ড","ঢ","ণ","ত","থ","দ","ধ","ন","প","ফ","ব","ভ","ম","য","র","ল","শ","ষ","স","হ","া","ি","ী","ু","ূ","ৃ","ে","ৈ","ো","ৌ","্"};
					String Hintel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఋ","ఏ","ఐ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","వ","శ","ష","స","హ","ళ","ఱ","ా","ి","ీ","ు","ూ","ృ","ే","ై","ో","ౌ","్"},hin[]={"अ","आ","इ","ई","उ","ऊ","ऋ","ए","ऐ","ओ","औ","ं","ः","क","ख","ग","घ","ङ","च","छ","ज","झ","ञ","ट","ठ","ड","ढ","ण","त","थ","द","ध","न","प","फ","ब","भ","म","य","र","ल","व","श","ष","स","ह","ळ","ऱ","ा","ि","ी","ु","ू","ृ","े","ै","ो","ौ","्"};
					String kantel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఋ","ఎ","ఏ","ఐ","ఒ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","వ","శ","ష","స","హ","ళ","ఱ","ా","ి","ీ","ు","ూ","ృ","ె","ే","ై","ొ","ో","ౌ","్"},kan[]={"ಅ","ಆ","ಇ","ಈ","ಉ","ಊ","ಋ","ಎ","ಏ","ಐ","ಒ","ಓ","ಔ","ಂ","ಃ","ಕ","ಖ","ಗ","ಘ","ಙ","ಚ","ಛ","ಜ","ಝ","ಞ","ಟ","ಠ","ಡ","ಢ","ಣ","ತ","ಥ","ದ","ಧ","ನ","ಪ","ಫ","ಬ","ಭ","ಮ","ಯ","ರ","ಲ","ವ","ಶ","ಷ","ಸ","ಹ","ಳ","ಱ","ಾ","ಿ","ೀ","ು","ೂ","ೃ","ೆ","ೇ","ೈ","ೊ","ೋ","ೌ","್"};
					String gur[]={"ਅ","ਆ","ਇ","ਈ","ਉ","ਊ","ਏ","ਐ","ਓ","ਔ","ਂ","ਃ","ਕ","ਖ","ਗ","ਘ","ਙ","ਚ","ਛ","ਜ","ਝ","ਞ","ਟ","ਠ","ਡ","ਢ","ਣ","ਤ","ਥ","ਦ","ਧ","ਨ","ਪ","ਫ","ਬ","ਭ","ਮ","ਯ","ਰ","ਲ","ਵ","ਸ਼","ਸ","ਹ","ਲ਼","ਾ","ਿ","ੀ","ੁ","ੂ","ੇ","ੈ","ੋ","ੌ","੍"},Gurtel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఏ","ఐ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","వ","ష","స","హ","ళ","ా","ి","ీ","ు","ూ","ే","ై","ో","ౌ","్"};
					 String guj[]={"અ","આ","ઇ","ઈ","ઉ","ઊ","ઋ","એ","ઐ","ઓ","ઔ","ં","ઃ","ક","ખ","ગ","ઘ","ઙ","ચ","છ","જ","ઝ","ઞ","ટ","ઠ","ડ","ઢ","ણ","ત","થ","દ","ધ","ન","પ","ફ","બ","ભ","મ","ય","ર","લ","વ","શ","ષ","સ","હ","ળ","ા","િ","ી","ુ","ૂ","ૃ","ે","ેૈ","ો","ૌ","્"},Gujtel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఋ","ఏ","ఐ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","వ","శ","ష","స","హ","ళ","ా","ి","ీ","ు","ూ","ృ","ే","ై","ో","ౌ","్"};
					String od[]={"ଅ","ଆ","ଇ","ଈ","ଉ","ଊ","ଋ","ଏ","ଐ","ଓ","ଔ","ଂ","ଃ","କ","ଖ","ଗ","ଘ","ଙ","ଚ","ଛ","ଜ","ଝ","ଞ","ଟ","ଠ","ଡ","ଢ","ଣ","ତ","ଥ","ଦ","ଧ","ନ","ପ","ଫ","ବ","ଭ","ମ","ଯ","ର","ଲ","ଵ","ଶ","ଷ","ସ","ହ","ଳ","ୟ","ା","ି","ୀ","ୁ","ୂ","ୃ","େ","ୈ","ୋ","ୌ","୍"},Odtel[]={"అ","ఆ","ఇ","ఈ","ఉ","ఊ","ఋ","ఏ","ఐ","ఓ","ఔ","ం","ః","క","ఖ","గ","ఘ","ఙ","చ","ఛ","జ","ఝ","ఞ","ట","ఠ","డ","ఢ","ణ","త","థ","ద","ధ","న","ప","ఫ","బ","భ","మ","య","ర","ల","వ","శ","ష","స","హ","ళ","య","ా","ి","ీ","ు","ూ","ృ","ే","ై","ో","ౌ","్"};
					
					temp = _charSeq;
					if (spinner1.getSelectedItemPosition() == 0) {
						for(int i=0;i<Hintel.length;i++)
						{ temp=temp.replace(hin[i],Hintel[i]);}
					}
					if (spinner1.getSelectedItemPosition() == 3) {
						for(int i=0;i<kan.length;i++)
						{ temp=temp.replace(kan[i],kantel[i]);}
					}
					if (spinner1.getSelectedItemPosition() == 5) {
						for(int i=0;i<Bentel.length;i++)
						{ temp=temp.replace(ben[i],Bentel[i]);}
					}
					if (spinner1.getSelectedItemPosition() == 6) {
						for(int i=0;i<Gurtel.length;i++)
						{ temp=temp.replace(gur[i],Gurtel[i]);}
					}
					if (spinner1.getSelectedItemPosition() == 7) {
						for(int i=0;i<Gujtel.length;i++)
						{ temp=temp.replace(guj[i],Gujtel[i]);}
					}
					if (spinner1.getSelectedItemPosition() == 8) {
						for(int i=0;i<Odtel.length;i++)
						{ temp=temp.replace(od[i],Odtel[i]);}
					}
					edittext2.setText(temp);
				}
				if (!edittext1.isEnabled()) {
					edittext1.setSelection(edittext1.getText().length());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button42.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				A = edittext1.getText().toString();
				if (0 < edittext1.getText().toString().length()) {
					using.setPositiveButton("Share as image", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							tempo = edittext1.getText().toString();
							tempo=tempo.replace(" ","");
							if (tempo.length() < 8) {
								naamaha = tempo.substring((int)(0), (int)(tempo.length()));
							}
							else {
								naamaha = tempo.substring((int)(0), (int)(8));
							}
							_saveit(edittext2, naamaha);
						}
					});
					using.setNeutralButton("Share text", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							Intent i = new Intent(android.content.Intent.ACTION_SEND);i.setType("text/plain"); i.putExtra(android.content.Intent.EXTRA_TEXT,A); startActivity(Intent.createChooser(i,"Share text using"));
						}
					});
					using.create().show();
				}
			}
		});
		
		button41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				vowels_2.setVisibility(View.VISIBLE);
				vowels_1.setVisibility(View.VISIBLE);
				kacha.setVisibility(View.VISIBLE);
				yara.setVisibility(View.VISIBLE);
				spaces.setVisibility(View.VISIBLE);
				{LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) vscroll3.getLayoutParams(); params.weight = 5.0f;
					vscroll3.setLayoutParams(params);
					
					LinearLayout.LayoutParams param = (LinearLayout.LayoutParams) linear11.getLayoutParams(); param.weight = 1.0f;
					linear11.setLayoutParams(param);
					
					LinearLayout.LayoutParams para1 = (LinearLayout.LayoutParams) vowels_1.getLayoutParams(); para1.weight = 1.0f;
					vowels_1.setLayoutParams(para1);
					
					LinearLayout.LayoutParams para2 = (LinearLayout.LayoutParams) vowels_2.getLayoutParams(); para2.weight = 1.0f;
					vowels_2.setLayoutParams(para2);
					
					LinearLayout.LayoutParams para3 = (LinearLayout.LayoutParams) kacha.getLayoutParams(); para3.weight = 1.0f;
					kacha.setLayoutParams(para3);
					
					LinearLayout.LayoutParams para4= (LinearLayout.LayoutParams) yara.getLayoutParams(); para4.weight = 1.0f;
					yara.setLayoutParams(para4);
					
					LinearLayout.LayoutParams para5 = (LinearLayout.LayoutParams) kacha.getLayoutParams(); para5.weight = 1.0f;
					spaces.setLayoutParams(para5);
				}
				linear10.setScaleY((float)(2.3d));
				jigelu.vibrate((long)(30));
				if (textview1.getText().toString().equals("భారతి")) {
					textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
					textview2.setText("భారతి");
					textview1.setText(language.get((int)(spinner1.getSelectedItemPosition())));
					textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/normal.ttf"), 0);
					edittext1.setEnabled(true);
					
					edittext1.requestFocus();
					edittext1.setHint("enter text in ".concat(textview1.getText().toString()));
					vowels_2.setVisibility(View.INVISIBLE);
					vowels_1.setVisibility(View.INVISIBLE);
					kacha.setVisibility(View.INVISIBLE);
					yara.setVisibility(View.INVISIBLE);
					spaces.setVisibility(View.INVISIBLE);
					{LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) vscroll3.getLayoutParams(); params.weight = 0f;
						vscroll3.setLayoutParams(params);
						
						LinearLayout.LayoutParams param = (LinearLayout.LayoutParams) linear11.getLayoutParams(); param.weight = 0.0f;
						linear11.setLayoutParams(param);
						
						LinearLayout.LayoutParams para1 = (LinearLayout.LayoutParams) vowels_1.getLayoutParams(); para1.weight = 0.0f;
						vowels_1.setLayoutParams(para1);
						
						LinearLayout.LayoutParams para2 = (LinearLayout.LayoutParams) vowels_2.getLayoutParams(); para2.weight = 0.0f;
						vowels_2.setLayoutParams(para2);
						
						LinearLayout.LayoutParams para3 = (LinearLayout.LayoutParams) kacha.getLayoutParams(); para3.weight = 0.0f;
						kacha.setLayoutParams(para3);
						
						LinearLayout.LayoutParams para4= (LinearLayout.LayoutParams) yara.getLayoutParams(); para4.weight = 0.0f;
						yara.setLayoutParams(para4);
						
						LinearLayout.LayoutParams para5 = (LinearLayout.LayoutParams) kacha.getLayoutParams(); para5.weight = 0.0f;
						spaces.setLayoutParams(para5);
					}
					linear10.setScaleY((float)(2.4d));
					
					
				}
				else {
					textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
					textview1.setText("భారతి");
					textview2.setText(language.get((int)(spinner1.getSelectedItemPosition())));
					textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/normal.ttf"), 0);
					edittext1.setEnabled(false);
					edittext1.setHint(" ");
				}
			}
		});
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				edittext2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sund.ttf"), 0);
				edittext2.setText("");
				edittext1.setText("");
				
				ae.setEnabled(true);
				ae.setAlpha((float)(1));
				o.setEnabled(true);
				o.setAlpha((float)(1));
				ru.setEnabled(true);
				ru.setAlpha((float)(1));
				v.setEnabled(true);
				v.setAlpha((float)(1));
				vowels_2.setVisibility(View.VISIBLE);
				vowels_1.setVisibility(View.VISIBLE);
				kacha.setVisibility(View.VISIBLE);
				yara.setVisibility(View.VISIBLE);
				spaces.setVisibility(View.VISIBLE);
				{LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) vscroll3.getLayoutParams(); params.weight = 5.0f;
					//params.height=(int)Math.round(height);
					vscroll3.setLayoutParams(params);
					
					LinearLayout.LayoutParams param = (LinearLayout.LayoutParams) linear11.getLayoutParams(); param.weight = 1.0f;
					//param.height=(int)Math.round(width);
					linear11.setLayoutParams(param);
					
					LinearLayout.LayoutParams para1 = (LinearLayout.LayoutParams) vowels_1.getLayoutParams(); para1.weight = 1.0f;
					vowels_1.setLayoutParams(para1);
					
					LinearLayout.LayoutParams para2 = (LinearLayout.LayoutParams) vowels_2.getLayoutParams(); para2.weight = 1.0f;
					vowels_2.setLayoutParams(para2);
					
					LinearLayout.LayoutParams para3 = (LinearLayout.LayoutParams) kacha.getLayoutParams(); para3.weight = 1.0f;
					kacha.setLayoutParams(para3);
					
					LinearLayout.LayoutParams para4= (LinearLayout.LayoutParams) yara.getLayoutParams(); para4.weight = 1.0f;
					yara.setLayoutParams(para4);
					
					LinearLayout.LayoutParams para5 = (LinearLayout.LayoutParams) kacha.getLayoutParams(); para5.weight = 1.0f;
					spaces.setLayoutParams(para5);
				}
				if(_position==0||_position==5||_position==6||_position==7||_position==8)
				{
					ae.setEnabled(false);
					ae.setAlpha((float)(0.5d));
					o.setEnabled(false);
					o.setAlpha((float)(0.5d));
				}
				if(_position==1||_position==4)
				edittext2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
				textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
				textview1.setText("భారతి");
				textview2.setText(language.get((int)(_position)));
				textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/normal.ttf"), 0);
				edittext1.setEnabled(false);
				if(_position==1||_position==6){
					ru.setEnabled(false);
					ru.setAlpha((float)(0.5d));
				}
				if(_position==5){
					v.setEnabled(false);
					v.setAlpha((float)(0.5d));
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		button43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				inte.setClass(getApplicationContext(), HelpActivity.class);
				startActivity(inte);
			}
		});
		
		a.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (a.getText().toString().equals("అ")) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(a.getText().toString()));
					}
					else {
						if (temo == 100) {
							edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(a.getText().toString()));
						}
						else {
							edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(a.getText().toString()));
						}
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(a.getText().toString()));
				}
				a.setText("అ");
				aa.setText("ఆ");
				ii.setText("ఇ");
				ee.setText("ఈ");
				u.setText("ఉ");
				uu.setText("ఊ");
				ru.setText("ఋ");
				ak.setText("్");
				ae.setText("ఎ");
				aae.setText("ఏ");
				ai.setText("ఐ");
				o.setText("ఒ");
				oo.setText("ఓ");
				au.setText("ఔ");
				am.setText("ం");
				ah.setText("ః");
			}
		});
		
		aa.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(aa.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(aa.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(aa.getText().toString()));
				}
			}
		});
		
		ii.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(ii.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(ii.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(ii.getText().toString()));
				}
			}
		});
		
		ee.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(ee.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(ee.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(ee.getText().toString()));
				}
			}
		});
		
		u.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(u.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(u.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(u.getText().toString()));
				}
			}
		});
		
		uu.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(uu.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(uu.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(uu.getText().toString()));
				}
			}
		});
		
		ru.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(ru.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(ru.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(ru.getText().toString()));
				}
			}
		});
		
		ak.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(ak.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(ak.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(ak.getText().toString()));
				}
			}
		});
		
		ae.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(ae.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(ae.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(ae.getText().toString()));
				}
			}
		});
		
		aae.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(aae.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(aae.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(aae.getText().toString()));
				}
			}
		});
		
		ai.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(ai.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(ai.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(ai.getText().toString()));
				}
			}
		});
		
		o.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(o.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(o.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(o.getText().toString()));
				}
			}
		});
		
		oo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(oo.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(oo.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(oo.getText().toString()));
				}
			}
		});
		
		au.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(au.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(au.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(au.getText().toString()));
				}
			}
		});
		
		am.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(am.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(am.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(am.getText().toString()));
				}
			}
		});
		
		ah.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (temo == 100) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(ah.getText().toString()));
					}
					else {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 0)).concat(ah.getText().toString()));
					}
				} catch(Exception e){
					edittext2.setText(edittext2.getText().toString().concat(ah.getText().toString()));
				}
			}
		});
		
		asp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(spinner1.getSelectedItemPosition() == 1)) {
					try{
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(asp.getText().toString()));
					}catch(Exception e){}
				}
			}
		});
		
		k.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("క"));
				/*
dot = 0;
*/
			}
		});
		
		ch.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("చ"));
				/*
dot = 1;
*/
			}
		});
		
		t.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("ట"));
				/*
dot = 2;
*/
			}
		});
		
		th.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("త"));
				/*
dot = 3;
*/
			}
		});
		
		p.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("ప"));
				/*
dot = 4;
*/
			}
		});
		
		n.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("న"));
				/*
Lara = 3;
*/
			}
		});
		
		nn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					edittext2.setText(edittext2.getText().toString().concat("ణ"));
				}catch(Exception e){}
			}
		});
		
		voi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (!(spinner1.getSelectedItemPosition() == 1)) {
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(voi.getText().toString()));
					}
					else {
						if (edittext2.getText().toString().substring((int)(edittext2.getText().toString().length() - 1), (int)(edittext2.getText().toString().length())).equals("చ")) {
							edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(voi.getText().toString()));
						}
					}
				}catch(Exception e){}
			}
		});
		
		m.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("మ"));
			}
		});
		
		y.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("య"));
			}
		});
		
		r.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("ర"));
			}
		});
		
		l.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("ల"));
			}
		});
		
		v.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("వ"));
			}
		});
		
		s.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("స"));
				/*
Lara = 2;
*/
			}
		});
		
		h.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("హ"));
			}
		});
		
		back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)));
				}catch(Exception e){}
			}
		});
		
		av.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(spinner1.getSelectedItemPosition() == 1)) {
					try{
						edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(av.getText().toString()));
					}catch(Exception e){}
				}
			}
		});
		
		in.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("ఞ"));
			}
		});
		
		underli.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(lara.substring((int)(Lara), (int)(Lara + 1))));
				}catch(Exception e){}
			}
		});
		
		space.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat(" "));
			}
		});
		
		d_under.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					edittext2.setText(edittext2.getText().toString().substring((int)(0), (int)(edittext2.getText().toString().length() - 1)).concat(lara.substring((int)(Lara + 3), (int)(Lara + 4))));
				}catch(Exception e){}
			}
		});
		
		ng.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("ఙ"));
			}
		});
		
		ent.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext2.setText(edittext2.getText().toString().concat("\n"));
			}
		});
	}
	private void initializeLogic() {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		edittext2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sund.ttf"), 0);
		edittext1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bharati.ttf"), 0);
		a.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		aa.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		ii.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		ee.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		u.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		uu.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		ru.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		ak.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		ae.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		aae.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		ai.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		o.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		oo.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		au.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		am.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		ah.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		k.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		ch.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		t.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		th.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		p.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		n.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		m.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		y.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		r.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		l.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		v.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		s.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		h.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		in.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		ng.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		nn.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		asp.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		voi.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		av.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nav.ttf"), 1);
		gaja = "గజడదబ";
		khacha = "ఖఛఠథఫ";
		ghajha = "ఘఝఢధభ";
		lara = "ఱళశனழష";
		Lang.add("अक");
		Lang.add("அக");
		Lang.add("అక");
		Lang.add("ಅಕ");
		Lang.add("അക");
		Lang.add("অক");
		Lang.add("ਅਕ");
		Lang.add("અક");
		Lang.add("ଅକ");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, Lang));
		language.add("देवनाग्रि");
		language.add("தமிழ்");
		language.add("తెలుగు");
		language.add("ಕನ್ನಡ");
		language.add("മലയാളം");
		language.add("বেংগালি");
		language.add("ਗੁਰ੍ਮੁਖਿ");
		language.add("ગુજરાતિ");
		language.add("ଓଡିଯା");
		inte.setClass(getApplicationContext(), IntroActivity.class);
		startActivity(inte);
		if (900 > SketchwareUtil.getDisplayHeightPixels(getApplicationContext())) {
			_setTextSize(a, 14);
			_setTextSize(aa, 14);
			_setTextSize(ii, 14);
			_setTextSize(ee, 14);
			_setTextSize(u, 14);
			_setTextSize(uu, 14);
			_setTextSize(ru, 14);
			_setTextSize(ak, 14);
			_setTextSize(ae, 14);
			_setTextSize(aae, 14);
			_setTextSize(ai, 14);
			_setTextSize(o, 14);
			_setTextSize(oo, 14);
			_setTextSize(au, 14);
			_setTextSize(am, 14);
			_setTextSize(ah, 14);
			_setTextSize(asp, 14);
			_setTextSize(k, 14);
			_setTextSize(ch, 14);
			_setTextSize(t, 14);
			_setTextSize(th, 14);
			_setTextSize(p, 14);
			_setTextSize(n, 14);
			_setTextSize(nn, 14);
			_setTextSize(voi, 14);
			_setTextSize(m, 14);
			_setTextSize(y, 14);
			_setTextSize(r, 14);
			_setTextSize(l, 14);
			_setTextSize(v, 14);
			_setTextSize(s, 14);
			_setTextSize(h, 14);
			_setTextSize(av, 14);
			_setTextSize(in, 14);
			_setTextSize(underli, 14);
			_setTextSize(d_under, 14);
			_setTextSize(ng, 14);
		}
		else {
			if (SketchwareUtil.getDisplayHeightPixels(getApplicationContext()) > 1400) {
				_setTextSize(a, 25);
				_setTextSize(aa, 25);
				_setTextSize(ii, 25);
				_setTextSize(ee, 25);
				_setTextSize(u, 25);
				_setTextSize(uu, 25);
				_setTextSize(ru, 25);
				_setTextSize(ak, 25);
				_setTextSize(ae, 25);
				_setTextSize(aae, 25);
				_setTextSize(ai, 25);
				_setTextSize(o, 25);
				_setTextSize(oo, 25);
				_setTextSize(au, 25);
				_setTextSize(am, 25);
				_setTextSize(ah, 25);
				_setTextSize(asp, 25);
				_setTextSize(k, 25);
				_setTextSize(ch, 25);
				_setTextSize(t, 25);
				_setTextSize(th, 25);
				_setTextSize(p, 25);
				_setTextSize(n, 25);
				_setTextSize(nn, 25);
				_setTextSize(voi, 25);
				_setTextSize(m, 25);
				_setTextSize(y, 25);
				_setTextSize(r, 25);
				_setTextSize(l, 25);
				_setTextSize(v, 25);
				_setTextSize(s, 25);
				_setTextSize(h, 25);
				_setTextSize(av, 25);
				_setTextSize(in, 25);
				_setTextSize(underli, 25);
				_setTextSize(d_under, 25);
				_setTextSize(ng, 25);
			}
		}

		if (!FileUtil.isExistFile(FileUtil.getExternalStorageDir().concat("/BharatiKeyboard/"))) {
			FileUtil.makeDir(FileUtil.getExternalStorageDir().concat("/BharatiKeyboard/"));
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _saveit (final View _view, final String _lable) {
		
		tem = _lable;
		{edittext2.setTextSize(TypedValue.COMPLEX_UNIT_SP,30);}
		Bitmap returnedBitmap = Bitmap.createBitmap(_view.getWidth(), _view.getHeight(),Bitmap.Config.ARGB_8888);
		
		Canvas canvas = new Canvas(returnedBitmap);
		android.graphics.drawable.Drawable bgDrawable =_view.getBackground();
		if (bgDrawable!=null) {
			bgDrawable.draw(canvas);
		} else {
			canvas.drawColor(Color.WHITE);
		}
		_view.draw(canvas);
		
		java.io.File pictureFile = new java.io.File(Environment.getExternalStorageDirectory() + "/BharatiKeyboard/"+tem+".png");
		if (pictureFile == null) {
			showMessage("Error creating media file, check storage permissions: ");
			return; }
		try {
			java.io.FileOutputStream fos = new java.io.FileOutputStream(pictureFile); returnedBitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
			fos.close();
			showMessage("Image Saved in /storage/emulated/0/BharatiKeyboard/");
		} catch (java.io.FileNotFoundException e) {
			showMessage("File not found: " + e.getMessage()); } catch (java.io.IOException e) {
			showMessage("Error accessing file: " + e.getMessage());
			
		}
		Intent iten = new Intent(android.content.Intent.ACTION_SEND);
		iten.setType("*/*");
		iten.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new java.io.File(FileUtil.getExternalStorageDir() + "/BharatiKeyboard/"+tem+".png")));
		startActivity(Intent.createChooser(iten, "Share image"));
		{edittext2.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);}
	}
	
	
	private void _setTextSize (final TextView _view, final double _size) {
		_view.setTextSize(TypedValue.COMPLEX_UNIT_SP,(float)_size);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}

package com.example.photocollage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity {

	GridView grid;
	Integer[] Frame_id;
	Adapter_grid adapter;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);

		Frame_id = new Integer[] { R.drawable.t1_01, R.drawable.t1_02,
				R.drawable.t1_03, R.drawable.t1_04, R.drawable.t1_05,
				R.drawable.t1_06, R.drawable.t1_07, R.drawable.t1_08,
				R.drawable.t1_09, R.drawable.t1_10, R.drawable.t1_11,
				R.drawable.t1_12, R.drawable.t1_13, R.drawable.t1_14,
				R.drawable.t1_15, R.drawable.t1_16, R.drawable.t1_17,
				R.drawable.t1_18, R.drawable.t1_19, R.drawable.t1_20,
				R.drawable.t1_21, R.drawable.t1_22, R.drawable.t1_23,
				R.drawable.t1_24, R.drawable.t1_25, R.drawable.t1_26,
				R.drawable.t1_27, R.drawable.t1_28, R.drawable.t1_29,
				R.drawable.t1_30, R.drawable.t1_31, R.drawable.t1_32,
				R.drawable.t1_33, R.drawable.t1_34, R.drawable.t1_35,
				R.drawable.t1_36, R.drawable.t1_37, R.drawable.t1_38,
				R.drawable.t1_39, R.drawable.t1_40, R.drawable.t1_41,
				R.drawable.t1_42, R.drawable.t1_43, R.drawable.t1_44,
				R.drawable.t1_45, R.drawable.t1_46, R.drawable.t1_47,
				R.drawable.t1_48, R.drawable.t1_49, R.drawable.t1_50,
				R.drawable.t1_51, R.drawable.t1_52, R.drawable.t1_53 };

		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		getActionBar().hide();
		setContentView(R.layout.activity_main);

		//bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#78B4BE")));
		
		
		grid = (GridView) findViewById(R.id.gridView1);
		adapter = new Adapter_grid(getApplicationContext(), Frame_id);
		grid.setAdapter(adapter);

		grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub

				Log.i("You are click at...", "" + Frame_id[arg2]);
				
				Intent i  = new Intent(MainActivity.this, SelectedImageActivity.class);
				i.putExtra("img_id", Frame_id[arg2]);
				startActivity(i);
				/*
				 * Toast.makeText(getApplicationContext(), "You clicked at" +
				 * Frame_id[arg2], Toast.LENGTH_SHORT) .show();
				 */

			}
		});
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}*/

}

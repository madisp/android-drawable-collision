package com.madisp.android.collision;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ImageView iv = new ImageView(this);
		iv.setBackgroundResource(R.color.transparent);
		iv.setImageResource(R.drawable.ic_launcher);
		final int matchParent = ViewGroup.LayoutParams.MATCH_PARENT;
		setContentView(iv, new ViewGroup.LayoutParams(matchParent, matchParent));
	}
}

package vane.com.clickarea;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.vane.demo.R;

public class MainActivity extends Activity implements OnClickListener {

	private Toast mToast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.menu_1).setOnClickListener(this);
		findViewById(R.id.menu_2).setOnClickListener(this);
		findViewById(R.id.menu_3).setOnClickListener(this);
		findViewById(R.id.menu_4).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (null != mToast) {
			mToast.cancel();
		}
		switch (v.getId()) {
		case R.id.menu_1:
			mToast = Toast.makeText(this, "red", Toast.LENGTH_SHORT);
			intent();
			break;
		case R.id.menu_2:
			mToast = Toast.makeText(this, "yellow", Toast.LENGTH_SHORT);
			intent();
			break;
		case R.id.menu_3:
			mToast = Toast.makeText(this, "green", Toast.LENGTH_SHORT);
			intent();
			break;
		case R.id.menu_4:
			mToast = Toast.makeText(this, "blue", Toast.LENGTH_SHORT);
			intent();
			break;
		}
		mToast.show();
	}

	private void intent() {
		Intent intent = new Intent(MainActivity.this, MyActivity.class);
		startActivity(intent);
	}
}

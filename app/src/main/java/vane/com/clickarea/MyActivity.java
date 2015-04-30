package vane.com.clickarea;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.vane.demo.R;

public class MyActivity extends Activity implements OnClickListener {

	private Toast mToast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mydemo);
		findViewById(R.id.home_page_1).setOnClickListener(this);
		findViewById(R.id.home_page_2).setOnClickListener(this);
		findViewById(R.id.home_page_3).setOnClickListener(this);
		findViewById(R.id.home_page_4).setOnClickListener(this);
		findViewById(R.id.home_page_5).setOnClickListener(this);
		findViewById(R.id.home_page_6).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (null != mToast) {
			mToast.cancel();
		}
		switch (v.getId()) {
		case R.id.home_page_1:
			mToast = Toast.makeText(this, "我的钱包", Toast.LENGTH_SHORT);
			break;
		case R.id.home_page_2:
			mToast = Toast.makeText(this, "获取记录", Toast.LENGTH_SHORT);
			break;
		case R.id.home_page_3:
			mToast = Toast.makeText(this, "系统设置", Toast.LENGTH_SHORT);
			break;
		case R.id.home_page_4:
			mToast = Toast.makeText(this, "我的收藏", Toast.LENGTH_SHORT);
			break;
		case R.id.home_page_5:
			mToast = Toast.makeText(this, "提取积分", Toast.LENGTH_SHORT);
			break;
		case R.id.home_page_6:
			mToast = Toast.makeText(this, "账户管理", Toast.LENGTH_SHORT);
			break;
		}
		mToast.show();
	}
}

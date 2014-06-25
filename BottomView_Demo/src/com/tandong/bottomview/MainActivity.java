package com.tandong.bottomview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;

import com.tandong.bottomview.adapter.BVAdapter;
import com.tandong.bottomview.view.BottomView;

/**
 * BottomView
 * 
 * www.aplesson.com
 * 
 * @author TanDong
 * 
 */

public class MainActivity extends Activity implements OnClickListener {
	private Button btn_show;
	private ListView lv_menu_list;
	private ArrayList<String> menus;
	private BottomView bottomView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
		initData();

	}

	private void initData() {
		menus = new ArrayList<String>();
		menus.add(getResources().getString(R.string.menu_search));
		menus.add(getResources().getString(R.string.menu_filemanage));
		menus.add(getResources().getString(R.string.menu_downloadmanage));
		menus.add(getResources().getString(R.string.menu_setting));
		menus.add(getResources().getString(R.string.menu_about));

	}

	private void initView() {
		btn_show = (Button) this.findViewById(R.id.btn_show);
		btn_show.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		switch (arg0.getId()) {
		case R.id.btn_show:
			bottomView = new BottomView(MainActivity.this,
					R.style.BottomViewTheme_Defalut, R.layout.bottom_view);
			bottomView.setAnimation(R.style.BottomToTopAnim);
			
			bottomView.showBottomView(false);
			lv_menu_list = (ListView) bottomView.getView().findViewById(
					R.id.lv_list);
			BVAdapter adapter = new BVAdapter(MainActivity.this, menus);
			lv_menu_list.setAdapter(adapter);
			lv_menu_list.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					bottomView.dismissBottomView();

				}
			});
			break;

		default:
			break;
		}
	}

}

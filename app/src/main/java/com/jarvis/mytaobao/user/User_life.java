package com.jarvis.mytaobao.user;

import java.util.Random;

import com.jarvis.MyView.ScratchTextView;
import com.jarvis.mytaobaotest.R;
import com.zdp.aseo.content.AseoZdpAseo;

import android.app.Activity;
import android.os.Bundle;

/**
 * 刮刮乐界面
 * @author https://shop262893968.taobao.com/?spm=a230r.7195193.1997079397.2.8JmOqz
 *
 */
public class User_life extends Activity {

	/**刮刮乐组件*/
	private ScratchTextView tv_Scratch;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AseoZdpAseo.initType(this, AseoZdpAseo.INSERT_TYPE);
		setContentView(R.layout.user_life);
		tv_Scratch=(ScratchTextView) findViewById(R.id.tv_Scratch);
		tv_Scratch.initScratchCard(0xFFCECED1, 3, 1f);
		tv_Scratch.setText(str_reward[getRandom()]);
	}


	private String[] str_reward={"谢谢惠顾","恭喜！奖励5毛","鼓励奖，加油","优秀奖","表彰奖","Srroy！再来吧！","恭喜！一等奖","很抱歉","没有奖","再买一瓶就有了"};


	/**随机生成一个数*/
	private int getRandom(){
		Random random=new Random();
		int number=random.nextInt(10);

		return number;
	}

}

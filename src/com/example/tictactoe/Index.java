package com.example.tictactoe;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Index extends Activity implements OnClickListener{
	Button b1,b2,b3;
	int level=0;
	RelativeLayout rl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_index);
		
		rl=(RelativeLayout)findViewById(R.id.layout);
        rl.setBackgroundColor(Color.YELLOW);
        
		b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.index, menu);
		
		
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId()==(R.id.button1))
		{
			level=1;
		}
		
		else if (v.getId() == (R.id.button2))
		{
			level=2;	
		}
		
		else if (v.getId() == (R.id.button3))
		{
			level=3;
		}
		
		Intent i=new Intent(this,MainActivity.class);
		i.putExtra("LEVEL", level);
    	startActivity(i);
		
	}

}

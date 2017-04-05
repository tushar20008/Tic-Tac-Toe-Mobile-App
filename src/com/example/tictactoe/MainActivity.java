package com.example.tictactoe;

import java.util.Random;

import android.R.color;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    int x1=2,x2=3,x3=4,x4=5,x5=6,x6=7,x7=8,x8=9,x9=10;
    int counter=0,counter2=1;
    int score=0;
    int level =1;
    TextView tv1,tv2;
    RelativeLayout rl;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl=(RelativeLayout)findViewById(R.id.layout);
        rl.setBackgroundColor(Color.YELLOW);
        tv1=(TextView)findViewById(R.id.textView1);
        
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        
        b1.setTextColor(Color.BLUE);
        b2.setTextColor(Color.BLUE);
        b3.setTextColor(Color.BLUE);
        b4.setTextColor(Color.BLUE);
        b5.setTextColor(Color.BLUE);
        b6.setTextColor(Color.BLUE);
        b7.setTextColor(Color.BLUE);
        b8.setTextColor(Color.BLUE);
        b9.setTextColor(Color.BLUE);
        
        b10.setBackgroundColor(Color.GREEN);
        
        Intent mIntent = getIntent();
        level = mIntent.getIntExtra("LEVEL", 0);
       
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	
		if(v.getId()==(R.id.button1))
		{
			b1.setText("X");
			x1=1;
			b1.setEnabled(false);
			counter=0;
		}
		
		else if (v.getId() == (R.id.button2))
		{
				b2.setText("X");
				x2=1;
				b2.setEnabled(false);
				counter=0;
		}
		
		else if (v.getId() == (R.id.button3))
		{
				b3.setText("X");
				x3=1;
				b3.setEnabled(false);
				counter=0;
		}
		
		else if (v.getId() == (R.id.button4))
		{
				b4.setText("X");
	        	x4=1;
	        	b4.setEnabled(false);
	        	counter=0;
		}
			
		else if (v.getId() == (R.id.button5))
		{
				b5.setText("X");
				x5=1;
				b5.setEnabled(false);
				counter=0;
		}
		
		else if (v.getId() == (R.id.button6))
		{
				b6.setText("X");
				x6=1;
				b6.setEnabled(false);
				counter=0;
		}
		
		else if (v.getId() == (R.id.button7))
		{
			    b7.setText("X");
				x7=1;
				b7.setEnabled(false);
				counter=0;
		}
		
		else if (v.getId() == (R.id.button8))
		{
				b8.setText("X");
				x8=1;
				b8.setEnabled(false);
				counter=0;
		}
		
		else if (v.getId() == (R.id.button9))
		{
				b9.setText("X");
				x9=1;
				b9.setEnabled(false);
				counter=0;
		}
		
		else if (v.getId() == (R.id.button10))
		{
			b1.setTextColor(Color.BLUE);
	        b2.setTextColor(Color.BLUE);
	        b3.setTextColor(Color.BLUE);
	        b4.setTextColor(Color.BLUE);
	        b5.setTextColor(Color.BLUE);
	        b6.setTextColor(Color.BLUE);
	        b7.setTextColor(Color.BLUE);
	        b8.setTextColor(Color.BLUE);
	        b9.setTextColor(Color.BLUE);
	        
			b1.setText("");
			b2.setText("");
			b3.setText("");
			b4.setText("");
			b5.setText("");
			b6.setText("");
			b7.setText("");
			b8.setText("");
			b9.setText("");
			
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
			
			x1=2;
			x2=3;
			x3=4;
			x4=5;
			x5=6;
			x6=7;
			x7=8;
			x8=9;
			x9=10;
			if(counter2==1)
			{
				counter=1;
				counter2=0;
			}
			else
			{
				counter=0;
				counter2=1;
			}
		}
		
		Check(v);
		
		if(counter!=1)
		{
			if(level==1)
			{
				Easy(v);
			}
			else if(((x2==0 && x3==0) || (x4==0 && x7==0) || (x5==0 && x9==0)) && x1!=1)
			{
				b1.setText("0");
				x1=0;
				b1.setEnabled(false);
			}
			else if(((x1==0 && x3==0) || (x5==0 && x8==0)) && x2!=1)
			{
				b2.setText("0");
				x2=0;
				b2.setEnabled(false);
			}
			else if(((x1==0 && x2==0) || (x6==0 && x9==0) || (x5==0 && x7==0)) && x3!=1)
			{
				b3.setText("0");
				x3=0;
				b3.setEnabled(false);
			}
			else if(((x5==0 && x6==0) || (x1==0 && x7==0)) && x4!=1)
			{
				b4.setText("0");
				x4=0;
				b4.setEnabled(false);
			}
			else if(((x4==0 && x6==0) || (x2==0 && x8==0) || (x1==0 && x9==0) || (x3==0 && x7==0)) && x5!=1)
			{
				b5.setText("0");
				x5=0;
				b5.setEnabled(false);
			}
			else if(((x4==0 && x5==0) || (x3==0 && x9==0)) && x6!=1)
			{
				b6.setText("0");
				x6=0;
				b6.setEnabled(false);
			}
			else if(((x1==0 && x4==0) || (x8==0 && x9==0) || (x3==0 && x5==0)) && x7!=1)
			{
				b7.setText("0");
				x7=0;
				b7.setEnabled(false);
			}
			else if(((x2==0 && x5==0) || (x7==0 && x9==0)) && x8!=1)
			{
				b8.setText("0");
				x8=0;
				b8.setEnabled(false);
			}
			else if(((x3==0 && x6==0) || (x7==0 && x8==0) || (x1==0 && x5==0)) && x9!=1)
			{
				b9.setText("0");
				x9=0;
				b9.setEnabled(false);
			}
			else if (((x2==1 && x3==1) || (x4==1 && x7==1) || (x5==1 && x9==1)) && x1!=0)
			{
				b1.setText("0");
				x1=0;
				b1.setEnabled(false);
			}
			else if(((x1==1 && x3==1) || (x5==1 && x8==1)) && x2!=0)
			{
				b2.setText("0");
				x2=0;
				b2.setEnabled(false);
			}
			else if(((x1==1 && x2==1) || (x6==1 && x9==1) || (x5==1 && x7==1)) && x3!=0)
			{
				b3.setText("0");
				x3=0;
				b3.setEnabled(false);
			}
			else if(((x5==1 && x6==1) || (x1==1 && x7==1)) && x4!=0)
			{
				b4.setText("0");
				x4=0;
				b4.setEnabled(false);
			}
			else if(((x4==1 && x6==1) || (x2==1 && x8==1) || (x1==1 && x9==1) || (x3==1 && x7==1)) && x5!=0)
			{
				b5.setText("0");
				x5=0;
				b5.setEnabled(false);
			}
			else if(((x4==1 && x5==1) || (x3==1 && x9==1)) && x6!=0)
			{
				b6.setText("0");
				x6=0;
				b6.setEnabled(false);
			}
			else if(((x1==1 && x4==1) || (x8==1 && x9==1) || (x3==1 && x5==1)) && x7!=0)
			{
				b7.setText("0");
				x7=0;
				b7.setEnabled(false);
			}
			else if(((x2==1 && x5==1) || (x7==1 && x9==1)) && x8!=0)
			{
				b8.setText("0");
				x8=0;
				b8.setEnabled(false);
			}
			else if(((x3==1 && x6==1) || (x7==1 && x8==1) || (x1==1 && x5==1)) && x9!=0)
			{
				b9.setText("0");
				x9=0;
				b9.setEnabled(false);
			}
			else if(level==2)
			{
				Easy(v);
			}
			else if(level==3)
			{
				if((x1==1 && x9==1) && x2!=0 && x2!=1)
				{
					b2.setText("O");
					b2.setEnabled(false);
					x2=0;
				}
				else if((x3==1 && x7==1) && x2!=0 && x2!=1)
				{
					b2.setText("O");
					b2.setEnabled(false);
					x2=0;
				}
				else if(x5>1)				
				{
					b5.setText("O");
					b5.setEnabled(false);
					x5=0;
				}
				else if(x1>1)				
				{
					b1.setText("O");
					b1.setEnabled(false);
					x1=0;
				}
				else if(x3>1)				
				{
					b3.setText("O");
					b3.setEnabled(false);
					x3=0;
				}
				else if(x7>1)				
				{
					b7.setText("O");
					b7.setEnabled(false);
					x7=0;
				}
				else if(x9>1)				
				{
					b9.setText("O");
					b9.setEnabled(false);
					x9=0;
				}
				else if(x2>1)				
				{
					b2.setText("O");
					b2.setEnabled(false);
					x2=0;
				}
				else if(x4>1)				
				{
					b4.setText("O");
					b4.setEnabled(false);
					x4=0;
				}
				else if(x6>1)				
				{
					b6.setText("O");
					b6.setEnabled(false);
					x6=0;
				}
				else if(x8>1)				
				{
					b8.setText("O");
					b8.setEnabled(false);
					x8=0;
				}
			}
			Check(v);
		}
	}
	
	public void Easy(View v)
	{
		for (int i=0; i!=1;)
		{
			int n = (int) (Math.random()*10);
			if(n==1 && x1>1)
			{
				b1.setText("O");
				b1.setEnabled(false);
				x1=0;
				i++;
			}
			if(n==2 && x2>1)
			{
				b2.setText("O");
				b2.setEnabled(false);
				x2=0;
				i++;
			}
			if(n==3 && x3>1)
			{
				b3.setText("O");
				b3.setEnabled(false);
				x3=0;
				i++;
			}
			if(n==4 && x4>1)
			{
				b4.setText("O");
				b4.setEnabled(false);
				x4=0;
				i++;
			}
			if(n==5 && x5>1)
			{
				b5.setText("O");
				b5.setEnabled(false);
				x5=0;
				i++;
			}
			if(n==6 && x6>1)
			{
				b6.setText("O");
				b6.setEnabled(false);
				x6=0;
				i++;
			}
			if(n==7 && x7>1)
			{
				b7.setText("O");
				b7.setEnabled(false);
				x7=0;
				i++;
			}
			if(n==8 && x8>1)
			{
				b8.setText("O");
				b8.setEnabled(false);
				x8=0;
				i++;
			}
			if(n==9 && x9>1)
			{
				b9.setText("O");
				b9.setEnabled(false);
				x9=0;
				i++;
			}
		}
	}
	
	public void Check(View v)
	{
		if(x1==x2 && x2==x3)
		{
			if(x1==1)
			{
				Toast t=Toast.makeText(this, "You Win", Toast.LENGTH_SHORT);
				t.show();
				score++;
			}
			else
			{
				Toast t=Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT);
				t.show();
				score--;
			}
			
			counter=1;
			b1.setTextColor(Color.RED);
			b2.setTextColor(Color.RED);
			b3.setTextColor(Color.RED);
			Gameover(v);
			
		}
		
		else if(x4==x5 && x5==x6)
		{
			if(x4==1)
			{
				Toast t=Toast.makeText(this, "You Win", Toast.LENGTH_SHORT);
				t.show();
				score++;
			}
			else
			{
				Toast t=Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT);
				t.show();
				score--;
			}
			
			counter=1;
			b4.setTextColor(Color.RED);
			b5.setTextColor(Color.RED);
			b6.setTextColor(Color.RED);
			Gameover(v);

		}
		
		else if(x7==x8 && x8==x9)
		{
			if(x7==1)
			{
				Toast t=Toast.makeText(this, "You Win", Toast.LENGTH_SHORT);
				t.show();
				score++;
			}
			else
			{
				Toast t=Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT);
				t.show();
				score--;
			}
			
			counter=1;
			b7.setTextColor(Color.RED);
			b8.setTextColor(Color.RED);
			b9.setTextColor(Color.RED);
			Gameover(v);

		}
		
		else if(x1==x4 && x4==x7)
		{
			if(x1==1)
			{
				Toast t=Toast.makeText(this, "You Win", Toast.LENGTH_SHORT);
				t.show();
				score++;
			}
			else
			{
				Toast t=Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT);
				t.show();
				score--;
			}
			
			counter=1;
			b1.setTextColor(Color.RED);
			b4.setTextColor(Color.RED);
			b7.setTextColor(Color.RED);
			Gameover(v);

		}
		
		else if(x2==x5 && x5==x8)
		{
			if(x2==1)
			{
				Toast t=Toast.makeText(this, "You Win", Toast.LENGTH_SHORT);
				t.show();
				score++;
			}
			else
			{
				Toast t=Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT);
				t.show();
				score--;
			}
			
			counter=1;
			b2.setTextColor(Color.RED);
			b5.setTextColor(Color.RED);
			b8.setTextColor(Color.RED);
			Gameover(v);

		}
		
		else if(x3==x6 && x6==x9)
		{
			if(x3==1)
			{
				Toast t=Toast.makeText(this, "You Win", Toast.LENGTH_SHORT);
				t.show();
				score++;
			}
			else
			{
				Toast t=Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT);
				t.show();
				score--;
			}
			
			counter=1;
			b3.setTextColor(Color.RED);
			b6.setTextColor(Color.RED);
			b9.setTextColor(Color.RED);
			Gameover(v);

		}
		
		else if(x1==x5 && x5==x9)
		{
			if(x1==1)
			{
				Toast t=Toast.makeText(this, "You Win", Toast.LENGTH_SHORT);
				t.show();
				score++;
			}
			else
			{
				Toast t=Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT);
				t.show();
				score--;
			}
			
			counter=1;
			b1.setTextColor(Color.RED);
			b5.setTextColor(Color.RED);
			b9.setTextColor(Color.RED);
			Gameover(v);

		}
		
		else if(x3==x5 && x5==x7)
		{
			if(x3==1)
			{
				Toast t=Toast.makeText(this, "You Win", Toast.LENGTH_SHORT);
				t.show();
				score++;
			}
			else
			{
				Toast t=Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT);
				t.show();
				score--;
			}
			
			counter=1;
			b3.setTextColor(Color.RED);
			b5.setTextColor(Color.RED);
			b7.setTextColor(Color.RED);
			Gameover(v);

		}
		
		else if(x1!=2 && x2!=3 && x3!=4 && x4!=5 && x5!=6 && x6!=7 && x7!=8 && x8!=9 && x9!=10)
		{
			Toast t=Toast.makeText(this, "Draw", Toast.LENGTH_SHORT);
			t.show();
			counter=1;
		}
		
		tv1.setText("Your Score : " + score);
	}
	
	public void Gameover(View v)
	{
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	}

    
}
 
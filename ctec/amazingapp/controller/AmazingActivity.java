package ctec.amazingapp.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AmazingActivity extends Activity
{
	private Button talkButton;
	private int talkCount = 0;
	private TextView talkTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_amazing);
		talkButton = (Button) findViewById(R.id.talkButton);
		talkTextView = (TextView) findViewById(R.id.talkingTextView);
		
		setupListners();
	}
	
	private void setupListners()
	{
		talkButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				if (talkCount == 0)
				{
					talkTextView.setText("what is your name");
				}
			}
		});
	}
}

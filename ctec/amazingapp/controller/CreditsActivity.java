package ctec.amazingapp.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CreditsActivity extends Activity
{
	private Button BackButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_credits);
		BackButton = (Button) findViewById(R.id.backButton);
		
		setupListners();
	}
	
	private void setupListners()
	{
		BackButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent currentIntent = new Intent();
				setResult(RESULT_OK, currentIntent);
				finish();
				
			}
		});
	}
}

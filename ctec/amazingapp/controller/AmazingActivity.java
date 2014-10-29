package ctec.amazingapp.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AmazingActivity extends Activity
{
	private Button talkButton;
	private int talkCount = 0;
	private TextView talkTextView;
	private Button UpButton;
	private Button DownButton;
	private Button RightButton;
	private Button LeftButton;
	private ImageView LinkImage;
	private Button CreditButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_amazing);
		talkButton = (Button) findViewById(R.id.talkButton);
		talkTextView = (TextView) findViewById(R.id.talkingTextView);
		UpButton = (Button) findViewById(R.id.upButton);
		DownButton = (Button) findViewById(R.id.downButton);
		RightButton = (Button) findViewById(R.id.rightButton);
		LeftButton = (Button) findViewById(R.id.leftButton);
		LinkImage = (ImageView) findViewById(R.id.LinkImage);
		CreditButton = (Button) findViewById(R.id.creditsButton);

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
					talkTextView.setText("My name is Steve");
					talkCount++;
				}
				else if (talkCount == 1)
				{
					talkTextView.setText("I like balloons.");
					talkCount++;
				}
				else if (talkCount == 2)
				{
					talkTextView.setText("One day, I saw a balloon in the park.");
					talkCount++;
				}
				else if (talkCount == 3)
				{
					talkTextView.setText("It was big and red.");
					talkCount++;
				}
				else if (talkCount == 4)
				{
					talkTextView.setText("The kid that held it let go of it.");
					talkCount++;
				}
				else if (talkCount == 5)
				{
					talkTextView.setText("This made me sad.");
					talkCount++;
				}
				else if (talkCount == 6)
				{
					talkTextView.setText("So I bought my own balloon.");
					talkCount++;
				}
				else if (talkCount == 7)
				{
					talkTextView.setText("I wrote on it,");
					talkCount++;
				}
				else if (talkCount == 8)
				{
					talkTextView.setText("and it said:");
					talkCount = 0;
				}
			}
		});

		RightButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				LinkImage.setX(LinkImage.getX() + 50);
			}
		});
		LeftButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				LinkImage.setX(LinkImage.getX() - 50);
			}
		});
		UpButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				LinkImage.setY(LinkImage.getY() - 50);
			}
		});
		DownButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				LinkImage.setY(LinkImage.getY() + 50);
			}
		});
		CreditButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View currentView)
			{
				Intent myIntent = new Intent(currentView.getContext(), CreditsActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	}
}

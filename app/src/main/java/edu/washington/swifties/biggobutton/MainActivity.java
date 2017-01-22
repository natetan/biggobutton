package edu.washington.swifties.biggobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  private Button pushMeButton;
  private int count;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    count = 0;
    pushMeButton = (Button) findViewById(R.id.pushMeButton);
    pushMeButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        count++;
        pushMeButton.setText("You have pushed me " + count + " times!");
      }
    });
  }
}

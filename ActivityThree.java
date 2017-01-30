package course.lab.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.closeButton;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

/**
 * Activity Three
 */
public class ActivityThree extends Activity {
    private static final String MESSAGE_KEY = "message";
    EditText mTEdit;
    String mEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        mTEdit = (EditText) findViewById(R.id.edit_message);

        Button closeButton = (Button) findViewById(R.id.bClose);
        closeButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

        if (savedInstanceState != null){
            mEdit = savedInstanceState.getString(MESSAGE_KEY);
        }

        if (mEdit != null){
            mTEdit.setText(mEdit);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString(MESSAGE_KEY, mTEdit.getText().toString());
    }
}

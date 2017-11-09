package com.example.android.autofillframework.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.android.autofillframework.R;

/**
 * Created by dlarson on 6/26/17.
 */
public class AddressActivity extends AppCompatActivity {

    private Spinner stateSpinner;

    public static Intent getStartActivityIntent(Context context) {
        return new Intent(context, AddressActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.address_layout);

        stateSpinner = findViewById(R.id.states);

        ArrayAdapter<CharSequence> stateAdapter = ArrayAdapter.createFromResource(
                this, R.array.states, android.R.layout.simple_spinner_item);

        findViewById(R.id.button).setOnClickListener(v -> submit());

        stateSpinner.setAdapter(stateAdapter);
    }

    private void submit() {
        Intent intent = WelcomeActivity.getStartActivityIntent(this);
        startActivity(intent);
        finish();
    }

}

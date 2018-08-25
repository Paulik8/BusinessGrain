package ru.paul.businessgrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =findViewById(R.id.humidity);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                double doubleValue = 0;
                if (s != null) {
                    try {
                        doubleValue = Double.parseDouble(s.toString().replace(',', '.'));
                    } catch (NumberFormatException e) {
                        //Error
                    }
                }
                Log.i("hi", String.valueOf(doubleValue));
            }
        });
    }


}

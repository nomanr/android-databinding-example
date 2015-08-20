package com.databinding.example.databindingexample.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.databinding.example.databindingexample.R;
import com.databinding.example.databindingexample.databinding.SimpleTextActivityBinding;

public class SimpleTextActivity extends AppCompatActivity {
    private String text;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //When we define data in our xml file.
        //SimpleTextActivityBinding is generated automatically afterwards

        final SimpleTextActivityBinding binding = DataBindingUtil
                .setContentView(this, R.layout.simple_text_activity);
        text = "Hello from SimpleTextActivity";
        binding.setText(text);

        editText = (EditText) findViewById(R.id.simple_edit_text);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //binded to the textView in layoutfile
                //whenever text will be changed, textView will be updated
                binding.setText(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }


}

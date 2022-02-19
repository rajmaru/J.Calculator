package com.one.javacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.one.javacalculator.databinding.ActivityMainBinding;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    String inputText = "";
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText += "1";
                binding.input.setText(inputText);
                try {
                    result(inputText);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void result(String inputText) throws ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        result = (String) engine.eval(inputText);
        binding.result.setText(result);
    }
}
package com.one.javacalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;

import com.one.javacalculator.databinding.ActivityMainBinding;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    String inputText = "";
    String resultText = "";
    Object calculatedResult;
    int dotIndex;
    Boolean canOperatorUsed = false;
    Boolean canDotUsed = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.input.setMovementMethod(new ScrollingMovementMethod());

        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = inputText + '1';
                binding.input.setText(inputText);
                try {
                    result(inputText);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
                canOperatorUsed = true;
            }
        });


        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = inputText + '2';
                binding.input.setText(inputText);
                try {
                    result(inputText);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
                canOperatorUsed = true;
            }
        });


        binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = inputText + '3';
                binding.input.setText(inputText);
                try {
                    result(inputText);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
                canOperatorUsed = true;
            }
        });

        binding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = inputText + '4';
                binding.input.setText(inputText);
                try {
                    result(inputText);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
                canOperatorUsed = true;
            }
        });

        binding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = inputText + '5';
                binding.input.setText(inputText);
                try {
                    result(inputText);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
                canOperatorUsed = true;
            }
        });

        binding.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = inputText + '6';
                binding.input.setText(inputText);
                try {
                    result(inputText);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
                canOperatorUsed = true;
            }
        });

        binding.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = inputText + '7';
                binding.input.setText(inputText);
                try {
                    result(inputText);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
                canOperatorUsed = true;
            }
        });

        binding.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = inputText + '8';
                binding.input.setText(inputText);
                try {
                    result(inputText);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
                canOperatorUsed = true;
            }
        });

        binding.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = inputText + '9';
                binding.input.setText(inputText);
                try {
                    result(inputText);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
                canOperatorUsed = true;
            }
        });

        binding.btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = inputText + "00";
                binding.input.setText(inputText);
                try {
                    result(inputText);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
                canOperatorUsed = true;
            }
        });

        binding.btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = inputText + '0';
                binding.input.setText(inputText);
                try {
                    result(inputText);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
                canOperatorUsed = true;
                canDotUsed = true;
            }
        });

        binding.btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (canDotUsed) {
                    inputText = inputText + '.';
                    binding.input.setText(inputText);
                    try {
                        result(inputText);
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }
                }
                canDotUsed = false;
            }
        });

        binding.btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = "";
                resultText = "";
                binding.input.setText(inputText);
                binding.result.setText(resultText);
                canOperatorUsed = false;
                canDotUsed = true;
                binding.input.setSelection(binding.input.getText().length());;
            }
        });

        binding.btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!inputText.isEmpty()) {
                    inputText = inputText.substring(0, inputText.length() - 1);
                    binding.input.setText(inputText);
                    try {
                        result(inputText);
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }
                } else {

                }
            }
        });

        binding.btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText = resultText;
                resultText = "";
                binding.input.setText(inputText);
                binding.result.setText(resultText);
            }
        });

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (canOperatorUsed) {
                    inputText = inputText + '+';
                    binding.input.setText(inputText);
                    try {
                        result(inputText);
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }
                }
                canOperatorUsed = false;
                canDotUsed = true;
            }
        });

        binding.btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (canOperatorUsed) {
                    inputText = inputText + '-';
                    binding.input.setText(inputText);
                    try {
                        result(inputText);
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }
                }
                canDotUsed = true;
                canOperatorUsed = false;
            }
        });

        binding.btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (canOperatorUsed) {
                    inputText = inputText + 'x';
                    binding.input.setText(inputText);
                    try {
                        result(inputText);
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }
                }
                canDotUsed = true;
                canOperatorUsed = false;
            }
        });

        binding.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (canOperatorUsed) {
                    inputText = inputText + '÷';
                    binding.input.setText(inputText);
                    try {
                        result(inputText);
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }
                }
                canOperatorUsed = false;
                canDotUsed = true;
            }
        });

    }

    private void result(@NonNull String text) throws ScriptException {
        if (!text.isEmpty()) {
            resultText = text.replace('x', '*').replace('÷', '/');
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
            calculatedResult = engine.eval(resultText);
            resultText = String.valueOf(calculatedResult);
//            if (inputText.contains(".")) {
                binding.result.setText(resultText);
//            } else {
//                dotIndex = resultText.indexOf(".");
//                resultText = resultText.substring(0, dotIndex);
//                binding.result.setText(resultText);
//            }
//        } else {
//            binding.result.setText("");
        }
    }
}
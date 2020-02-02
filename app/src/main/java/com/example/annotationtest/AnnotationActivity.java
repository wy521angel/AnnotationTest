package com.example.annotationtest;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lib_reflection.BindView;
import com.example.lib_reflection.Binding;

public class AnnotationActivity extends AppCompatActivity {


    @BindView(R.id.text)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotation);
        switch (getIntent().getIntExtra("TAG",-1)){
            case 0:
                Binding.bind(AnnotationActivity.this);
                textView.setText("我使用的是反射注解");
                break;
        }
    }
}

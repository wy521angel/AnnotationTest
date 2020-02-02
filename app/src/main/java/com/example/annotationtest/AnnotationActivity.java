package com.example.annotationtest;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lib_annotation_processing.Binding;
import com.example.lib_annotations.BindView;

public class AnnotationActivity extends AppCompatActivity {


    @BindView(R.id.text)
    TextView textView;
    @BindView(R.id.parentLayout)
    ViewGroup parentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotation);

        Binding.bind(AnnotationActivity.this);
        textView.setText("我使用的是编译时注解");

        parentLayout.setBackgroundColor(Color.CYAN);
    }
}

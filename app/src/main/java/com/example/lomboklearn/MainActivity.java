package com.example.lomboklearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * 使用LomBok要填加依赖项方可使用
 */
public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student student = new Student();
        student.setAge(1314);
        student.setName("SongAndPei");

        String name = student.getName();
        int age = student.getAge();

        Log.i(TAG, "Name: " + name + " Age: " + age);
    }
}

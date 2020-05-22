package com.example.listview01_0522;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.listview01_0522.databinding.ActivityMainBinding;
import com.example.listview01_0522.datas.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {


    ActivityMainBinding binding;

    List<Student> ourClassStudentList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {


    }

    @Override
    public void setValues() {

       addStudents();

    }
    void addStudents() {
        ourClassStudentList.add(new Student("조경진", "서울시 은평구"));
        ourClassStudentList.add(new Student("강희진", "인천시 남동구"));
        ourClassStudentList.add(new Student("구현정", "서울시 종로구"));
        ourClassStudentList.add(new Student("김정민", "서울시 도봉구"));
        ourClassStudentList.add(new Student("김하늬", "서울시 성북구"));
        ourClassStudentList.add(new Student("문희원", "서울시 은평구"));
        ourClassStudentList.add(new Student("송세인", "서울시 은평구"));
        ourClassStudentList.add(new Student("위건", "서울시 성동구"));
        ourClassStudentList.add(new Student("유혜원", "서울시 은평구"));
        ourClassStudentList.add(new Student("이다연", "서울시 은평구"));
        ourClassStudentList.add(new Student("황보석", "인천시 남동구"));
    }
}

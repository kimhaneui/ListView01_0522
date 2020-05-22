package com.example.listview01_0522.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listview01_0522.R;
import com.example.listview01_0522.datas.Student;

import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student> {

    Context mContext;
    List<Student> mList;
    LayoutInflater inf;

    public StudentAdapter(@NonNull Context context, int resource, @NonNull List<Student> objects) {
        super(context, resource, objects);
        mContext =context;
        mList=objects;
        inf=LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row ==null){
            row = inf.inflate(R.layout.student_list_item,null);
        }
        return  row;
    }

}

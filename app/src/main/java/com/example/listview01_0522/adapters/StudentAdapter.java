package com.example.listview01_0522.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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
        TextView nameTxt = row.findViewById(R.id.nameTxt);
        TextView addressTxt = row.findViewById(R.id.addressTxt);

        Log.d("getView실행",position+"번 줄");

        Student stdData = mList.get(position);

        nameTxt.setText(stdData.getName());
        addressTxt.setText(stdData.getAddress());
        return  row;
    }

}

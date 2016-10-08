package com.example.aston4.Activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aston4.Adapter.Subject;
import com.example.aston4.Adapter.SubjectAdapter;
import com.example.aston4.R;

import java.util.ArrayList;
import java.util.List;

public class AssignmentActivity extends Fragment {

    private RecyclerView recyclerView;
    private SubjectAdapter adapter;
    private List<Subject> subjectList;

    public AssignmentActivity(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_assignment, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        subjectList = new ArrayList<>();
        adapter = new SubjectAdapter(getContext(),subjectList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareSubjectData();

        return view;

    }

    private void prepareSubjectData() {

        Subject subject = new Subject("DBMS",14,3);
        subjectList.add(subject);

        subject = new Subject("DFS",14,6);
        subjectList.add(subject);

        subject = new Subject("Data Mining",14,2);
        subjectList.add(subject);

        subject = new Subject("Compiler Design",14,10);
        subjectList.add(subject);

        adapter.notifyDataSetChanged();
    }

}

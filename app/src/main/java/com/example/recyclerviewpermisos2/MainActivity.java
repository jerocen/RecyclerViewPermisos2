package com.example.recyclerviewpermisos2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private PermissionAdapter permissionAdapter;
    private List<PermissionItem> permissionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        permissionList = new ArrayList<>();
        permissionList.add(new PermissionItem("Mandar mensajes", false));

        permissionAdapter = new PermissionAdapter(permissionList);
        recyclerView.setAdapter(permissionAdapter);
    }
}
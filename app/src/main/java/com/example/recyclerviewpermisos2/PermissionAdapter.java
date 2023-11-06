package com.example.recyclerviewpermisos2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PermissionAdapter extends RecyclerView.Adapter<PermissionAdapter.ViewHolder> {

    private List<PermissionItem> permissionList;

    public PermissionAdapter(List<PermissionItem> permissionList) {
        this.permissionList = permissionList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_permission, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PermissionItem permissionItem = permissionList.get(position);
        holder.textViewPermission.setText(permissionItem.getName());
        holder.switchPermission.setChecked(permissionItem.isEnabled());
        holder.switchPermission.setOnCheckedChangeListener((buttonView, isChecked) -> {
            permissionItem.setEnabled(isChecked);
            // Puedes realizar acciones adicionales según el estado del Switch
        });
    }

    @Override
    public int getItemCount() {
        return permissionList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewPermission;
        public Switch switchPermission;

        public ViewHolder(View view)
        {
            super(view);
            textViewPermission = view.findViewById(R.id.textViewPermission);
            switchPermission = view.findViewById(R.id.switchPermission);
        }
    }
}


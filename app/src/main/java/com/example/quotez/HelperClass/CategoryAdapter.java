package com.example.quotez.HelperClass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotez.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    int moodName;
    int moodBg;
    List<CategoryModel> moodList;

    public CategoryAdapter(List<CategoryModel> moodList) {
        this.moodList = moodList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_category, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), android.R.anim.slide_in_left);

        holder.moodName.setText(""+position);

        int resource = moodList.get(position).getMoodImg();
        String name = moodList.get(position).getMoodName();

        holder.setData(resource, name);
        holder.itemView.startAnimation(animation);

    }

    @Override
    public int getItemCount() {
        return moodList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView moodBg;
        TextView moodName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            moodBg = itemView.findViewById(R.id.moodBg);
            moodName = itemView.findViewById(R.id.moodName);
        }

        public void setData(int resource, String name) {
            moodBg.setImageResource(resource);
            moodName.setText(name);
        }
    }
}

package com.example.insta.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.insta.R;
import com.example.insta.data.Story;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {

    private List<Story> StoryList;
    private Context context;

    public StoryAdapter(List<Story> storyList, Context context) {
        StoryList = storyList;
        this.context = context;
    }

    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.single_story_view, parent, false);
        StoryViewHolder storyViewHolder = new StoryViewHolder(inflate);
        return storyViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder storyViewHolder, int position) {
        Story story = StoryList.get(position);
        storyViewHolder.UserName.setText(story.getUserName());
        storyViewHolder.ImageView.setImageResource(story.getUserImage());

    }

    @Override
    public int getItemCount() {
        return StoryList.size();
    }


    public class StoryViewHolder extends RecyclerView.ViewHolder{
        private android.widget.ImageView ImageView;
        private TextView UserName;
        public StoryViewHolder(@NonNull View itemView) {
            super(itemView);
            UserName=itemView.findViewById(R.id.user_name);
            ImageView=itemView.findViewById(R.id.user_image);

        }
    }
}

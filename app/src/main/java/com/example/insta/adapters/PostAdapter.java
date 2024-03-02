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
import com.example.insta.data.Post;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private List<Post> lists_of_post;
    private Context context;

    public PostAdapter(List<Post> lists_of_post, Context context) {
        this.lists_of_post = lists_of_post;
        this.context = context;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.single_post_view, parent, false);
        PostViewHolder postViewHolder = new PostViewHolder(inflate);
        return postViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post =lists_of_post.get(position);
        holder.post_image.setImageResource(post.getPostImage());
        holder.profile_image.setImageResource(post.getProfileImage());
        holder.profile_name.setText(post.getProfileName());
        holder.comments.setText(post.getComments());
        holder.likes.setText(post.getLikes());
        holder.days.setText(post.getDays());
        holder.caption.setText(post.getCaption());

    }

    @Override
    public int getItemCount() {
        return lists_of_post.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{
        private ImageView post_image,profile_image;
        private TextView profile_name,comments,likes,days,caption;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            post_image=itemView.findViewById(R.id.post);
            profile_image=itemView.findViewById(R.id.profile_image);
            profile_name=itemView.findViewById(R.id.profile_name);
            comments=itemView.findViewById(R.id.comments);
            likes=itemView.findViewById(R.id.likes);
            caption=itemView.findViewById(R.id.caption);
            days=itemView.findViewById(R.id.days);


        }
    }
}

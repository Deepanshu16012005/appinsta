package com.example.insta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.insta.adapters.PostAdapter;
import com.example.insta.adapters.StoryAdapter;
import com.example.insta.data.Post;
import com.example.insta.data.Story;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView story_recycler_view, post_recycler_view;
    private List<Story> stories;
    private List<Post> posts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializers();
        StoryAdapter storyAdapter = new StoryAdapter(stories, this);
        story_recycler_view.setAdapter(storyAdapter);
        PostAdapter postAdapter = new PostAdapter(posts,this);
        post_recycler_view.setAdapter(postAdapter);
    }

    private void initializers() {
        this.story_recycler_view=findViewById(R.id.story_container);
        this.stories=new ArrayList<>();
        stories.add(new Story(1,"tuffy",R.drawable.story1));
        stories.add(new Story(2,"3 dogs",R.drawable.story2));
        stories.add(new Story(3,"neha",R.drawable.story3));
        stories.add(new Story(4,"deepika",R.drawable.story4));
        stories.add(new Story(5,"emma",R.drawable.story5));
        stories.add(new Story(6,"xyzgaming",R.drawable.story6));
        stories.add(new Story(7,"rahul",R.drawable.story7));
        stories.add(new Story(8,"suresh",R.drawable.story8));
        this.post_recycler_view=findViewById(R.id.post_layout);
        this.posts=new ArrayList<>();
        posts.add(new Post(R.drawable.story1,"tuffy",R.drawable.story1,"14126 likes","Attitude","view all 16 comments","4 days ago"));
        posts.add(new Post(R.drawable.story2,"3 dogs",R.drawable.story1,"14156 likes","Attitude","view all 100 comments","2 days ago"));
        posts.add(new Post(R.drawable.story3,"neha",R.drawable.story1,"141 likes","Attitude","view all 1000 comments","4 days ago"));
        posts.add(new Post(R.drawable.story4,"deepika",R.drawable.story1,"1126 likes","Attitude","view all 11236 comments","1 days ago"));
        posts.add(new Post(R.drawable.story5,"emma",R.drawable.story1,"145416 likes","Attitude","view all 85 comments","4 days ago"));
        posts.add(new Post(R.drawable.story6,"xyz gaming",R.drawable.story1,"16126 likes","Attitude","view all 10 comments","6 days ago"));
        posts.add(new Post(R.drawable.story7,"Rahul",R.drawable.story1,"14126 likes","Attitude","view all 5 comments","8 days ago"));
        posts.add(new Post(R.drawable.story8,"Suresh",R.drawable.story1,"14006 likes","Attitude","view all 1154 comments","7 days ago"));

    }
}
package blog;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<User> users = new ArrayList<>();
    List<Post> posts = new ArrayList<>();

    void publishPost(int userId, String c) {
        User user = null;
        for (User usr : users) {
            if (userId == usr.getId()) {
                user = usr;
            }

        }
        List<Comment> comment = new ArrayList<>();
        Post post = new Post(posts.size() + 1, LocalDateTime.now(), user, c, comment);
        posts.add(post);
    }

    void commentPost(int userId, int postId, String c) {
        User user = null;
        Post post = null;
        for (User usr : users) {
            if (userId == usr.getId()) {
                user = usr;
            }
            for (Post pst : posts) {
                if (post.getId() == postId) {
                    post = pst;
                }
            }
        }
        Comment comment = new Comment(post.getComment().size() + 1, LocalDateTime.now(), user, c);
        post.getComment().add(comment);

    }
    void displayUserEntries(int userId){
        for(Post posts:posts){
            if(userId == posts.getAuthor().getId()){
                System.out.println( posts.getAuthor().getNickName() + " " + posts.getPostedDate());
            }
        }

        for (Post posts : posts) {
            for (Comment com : posts.getComment()) {
                if (userId == com.getAuthor().getId()) {
                    System.out.println(com.getAuthor().getNickName() + " " + com.getPostedDate());
                }

            }
        }


    }
}
package Model;

import java.util.ArrayList;
import java.util.List;

public class PostModel {
    private String Publisher;
    private String PostContent;
    private int numOfComments=0;
    private List<CommentModel> Comments = new ArrayList<CommentModel>();

    public String getPublisher() {
        return Publisher;
    }
    public void setPublisher(String Publisher, String PostContent) {
        this.Publisher = Publisher;
        this.PostContent = PostContent;
    }
    public int getNumOfComments() {
        return numOfComments;
    }
    public String GetPostContent() {
        return PostContent;
    }
    public void setNumOfComments(int numOfComments) {
        this.numOfComments = numOfComments;
    }
public void AddComment(CommentModel Comment) {
    Comments.add(Comment);


    }
    public List<CommentModel> getComments() {
        return Comments;
    }




}

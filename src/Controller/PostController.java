package Controller;

import Model.CommentModel;
import Model.PostModel;
import View.PostView;

public class PostController {
    private PostModel model;
    private PostView view;
    public PostController(PostModel model, PostView view) {
        this.model = model;
        this.view = view;
    }
    public void setPublisher(String Publisher, String PostContent) {
        model.setPublisher(Publisher, PostContent);
    }
    public void AddComment(String Commenter, String Comment) {
        model.setNumOfComments(model.getNumOfComments()+1);
        CommentModel CommentModel = new CommentModel();
        CommentModel.setCommenter(Commenter);
        CommentModel.setComment(Comment);
        model.AddComment(CommentModel);
    }
    public void updateView() {
        view.printPostDetails(model.getPublisher(),model.GetPostContent(), model.getNumOfComments(),model.getComments());
    }

}

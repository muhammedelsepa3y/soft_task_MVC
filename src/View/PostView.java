package View;

import Model.CommentModel;

import java.util.List;

public class PostView {

    public void printPostDetails(String publisher,String PostContent, int numOfComments, List<CommentModel> Comments) {
        System.out.println(publisher+" posted : "+PostContent);
        System.out.println("number of comments: " + numOfComments);
        for (CommentModel i : Comments) {
            System.out.println(i.getCommenter() + " commented: " + i.getComment());
        }

    }
}

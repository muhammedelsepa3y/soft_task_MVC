import Controller.PostController;
import Model.PostModel;
import View.PostView;

public class Main {
    public static void main(String[] args) {
        PostModel model = new PostModel();
        PostView view = new PostView();
        PostController controller = new PostController(model, view);

        controller.setPublisher("Hassan", "YOLO!");
        controller.updateView();
        System.out.println("---------------------------");

        controller.AddComment("Omar","widsom  :D");
        controller.updateView();


    }
}
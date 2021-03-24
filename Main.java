import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Main extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{

        Label lbl = new Label("Label");
        lbl.setTooltip(new Tooltip("This is a label"));

        Button btn = new Button("Click");
        btn.setTooltip(new Tooltip("Click the button \nto start an action"));
        FlowPane root = new FlowPane(10,10, btn, lbl);
        Scene scene = new Scene(root,250,250);

        stage.setScene(scene);
        stage.setTitle("Tooltip in JavaFX");
        stage.show();
    }
}









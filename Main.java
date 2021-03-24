import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{

        Label headerLbl = new Label("ScrollPane");
        Label textLbl = new Label("Lorem Ipsum is simply dummy text of the printing and typesetting \n" +
                "industry. Lorem Ipsum has been the industry standard dummy \n" +
                "text ever since the 1500s, when a unknown printer took a galley...");

        ScrollPane scrollPane = new ScrollPane(textLbl);
        scrollPane.setPrefViewportHeight(150);
        scrollPane.setPrefViewportWidth(150);
        // Kui me soovime, et kerimisriba elemendi asukoht oleks keskel:
        //
        //ScrollPane scrollPane = new ScrollPane(textLbl);
        //scrollPane.setPrefViewportHeight(150);
        //scrollPane.setPrefViewportWidth(200);
        //scrollPane.setPannable(false);
        //scrollPane.setVvalue(0.5);
        //scrollPane.setHvalue(0.5);
        FlowPane root = new FlowPane(Orientation.VERTICAL,10,10,headerLbl,scrollPane);
        Scene scene = new Scene(root,300,250);

        stage.setScene(scene);
        stage.setTitle("ScrollPane in JavaFX");
        stage.show();
    }
}
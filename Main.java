import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Main extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{

        // loome objektide nimekiri
        ObservableList<Person> people = FXCollections.observableArrayList(

                new Person("Tom", 34),
                new Person("Bob", 22),
                new Person("Sam", 28),
                new Person("Alice", 29)
        );

        Label lbl = new Label();
        TableView<Person> table = new TableView<Person>(people);
        table.setPrefWidth(250);
        table.setPrefHeight(200);

        // veerg nime kuvamiseks
        TableColumn<Person, String> nameColumn = new TableColumn<Person, String>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
        table.getColumns().add(nameColumn);

        // veerg vanuse kuvamiseks
        TableColumn<Person, Integer> ageColumn = new TableColumn<Person, Integer>("Age");
        ageColumn.setCellValueFactory(new PropertyValueFactory<Person, Integer>("age"));
        table.getColumns().add(ageColumn);

        TableView.TableViewSelectionModel<Person> selectionModel = table.getSelectionModel();
        selectionModel.selectedItemProperty().addListener(new ChangeListener<Person>() {

            public void changed(ObservableValue<? extends Person> val, Person oldVal, Person newVal) {
                if(newVal != null) lbl.setText("Selected: " + newVal.getName());
            }
        });

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, lbl, table);
        Scene scene = new Scene(root,300,250);

        stage.setScene(scene);
        stage.setTitle("TableView in JavaFX");
        stage.show();
    }
}









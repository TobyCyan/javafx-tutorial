import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class DialogBox extends HBox {
    private Label text;
    private ImageView displayIcon;

    public DialogBox(String text, Image icon) {
        this.text = new Label(text);
        this.displayIcon = new ImageView(icon);

        this.text.setWrapText(true);
        this.displayIcon.setFitWidth(100.0);
        this.displayIcon.setFitHeight(100.0);
        this.setAlignment(Pos.TOP_RIGHT);

        this.getChildren().addAll(this.text, this.displayIcon);
    }

    /**
     * Flips the dialog box such that the ImageView is on the left and text on the right.
     */
    private void flip() {
        this.setAlignment(Pos.TOP_LEFT);
        ObservableList<Node> tmp = FXCollections.observableArrayList(this.getChildren());
        FXCollections.reverse(tmp);
        this.getChildren().setAll(tmp);
    }

    public static DialogBox getUserDialog(String text, Image icon) {
        return new DialogBox(text, icon);
    }

    public static DialogBox getDukeDialog(String text, Image icon) {
        DialogBox dialogBox = new DialogBox(text, icon);
        dialogBox.flip();
        return dialogBox;
    }
}

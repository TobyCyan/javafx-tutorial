import javafx.geometry.Pos;
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
}

package sample;

import javafx.scene.control.TextField;
import javafx.scene.input.*;

public class Controller {
    public TextField txfSource;

    public void txfDragOnDetected(MouseEvent mouseEvent) {

        TextField ref = (TextField) mouseEvent.getSource();
        if (!ref.getText().isEmpty()) {
            Dragboard db = txfSource.startDragAndDrop(TransferMode.ANY);
            ClipboardContent content = new ClipboardContent();
            content.putString(txfSource.getText());
            db.setContent(content);
        }
    }

    public void imgOnDragDrop(DragEvent dragEvent) {
        Dragboard db = dragEvent.getDragboard();
        txfSource.clear();

    }

    public void imgDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }
}

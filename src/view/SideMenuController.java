/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Abed
 */
public class SideMenuController implements Initializable {

    @FXML
    private VBox sidePane;
    @FXML
    private ImageView img;
    @FXML
    private JFXButton addView;
    @FXML
    private JFXButton consultView;
    @FXML
    private JFXButton editVIew;
    @FXML
    private JFXButton exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public JFXButton getAddView() {
        return addView;
    }

    public void setAddView(JFXButton addView) {
        this.addView = addView;
    }

    public JFXButton getConsultView() {
        return consultView;
    }

    public void setConsultView(JFXButton consultView) {
        this.consultView = consultView;
    }

    public JFXButton getEditVIew() {
        return editVIew;
    }

    public void setEditVIew(JFXButton editVIew) {
        this.editVIew = editVIew;
    }

    public JFXButton getExit() {
        return exit;
    }

    public void setExit(JFXButton exit) {
        this.exit = exit;
    }

    public VBox getSidePane() {
        return sidePane;
    }

    public void setSidePane(VBox sidePane) {
        this.sidePane = sidePane;
    }

}

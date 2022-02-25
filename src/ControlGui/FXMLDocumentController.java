/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlGui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.FillRule;

/**
 *
 * @author andres_fel.acosta
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Canvas lienzo;

    GraphicsContext g;
    double arrex[]={0,-100,100};
    double arrey[]={100,0,0};

    @FXML
    private void circulo1(ActionEvent event) {

        g.setStroke(Color.BLACK);
        g.setLineWidth(4);
        g.strokeOval(100, 100, 160, 160);
    }

    @FXML
    private void circulo2(ActionEvent event) {
        
        g.setFill(Color.RED);
        g.setFillRule(FillRule.EVEN_ODD);
        
        g.setStroke(Color.AQUAMARINE);
        g.setLineWidth(3);
        g.strokeOval(100, 100, 50, 50);
    }

    @FXML
    private void triangulo1(ActionEvent event) {
        g.setStroke(Color.CHOCOLATE);
        g.setLineWidth(3);
        g.strokePolygon(arrex, arrey, 3);
    }

    @FXML
    private void Triangulo2(ActionEvent event) {

    }

    @FXML
    private void cuadrado2(ActionEvent event) {
        
        g.setStroke(Color.CHOCOLATE);
        g.setLineWidth(3);
        g.strokeRect(10, 10, 120, 70);
    }

    @FXML
    private void cuadrado1(ActionEvent event) {
        
        g.setStroke(Color.DARKCYAN);
        g.setLineWidth(3);
        g.strokeRect(10, 10, 170, 120);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        g = lienzo.getGraphicsContext2D();

        double w = lienzo.getWidth();
        double h = lienzo.getHeight();

        g.setStroke(Color.DARKCYAN);
        g.setLineWidth(3);
        g.strokeRect(0, 0, w, h);

    }

}

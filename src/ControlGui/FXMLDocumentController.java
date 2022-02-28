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
    double arrex[]={100,200,400};
    double arrey[]={100,20,20};
    double arrex1[]={50,100,200};
    double arrey1[]={100,10,10};

    @FXML
    private void circulo1(ActionEvent event) {

        g.setStroke(Color.BLACK);
        g.setLineWidth(4);
        g.strokeOval(100, 100, 160, 160);
    }

    @FXML
    private void circulo2(ActionEvent event) {
        
        //g.setFill(Color.RED);
        
        
        g.setStroke(Color.AQUAMARINE);
        g.setLineWidth(3);
        g.strokeOval(100, 100, 50, 50);
        g.setFill(Color.RED);
        g.fillOval(100, 100, 50, 50);
        
        
    }

    @FXML
    private void triangulo1(ActionEvent event) {
        
        g.setStroke(Color.RED);
        g.setLineWidth(3);
        g.strokePolygon(arrex, arrey, 3);
    }

    @FXML
    private void Triangulo2(ActionEvent event) {
        
        g.setStroke(Color.BLUEVIOLET);
        g.setLineWidth(3);
        g.strokePolygon(arrex1, arrey1, 3);
        g.setFill(Color.AQUAMARINE);
        g.fillPolygon(arrex1, arrey1, 3);
    }

    @FXML
    private void cuadrado2(ActionEvent event) {
        
        g.setStroke(Color.CHOCOLATE);
        g.setLineWidth(3);
        g.strokeRect(10, 10, 120, 70);
        g.setFill(Color.CADETBLUE);
        g.fillRect(10, 10, 120, 70);
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

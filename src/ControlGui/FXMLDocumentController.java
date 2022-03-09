/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlGui;

import Modelo.Punto2D;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
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
    double arrex[] = {100, 200, 400};
    double arrey[] = {100, 20, 20};
    double arrex1[] = {50, 100, 200};
    double arrey1[] = {100, 10, 10};
    
    double []arrax2;
    double []array2;
    
    double coordenadax;
    double coordenaday;
    

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

    @FXML
    private void obtenerCoordenadas(MouseEvent event) {

        coordenadax = event.getX();
        coordenaday = event.getY();
//
        Punto2D objp = new Punto2D(coordenadax, coordenaday );

        System.out.println("Punto: " + objp.toString());
//
//        g.setStroke(Color.BLACK);
//        g.setLineWidth(4);
//        g.strokeOval(x, y, 110, 110);

//        g.setStroke(Color.RED);
//        g.setLineWidth(3);
//        g.strokePolygon(arrax2, array2, 5);

    }

    @FXML
    private void pintar(MouseEvent event) {
        
        double x = event.getX();
        double y = event.getY();
        
        g.setStroke(Color.BLACK);
        g.setLineWidth(5);
        g.strokeLine(x, y, x, y);
        

    }
    
    @FXML
    private void generarhexagono(ActionEvent event) {
        arrax2= new double[6];
        array2= new double[6];
        
        double r=100;
        double pi= 2*Math.PI/6;
        
        
        arrax2[0]=coordenadax+100;
        array2[0]=coordenaday;
        
        arrax2[1]= Math.cos(pi*r);
        array2[1]=Math.sin(pi*r);
        
        arrax2[2]= Math.cos((2+pi)*r);
        array2[2]=Math.sin((2+pi)*r);
        
        arrax2[3]= Math.cos((3+pi)*r);
        array2[3]=Math.sin((3+pi)*r);
        
        arrax2[4]= Math.cos((4+pi)*r);
        array2[4]=Math.sin((4+pi)*r);
        
        arrax2[5]= Math.cos((5+pi)*r);
        array2[5]=Math.sin((5+pi)*r);
        
        arrax2[6]= Math.cos((6+pi)*r);
        array2[6]=Math.sin((6+pi)*r);
        
        g.setStroke(Color.BLUEVIOLET);
        g.strokePolygon(arrax2, array2, 0);
        
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlGui;

import Modelo.Punto2D;
import java.net.URL;
import java.util.LinkedList;
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
    
    double[] x;
    double[] y;
    
    double coordenadaX;
    double coordenadaY;
    
    double r;
    LinkedList<Punto2D> listap;

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

        coordenadaX = event.getX();
        coordenadaY = event.getY();
//
        Punto2D objp = new Punto2D(coordenadaX, coordenadaY );

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
        x = new double[6];
        y = new double[6];
        
        listap=new LinkedList<>();
        
        x[0] = (coordenadaX + r);
        y[0] = coordenadaY;
        x[1] = coordenadaX + (r * Math.cos(2 * Math.PI / 6));
        y[1] = coordenadaY - (r * Math.sin(2 * Math.PI / 6));
        x[2] = coordenadaX + (r * Math.cos(2 * 2 * Math.PI / 6));
        y[2] = coordenadaY - (r * Math.sin(2 * 2 * Math.PI / 6));
        x[3] = coordenadaX + (r * Math.cos(3 * 2 * Math.PI / 6));
        y[3] = coordenadaY - (r * Math.sin(3 * 2 * Math.PI / 6));
        x[4] = coordenadaX + (r * Math.cos(4 * 2 * Math.PI / 6));
        y[4] = coordenadaY - (r * Math.sin(4 * 2 * Math.PI / 6));
        x[5] = coordenadaX + (r * Math.cos(5 * 2 * Math.PI / 6));
        y[5] = coordenadaY - (r * Math.sin(5 * 2 * Math.PI / 6));
        g.setStroke(Color.BLUE);
        g.setLineWidth(3);
        g.strokePolygon(x, y, 6);
        
        for (int i = 0; i < x.length; i++) {
            listap.add(new Punto2D(x[i], y[i]));
            
        }
        
    }
    
    @FXML
    private void generarpentagono(ActionEvent event) {
        x = new double[5];
        y = new double[5];
        
        listap=new LinkedList<>();

        x[0] = (coordenadaX + r);
        y[0] = coordenadaY;
        x[1] = coordenadaX + (r * Math.cos(2 * Math.PI / 5));
        y[1] = coordenadaY - (r * Math.sin(2 * Math.PI / 5));
        x[2] = coordenadaX + (r * Math.cos(2 * 2 * Math.PI / 5));
        y[2] = coordenadaY - (r * Math.sin(2 * 2 * Math.PI / 5));
        x[3] = coordenadaX + (r * Math.cos(3 * 2 * Math.PI / 5));
        y[3] = coordenadaY - (r * Math.sin(3 * 2 * Math.PI / 5));
        x[4] = coordenadaX + (r * Math.cos(4 * 2 * Math.PI / 5));
        y[4] = coordenadaY - (r * Math.sin(4 * 2 * Math.PI / 5));

        g.setStroke(Color.BLUE);
        g.setLineWidth(3);
        g.strokePolygon(x, y, 5);
        
        for (int i = 0; i < x.length; i++) {
            listap.add(new Punto2D(x[i], y[i]));
            
        }
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        g = lienzo.getGraphicsContext2D();
        r=100;
        double w = lienzo.getWidth();
        double h = lienzo.getHeight();

        g.setStroke(Color.DARKCYAN);
        g.setLineWidth(3);
        g.strokeRect(0, 0, w, h);

    }

}

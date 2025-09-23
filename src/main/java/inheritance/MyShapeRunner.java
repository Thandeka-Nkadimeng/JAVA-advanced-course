/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Thandeka Nkadimeng
 */
public class MyShapeRunner {

    public static void main(String[] args) {
        MyShape obj = new MyShape(5, 6);
        obj.calcArea();

        MyRectangle rect = new MyRectangle(9, 4);
        rect.display("Rectangle");

        MySquare squ = new MySquare(5);
        squ.display("Square");

        //Txaka
        MyTriangle tri = new MyTriangle(10, 5);
        tri.display("Triangle");

        MyCircle cir = new MyCircle(7);
        cir.display("Circle");

        MyParallelogram para = new MyParallelogram(12, 6);
        para.display("Parallelogram");
    }

}

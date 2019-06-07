import acm.breadboards.AbstractBreadboard;
import acm.graphics.GCanvas;
import acm.graphics.GOval;
import acm.graphics.GLine;
import acm.graphics.GPoint;
import acm.graphics.GLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrigWheel extends AbstractBreadboard {


    public void run() {

        //Add (+,+), (-, +), (-, -), (+, -) to quadrants

        GCanvas gc = this.getGCanvas();

        this.setSize(1000,1000);
        GOval wheel = new GOval(100, 100, 800, 800);
        this.add(wheel);
        GLine horzline = new GLine(105,500, 895, 500);
        this.add(horzline);
        GLine vertline = new GLine(500,105, 500, 895);
        this.add(vertline);

        GLabel Quad1 = new GLabel("(+,+)", 700, 100);
        Quad1.setFont("Arial-PLAIN-28");
        this.add(Quad1);

        GLabel Quad2 = new GLabel("(-,+)", 300, 100);
        Quad2.setFont("Arial-PLAIN-28");
        this.add(Quad2);

        GLabel Quad3 = new GLabel("(-,-)", 300, 900);
        Quad3.setFont("Arial-PLAIN-28");
        this.add(Quad3);

        GLabel Quad4 = new GLabel("(+,-)", 700, 900);
        Quad4.setFont("Arial-PLAIN-28");
        this.add(Quad4);

        //TwoPi
        GLabel TwoPiShow = new GLabel("2π");
        GOval twopi = new GOval(890, 490, 20,20);
        this.add(twopi);
        twopi.setFilled(true);
        twopi.setFillColor(Color.BLACK);
        TwoPiShow.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(TwoPiShow, 915, 510);

        GLabel TwoPiSin = new GLabel("(0)");
        TwoPiSin.setFont("Arial-PLAIN-18");
        TwoPiSin.setColor(Color.GREEN);


        GLabel TwoPiCos = new GLabel("(1)");
        TwoPiCos.setFont("Arial-PLAIN-18");
        TwoPiCos.setColor(Color.BLUE);

        GLabel TwoPiTan = new GLabel("(0)");
        TwoPiTan.setFont("Arial-PLAIN-18");
        TwoPiTan.setColor(Color.RED);

        GLabel TwoPiSec = new GLabel("(1)");
        TwoPiSec.setFont("Arial-PLAIN-18");
        TwoPiSec.setColor(Color.CYAN);

        GLabel TwoPiCsc = new GLabel("(undefined)");
        TwoPiCsc.setFont("Arial-PLAIN-18");
        TwoPiCsc.setColor(Color.ORANGE);

        /*
        Make Mouse Listener Thing for:

        Sin(2pi) = 0
        Cos(2pi) = 1



         */


        //Zero
        GLabel Zero = new GLabel("0");
        Zero.setFont("Arial-PLAIN-18");
        this.add(Zero, 915, 495);

        /*
        Make Mouse Listener Thing for:

        Or I guess make a button to show these:

        Sin(0) = 0
        Cos(0) = 1
        Tan(0)
        Sec(0)
        Csc(0)
        Cot(0)

        Mouse Scroll Over --> show that:

        Tan = (sin)/(cos)

        Sec = 1/(cos)

        Cot = 1/(tan)

        Csc = 1/(sin)



         */


        // Quad 1

        //Pi6
        GLabel Pi6Show = new GLabel("(π/6)");
        GOval Pi6 = new GOval(840, 300, 20,20);
        this.add(Pi6);
        Pi6.setFilled(true);
        Pi6.setFillColor(Color.BLACK);
        Pi6Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(Pi6Show, 860, 300);

        GLabel Pi6Sin = new GLabel("(1/2)");
        Pi6Sin.setFont("Arial-PLAIN-18");
        Pi6Sin.setColor(Color.GREEN);



        GLabel Pi6Cos = new GLabel("(√3/2)");
        Pi6Cos.setFont("Arial-PLAIN-18");
        Pi6Cos.setColor(Color.BLUE);

        GLabel Pi6Tan = new GLabel("(√3/3)");
        Pi6Tan.setFont("Arial-PLAIN-18");
        Pi6Tan.setColor(Color.RED);

        GLabel Pi6Cot = new GLabel("(√3)");
        Pi6Cot.setFont("Arial-PLAIN-18");
        Pi6Cot.setColor(Color.MAGENTA);

        GLabel Pi6Csc = new GLabel("2");
        Pi6Csc.setFont("Arial-PLAIN-18");
        Pi6Csc.setColor(Color.CYAN);

        GLabel Pi6Sec = new GLabel("(2√3/3)");
        Pi6Sec.setFont("Arial-PLAIN-18");
        Pi6Sec.setColor(Color.ORANGE);




        /*
        Make Mouse Listener Thing for:

        Sin(pi/6) = 1/2
        Cos(pi/6) = sqrt(3)/2


         */

        //Pi4
        GLabel Pi4Show = new GLabel("(π/4)");
        GOval Pi4 = new GOval(770, 200, 20,20);
        this.add(Pi4);
        Pi4.setFilled(true);
        Pi4.setFillColor(Color.BLACK);
        Pi4Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(Pi4Show, 800, 200);

        GLabel Pi4Sin = new GLabel("(√2/2)");
        Pi4Sin.setFont("Arial-PLAIN-18");
        Pi4Sin.setColor(Color.GREEN);


        GLabel Pi4Cos = new GLabel("(√2/2)");
        Pi4Cos.setFont("Arial-PLAIN-18");
        Pi4Cos.setColor(Color.blue);

        GLabel Pi4Tan = new GLabel("1");
        Pi4Cos.setFont("Arial-PLAIN-18");
        Pi4Cos.setColor(Color.RED);

        GLabel Pi4Sec = new GLabel("(2√2/2)");
        Pi4Cos.setFont("Arial-PLAIN-18");
        Pi4Cos.setColor(Color.ORANGE);

        GLabel Pi4Csc = new GLabel("(2√2/2)");
        Pi4Cos.setFont("Arial-PLAIN-18");
        Pi4Cos.setColor(Color.CYAN);


        //Pi3
        GLabel Pi3Show = new GLabel("(π/3)");
        GOval Pi3 = new GOval(650, 120, 20,20);
        this.add(Pi3);
        Pi3.setFilled(true);
        Pi3.setFillColor(Color.BLACK);
        Pi3Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(Pi3Show, 670, 120);

        GLabel Pi3Sin = new GLabel("(√3/2)");
        Pi3Sin.setFont("Arial-PLAIN-18");
        Pi3Sin.setColor(Color.GREEN);


        GLabel Pi3Cos = new GLabel("(1/2)");
        Pi3Cos.setFont("Arial-PLAIN-18");
        Pi3Cos.setColor(Color.BLUE);

        GLabel Pi3Tan = new GLabel("(√3)");
        Pi3Tan.setFont("Arial-PLAIN-18");
        Pi3Tan.setColor(Color.RED);

        GLabel Pi3Sec = new GLabel("2");
        Pi3Sec.setFont("Arial-PLAIN-18");
        Pi3Sec.setColor(Color.ORANGE);

        GLabel Pi3Csc = new GLabel("(2√3/3)");
        Pi3Csc.setFont("Arial-PLAIN-18");
        Pi3Csc.setColor(Color.CYAN);


        //Pi2
        GLabel Pi2Show = new GLabel("(π/2)");
        GOval Pi2 = new GOval(490, 90, 20,20);
        this.add(Pi2);
        Pi2.setFilled(true);
        Pi2.setFillColor(Color.BLACK);
        Pi2Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(Pi2Show, 490, 90);

        GLabel Pi2Sin = new GLabel("(1)");
        Pi2Sin.setFont("Arial-PLAIN-18");
        Pi2Sin.setColor(Color.GREEN);


        GLabel Pi2Cos = new GLabel("(0)");
        Pi2Cos.setFont("Arial-PLAIN-18");
        Pi2Cos.setColor(Color.BLUE);

        GLabel Pi2Tan = new GLabel("(undefined)");
        Pi2Tan.setFont("Arial-PLAIN-18");
        Pi2Tan.setColor(Color.RED);

        GLabel Pi2Sec = new GLabel("(undefined)");
        Pi2Sec.setFont("Arial-PLAIN-18");
        Pi2Sec.setColor(Color.ORANGE);

        GLabel Pi2Csc = new GLabel("(1)");
        Pi2Csc.setFont("Arial-PLAIN-18");
        Pi2Csc.setColor(Color.CYAN);



        // Quad 2

        //2Pi3
        GLabel TwoPi3Show = new GLabel("(2π/3)");
        GOval TwoPi3 = new GOval(340, 115, 20,20);
        this.add(TwoPi3);
        TwoPi3.setFilled(true);
        TwoPi3.setFillColor(Color.BLACK);
        TwoPi3Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(TwoPi3Show, 285, 125);


        GLabel TwoPi3Sin = new GLabel("(√3/2)");
        TwoPi3Sin.setFont("Arial-PLAIN-18");
        TwoPi3Sin.setColor(Color.GREEN);


        GLabel TwoPi3Cos = new GLabel("(-1/2)");
        TwoPi3Cos.setFont("Arial-PLAIN-18");
        TwoPi3Cos.setColor(Color.BLUE);

        GLabel TwoPi3Tan = new GLabel("(-√3)");
        TwoPi3Tan.setFont("Arial-PLAIN-18");
        Pi2Tan.setColor(Color.RED);

        GLabel TwoPi3Sec = new GLabel("(-2)");
        TwoPi3Sec.setFont("Arial-PLAIN-18");
        TwoPi3Sec.setColor(Color.ORANGE);

        GLabel TwoPi3Csc = new GLabel("(2√3/3)");
        TwoPi3Csc.setFont("Arial-PLAIN-18");
        TwoPi3Csc.setColor(Color.CYAN);

        //3Pi4
        GLabel ThreePi4Show = new GLabel("(3π/4)");
        GOval ThreePi4 = new GOval(225, 190, 20,20);
        this.add(ThreePi4);
        ThreePi4.setFilled(true);
        ThreePi4.setFillColor(Color.BLACK);
        ThreePi4Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(ThreePi4Show, 160, 205);


        GLabel ThreePi4Sin = new GLabel("(√2/2)");
        ThreePi4Sin.setFont("Arial-PLAIN-18");
        ThreePi4Sin.setColor(Color.GREEN);


        GLabel ThreePi4Cos = new GLabel("(-√2/2)");
        ThreePi4Cos.setFont("Arial-PLAIN-18");
        ThreePi4Cos.setColor(Color.BLUE);

        GLabel ThreePi4Tan = new GLabel("(-1)");
        ThreePi4Tan.setFont("Arial-PLAIN-18");
        ThreePi4Tan.setColor(Color.RED);

        GLabel ThreePi4Sec = new GLabel("(-2√2/2)");
        ThreePi4Sec.setFont("Arial-PLAIN-18");
        ThreePi4Sec.setColor(Color.ORANGE);

        GLabel ThreePi4Csc = new GLabel("(2√3/3)");
        ThreePi4Csc.setFont("Arial-PLAIN-18");
        ThreePi4Csc.setColor(Color.CYAN);

        //5Pi6

        GLabel FivePi6Show = new GLabel("(5π/6)");
        GOval FivePi6 = new GOval(135, 290, 20,20);
        this.add(FivePi6);
        FivePi6.setFilled(true);
        FivePi6.setFillColor(Color.BLACK);
        FivePi6Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(FivePi6Show, 80, 310);

        GLabel FivePi6Sin = new GLabel("(1/2)");
        FivePi6Sin.setFont("Arial-PLAIN-18");
        FivePi6Sin.setColor(Color.GREEN);


        GLabel FivePi6Cos = new GLabel("(-√3/2)");
        FivePi6Cos.setFont("Arial-PLAIN-18");
        FivePi6Cos.setColor(Color.BLUE);

        GLabel FivePi6Tan = new GLabel("(-√3/3)");
        FivePi6Tan.setFont("Arial-PLAIN-18");
        FivePi6Tan.setColor(Color.RED);

        GLabel FivePi6Sec = new GLabel("(-2√2/2)");
        FivePi6Sec.setFont("Arial-PLAIN-18");
        FivePi6Sec.setColor(Color.ORANGE);

        GLabel FivePi6Csc = new GLabel("(2)");
        FivePi6Csc.setFont("Arial-PLAIN-18");
        FivePi6Csc.setColor(Color.CYAN);

        //Pi

        GLabel PiShow = new GLabel("π");
        GOval pi = new GOval(90, 490, 20,20);
        this.add(pi);
        pi.setFilled(true);
        pi.setFillColor(Color.BLACK);
        PiShow.setFont("Arial-PLAIN-22");
        //Make into Mouse Listener
        this.add(PiShow, 75, 510);

        GLabel PiSin = new GLabel("(0)");
        PiSin.setFont("Arial-PLAIN-18");
        PiSin.setColor(Color.GREEN);


        GLabel PiCos = new GLabel("(-1)");
        PiCos.setFont("Arial-PLAIN-18");
        PiCos.setColor(Color.BLUE);

        GLabel PiTan = new GLabel("(0)");
        PiTan.setFont("Arial-PLAIN-18");
        PiTan.setColor(Color.RED);

        GLabel PiSec = new GLabel("(-1)");
        PiSec.setFont("Arial-PLAIN-18");
        PiSec.setColor(Color.ORANGE);

        GLabel PiCsc = new GLabel("(undefined)");
        PiCsc.setFont("Arial-PLAIN-18");
        PiCsc.setColor(Color.CYAN);

//Quad 3

        //7Pi6

        GLabel SevenPi6Show = new GLabel("(7π/6)");
        GOval SevenPi6 = new GOval(145, 680, 20,20);
        this.add(SevenPi6);
        SevenPi6.setFilled(true);
        SevenPi6.setFillColor(Color.BLACK);
        SevenPi6Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(SevenPi6Show, 90, 690);

        GLabel SevenPi6Sin = new GLabel("(-1/2)");
        SevenPi6Sin.setFont("Arial-PLAIN-18");
        SevenPi6Sin.setColor(Color.GREEN);


        GLabel SevenPi6Cos = new GLabel("(-√3/2)");
        SevenPi6Cos.setFont("Arial-PLAIN-18");
        SevenPi6Cos.setColor(Color.BLUE);

        GLabel SevenPi6Tan = new GLabel("(√3/3)");
        SevenPi6Tan.setFont("Arial-PLAIN-18");
        SevenPi6Tan.setColor(Color.RED);

        GLabel SevenPi6Sec = new GLabel("(-2√3/3)");
        SevenPi6Sec.setFont("Arial-PLAIN-18");
        SevenPi6Sec.setColor(Color.ORANGE);

        GLabel SevenPi6Csc = new GLabel("(-2)");
        SevenPi6Csc.setFont("Arial-PLAIN-18");
        SevenPi6Csc.setColor(Color.CYAN);

        //5Pi4

        GLabel FivePi4Show = new GLabel("(5π/4)");
        GOval FivePi4 = new GOval(205, 780, 20,20);
        this.add(FivePi4);
        FivePi4.setFilled(true);
        FivePi4.setFillColor(Color.BLACK);
        FivePi4Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(FivePi4Show, 150, 790);

        GLabel FivePi4Sin = new GLabel("(-√2/2)");
        FivePi4Sin.setFont("Arial-PLAIN-18");
        FivePi4Sin.setColor(Color.GREEN);

        GLabel FivePi4Cos = new GLabel("(-√2/2)");
        FivePi4Cos.setFont("Arial-PLAIN-18");
        FivePi4Cos.setColor(Color.BLUE);

        GLabel FivePi4Tan = new GLabel("(1)");
        FivePi4Tan.setFont("Arial-PLAIN-18");
        FivePi4Tan.setColor(Color.RED);


        GLabel FivePi4Csc = new GLabel("(-2√2/2)");
        FivePi4Csc.setFont("Arial-PLAIN-18");
        FivePi4Csc.setColor(Color.CYAN);

        GLabel FivePi4Sec = new GLabel("(-2√2/2)");
        FivePi4Sec.setFont("Arial-PLAIN-18");
        FivePi4Sec.setColor(Color.ORANGE);



        //4Pi3

        GLabel FourPi3Show = new GLabel("(4π/3)");
        GOval FourPi3 = new GOval(335, 860, 20,20);
        this.add(FourPi3);
        FourPi3.setFilled(true);
        FourPi3.setFillColor(Color.BLACK);
        FourPi3Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(FourPi3Show, 275, 870);

        GLabel FourPi3Sin = new GLabel("(-√3/2)");
        FourPi3Sin.setFont("Arial-PLAIN-18");
        FourPi3Sin.setColor(Color.GREEN);


        GLabel FourPi3Cos = new GLabel("(-1/2)");
        FourPi3Cos.setFont("Arial-PLAIN-18");
        FourPi3Cos.setColor(Color.blue);

        GLabel FourPi3Tan = new GLabel("(√3)");
        FourPi3Cos.setFont("Arial-PLAIN-18");
        FourPi3Cos.setColor(Color.RED);

        GLabel FourPi3Sec = new GLabel("(-2)");
        FourPi3Cos.setFont("Arial-PLAIN-18");
        FourPi3Cos.setColor(Color.ORANGE);

        GLabel FourPi3Csc = new GLabel("(-2√3/3)");
        FourPi3Cos.setFont("Arial-PLAIN-18");
        FourPi3Cos.setColor(Color.CYAN);

/*
        //TwoPi
        GLabel TwoPiShow = new GLabel("2π");
        GOval twopi = new GOval(890, 490, 20,20);
        this.add(twopi);
        twopi.setFilled(true);
        twopi.setFillColor(Color.BLACK);
        TwoPiShow.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(TwoPiShow, 915, 510);


*/

        //3Pi2
        GLabel ThreePi2Show = new GLabel("(3π/2)");
        GOval ThreePi2 = new GOval(490, 890, 20,20);
        this.add(ThreePi2);
        ThreePi2.setFilled(true);
        ThreePi2.setFillColor(Color.BLACK);
        ThreePi2Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(ThreePi2Show, 480, 890);

        GLabel ThreePi2Sin = new GLabel("(-1)");
        ThreePi2Sin.setFont("Arial-PLAIN-18");
        ThreePi2Sin.setColor(Color.GREEN);

        GLabel ThreePi2Cos = new GLabel("(0)");
        ThreePi2Cos.setFont("Arial-PLAIN-18");
        ThreePi2Cos.setColor(Color.BLUE);

        GLabel ThreePi2Tan = new GLabel("(undefined)");
        ThreePi2Tan.setFont("Arial-PLAIN-18");
        ThreePi2Tan.setColor(Color.RED);

        GLabel ThreePi2Cot = new GLabel("(0)");
        ThreePi2Cot.setFont("Arial-PLAIN-18");
        ThreePi2Cot.setColor(Color.MAGENTA);

        GLabel ThreePi2Csc = new GLabel("(-1)");
        ThreePi2Csc.setFont("Arial-PLAIN-18");
        ThreePi2Csc.setColor(Color.CYAN);

        GLabel ThreePi2Sec = new GLabel("(undefined)");
        ThreePi2Sec.setFont("Arial-PLAIN-18");
        ThreePi2Sec.setColor(Color.ORANGE);

        //FivePi3
        GLabel FivePi3Show = new GLabel("(5π/3)");
        GOval FivePi3 = new GOval(655, 855, 20,20);
        this.add(FivePi3);
        FivePi3.setFilled(true);
        FivePi3.setFillColor(Color.BLACK);
        FivePi3Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(FivePi3Show, 685, 865);

        GLabel FivePi3Sin = new GLabel("(-√3/2)");
        FivePi3Sin.setFont("Arial-PLAIN-18");
        FivePi3Sin.setColor(Color.GREEN);

        GLabel FivePi3Cos = new GLabel("(1/2)");
        FivePi3Cos.setFont("Arial-PLAIN-18");
        FivePi3Cos.setColor(Color.BLUE);

        GLabel FivePi3Tan = new GLabel("(-√3)");
        FivePi3Tan.setFont("Arial-PLAIN-18");
        FivePi3Tan.setColor(Color.RED);


        GLabel FivePi3Csc = new GLabel("(-2√3/3)");
        FivePi3Csc.setFont("Arial-PLAIN-18");
        FivePi3Csc.setColor(Color.CYAN);

        GLabel FivePi3Sec = new GLabel("2");
        FivePi3Sec.setFont("Arial-PLAIN-18");
        FivePi3Sec.setColor(Color.ORANGE);



        //SevenPi4
        GLabel SevenPi4Show = new GLabel("(7π/4)");
        GOval SevenPi4 = new GOval(785, 760, 20,20);
        this.add(SevenPi4);
        SevenPi4.setFilled(true);
        SevenPi4.setFillColor(Color.BLACK);
        SevenPi4Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(SevenPi4Show, 810, 770);

        GLabel SevenPi4Sin = new GLabel("(-√2/2)");
        SevenPi4Sin.setFont("Arial-PLAIN-18");
        SevenPi4Sin.setColor(Color.GREEN);

        GLabel SevenPi4Cos = new GLabel("(√2/2)");
        SevenPi4Cos.setFont("Arial-PLAIN-18");
        FivePi3Cos.setColor(Color.BLUE);

        GLabel SevenPi4Tan = new GLabel("(-1)");
        SevenPi4Tan.setFont("Arial-PLAIN-18");
        SevenPi4Tan.setColor(Color.RED);


        GLabel SevenPi4Csc = new GLabel("(-2√2/2)");
        SevenPi4Csc.setFont("Arial-PLAIN-18");
        SevenPi4Csc.setColor(Color.CYAN);

        GLabel SevenPi4Sec = new GLabel("(2√2/2)");
        SevenPi4Sec.setFont("Arial-PLAIN-18");
        SevenPi4Sec.setColor(Color.ORANGE);

        //ElevenPi6
        GLabel ElevenPi6Show = new GLabel("(11π/4)");
        GOval ElevenPi6 = new GOval(855, 660, 20,20);
        this.add(ElevenPi6);
        ElevenPi6.setFilled(true);
        ElevenPi6.setFillColor(Color.BLACK);
        SevenPi4Show.setFont("Arial-PLAIN-18");
        //Make into Mouse Listener
        this.add(ElevenPi6Show, 885, 670);

        GLabel ElevenPi6Sin = new GLabel("(-1/2)");
        ElevenPi6Sin.setFont("Arial-PLAIN-18");
        ElevenPi6Sin.setColor(Color.GREEN);

        GLabel ElevenPi6Cos = new GLabel("(√3/2)");
        ElevenPi6Cos.setFont("Arial-PLAIN-18");
        ElevenPi6Cos.setColor(Color.BLUE);

        GLabel ElevenPi6Tan = new GLabel("(-√3/3)");
        ElevenPi6Tan.setFont("Arial-PLAIN-18");
        ElevenPi6Tan.setColor(Color.RED);

        GLabel ElevenPi6Csc = new GLabel("(-2)");
        ElevenPi6Csc.setFont("Arial-PLAIN-18");
        ElevenPi6Csc.setColor(Color.CYAN);

        GLabel ElevenPi6Sec = new GLabel("(2√3/3)");
        ElevenPi6Sec.setFont("Arial-PLAIN-18");
        ElevenPi6Sec.setColor(Color.ORANGE);




//Now add mouse listeners and lines
        // Add buttons (action listeners) too with sin, cos, tan, sec, csc, cot
        //And then a key listener for a quiz

/*
        Pi6.addMouseMotionListener(
                new MouseMotionListener() {
                    @Override
                    public void mouseDragged(MouseEvent e) { }
                    @Override
                    public void mouseMoved(MouseEvent e) {
                        GLine LinePi6 = new GLine(400, 400, 840, 300);
                        LinePi6.setColor(Color.GREEN);
                        canvas.add(LinePi6);

                    }
                }


        );

        */

        JButton buttonSin = new JButton("Sin(x)");
        this.add(buttonSin, SOUTH);
        JButton buttonCos = new JButton("Cos(x)");
        this.add(buttonCos, SOUTH);
        JButton buttonTan = new JButton("Tan(x)");
        this.add(buttonTan, SOUTH);
        JButton buttonCot = new JButton("Cot(x)");
        this.add(buttonCos, SOUTH);
        JButton buttonCsc = new JButton("Csc(x)");
        this.add(buttonCsc, SOUTH);
        JButton buttonSec = new JButton("Sec(x)");
        this.add(buttonSec, SOUTH);

        buttonSin.getParent().revalidate();

        buttonSin.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        GCanvas canvas = TrigWheel.this.getGCanvas();
                        canvas.add(Pi6Sin, 900, 300);
                        canvas.add(Pi4Sin,840, 200);
                        canvas.add(Pi3Sin,710, 120);
                        canvas.add(Pi2Sin, 530, 90);
                        canvas.add(TwoPiSin,955, 510);

                        canvas.add(TwoPi3Sin, 235, 125);
                        canvas.add(ThreePi4Sin,100, 205);
                        canvas.add(FivePi6Sin,40, 300);
                        canvas.add(PiSin,35, 510);

                        canvas.add(FourPi3Sin, 215, 870);
                        canvas.add(FivePi4Sin,90, 790);
                        canvas.add(SevenPi6Sin,40, 690);

                        canvas.add(FivePi3Sin, 740, 865);
                        canvas.add(SevenPi4Sin,860, 770);
                        canvas.add(ElevenPi6Sin,935, 670);

                    }
                }


        );

        buttonCos.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        GCanvas canvas = TrigWheel.this.getGCanvas();
                        canvas.add(Pi6Cos, 900, 300);
                        canvas.add(Pi4Cos,840, 200);
                        canvas.add(Pi3Cos,710, 120);
                        canvas.add(Pi2Cos, 530, 90);
                        canvas.add(TwoPiCos,955, 510);

                        canvas.add(TwoPi3Cos, 235, 125);
                        canvas.add(ThreePi4Cos,100, 205);
                        canvas.add(FivePi6Cos,40, 300);
                        canvas.add(PiCos,35, 510);

                        canvas.add(FourPi3Cos, 215, 870);
                        canvas.add(FivePi4Cos,90, 790);
                        canvas.add(SevenPi6Cos,40, 690);

                        canvas.add(FivePi3Cos, 740, 865);
                        canvas.add(SevenPi4Cos,860, 770);
                        canvas.add(ElevenPi6Cos,935, 670);


                    }
                }


        );

        buttonTan.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        GCanvas canvas = TrigWheel.this.getGCanvas();
                        canvas.add(Pi6Tan, 900, 300);
                        canvas.add(Pi4Tan,840, 200);
                        canvas.add(Pi3Tan,710, 120);
                        canvas.add(Pi2Tan, 530, 90);
                        canvas.add(TwoPiTan,955, 510);

                        canvas.add(TwoPi3Tan, 235, 125);
                        canvas.add(ThreePi4Tan,100, 205);
                        canvas.add(FivePi6Tan,40, 300);
                        canvas.add(PiTan,35, 510);

                        canvas.add(FourPi3Tan, 215, 870);
                        canvas.add(FivePi4Tan,90, 790);
                        canvas.add(SevenPi6Tan,40, 690);

                        canvas.add(FivePi3Tan, 740, 865);
                        canvas.add(SevenPi4Tan,860, 770);
                        canvas.add(ElevenPi6Tan,935, 670);


                    }
                }


        );

        buttonSec.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        GCanvas canvas = TrigWheel.this.getGCanvas();
                        canvas.add(Pi6Sec, 900, 300);
                        canvas.add(Pi4Sec,840, 200);
                        canvas.add(Pi3Sec,720, 120);
                        canvas.add(Pi2Sec, 530, 90);
                        canvas.add(TwoPiSec,955, 510);

                        canvas.add(TwoPi3Sec, 235, 125);
                        canvas.add(ThreePi4Sec,90, 205);
                        canvas.add(FivePi6Sec,40, 290);
                        canvas.add(PiSec,35, 510);

                        canvas.add(FourPi3Sec, 215, 870);
                        canvas.add(FivePi4Sec,80, 790);
                        canvas.add(SevenPi6Sec,40, 670);

                        canvas.add(FivePi3Sec, 740, 865);
                        canvas.add(SevenPi4Sec,860, 770);
                        canvas.add(ElevenPi6Sec,935, 670);


                    }
                }


        );

        buttonCsc.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        GCanvas canvas = TrigWheel.this.getGCanvas();
                        canvas.add(Pi6Csc, 900, 300);
                        canvas.add(Pi4Csc,840, 200);
                        canvas.add(Pi3Csc,720, 120);
                        canvas.add(Pi2Csc, 530, 90);
                        canvas.add(TwoPiCsc,890, 480);

                        canvas.add(TwoPi3Csc, 215, 125);
                        canvas.add(ThreePi4Csc,90, 205);
                        canvas.add(FivePi6Csc,40, 300);
                        canvas.add(PiCsc,35, 490);

                        canvas.add(FourPi3Csc, 215, 870);
                        canvas.add(FivePi4Csc,80, 790);
                        canvas.add(SevenPi6Csc,40, 680);

                        canvas.add(FivePi3Csc, 740, 865);
                        canvas.add(SevenPi4Csc,860, 770);
                        canvas.add(ElevenPi6Csc,935, 670);



                    }
                }


        );

/*
        Pi6.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mousePressed(MouseEvent e) {

                    }
                    @Override
                    public void mouseReleased(MouseEvent e) {}
                    @Override
                    public void mouseEntered(MouseEvent e) {}
                    @Override
                    public void mouseExited(MouseEvent e) {}
                    @Override
                    public void mouseClicked(MouseEvent e) {}
                }
        );
*/





    }






}

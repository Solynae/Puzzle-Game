import javax.swing.*;

public class gameproject {
    public static void main(String[] args) {
        JFrame game = new JFrame();
        game.setSize(445,700);
        game.setLayout(null);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setTitle("Puzzle Game");

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("10");
        JButton b11 = new JButton("11");
        JButton b12 = new JButton("12");
        JButton b13 = new JButton("13");
        JButton b14 = new JButton("14");
        JButton b15 = new JButton("15");
        JButton b16 = new JButton("16");
        JButton b17 = new JButton("17");
        JButton b18= new JButton("18");
        JButton b19 = new JButton("19");
        JButton b20 = new JButton("20");
        JButton b21 = new JButton("21");
        JButton b22 = new JButton("22");
        JButton b23 = new JButton("23");
        JButton b24 = new JButton("24");
        JButton bos = new JButton(" ");


        JButton res = new JButton("RESET");
        JButton shuf = new JButton("SHUFFLE");

        one.setBounds(0, 0, 86, 113);
        two.setBounds(86, 0, 86, 113);
        three.setBounds(172, 0, 86, 113);
        four.setBounds(258, 0, 86, 113);
        five.setBounds(344, 0, 86, 113);

        six.setBounds(0, 113, 86, 113);
        seven.setBounds(86, 113, 86, 113);
        eight.setBounds(172, 113, 86, 113);
        b9.setBounds(258, 113, 86, 113);
        b10.setBounds(344, 113, 86, 113);

        b11.setBounds(0, 226, 86, 113);
        b12.setBounds(86, 226, 86, 113);
        b13.setBounds(172, 226, 86, 113);
        b14.setBounds(258, 226, 86, 113);
        b15.setBounds(344, 226, 86, 113);

        b16.setBounds(0, 339, 86, 113);
        b17.setBounds(86, 339, 86, 113);
        b18.setBounds(172, 339, 86, 113);
        b19.setBounds(258, 339, 86, 113);
        b20.setBounds(344, 339, 86, 113);

        b21.setBounds(0, 452, 86, 113);
        b22.setBounds(86, 452, 86, 113);
        b23.setBounds(172, 452, 86, 113);
        b24.setBounds(258, 452, 86, 113);
        bos.setBounds(344, 452, 86, 113);


        res.setBounds(120,600,90,50);
        shuf.setBounds(220,600,90,50);


        game.add(one);
        game.add(two);
        game.add(three);
        game.add(four);
        game.add(five);
        game.add(six);
        game.add(seven);
        game.add(eight);
        game.add(b9);
        game.add(b10);
        game.add(b11);
        game.add(b12);
        game.add(b13);
        game.add(b14);
        game.add(b15);
        game.add(b16);
        game.add(b17);
        game.add(b18);
        game.add(b19);
        game.add(b20);
        game.add(b21);
        game.add(b22);
        game.add(b23);
        game.add(b24);

        game.add(bos);



        game.add(res);
        game.add(shuf);

        one.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_1.png"));
        two.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_2.png"));
        three.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_3.png"));
        four.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_4.png"));
        five.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_5.png"));
        
        six.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_6.png"));
        seven.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_7.png"));
        eight.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_8.png"));
        b9.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_9.png"));
        b10.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_10.png"));
        
        b11.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_11.png"));
        b12.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_12.png"));
        b13.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_13.png"));
        b14.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_14.png"));
        b15.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_15.png"));
        
        b16.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_16.png"));
        b17.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_17.png"));
        b18.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_18.png"));
        b19.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_19.png"));
        b20.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_20.png"));
        
        b21.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_21.png"));
        b22.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_22.png"));
        b23.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_23.png"));
        b24.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/piece_24.png"));
        bos.setIcon(new ImageIcon("C:/Users/nazli/OneDrive/Masaüstü/JavaCourse/photos4/beyaz.png"));
        

       // JButton[] buttons = {one, two, three, four, five, six, seven, eight, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24};

        // for (JButton button : buttons) {
        //     button.addActionListener(e -> {
        //         int onex = button.getBounds().x;
        //         int oney = button.getBounds().y;
        
        //         int bosx = bos.getBounds().x;
        //         int bosy = bos.getBounds().y;
        
        //         if ((Math.abs(onex - bosx) == 86 && oney == bosy) || (Math.abs(oney - bosy) == 113 && onex == bosx)) {
        //             button.setBounds(bosx, bosy, 86, 113);
        //             bos.setBounds(onex, oney, 86, 113);
        //         }

        //         game.repaint();
        //     });
        //}

        one.addActionListener(e -> {
            int onex = one.getBounds().x;
            int oney = one.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(onex - bosx) == 86 && oney == bosy) || (Math.abs(oney - bosy) == 113 && onex == bosx)) {
                one.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(onex, oney, 86, 113);
            }
        
            game.repaint();
        });
        
        two.addActionListener(e -> {
            int twox = two.getBounds().x;
            int twoy = two.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(twox - bosx) == 86 && twoy == bosy) || (Math.abs(twoy - bosy) == 113 && twox == bosx)) {
                two.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(twox, twoy, 86, 113);
            }
        
            game.repaint();
        });
        
        three.addActionListener(e -> {
            int threex = three.getBounds().x;
            int threey = three.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(threex - bosx) == 86 && threey == bosy) || (Math.abs(threey - bosy) == 113 && threex == bosx)) {
                three.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(threex, threey, 86, 113);
            }
        
            game.repaint();
        });
        
        
        four.addActionListener(e -> {
            int fourx = four.getBounds().x;
            int foury = four.getBounds().y;        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(fourx - bosx) == 86 && foury == bosy) || (Math.abs(foury - bosy) == 113 && fourx == bosx)) {
                four.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(fourx, foury, 86, 113);
            }
        
            game.repaint();
        });
        
        five.addActionListener(e -> {
            int fivex = five.getBounds().x;
            int fivey = five.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(fivex - bosx) == 86 && fivey == bosy) || (Math.abs(fivey - bosy) == 113 && fivex == bosx)) {
                five.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(fivex, fivey, 86, 113);
            }
        
            game.repaint();
        });
        six.addActionListener(e -> {
            int sixx = six.getBounds().x;
            int sixy = six.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(sixx - bosx) == 86 && sixy == bosy) || (Math.abs(sixy - bosy) == 113 && sixx == bosx)) {
                six.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(sixx, sixy, 86, 113);
            }
        
            game.repaint();
        });
        
        seven.addActionListener(e -> {
            int sevenx = seven.getBounds().x;
            int seveny = seven.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(sevenx - bosx) == 86 && seveny == bosy) || (Math.abs(seveny - bosy) == 113 && sevenx == bosx)) {
                seven.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(sevenx, seveny, 86, 113);
            }
        
            game.repaint();
        });
        
        eight.addActionListener(e -> {
            int eightx = eight.getBounds().x;
            int eighty = eight.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(eightx - bosx) == 86 && eighty == bosy) || (Math.abs(eighty - bosy) == 113 && eightx == bosx)) {
                eight.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(eightx, eighty, 86, 113);
            }
        
            game.repaint();
        });
        
        b9.addActionListener(e -> {
            int b9x = b9.getBounds().x;
            int b9y = b9.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b9x - bosx) == 86 && b9y == bosy) || (Math.abs(b9y - bosy) == 113 && b9x == bosx)) {
                b9.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b9x, b9y, 86, 113);
            }
        
            game.repaint();
        });
        
        b10.addActionListener(e -> {
            int b10x = b10.getBounds().x;
            int b10y = b10.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b10x - bosx) == 86 && b10y == bosy) || (Math.abs(b10y - bosy) == 113 && b10x == bosx)) {
                b10.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b10x, b10y, 86, 113);
            }
        
            game.repaint();
        });
        b11.addActionListener(e -> {
            int b11x = b11.getBounds().x;
            int b11y = b11.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b11x - bosx) == 86 && b11y == bosy) || (Math.abs(b11y - bosy) == 113 && b11x == bosx)) {
                b11.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b11x, b11y, 86, 113);
            }
        
            game.repaint();
        });
        
        b12.addActionListener(e -> {
            int b12x = b12.getBounds().x;
            int b12y = b12.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b12x - bosx) == 86 && b12y == bosy) || (Math.abs(b12y - bosy) == 113 && b12x == bosx)) {
                b12.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b12x, b12y, 86, 113);
            }
        
            game.repaint();
        });
        
        b13.addActionListener(e -> {
            int b13x = b13.getBounds().x;
            int b13y = b13.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b13x - bosx) == 86 && b13y == bosy) || (Math.abs(b13y - bosy) == 113 && b13x == bosx)) {
                b13.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b13x, b13y, 86, 113);
            }
        
            game.repaint();
        });
        
        b14.addActionListener(e -> {
            int b14x = b14.getBounds().x;
            int b14y = b14.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b14x - bosx) == 86 && b14y == bosy) || (Math.abs(b14y - bosy) == 113 && b14x == bosx)) {
                b14.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b14x, b14y, 86, 113);
            }
        
            game.repaint();
        });
        
        b15.addActionListener(e -> {
            int b15x = b15.getBounds().x;
            int b15y = b15.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b15x - bosx) == 86 && b15y == bosy) || (Math.abs(b15y - bosy) == 113 && b15x == bosx)) {
                b15.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b15x, b15y, 86, 113);
            }
        
            game.repaint();
        });
        b16.addActionListener(e -> {
            int b16x = b16.getBounds().x;
            int b16y = b16.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b16x - bosx) == 86 && b16y == bosy) || (Math.abs(b16y - bosy) == 113 && b16x == bosx)) {
                b16.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b16x, b16y, 86, 113);
            }
        
            game.repaint();
        });
        
        b17.addActionListener(e -> {
            int b17x = b17.getBounds().x;
            int b17y = b17.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b17x - bosx) == 86 && b17y == bosy) || (Math.abs(b17y - bosy) == 113 && b17x == bosx)) {
                b17.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b17x, b17y, 86, 113);
            }
        
            game.repaint();
        });
        
        b18.addActionListener(e -> {
            int b18x = b18.getBounds().x;
            int b18y = b18.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b18x - bosx) == 86 && b18y == bosy) || (Math.abs(b18y - bosy) == 113 && b18x == bosx)) {
                b18.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b18x, b18y, 86, 113);
            }
        
            game.repaint();
        });
        
        b19.addActionListener(e -> {
            int b19x = b19.getBounds().x;
            int b19y = b19.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b19x - bosx) == 86 && b19y == bosy) || (Math.abs(b19y - bosy) == 113 && b19x == bosx)) {
                b19.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b19x, b19y, 86, 113);
            }
        
            game.repaint();
        });
        
        b20.addActionListener(e -> {
            int b20x = b20.getBounds().x;
            int b20y = b20.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b20x - bosx) == 86 && b20y == bosy) || (Math.abs(b20y - bosy) == 113 && b20x == bosx)) {
                b20.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b20x, b20y, 86, 113);
            }
        
            game.repaint();
        });
        b21.addActionListener(e -> {
            int b21x = b21.getBounds().x;
            int b21y = b21.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b21x - bosx) == 86 && b21y == bosy) || (Math.abs(b21y - bosy) == 113 && b21x == bosx)) {
                b21.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b21x, b21y, 86, 113);
            }
        
            game.repaint();
        });
        
        b22.addActionListener(e -> {
            int b22x = b22.getBounds().x;
            int b22y = b22.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b22x - bosx) == 86 && b22y == bosy) || (Math.abs(b22y - bosy) == 113 && b22x == bosx)) {
                b22.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b22x, b22y, 86, 113);
            }
        
            game.repaint();
        });
        
        b23.addActionListener(e -> {
            int b23x = b23.getBounds().x;
            int b23y = b23.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b23x - bosx) == 86 && b23y == bosy) || (Math.abs(b23y - bosy) == 113 && b23x == bosx)) {
                b23.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b23x, b23y, 86, 113);
            }
        
            game.repaint();
        });
        
        b24.addActionListener(e -> {
            int b24x = b24.getBounds().x;
            int b24y = b24.getBounds().y;
        
            int bosx = bos.getBounds().x;
            int bosy = bos.getBounds().y;
        
            if ((Math.abs(b24x - bosx) == 86 && b24y == bosy) || (Math.abs(b24y - bosy) == 113 && b24x == bosx)) {
                b24.setBounds(bosx, bosy, 86, 113);
                bos.setBounds(b24x, b24y, 86, 113);
            }
        
            game.repaint();
        });
                                        

        res.addActionListener(e -> {
          
            one.setBounds(0,0,86,113);
            two.setBounds(86,0,86,113);
            three.setBounds(172,0,86,113);
            four.setBounds(258,0,86,113);
            five.setBounds(344,0,86,113);
    
            six.setBounds(0,113,86,113);
            seven.setBounds(86,113,86,113);
            eight.setBounds(172,113,86,113);
            b9.setBounds(258,113,86,113);
            b10.setBounds(344,113,86,113);
    
            b11.setBounds(0,226,86,113);
            b12.setBounds(86,226,86,113);
            b13.setBounds(172,226,86,113);
            b14.setBounds(258,226,86,113);
            b15.setBounds(344,226,86,113);
    
            b16.setBounds(0,339,86,113);
            b17.setBounds(86,339,86,113);
            b18.setBounds(172,339,86,113);
            b19.setBounds(258,339,86,113);
            b20.setBounds(344,339,86,113);
    
            b21.setBounds(0,452,86,113);
            b22.setBounds(86,452,86,113);
            b23.setBounds(172,452,86,113);
            b24.setBounds(258,452,86,113);
            bos.setBounds(344,452,86,113);

            
            game.repaint(); 
        });

        
        game.setVisible(true);


        shuf.addActionListener(e -> {
           
            one.setBounds(258, 339, 86, 113);
            two.setBounds(172, 452, 86, 113);
            three.setBounds(86, 113, 86, 113);
            four.setBounds(0, 226, 86, 113);
            five.setBounds(344, 0, 86, 113);

            six.setBounds(0, 113, 86, 113);
            seven.setBounds(172, 339, 86, 113);
            eight.setBounds(258, 0, 86, 113);
            b9.setBounds(344, 226, 86, 113);
            b10.setBounds(86, 226, 86, 113);

            b11.setBounds(172, 0, 86, 113);
            b12.setBounds(86, 339, 86, 113);
            b13.setBounds(0, 339, 86, 113);
            b14.setBounds(258, 452, 86, 113);
            b15.setBounds(344, 113, 86, 113);

            b16.setBounds(344, 339, 86, 113);
            b17.setBounds(86, 0, 86, 113);
            b18.setBounds(258, 113, 86, 113);
            b19.setBounds(172, 226, 86, 113);
            b20.setBounds(0, 452, 86, 113);
        
            b21.setBounds(258, 226, 86, 113);
            b22.setBounds(86, 452, 86, 113);
            b23.setBounds(172, 113, 86, 113);
            b24.setBounds(0, 0, 86, 113);
        
            bos.setBounds(344, 452, 86, 113); 
        
            
            game.repaint();
        });

        
        
    }
}

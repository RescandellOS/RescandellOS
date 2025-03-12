package org.example;


import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        File checink = new File("src/rec32/info.txt");

        if (checink.exists()) {




            try {
                File startup = new File("src/music/startup.wav");
                AudioInputStream start = AudioSystem.getAudioInputStream(startup);
                Clip startclip = AudioSystem.getClip();
                startclip.open(start);
                startclip.start();
                System.out.println("music listen");
                Thread.sleep(startclip.getMicrosecondLength() / 1000);
                startclip.close();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
                     InterruptedException strt) {
                strt.printStackTrace();
            }


            //startup
            JFrame startfrm = new JFrame();
            startfrm.setBounds(0, 0, 1920, 680);
            startfrm.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
            startfrm.setUndecorated(true);
            startfrm.setResizable(false);
            startfrm.setVisible(true);
            startfrm.getContentPane().setBackground(new Color(0, 255, 226));


            JLabel label = new JLabel("SYSTEMOracation™");
            label.setFont(new Font("Monospaced",Font.PLAIN,29));
            label.getMousePosition();
            label.setBounds(800, 150, 500, 500);
            label.setVisible(true);
            startfrm.add(label);


            //frame for oc


            try {
                Thread.sleep(3500);
            } catch (InterruptedException t) {
                t.printStackTrace();
            }

            startfrm.setVisible(false);



            JFrame frame = new JFrame("Rescandell");


            frame.setBounds(0, 0, 1920, 1080);
            frame.setUndecorated(true);
            frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
            frame.setResizable(false); //Disable the Resize Button
            frame.setLayout(null);
            frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            frame.setVisible(true);
            frame.getContentPane().setBackground(new Color(156, 29, 113, 205));
            //musicprogg
            JButton musicprogg = new JButton("MusicBox");
            musicprogg.setBackground(new Color(9, 164, 244, 158));
            musicprogg.setBounds(0, 450, 100, 50);
            musicprogg.addActionListener(bx -> {
                JFrame music = new JFrame("MusicBox");
                music.getContentPane().setBackground(new Color(137, 2, 255, 158));
                music.setBounds(0, 0, 1920, 1080);
                music.setLayout(null);
                music.setVisible(true);


                JButton muskell = new JButton("music:GAYAZOV_BROTHER");
                muskell.setBounds(300, 100, 300, 50);
                muskell.addActionListener(muskel -> {
                    try {
                        File kell = new File("src/music/GAYAZOV_BROTHER_-_Pyanyjj_tuman_62788609.wav");
                        AudioInputStream audiostreamsdofkell = AudioSystem.getAudioInputStream(kell);
                        Clip clipsoundkell = AudioSystem.getClip();
                        clipsoundkell.open(audiostreamsdofkell);
                        clipsoundkell.start();
                        System.out.println("music listen");
                        Thread.sleep(clipsoundkell.getMicrosecondLength() / 1000);
                        clipsoundkell.close();
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
                             InterruptedException e1) {
                        e1.printStackTrace();
                    }
                });
                muskell.setVisible(true);
                music.add(muskell);


                JButton under = new JButton("music:undertale-save world");
                under.setBounds(600, 100, 400, 50);
                under.addActionListener(muskel -> {
                    try {
                        File tale = new File("src/music/Toby_Fox_-_SAVE_The_World_64962851.wav");
                        AudioInputStream audiostreamsdofunder = AudioSystem.getAudioInputStream(tale);
                        Clip clipsoundunder = AudioSystem.getClip();
                        clipsoundunder.open(audiostreamsdofunder);
                        clipsoundunder.start();
                        System.out.println("music listen");
                        Thread.sleep(clipsoundunder.getMicrosecondLength() / 1000);
                        clipsoundunder.close();
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
                             InterruptedException e1) {
                        e1.printStackTrace();
                    }
                });
                under.setVisible(true);
                music.add(under);


                JButton mus123 = new JButton("music:undertale-sans");
                mus123.setBounds(0, 100, 300, 50);
                mus123.addActionListener(mus11 -> {
                    try {
                        File mus = new File("src/music/Toby_Fox_-_MEGALOVANIA_64962866.wav");
                        AudioInputStream audiostreamsdofmm = AudioSystem.getAudioInputStream(mus);
                        Clip clipsoundmm = AudioSystem.getClip();
                        clipsoundmm.open(audiostreamsdofmm);
                        clipsoundmm.start();
                        System.out.println("music listen");
                        Thread.sleep(clipsoundmm.getMicrosecondLength() / 1000);
                        clipsoundmm.close();
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
                             InterruptedException e1) {
                        e1.printStackTrace();
                    }
                });
                mus123.setVisible(true);
                music.add(mus123);


                JButton mozno = new JButton("music:mozno ya stoboy");
                mozno.setBounds(450, 0, 300, 50);
                mozno.addActionListener(moz -> {
                    try {
                        File yastb = new File("src/music/APENT_-_Mozhno_ya_s_tobojj_77552797.wav");
                        AudioInputStream audiostreamsdofya = AudioSystem.getAudioInputStream(yastb);
                        Clip clipsoundya = AudioSystem.getClip();
                        clipsoundya.open(audiostreamsdofya);
                        clipsoundya.start();
                        System.out.println("music listen");
                        Thread.sleep(clipsoundya.getMicrosecondLength() / 1000);
                        clipsoundya.close();
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
                             InterruptedException e1) {
                        e1.printStackTrace();
                    }
                });
                mozno.setVisible(true);
                music.add(mozno);


                JButton musicprogg1 = new JButton("music:belie rozi");
                musicprogg1.setBounds(0, 0, 250, 50);
                musicprogg1.addActionListener(bx1 -> {
                    try {
                        File bel = new File("src/music/YUrijj_SHatunov_-_Belye_rozy_49909527.wav");
                        AudioInputStream audiostreamsdofbel = AudioSystem.getAudioInputStream(bel);
                        Clip clipsoundbel = AudioSystem.getClip();
                        clipsoundbel.open(audiostreamsdofbel);
                        clipsoundbel.start();
                        System.out.println("music listen");
                        Thread.sleep(clipsoundbel.getMicrosecondLength() / 1000);
                        clipsoundbel.close();
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
                             InterruptedException e1) {
                        e1.printStackTrace();
                    }

                });
                musicprogg1.setVisible(true);
                music.add(musicprogg1);

                JButton musicprogg2 = new JButton("music:what is love");
                musicprogg2.setBounds(200, 0, 250, 50);
                musicprogg2.addActionListener(bx1 -> {
                    try {
                        File soundwhat = new File("src/music/Haddaway_-_What_Is_Love_48045121.wav");
                        AudioInputStream audiowhat = AudioSystem.getAudioInputStream(soundwhat);
                        Clip clipsoundww = AudioSystem.getClip();
                        clipsoundww.open(audiowhat);
                        clipsoundww.start();
                        System.out.println("music listen");
                        Thread.sleep(clipsoundww.getMicrosecondLength() / 1000);
                        clipsoundww.close();
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
                             InterruptedException e1) {
                        e1.printStackTrace();
                    }



                    musicprogg2.setVisible(true);
                    music.add(musicprogg2);


                });
                musicprogg2.setVisible(true);
                music.add(musicprogg2);
            });
            musicprogg.setVisible(true);
            frame.add(musicprogg);



            //console
            JButton console1 = new JButton("MALWARE");
           console1.setBackground(new Color(9, 164, 244, 158));
            console1.setBounds(0, 100, 100, 50);
            console1.addActionListener(e3 -> {
                String returncomm = JOptionPane.showInputDialog(null, "enter command:");



                switch (returncomm) {

                    case "class_NaN._<shut>.shutdown/restart/s/f_0:Return:0:end":
                        JFrame restart = new JFrame("shutdown");
                        restart.setBounds(0, 0, 1920, 1080);
                        restart.setLayout(null);
                        restart.setVisible(true);

                        JButton rst = new JButton("shutdown");
                        rst.setBounds(600, 100, 100, 50);
                        rst.setBackground(Color.gray);
                        rst.addActionListener(dan -> {
                            Runtime restr = Runtime.getRuntime();
                            try {
                                restr.exec("shutdown -r");

                            } catch (IOException e) {

                                throw new RuntimeException(e);

                            }
                        });
                        rst.setVisible(true);
                        restart.add(rst);

                        break;

                    case "MenuBar":
                        JFrame settings = new JFrame("MyBar");
                     settings.getContentPane().setBackground(new Color(10,4,57));
                        settings.setBounds(0, 0, 1920, 1080);
                        settings.setLayout(null);
                        settings.setVisible(true);

                        JButton dannie = new JButton("createTXT");
                        dannie.setBounds(300, 100, 100, 50);
                        dannie.setBackground(Color.black);
                        dannie.addActionListener(dan -> {
                            File create = new File("src/rec32/qwerty111.txt");
                            try {
                                create.createNewFile();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
                        dannie.setVisible(true);
                        settings.add(dannie);

                        JButton dannie1 = new JButton("help");
                        dannie1.setBounds(600, 100, 100, 50);
                        dannie1.setBackground(Color.red);
                        dannie1.addActionListener(dan -> {
                            JOptionPane.showMessageDialog(null, "1.To turn off the OS press the off button on the desktop" +
                                    " 2.if you do not know the codes for the console,here are the codes: MenuBar,class_NaN._<shut>.shutdown/restart/s/f_0:Return:0:end");
                            JOptionPane.showMessageDialog(null, "in the future there will be more functions and convenience!");


                        });
                        dannie1.setVisible(true);
                        settings.add(dannie1);
                        break;

                    case "class<main>:<Destup://<deltasecurity>{path:}:(-src/rec32/info.txt-):[ready]::return<delta>/end>":
                        File fileinfo = new File("src/rec32/info.txt");

                       

                        JFrame info32 = new JFrame(fileinfo.getName());
                        info32.getContentPane().setBackground(new Color(0x002DA8));
                        info32.setBounds(0,200,550,550);
                        info32.setVisible(true);
                        info32.setLayout(null);

                        JLabel labelinfo = new JLabel("waiting for a response from the file...");
                        labelinfo.setBounds(0,0,800,750);
                        labelinfo.setFont(new Font("Monospaced",Font.HANGING_BASELINE,29));


                        BufferedReader reader;

                        try {
                            reader = new BufferedReader(new FileReader("src/rec32/info.txt"));
                            String line = reader.readLine();

                            while (line != null) {
                               labelinfo.setText(line);
                                // read next line
                                line = reader.readLine();
                            }

                            reader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }



                        labelinfo.getMousePosition();
                        info32.add(labelinfo);
                        labelinfo.setVisible(true);
                        break;

                    case "class main<Runtime<listerning>=create_Runtime(--system--):{__:DEX=@[delete]@:_SYSTEM_CALL_<-src/rec32/boot32.txt-> and <-src/rec32/info.txt->_{_[$DELETE_ON_REMOVE$]_CALLTODELETE_return:end//>}}":
                            File info = new File("src/rec32/info.txt");
                            info.delete();
                        File boot32 = new File("src/rec32/boot32.txt");
                        boot32.delete();

                        JFrame errorscreen = new JFrame();
                            errorscreen.setBounds(0,0,1920,1080);
                            errorscreen.setLayout(null);
                            errorscreen.getContentPane().setBackground(Color.RED);
                        errorscreen.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
                       errorscreen.setUndecorated(true);
                       errorscreen.setResizable(false);
                       errorscreen.setVisible(true);

                       JLabel error = new JLabel();
                       error.setBounds(350,0,1920,1080);
                       error.setFont(new Font("Monospaced",Font.LAYOUT_NO_START_CONTEXT,35));
                       error.setText("<html><br>FatalError:system can't find the file {info} <br>if you don't know what to do then contact <br>the developer:wisanimation7@gmail.com</html>");
                       error.setVisible(true);
                       errorscreen.add(error);

                       frame.setVisible(false);

                       try{
                           File sonderror = new File("src/rec32/reos32/detailsounds/detalErrorscreen.wav");
                           AudioInputStream pusk = AudioSystem.getAudioInputStream(sonderror);
                           Clip clvoid = AudioSystem.getClip();
                           clvoid.open(pusk);
                           clvoid.start();
                           System.out.println("error");
                           Thread.sleep(clvoid.getMicrosecondLength() / 1000);
                          clvoid.close();
                       }catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException s){
                          s.printStackTrace();
                       }
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,"Error "+returncomm+" is not valid command");
                        break;


                }
            });
            console1.setBackground(Color.CYAN);
            console1.setVisible(true);
            frame.add(console1);
// off system
            JButton buttonenbled = new JButton("off");
            buttonenbled.addActionListener(e -> {

                try {
                    File soundcomp = new File("src/rec32/archivo.wav");
                    AudioInputStream audiostreamsdof = AudioSystem.getAudioInputStream(soundcomp);
                    Clip clipsound = AudioSystem.getClip();
                    clipsound.open(audiostreamsdof);
                    clipsound.start();
                    System.out.println("music listen");
                    Thread.sleep(clipsound.getMicrosecondLength() / 1000);
                    clipsound.close();
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
                         InterruptedException e1) {
                    e1.printStackTrace();
                }


                Runtime runtime = Runtime.getRuntime();
                try {
                    Process proc = runtime.exec("shutdown -s -t 0");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                System.exit(0);


            });
            buttonenbled.setBounds(0, 750, 100, 50);
            buttonenbled.setVisible(true);
            frame.add(buttonenbled);

            //game
            JButton buttongame = new JButton("pianoMEME");
            buttongame.setBounds(0, 0, 150, 100);
            buttongame.addActionListener(e1 -> {
                JFrame game = new JFrame("tiger cub");
                game.setBounds(0, 0, 1920, 1080);

                game.setLayout(null);
                game.setVisible(true);
                //note1


                String rndmus[] = {"src/rec32/game/vemon.wav", "src/rec32/game/geroy.wav", "src/rec32/game/den-ivana-zolo.wav", "src/rec32/game/fimozik.wav", "src/rec32/game/open.wav", "src/rec32/game/nax.wav", "src/rec32/game/dobroe-utro-moia-devochka.wav", "src/rec32/game/plnktaa.wav"};
                int number = new Random().nextInt(8);


                String rndmus1[] = {"src/rec32/game/vemon.wav", "src/rec32/game/geroy.wav", "src/rec32/game/den-ivana-zolo.wav"};
                int number1 = new Random().nextInt(2);


                String rndmus2[] = {"src/rec32/game/vemon.wav", "src/rec32/game/dobroe-utro-moia-devochka.wav"};
                int number2 = new Random().nextInt(1);

                JButton cards1 = new JButton("note1");
                cards1.setBounds(0, 100, 100, 100);
                cards1.setBackground(Color.DARK_GRAY);
                cards1.addActionListener(cad1 -> {

                    try {
                        File vemonsound = new File(rndmus[number]);
                        AudioInputStream audiostream = AudioSystem.getAudioInputStream(vemonsound);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audiostream);
                        clip.start();
                        System.out.println("music listen");
                        Thread.sleep(clip.getMicrosecondLength() / 1000);
                        clip.close();
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
                             InterruptedException e) {
                        e.printStackTrace();
                    }
                    game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                });
                cards1.setVisible(true);

                game.add(cards1);
                //note2
                JButton cards2 = new JButton("note2");
                cards2.setBounds(120, 100, 100, 100);
                cards2.addActionListener(cad2 -> {

                    try {

                        File vemonsound = new File(rndmus1[number1]);
                        AudioInputStream audiostream1 = AudioSystem.getAudioInputStream(vemonsound);
                        Clip clip1 = AudioSystem.getClip();
                        clip1.open(audiostream1);
                        clip1.start();
                        System.out.println("music listen");
                        Thread.sleep(clip1.getMicrosecondLength() / 1000);
                        clip1.close();
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
                             InterruptedException e) {
                        e.printStackTrace();
                    }

                });
                cards2.setBackground(Color.DARK_GRAY);
                cards2.setVisible(true);

                game.add(cards2);
                //note3
                JButton cards3 = new JButton("note3");
                cards3.setBounds(230, 100, 100, 100);
                cards3.setBackground(Color.DARK_GRAY);
                cards3.addActionListener(cad3 -> {

                    try {
                        File vemonsound3 = new File(rndmus2[number2]);
                        AudioInputStream audiostream3 = AudioSystem.getAudioInputStream(vemonsound3);
                        Clip clip3 = AudioSystem.getClip();
                        clip3.open(audiostream3);
                        clip3.start();
                        System.out.println("music listen");
                        Thread.sleep(clip3.getMicrosecondLength() / 1000);
                        clip3.close();
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
                             InterruptedException e) {
                        e.printStackTrace();
                    }


                });

                cards3.setVisible(true);

                game.add(cards3);


            });


            buttongame.setVisible(true);
            frame.add(buttongame);
            //end
            //errorscreen


        } else {
            JFrame errorscreen2 = new JFrame();
            errorscreen2.setBounds(0,0,1920,1080);
            errorscreen2.setLayout(null);
            errorscreen2.getContentPane().setBackground(Color.RED);
            errorscreen2.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
            errorscreen2.setUndecorated(true);
            errorscreen2.setResizable(false);
            errorscreen2.setVisible(true);





            try{
                File sonderror = new File("src/rec32/reos32/detailsounds/detalErrorscreen.wav");
                AudioInputStream pusk = AudioSystem.getAudioInputStream(sonderror);
                Clip clvoid = AudioSystem.getClip();
                clvoid.open(pusk);
                clvoid.start();
                System.out.println("error");
                Thread.sleep(clvoid.getMicrosecondLength() / 1000);
                clvoid.close();
            }catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException s){
                s.printStackTrace();
            }

            try {
                Thread.sleep(15000);
            }catch (InterruptedException ti){

                ti.printStackTrace();

            }

            JOptionPane.showMessageDialog(null, "Welcome to RescandellOS!");



            String treat = JOptionPane.showInputDialog(null, "how to treat you?");
            if (!treat.isEmpty()) {


                String password = JOptionPane.showInputDialog(null, "Please " + treat + " enter your new password");
                if (!password.isEmpty()) {


                    try {
                        FileWriter info32 = new FileWriter("src/rec32/info.txt");

                        info32.write("info:nickname:"+treat+"   xhashcodeName:"+treat.hashCode());
                        info32.write("    / version:1.1");
                        info32.close();

                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "error 4089 " + e);
                        e.printStackTrace();

                    }




                    try{
                        String javaVersion=System.getProperty("java.version");
                        String javaVendor = System.getProperty("java.vendor");

                        FileWriter system = new FileWriter("src/rec32/boot32.txt");
                        system.write(javaVendor + "  " + javaVersion);
                        system.close();
                    }catch (IOException w){
                        w.printStackTrace();
                    }

                    JOptionPane.showMessageDialog(null,"Please restarting to system");

                }else {
                    JOptionPane.showMessageDialog(null,"please enter your password!");
                    JOptionPane.showMessageDialog(null,"please restarting your system");
                }
            }else {
                JOptionPane.showMessageDialog(null,"please enter your nickname!");
            }
        }


    }
}


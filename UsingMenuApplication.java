package VasilevJavaBuch.Glava_16_Menu_i_panel_instrumentov;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class MyFrame extends JFrame implements ActionListener{
    private int state;
    private JPanel pnl;
    private Border bdr;
    private Color[] clr = new Color[3];
    private JButton btn;
    private JMenu content, view, program;
    private ImageIcon[] imgs;
    private String[] engNames = {"fox", "wolf", "bear", "racoon"};
    private String[] cyrNames = {"der Fuchs", "der Wolf", "der Bär", "der Waschbär"};
    private String[] files;
    private JLabel lbl;
    private JTextPane tp;
    private JMenuBar mb;
    private JMenuItem about, exit;
    private JMenuItem[] animals;
    private JCheckBoxMenuItem color;
    private JRadioButtonMenuItem light, dark, ordinary;
    private JToolBar tb;
    private MyButton exitBtn, nextBtn, prevBtn, startBtn;
    private JPopupMenu pm;
    class MyButton extends JButton{
        MyButton(String txt){
            super(new ImageIcon("C:\\Users\\yuriy\\Documents\\NetBeansProjects\\VideoCourse\\src\\VasilevJavaBuch\\Glava_16_Menu_i_panel_instrumentov\\img\\" + txt));
            setFocusPainted(false);
        }
    }
    private void setContent(){
        lbl.setIcon(imgs[state]);
        try{
            tp.setPage(files[state]);
        }catch(IOException err){
            tp.setText("Information nicht verfügbar");
        }
    }
    public void actionPerformed(ActionEvent e){
        state = Integer.parseInt(((JMenuItem)e.getSource()).getActionCommand());
        setContent();
    }
    MyFrame(){
        super("Fenster mit Menüleisten");
        setBounds(250, 250, 360, 240);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        state = 0;
        bdr = BorderFactory.createEtchedBorder();
        clr[0] = getBackground();
        clr[1] = Color.WHITE;
        clr[2] = Color.DARK_GRAY;
        imgs = new ImageIcon[engNames.length];
        files = new String[engNames.length];
        animals = new JMenuItem[cyrNames.length];
        for(int k = 0; k < engNames.length; k++){
            imgs[k] = new ImageIcon("C:\\Users\\yuriy\\Documents\\NetBeansProjects\\VideoCourse\\src\\VasilevJavaBuch\\Glava_16_Menu_i_panel_instrumentov\\img\\" + engNames[k] + ".jpg");
            files[k] = "с:\\Users\\yuriy\\Documents\\NetBeansProjects\\VideoCourse\\src\\VasilevJavaBuch\\Glava_16_Menu_i_panel_instrumentov\\files\\" + engNames[k] + ".txt";

        }
        tb = new JToolBar("Die Menüleiste");
        exitBtn = new MyButton("exit.png");
        exitBtn.setToolTipText("Beendigung der Arbeiten");
        startBtn = new MyButton("start.png");
        startBtn.setToolTipText("Startbild");
        prevBtn = new MyButton("prev.png");
        prevBtn.setToolTipText("Früheres Bild");
        nextBtn = new MyButton("next.png");
        nextBtn.setToolTipText("Nächstes Bild");
        tb.add(exitBtn);
        tb.add(startBtn);
        tb.add(prevBtn);
        tb.add(nextBtn);
        add(tb, BorderLayout.NORTH);
        pnl = new JPanel();
        pnl.setBorder(bdr);
        pnl.setLayout(new GridLayout(1, 2));
        lbl = new JLabel();
        lbl.setHorizontalAlignment(JLabel.CENTER);
        pnl.add(lbl);
        add(pnl, BorderLayout.CENTER);
        JScrollPane sp = new JScrollPane();
        tp = new JTextPane();
        tp.setEditable(false);
        sp.getViewport().add(tp);
        pnl.add(sp);
        btn = new JButton("OK");
        btn.setFocusPainted(false);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 3));
        p.setBorder(bdr);
        p.add(new JPanel());
        p.add(btn);
        p.add(new JPanel());
        add(p, BorderLayout.SOUTH);
        mb = new JMenuBar();
        content = new JMenu("Inhaltsverzeichnis");
        view = new JMenu("Siehe");
        program = new JMenu("Programm");
        about = new JMenuItem("Über das Programm");
        exit = new JMenuItem("Ausgang", exitBtn.getIcon());
        program.add(about);
        program.addSeparator();
        program.add(exit);
        color = new JCheckBoxMenuItem("Farbe des Paneels", true);
        light = new JRadioButtonMenuItem("Licht", false);
        dark = new JRadioButtonMenuItem("Dunkel", false);
        ordinary = new JRadioButtonMenuItem("Normalerweise", true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(ordinary);
        bg.add(light);
        bg.add(dark);
        view.add(color);
        view.addSeparator();
        view.add(ordinary);
        view.add(light);
        view.add(dark);
        for(int k = 0; k < animals.length; k++){
            animals[k] = new JMenuItem(cyrNames[k]);
            animals[k].setActionCommand("" +k);
            animals[k].addActionListener(this);
            content.add(animals[k]);
        }
        mb.add(content);
        mb.add(view);
        mb.add(program);
        setJMenuBar(mb);
        pm = new JPopupMenu();
        for(int k = 0; k < cyrNames.length; k++){
            pm.add(new JMenuItem(cyrNames[k])).setActionCommand("" + k);
            ((JMenuItem)pm.getComponent(k)).addActionListener(this);
        }
        pm.addSeparator();
        pm.add(new JMenuItem("Ausgang", exitBtn.getIcon())).addActionListener(e -> exitBtn.doClick());
        lbl.setComponentPopupMenu(pm);
        btn.addActionListener(e -> System.exit(0));
        exitBtn.addActionListener(btn.getActionListeners()[0]);
        nextBtn.addActionListener(e -> {
            state = (state +1)%(engNames.length);
            setContent();
        });
        prevBtn.addActionListener(e -> {
            state = state == 0?engNames.length-1:(state-1);
            setContent();
        });
        startBtn.addActionListener(e -> {
            state = 0;
            setContent();
        });
        exit.addActionListener(exitBtn.getActionListeners()[0]);
        about.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this, "   Das Menü der Symbolleiste\n wird im Programm verwendet.", "Über das Programm", JOptionPane.INFORMATION_MESSAGE
            );
        });
        lbl.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                if(e.isPopupTrigger()){
                    pm.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        color.addActionListener(e -> {
            if(color.isSelected()){
                ordinary.setEnabled(true);
                light.setEnabled(true);
                dark.setEnabled(true);
            }else{
                ordinary.setEnabled(false);
                light.setEnabled(false);
                dark.setEnabled(false);
            }
        });
        ordinary.addActionListener(e -> pnl.setBackground(clr[0]));
        light.addActionListener(e -> pnl.setBackground(clr[1]));
        dark.addActionListener(e -> pnl.setBackground(clr[2]));
        setContent();
        setVisible(true);
    }
}
public class UsingMenuApplication {
    public static void main(String[] args) {
        new MyFrame();
    }
}

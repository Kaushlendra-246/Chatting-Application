import javax.swing.*;
import java.awt.*; //colour, ..
import java.awt.event.*; //for ActionListener (action perform when we click img)

public class Server extends JFrame implements ActionListener{

    // JFrame = swing
    Server() { //All coding of server frame

        setLayout(null); //We set Panel According to me

        //How to divide Frame into Panel?
        JPanel p1 = new JPanel(); //divide Frame
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70); //Set panel on frame
        p1.setLayout(null); //we set img on panel acco. to me
        add(p1);

        //How to set Image?
        //(1)Back (Arrow) button
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3); //Can't pass i2 directally
        back.setBounds(5,20,25,25); //Coordinate and size of img
        p1.add(back); //Set img on panel

        //perform operation
        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae){
                System.exit(0);
                //setVisible(false);
            }
        }
        );

        //(2)Profile img
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6); //Can't pass i5 directally
        profile.setBounds(40,10,50,50); //Coordinate and size of img
        p1.add(profile); //Set img on panel

        //(3)Video call
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9); //Can't pass i8 directally
        video.setBounds(300,20,30,30); //Coordinate and size of img
        p1.add(video); //Set img on panel

        //(4)Voice Call
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12); //Can't pass i11 directally
        phone.setBounds(360,20,35,30); //Coordinate and size of img
        p1.add(phone); //Set img on panel

        //(5) more (moreVert) option
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i14 = i13.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel more = new JLabel(i15); //Can't pass i14 directally
        more.setBounds(420,23,10,25); //Coordinate and size of img
        p1.add(more); //Set img on panel

        //How to set name?
        JLabel name = new JLabel("Kaushlendra"); //Pass name
        name.setBounds(110, 15, 150, 15); //Coordinate and size of text
        name.setForeground(Color.WHITE); //Set text color not background
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p1.add(name); //set on panel

        //Active or not
        JLabel status = new JLabel("Active Now"); //Pass text
        status.setBounds(110, 40, 100, 10); //Coordinate and size of text
        status.setForeground(Color.WHITE); //Set text color
        status.setFont(new Font("SAN_SERIF", Font.BOLD, 12));
        p1.add(status); //set on panel

        //Add new frame for "text area"
        JPanel al = new JPanel();
        al.setBounds(5, 75, 440, 575); //set size and co-ordinate
        //al.setBounds(5, 75, 425, 560); // if minimize, Maximize and cut button is not removed
        add(al); //set on frame

        //Where we type chats
        JTextField text = new JTextField();
        text.setBounds(5, 655, 310, 40); //co-ordinate and size
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16)); //default size of typing text is 12(probably)
        add(text); //set on frame

        //Send button?
        JButton send = new JButton("Send");
        send.setBounds(320, 655, 123, 40);
        send.setBackground(new Color(7, 94, 84));
        send.setForeground(Color.WHITE);
        send.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        add(send); // set on frame

        //How to set Frame Size and Color?
        setSize(450, 700);
        setLocation(200,100);
        setUndecorated(true); //Remove minimize, Maximize and cut button
        getContentPane().setBackground(new Color(197, 242, 252)); //getContentPane() = select whole frame
        //color can be also def as "Color.col"

        setVisible(true);
    }

    //Over-ride Abstract method in ActionListener otherwise Server show error
    public void actionPerformed(ActionEvent ae){
        
    }
    
    public static void main(String[] args) {
        
        new Server(); //Anynomous obj
    }
}

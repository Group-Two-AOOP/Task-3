import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GridLayOut {
    JFrame frame;
    JPanel PanelOne,PanelTwo, PanelThree;

        public GridLayOut() {
            this.createFrame();
        }
        
        public void createFrame() {
            JFrame.setDefaultLookAndFeelDecorated(true);
            frame = new JFrame("GridLayout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setLayout(new GridLayout(1, 3)); 

            frame.add(this.CreateJPanelOne());
            frame.add(this.CreateJPanelTwo());
            frame.add(this.CreateJPanelThree());

            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
            return frame;
        }

        public JPanel CreateJPanelOne() {
            PanelOne = new JPanel();
            Border JPanelOneBorder = BorderFactory.createTitledBorder("JPANEL ONE");
            PanelOne.setBorder(JPanelOneBorder);
            PanelOne.setBackground(Color.CYAN);
            return PanelOne;
        }

        public JPanel CreateJPanelTwo(){
            PanelTwo = new JPanel();
            Border JPanelTwoBorder = BorderFactory.createTitledBorder("JPANEL TWO");
            PanelTwo.setBorder(JPanelTwoBorder);
            PanelTwo.setBackground(Color.MAGENTA.brighter());
            return PanelTwo;
        }

        public JPanel CreateJPanelThree(){
            PanelThree = new JPanel();
            Border JPanelThreeBorder = BorderFactory.createTitledBorder("JPANEL THREE");
            PanelThree.setBorder(JPanelThreeBorder);
            PanelThree.setBackground(Color.GRAY.brighter());
            return PanelThree;
        }

    }

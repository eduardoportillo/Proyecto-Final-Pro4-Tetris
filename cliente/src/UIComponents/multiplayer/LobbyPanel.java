package UIComponents.multiplayer;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import UIComponents.IndexFrame;

public class LobbyPanel extends JPanel {

    static JScrollPane panelDeslizable = new JScrollPane();
    static JTextArea areaTexto = new JTextArea(80, 4);

    LobbyPanel instance = this;

    IndexFrame indexFrame;

    public LobbyPanel(IndexFrame indexFrame) {
        this.indexFrame = indexFrame;
        this.setSize(600, 600);
        // this.setLayout(new BoxLayout(this.getParent(), BoxLayout.Y_AXIS));
        indexFrame.getContentPane().setLayout(new BoxLayout(indexFrame.getContentPane(), BoxLayout.Y_AXIS));
        // setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        add(panelDeslizable, BorderLayout.CENTER);
        this.setVisible(true);

        JPanel p = new JPanel();

        String week[] = { "Monday", "Tuesday", "Wednesday" };
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < week.length; i++) {
            model.addElement(new PanelTest(week[i]));
        }

        JList list = new JList(model);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                System.out.println("entro al hacer click");
            }
        });
        
        list.setFixedCellHeight(50);
        list.setFixedCellWidth(400);
        list.setSelectedIndex(-1);
        list.setCellRenderer(new PanelRenderer());
        list.setSize(400, 400);
        p.add(list);
        panelDeslizable.setViewportView(p);
        // panelDeslizable.setSize(600, 600);
        // panelDeslizable.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
    }

    class PanelRenderer implements ListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
                boolean cellHasFocus) {
            JPanel renderer = (JPanel) value;
            renderer.setBackground(isSelected ? Color.red : list.getBackground());
            return renderer;
        }

    }

    public class PanelTest extends JPanel{

        public PanelTest(String texto) {
            this.setSize(500, 200);
            // this.setLayout(new GridLayout(0, 1));
            this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            JLabel l = new JLabel(texto);
            l.setSize(500, 50);
            this.add(l);

        }
    }

}

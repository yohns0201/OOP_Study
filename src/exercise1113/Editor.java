package exercise1113;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Editor extends JFrame {
    public Editor() {
        setTitle("Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);

        //메뉴바
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = createMenu("File", "Open", "Save", "Close");
        JMenu editMenu = createMenu("Edit", "Copy", "Cut", "Paste");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setJMenuBar(menuBar);

        //레이아웃 설정
        Container m = getContentPane();
        m.setLayout(new BorderLayout());

        //왼쪽 트리 패널
        JTree fileTree = new JTree(createTreeNodes());
        JScrollPane treeScrollPane = new JScrollPane(fileTree);
        treeScrollPane.setPreferredSize(new Dimension(150, getHeight()));

        //중앙 텍스트 패널
        JTextPane textPane = new JTextPane();
        textPane.setText("Hello, JTextPane!" + "\n".repeat(50));
        JScrollPane textScrollPane = new JScrollPane(textPane);
        textScrollPane.setPreferredSize(new Dimension(0, 500));

        //오른쪽 리스트
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Hello.java");
        listModel.addElement("World.java");
        JList<String> listPane = new JList<>(listModel);
        JScrollPane listScrollPane = new JScrollPane(listPane);
        listScrollPane.setPreferredSize(new Dimension(150, getHeight()));

        //아래 패널
        JTextPane bottomPane = new JTextPane();
        bottomPane.setText("Compiling......" + "\n".repeat(10));
        JScrollPane bottomScrollPane = new JScrollPane(bottomPane);
        bottomScrollPane.setPreferredSize(new Dimension(getWidth(), 100));

        //레이아웃에 삽입
        m.add(treeScrollPane, BorderLayout.WEST);
        m.add(textScrollPane, BorderLayout.CENTER);
        m.add(listScrollPane, BorderLayout.EAST);
        m.add(bottomScrollPane, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Editor();
    }

    //JMenu 항목 추가하는 메서드
    private JMenu createMenu(String name, String... items) {
        JMenu menu = new JMenu(name);
        for (String item : items) {
            menu.add(new JMenuItem(item));
        }
        return menu;
    }

    //왼쪽 트리 패널 구성
    private DefaultMutableTreeNode createTreeNodes() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("SRC");
        DefaultMutableTreeNode gui = new DefaultMutableTreeNode("GUI");
        DefaultMutableTreeNode lib = new DefaultMutableTreeNode("lib");

        root.add(gui);
        root.add(lib);
        gui.add(new DefaultMutableTreeNode("Hello.java"));
        lib.add(new DefaultMutableTreeNode("World.java"));

        return root;
    }
}

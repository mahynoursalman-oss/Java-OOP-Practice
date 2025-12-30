package player;

import javax.swing.*;//library for the gui

public class MusicWindow extends JFrame {

    private JList<Music> musicJList;
    private DefaultListModel<Music> listModel;
    private JButton playButton;

    public MusicWindow() {
        setTitle("mahy's music player");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//window to show it

        listModel = new DefaultListModel<>();
        musicJList = new JList<>(listModel);//to show list

        listModel.addElement(new Mp3Music("AMR DIAB PLAYING NOW :)"));
        listModel.addElement(new WavMusic("JADAL PLAYING NOW :)"));

        playButton = new JButton("start streaminggg");

        playButton.addActionListener(e -> playMusic());//for the click button

        add(new JScrollPane(musicJList), "Center");
        add(playButton, "South");
    }

    private void playMusic() {
        Music m = musicJList.getSelectedValue();
        if (m != null) {
            m.play();
            JOptionPane.showMessageDialog(this, "Now playing: " + m.getName());
        }
    }
}

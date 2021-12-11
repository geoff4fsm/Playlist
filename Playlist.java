import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Los");
        desertIslandPlaylist.add("Add it up");
        desertIslandPlaylist.add("Bohemian rhapsody");
        desertIslandPlaylist.add("Mein teil");
        desertIslandPlaylist.add("Master of puppets");
        desertIslandPlaylist.add("Immegrant song");
        System.out.println(desertIslandPlaylist);
        System.out.println("Number of songs is: " + desertIslandPlaylist.size());
        desertIslandPlaylist.remove(5);
        System.out.println(desertIslandPlaylist);
        String a = "Los";
        String b = "Mein teil";
        System.out.println(a + " is at index " + desertIslandPlaylist.indexOf(a));
        System.out.println(b + " is at index " + desertIslandPlaylist.indexOf(b));
        desertIslandPlaylist.set(0, b);
        desertIslandPlaylist.set(3, a);
        System.out.println(desertIslandPlaylist);
    }

}

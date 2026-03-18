package LinkedList.Circular_Linked_List.Question_2;

public class PlaylistTest {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.add(new Song("Bohemian Rhapsody", "Queen"));
        playlist.add(new Song("Hotel California", "Eagles"));
        playlist.add(new Song("Stairway to Heaven", "Led Zeppelin"));
        playlist.add(new Song("Smells Like Teen Spirit", "Nirvana"));
        playlist.add(new Song("Billie Jean", "Michael Jackson"));
        playlist.add(new Song("Lose Yourself", "Eminem"));
        playlist.add(new Song("Blinding Lights", "The Weekend"));
        playlist.add(new Song("So Easy", "Olivia Dean"));
        playlist.add(new Song("Someone Like You", "Adele"));
        playlist.add(new Song("Rolling in the Deep", "Adele"));

        System.out.println();

        playlist.print();

        System.out.println();

        playlist.delete("Billie Jean");
        playlist.print();

        System.out.println();

        playlist.repeat(2);

        System.out.println();

        playlist.shuffle();
        playlist.print();
    }
}
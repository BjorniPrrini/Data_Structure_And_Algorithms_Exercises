package LinkedList.Circular_Linked_List.Question_2;

public class Song {
    String songName;
    String artistName;
    Song next;

    Song(String songName, String artistName){
        this.songName = songName;
        this.artistName = artistName;
        next = null;
    }
}
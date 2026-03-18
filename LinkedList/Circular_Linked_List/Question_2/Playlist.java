package LinkedList.Circular_Linked_List.Question_2;

import java.util.Random;

public class Playlist {
    Song head;
    int songsInPlaylist = 0;

    public void add(Song newSong){

        if(head == null){
            head = newSong;
            newSong.next = head;

            songsInPlaylist++;

            System.out.println("Added: " + newSong.songName);

            return;
        }

        Song curr = head;

        while(curr.next != head){
            curr = curr.next;
        }

        curr.next = newSong;
        newSong.next = head;

        songsInPlaylist++;

        System.out.println("Added: " + newSong.songName);
    }

    public void delete(String name){
        if(head == null){
            System.out.println("Playlist is empty!");

            return;
        }

        if(head.songName.equals(name)){
            if(songsInPlaylist == 1){
                head = null;
            }else{
                Song curr = head;

                while(curr.next != head){
                    curr = curr.next;
                }

                head = head.next;
                curr.next = head;
            }

            songsInPlaylist--;

            return;
        }

        Song curr = head;

        while(curr.next != head){
            if(curr.next.songName.equals(name)){
                curr.next = curr.next.next;

                songsInPlaylist--;

                return;
            }

            curr = curr.next;
        }
    }

    public void print(){
        if(head == null){
            System.out.println("Empty playlist!");

            return;
        }

        Song curr = head;

        do {
            System.out.println(curr.songName);

            curr = curr.next;
        }while(curr != head);
    }

   public void repeat(int times){
        if(head == null){
            System.out.println("Empty playlist!");
            
            return;
        }

        Song curr = head;

        int totalSongs = songsInPlaylist * times;

        for(int i = 0; i < totalSongs; i++){
            System.out.println(curr.songName + " is playing!");
            
            curr = curr.next;
        }
    }

    public void shuffle(){
        if(songsInPlaylist < 2){
            System.out.println("Need at least 2 songs to shuffle!");
            
            return;
        }

        Song[] songArr = new Song[songsInPlaylist];

        Song curr = head;

        for(int i = 0; i < songsInPlaylist; i++){
            songArr[i] = curr;

            curr = curr.next;
        }

        Random random = new Random();

        for(int i = songsInPlaylist - 1; i > 0; i--){
            int j = random.nextInt(i + 1);

            Song temp = songArr[i];
            songArr[i] = songArr[j];
            songArr[j] = temp;
        }

        for(int i = 0; i < songsInPlaylist - 1; i++){
            songArr[i].next = songArr[i + 1];
        }

        songArr[songsInPlaylist - 1].next = songArr[0];

        head = songArr[0];
    }
}
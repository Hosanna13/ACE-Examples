/*
 * Playlist Cleanup
 *
 * You are given:
 *   - An integer n (number of songs)
 *   - An array of n integers representing song durations in seconds
 *
 * Tasks:
 *   1. Read n and then read n integers into an int[] array called songs.
 *   2. Create an ArrayList<Integer> called uniqueSongs.
 *   3. Go through songs and add each duration to uniqueSongs
 *      ONLY if it is not already in the list (ignore duplicates).
 *   4. Sort uniqueSongs in ascending order.
 *   5. Print:
 *        - On the first line: the number of unique songs (uniqueSongs.size()).
 *        - On the second line: all durations in uniqueSongs separated by spaces.
 *
 * Example:
 * Input:
 *   8
 *   180 200 180 240 200 300 150 180
 *
 * Output:
 *   5
 *   150 180 200 240 300
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlaylistCleanup {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1) Read n
        // int n = ...
        int n = in.nextInt();

        // 2) Create array to store durations
        // int[] songs = new int[n];
        //    - read n integers into songs
        int[] songs = new int[n];
        for (int i = 0; i < n; i++) {
            songs[i] = in.nextInt();
        }

        // 3) Create ArrayList for unique durations
        // ArrayList<Integer> uniqueSongs = new ArrayList<>();
        ArrayList<Integer> uniqueSongs = new ArrayList<>();


        // 4) Loop through songs array
        //    - for each duration:
        //        if (!uniqueSongs.contains(duration)) {
        //            uniqueSongs.add(duration);
        //        }
        for ( int i = 0; i < songs.length; i++) {
            if (!uniqueSongs.contains(songs[i])) {
                uniqueSongs.add(songs[i]);
            }
        }

        // 5) Sort the ArrayList
        // Collections.sort(uniqueSongs);
        for (int i = 0; uniqueSongs.size(); i++){
            for (int j = i + 1; j < uniqueSongs.size(); j++){
                if (uniqueSongs.get(i)  > uniqueSongs.get(j)){
                    int temp = uniqueSongs.get(i);
                    uniqueSongs.set(i, uniqueSongs.get(j));
                    uniqueSongs.set(j, temp);
                }
            }
        }

        // 6) Print:
        System.out.println(); 
        //    - first line: uniqueSongs.size()
        //    - second line: all elements of uniqueSongs separated by spaces

        in.close();
    }
}
package com.company;

import java.util.*;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
	// write your code here
        SomeBase base = new SomeBase();
        base.oldMethod("Do something stupid here");

        //without generics
        Library lib = new Library();
        Newspaper paper = new Newspaper();
        lib.addMedia(paper);
        Newspaper lastItem = (Newspaper) lib.retrieveLast();

        //with generics
        LibraryGeneric<Video> videoLib = new LibraryGeneric<>();
        videoLib.addMedia(new Video());
        videoLib.addMedia(new Video());
        videoLib.addMedia(new Video());

        Video lastVideo = videoLib.retrieveLast();

        LibraryGeneric<Newspaper> newsPaperLib = new LibraryGeneric<>();
        newsPaperLib.addMedia(new Newspaper());
        newsPaperLib.addMedia(new Newspaper());
        newsPaperLib.addMedia(new Newspaper());

        Newspaper lastNewspaper = newsPaperLib.retrieveLast();

        Vector<Newspaper> papers = new Vector<>();

        Stack<Video> videos = new Stack<>();

        HashMap<String, Newspaper> hashMap = new HashMap<>();
        Hashtable<String, Integer> hashTable = new Hashtable<>();
        for (Map.Entry<String, Newspaper> item :hashMap.entrySet()) {

        }

        for (Newspaper paperItem: papers) {
            System.out.println(paperItem);
        }
    }
}

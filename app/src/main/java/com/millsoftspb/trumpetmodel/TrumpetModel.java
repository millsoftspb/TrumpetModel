package com.millsoftspb.trumpetmodel;

import android.content.Context;
import android.media.MediaPlayer;

import java.util.HashMap;

public class TrumpetModel {
    MediaPlayer a4,b4,c4,d4,e4,f4,g4;
    String A4,B4,C4,D4,E4,F4,G4;
    HashMap<String,MediaPlayer> noteMap = new HashMap<>();

    public TrumpetModel(Context context) {

        //init NoteMap

        a4 = MediaPlayer.create(context,R.raw.a4);
        noteMap.put(A4,a4);
        b4 = MediaPlayer.create(context,R.raw.b4);
        noteMap.put(B4,b4);
        c4 = MediaPlayer.create(context,R.raw.c4);
        noteMap.put(C4,c4);
        d4 = MediaPlayer.create(context,R.raw.d4);
        noteMap.put(D4,d4);
        e4 = MediaPlayer.create(context,R.raw.e4);
        noteMap.put(E4,e4);
        f4 = MediaPlayer.create(context,R.raw.f4);
        noteMap.put(F4,f4);
        g4 = MediaPlayer.create(context,R.raw.g4);
        noteMap.put(G4,g4);

    }

    public void play(String note){
        switch (note) {
            case (A4): {
                a4.prepare();
                a4.start();
            }
        }
    }
}

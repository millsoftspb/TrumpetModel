package com.millsoftspb.trumpetmodel;

import android.content.Context;
import android.media.MediaPlayer;

import java.io.IOException;
import java.util.HashMap;

public class TrumpetModel {
    MediaPlayer currentMedia, a4, b4, c4, d4, e4, f4, g4;
    String currentNote, A4, B4, C4, D4, E4, F4, G4;
    HashMap<String, MediaPlayer> noteMap = new HashMap<>();

    public TrumpetModel(Context context) throws IOException {

        //init NoteMap

        a4 = MediaPlayer.create(context, R.raw.a4);
        a4.prepare();
        noteMap.put(A4, a4);
        b4 = MediaPlayer.create(context, R.raw.b4);
        b4.prepare();
        noteMap.put(B4, b4);
        c4 = MediaPlayer.create(context, R.raw.c4);
        c4.prepare();
        noteMap.put(C4, c4);
        d4 = MediaPlayer.create(context, R.raw.d4);
        noteMap.put(D4, d4);
        e4 = MediaPlayer.create(context, R.raw.e4);
        noteMap.put(E4, e4);
        f4 = MediaPlayer.create(context, R.raw.f4);
        noteMap.put(F4, f4);
        g4 = MediaPlayer.create(context, R.raw.g4);
        noteMap.put(G4, g4);

        //init
        currentNote = "A4";
        currentMedia = a4;

    }

    public void play(String note) throws IOException {
        if (currentNote != note & !currentMedia.isPlaying()) {
            switch (note) {
                case "A4": {
                    currentMedia.stop();
                    a4.prepare();
                    a4.start();
                    currentNote = "A4";
                    currentMedia = a4;
                    break;
                }
                case "B4": {
                    currentMedia.stop();
                    b4.prepare();
                    b4.start();
                    currentNote = "B4";
                    currentMedia = b4;
                    break;
                }
                case "C4": {
                    currentMedia.stop();
                    c4.prepare();
                    c4.start();
                    currentNote = "C4";
                    currentMedia = c4;
                    break;
                }
                case "D4": {
                    currentMedia.stop();
                    d4.prepare();
                    d4.start();
                    currentNote = "D4";
                    currentMedia = d4;
                    break;
                }
                case "E4": {
                    currentMedia.stop();
                    e4.prepare();
                    e4.start();
                    currentNote = "E4";
                    currentMedia = e4;
                    break;
                }
                case "F4": {
                    currentMedia.stop();
                    f4.prepare();
                    f4.start();
                    currentNote = "F4";
                    currentMedia = f4;
                    break;
                }
                case "G4": {
                    currentMedia.stop();
                    g4.prepare();
                    g4.start();
                    currentNote = "G4";
                    currentMedia = g4;
                    break;
                }
            }
        }
    }
}

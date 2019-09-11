package com.arra.sub43_mynotesapp;

import com.arra.sub43_mynotesapp.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}

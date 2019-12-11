package com.example.tosterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void show(Context context, String message) {

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

    }

}

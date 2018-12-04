package com.vignesh2514.tosting;

import android.content.Context;
import android.widget.Toast;

public class Ding {

    public static void s(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();


    }

    public static void l(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_LONG).show();

    }
}

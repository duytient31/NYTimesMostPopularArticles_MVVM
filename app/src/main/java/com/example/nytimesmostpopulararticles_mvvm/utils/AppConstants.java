package com.example.nytimesmostpopulararticles_mvvm.utils;

import com.example.nytimesmostpopulararticles_mvvm.BuildConfig;

public final class AppConstants {

    public static final String DB_NAME = BuildConfig.APPLICATION_ID + ".db";

    public static final String PREF_NAME = BuildConfig.APPLICATION_ID + "_pref";

    public static final String ARTICLE = "article";

    public static final int VIEW_TYPE_EMPTY = 0;

    public static final int VIEW_TYPE_NORMAL = 1;

    private AppConstants() {
        // This utility class is not publicly instantiable
    }
}

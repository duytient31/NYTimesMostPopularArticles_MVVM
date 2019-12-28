package com.example.nytimesmostpopulararticles_mvvm.data.local.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.nytimesmostpopulararticles_mvvm.di.PreferenceInfo;

import javax.inject.Inject;

public class AppPreferencesHelper implements PreferencesHelper {

    private final SharedPreferences mPrefs;

    @Inject
    public AppPreferencesHelper(Context context, @PreferenceInfo String prefFileName) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }
}
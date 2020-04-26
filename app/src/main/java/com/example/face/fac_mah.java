package com.example.face;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class fac_mah {



    private static final String SHARED_PREF_NAME = "simplifiedcodingsharedpref";
    private static final String KEY_USERNAME = "keyusername";
    private static final String KEY_EMAIL = "keyemail";
    private static final String KEY_GENDER = "keygender";
    private static final String KEY_ID = "keyid";


    private static fac_mah mInstance;
    public static Context mCtx;


    private fac_mah(Context context) {
        mCtx = context;

    }


    public static synchronized fac_mah getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new fac_mah(context);
        }
        return mInstance;

    }

    public void logout() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        mCtx.startActivity(new Intent(mCtx, LoginActivity.class));
    }

}



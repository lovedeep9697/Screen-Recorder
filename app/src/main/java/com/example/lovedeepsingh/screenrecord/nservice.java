package com.example.lovedeepsingh.screenrecord;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import static com.example.lovedeepsingh.screenrecord.variable.mMediaProjection;
import static com.example.lovedeepsingh.screenrecord.variable.mMediaProjectionCallback;
import static com.example.lovedeepsingh.screenrecord.variable.mMediaRecorder;
import static com.example.lovedeepsingh.screenrecord.variable.mVirtualDisplay;

/**
 * Created by Lovedeep Singh on 5/4/2017.
 */

public class nservice extends Service {


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        variable.toggle.setChecked(false);
        mMediaRecorder.stop();
        mMediaRecorder.reset();
        stopScreenSharings();
        return super.onStartCommand(intent, flags, startId);
    }
    static public void stopScreenSharings() {
        if (mVirtualDisplay == null) {
            return;
        }
        mVirtualDisplay.release();
        //mMediaRecorder.release(); //If used: mMediaRecorder object cannot
        // be reused again
        destroyMediaProjections();
    }

    static private void destroyMediaProjections() {
        if (mMediaProjection != null) {
            mMediaProjection.unregisterCallback(mMediaProjectionCallback);
            mMediaProjection.stop();
            mMediaProjection = null;
        }
        Log.i(variable.TAG, "MediaProjection Stopped");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

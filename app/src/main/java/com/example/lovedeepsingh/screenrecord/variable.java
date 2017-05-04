package com.example.lovedeepsingh.screenrecord;

import android.hardware.display.VirtualDisplay;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.util.SparseIntArray;
import android.widget.ToggleButton;

/**
 * Created by Lovedeep Singh on 5/4/2017.
 */

public class variable {
    public static int i=0;
    public static ToggleButton toggle = null;
    public static final String TAG = "MainActivity";
    public static final int REQUEST_CODE=1000;
    public static int mScreenDensity;
    public static MediaProjectionManager mProjectionManager;
    public static final int DISPLAY_WIDTH = 720;
    public static final int DISPLAY_HEIGHT = 1280;
    static public MediaProjection mMediaProjection;
    static public VirtualDisplay mVirtualDisplay;
    static public MainActivity.MediaProjectionCallback mMediaProjectionCallback;
    public static ToggleButton mToggleButton;
    public static MediaRecorder mMediaRecorder;
    public static final SparseIntArray ORIENTATIONS = new SparseIntArray();
    public static final int REQUEST_PERMISSIONS = 10;



}

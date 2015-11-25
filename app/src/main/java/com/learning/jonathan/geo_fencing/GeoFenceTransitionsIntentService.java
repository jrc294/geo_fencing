package com.learning.jonathan.geo_fencing;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.GeofencingEvent;

/**
 * Created by jonathan.cook on 11/24/2015.
 */
public class GeoFenceTransitionsIntentService extends IntentService {

    protected static final String TAG = "gfservice";

    public GeoFenceTransitionsIntentService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        // Handling an intent
        // Nice job
        GeofencingEvent geofencingEvent = GeofencingEvent.fromIntent(intent);
        if (geofencingEvent.hasError()) {
            String errorMessage = GeofenceStatusCodes.getStatusCodeString(geofencingEvent.getErrorCode());
            Log.e(TAG, errorMessage);
            return;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}

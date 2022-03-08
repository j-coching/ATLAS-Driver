/*package com.example.atlasdriver;

import android.content.Context;
import android.hardware.Camera;
import android.net.Uri;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.VideoView;

import androidx.annotation.NonNull;

public class ShowCamera extends SurfaceView implements SurfaceHolder.Callback
{
    Camera camera;
    SurfaceHolder holder;
    View view;
    VideoView vv;
    VideoView videoView;

    public ShowCamera(Context context, Camera camera) {
        super(context);
        this.camera = camera;
        holder = getHolder();
        holder.addCallback(this);

    }


    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {
        Camera.Parameters params = camera.getParameters();

        if(this.getResources()).getConfiguration().orientation
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

    }
}
*/
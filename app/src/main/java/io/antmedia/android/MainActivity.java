package io.antmedia.android;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.antmedia.android.liveVideoBroadcaster.*;
import io.antmedia.android.liveVideoBroadcaster.R;
import io.antmedia.android.liveVideoPlayer.LiveVideoPlayerActivity;
import io.antmedia.android.liveVideoPlayer.LiveVideoPlayerFragment;

public class MainActivity extends AppCompatActivity {

    /**
     * PLEASE WRITE RTMP BASE URL of the your RTMP SERVER.
     */
//    public static final String RTMP_BASE_URL = "rtmp://85.185.90.243/live/";
    public static final String RTMP_BASE_URL = "";

    public static final String RTMP_URL_POSTFIX = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(io.antmedia.android.liveVideoBroadcaster.R.layout.activity_main);

        LiveVideoBroadcasterFragment broadcastFragment = new LiveVideoBroadcasterFragment();

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame , broadcastFragment);

        LiveVideoPlayerFragment playerFragment1 = new LiveVideoPlayerFragment();
        ft.replace(R.id.frame1 , playerFragment1);

        LiveVideoPlayerFragment playerFragment2 = new LiveVideoPlayerFragment();
        ft.replace(R.id.frame2 , playerFragment2);
        ft.commit();
    }
}

package com.example.wt.lithoinappbarsample;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.Size;
import com.facebook.litho.annotations.MountSpec;
import com.facebook.litho.annotations.OnCreateMountContent;
import com.facebook.litho.annotations.OnMeasure;
import com.facebook.litho.annotations.OnMount;
import com.facebook.litho.annotations.OnUnmount;
import com.facebook.litho.annotations.State;
import com.facebook.litho.utils.MeasureUtils;

/**
 * VideoComponentSpec
 *
 * @author wt
 * @create 2020-06-19 14:21
 */
@MountSpec
public class VideoComponentSpec {

    @OnCreateMountContent
    static VideoView onCreateMountContent(Context c) {
        return new VideoView(c);
    }

    @OnMount
    static void onMount(final ComponentContext c, VideoView videoView) {
        videoView.setVideoPath("https://www.w3school.com.cn/example/html5/mov_bbb.mp4");
        videoView.start();
    }

    @OnUnmount
    static void onUnMount(ComponentContext c, VideoView videoView) {
        videoView.pause();
    }

    @OnMeasure
    static void onMeasure(ComponentContext c, ComponentLayout layout, int widthSpec, int heightSpec, Size outputSize) {
        MeasureUtils.measureWithAspectRatio(widthSpec, heightSpec, 1.78f, outputSize);
    }
}

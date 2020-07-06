package com.example.wt.lithoinappbarsample;

import android.graphics.Color;

import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaEdge;

/**
 * HeadComponentSpec
 *
 * @author wt
 * @create 2020-06-19 11:24
 */
@LayoutSpec
public class HeadComponentSpec {

    @OnCreateLayout
    static Component onCreateLayout(ComponentContext c) {
        return Column.create(c)
                .marginDip(YogaEdge.HORIZONTAL, 15)
                .child(Text.create(c)
                        .extraSpacingDip(5)
                        .textColor(Color.BLACK)
                        .textSizeDip(15)
                        .textRes(R.string.large_text_1)
                        .build())
                .child(VideoComponent.create(c)
                        .build())
                .child(Text.create(c)
                        .extraSpacingDip(5)
                        .textColor(Color.BLACK)
                        .textSizeDip(15)
                        .textRes(R.string.large_text_2)
                        .build())
                .build();
    }
}

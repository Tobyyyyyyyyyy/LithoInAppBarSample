package com.example.wt.lithoinappbarsample;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.facebook.litho.ComponentContext;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * ScrollingActivity
 *
 * @author wt
 * @create 2020-06-22 16:39
 */
public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        final MyLithoView lithoView = findViewById(R.id.head_container);
        AppBarLayout appBar = findViewById(R.id.app_bar);

        ComponentContext c = new ComponentContext(ScrollingActivity.this);
        lithoView.setComponent(HeadComponent.create(c)
                .build());
        appBar.addOnOffsetChangedListener(new AppBarLayout.BaseOnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                lithoView.notifyVisibleBoundsChanged();
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // fix
                lithoView.setBlockLayoutNotify(true);
            }
        });
    }
}

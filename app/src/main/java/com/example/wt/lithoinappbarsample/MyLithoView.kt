package com.example.wt.lithoinappbarsample

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView

/**
 * MyLithoView
 *
 * @author wt
 * @create 2020-06-24 16:00
 */
class MyLithoView : LithoView {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: ComponentContext?) : super(context)
    constructor(
        context: ComponentContext?,
        useExtensions: Boolean,
        delegateToRenderCore: Boolean
    ) : super(context, useExtensions, delegateToRenderCore)

    constructor(context: ComponentContext?, attrs: AttributeSet?) : super(context, attrs)
    constructor(
        context: ComponentContext?,
        attrs: AttributeSet?,
        useExtensions: Boolean,
        delegateToRenderCore: Boolean
    ) : super(context, attrs, useExtensions, delegateToRenderCore)

    var blockLayoutNotify = false

    override fun notifyVisibleBoundsChanged() {
        // block when appbar in layout what make mLithoView.getLocalVisibleRect get error rect
        if (blockLayoutNotify && !shouldRequestLayout()) {
            return
        }
        super.notifyVisibleBoundsChanged()
    }

    override fun offsetTopAndBottom(offset: Int) {
        // block when appbar offset when zero
        if (blockLayoutNotify && offset == 0) {
            return
        }
        super.offsetTopAndBottom(offset)
    }

    override fun offsetLeftAndRight(offset: Int) {
        if (blockLayoutNotify && offset == 0) {
            return
        }
        super.offsetLeftAndRight(offset)
    }
}
package com.victorai60.dialogfragment;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int resultWidth = 0, resultHeight = 0;
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        if (widthMode == MeasureSpec.EXACTLY) {
            resultWidth = widthSize;
        }
        if (heightMode == MeasureSpec.EXACTLY) {
            resultHeight = heightSize;
        }
        setMeasuredDimension(resultWidth, resultHeight);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        return super.dispatchTouchEvent(event);
    }
}

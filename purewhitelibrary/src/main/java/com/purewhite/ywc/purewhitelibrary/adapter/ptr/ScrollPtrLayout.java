package com.purewhite.ywc.purewhitelibrary.adapter.ptr;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.purewhite.ywc.purewhitelibrary.R;

/**
 * //解决与viewpager使用的时候滑动冲突
 * @author yuwenchao
 */
public class ScrollPtrLayout extends PtrLayout{

    //上一次x,y的位置；
    private float lastX,lastY;
    private boolean scroll=true;

    public ScrollPtrLayout(Context context) {
        this(context,null);
    }

    public ScrollPtrLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ScrollPtrLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initView(attrs);
    }

    private void initView(AttributeSet attrs) {
        if (attrs!=null)
        {
            TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ScrollPtrLayout);
            scroll = typedArray.getBoolean(R.styleable.ScrollPtrLayout_scroll_ptr, true);
            typedArray.recycle();
        }
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (scroll)
        {
            switch (ev.getAction())
            {
                case MotionEvent.ACTION_DOWN:
                    lastX=ev.getX();
                    lastY=ev.getY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    final float afterX = ev.getX();
                    final float afterY = ev.getY();
                    float moveX = Math.abs(afterX - lastX);
                    float moveY = Math.abs(afterY - lastY);
                    //如果x移动大于y移动就拦截
                    if (moveX>moveY)
                    {
                        return false;
                    }
                    break;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

}

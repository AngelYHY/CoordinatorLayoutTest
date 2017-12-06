package vip.freestar.coordinatorlayouttest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/**
 * 描述：
 * 作者：一颗浪星
 * 日期：2017/12/6
 * github：
 */

public class TempView extends AppCompatTextView {

    private int mSlop;
    private float mLastX;
    private float mLastY;

    public TempView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TempView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        setClickable(true);

        mSlop = ViewConfiguration.getTouchSlop();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // return super.onTouchEvent(event);
        int action = event.getAction();

        switch (action) {
            case MotionEvent.ACTION_DOWN:
                mLastX = event.getX();
                mLastY = event.getY();
                break;

            case MotionEvent.ACTION_MOVE:
                int deltax = (int) (event.getX() - mLastX);
                int deltay = (int) (event.getY() - mLastY);
                if (Math.abs(deltax) > mSlop || Math.abs(deltay) > mSlop) {
                    ViewCompat.offsetTopAndBottom(this, deltay);
                    ViewCompat.offsetLeftAndRight(this, deltax);
                    mLastX = event.getX();
                    mLastY = event.getY();
                }

                break;

            case MotionEvent.ACTION_UP:
                mLastX = event.getX();
                mLastY = event.getY();
                break;

            default:
                break;

        }

        return true;
    }
}

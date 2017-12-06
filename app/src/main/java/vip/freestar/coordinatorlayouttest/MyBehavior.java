package vip.freestar.coordinatorlayouttest;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * 描述：
 * 作者：一颗浪星
 * 日期：2017/12/6
 * github：
 */

public class MyBehavior extends CoordinatorLayout.Behavior<Button> {

    public MyBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, Button child, View dependency) {
        //如果dependency 是 TempView 的实例，说明它就是我们所需要的Dependency
        return dependency instanceof TempView;
    }

    //每次dependency位置发生变化，都会执行onDependentViewChanged方法
    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, Button btn, View dependency) {

        //根据dependency的位置，设置Button的位置

        int dependBottom = dependency.getBottom();

        btn.setY(dependBottom + 50);
        btn.setX(dependency.getLeft());
        return true;
    }


}

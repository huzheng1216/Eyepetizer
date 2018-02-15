package com.moment.eyepetizer.utils;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by moment on 2018/2/14.
 */

public class FooterBehavior extends CoordinatorLayout.Behavior<View> {

    public FooterBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    //确定所提供的子视图是否有另一个特定的同级视图作为布局从属。
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        //这个方法是说明这个子控件是依赖AppBarLayout的
        return dependency instanceof AppBarLayout;
    }

    //用于响应从属布局的变化
    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        int delta = dependency.getTop();
        child.setTranslationY(-delta);
        return true;
    }
}

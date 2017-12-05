package vip.freestar.coordinatorlayouttest;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * 描述：
 * 作者：一颗浪星
 * 日期：2017/12/5
 * github：
 */

public class MyAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public MyAdapter(@Nullable List<String> data) {
        super(R.layout.rv, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.name, item);
    }

}

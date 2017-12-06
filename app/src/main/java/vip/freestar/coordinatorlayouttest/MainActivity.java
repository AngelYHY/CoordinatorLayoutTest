package vip.freestar.coordinatorlayouttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    private List<String> mName;
    private Class[] mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecyclerView.setAdapter(new MyAdapter(mName));
        mRecyclerView.addOnItemTouchListener(new OnItemClickListener() {
            @Override
            public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {
                if (mActivity[position] != null) {
                    startActivity(new Intent(MainActivity.this, mActivity[position]));
                }
            }
        });
    }

    private void init() {
        getName();
        mActivity = new Class[mName.size()];
//        mActivity[3] = ParallaxActivity.class;
        mActivity[3] = ScrollingDemoActivity.class;
        mActivity[mName.size() - 1] = BehaviorActivity.class;
    }

    private void getName() {
        mName = new ArrayList<>();
        mName.add("ToolBar Snap");
        mName.add("toolBar的收缩与扩展");
        mName.add("ViewPager特效");
        mName.add("ViewPager视觉特差效果");
        mName.add("viewpager_new");
        mName.add("ViewPager视觉特差效果Snap");
        mName.add("FoloatingActionButton Sample ");
        mName.add("FoloatingActionButton horizontal Sample ");
        mName.add("仿知乎底部");
        mName.add("知乎首页");
        mName.add("仿简书");
        mName.add("CardViewSample");
        mName.add("DrawlayoutSample");
        mName.add("BottomSheetSample");
        mName.add("仿照微博例子");
        mName.add("behavior");
    }
}

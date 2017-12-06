package vip.freestar.coordinatorlayouttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ScrollingDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_demo);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new MyAdapter(getName()));

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    private List<String> getName() {
        List<String> mName = new ArrayList<>();
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
        return mName;
    }
}

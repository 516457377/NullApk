package com.lh.nullapk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.lh.nullapk.R;

import org.xutils.view.annotation.Event;
import org.xutils.x;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    //    @ViewInject(R.id.button)
//    private Button button;
    private static final String TAG = "FullscreenActivity";

    //声明
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: " + getTaskId());
        setContentView(R.layout.activity_fullscreen);
        x.view().inject(this);
//        mRecyclerView = (RecyclerView) findViewById(R.id.recy);
//        RecyAdapter adapter = new RecyAdapter(this);
//        mRecyclerView.setAdapter(adapter);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Event(value = {R.id.button, R.id.button2})
    private void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:

                Intent intent = new Intent("on.my.recriver");
                sendBroadcast(intent);
//                intent.addCategory("is.category");
//                startActivity(intent);
                break;
            case R.id.button2:
                startActivity(new Intent(this, Main2Activity.class));
                break;
        }

    }
}

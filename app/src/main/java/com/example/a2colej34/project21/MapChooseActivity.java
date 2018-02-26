package com.example.a2colej34.project21;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

/**
 * Created by 2colej34 on 05/02/2018.
 */

public class MapChooseActivity extends AppCompatActivity implements View.OnClickListener {
    public void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_choose);

        Button regularBtn = (Button)findViewById(R.id.btnRegular),
                hikeBikeBtn = (Button)findViewById(R.id.btnHikeBikeMap);
        regularBtn.setOnClickListener(this);
        hikeBikeBtn.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        boolean hikeBike = false;
        if(view.getId() == R.id.btnHikeBikeMap)
        {
            hikeBike = true;
        }
        Intent intent = new Intent();
        Bundle returnData = new Bundle();
        returnData.putBoolean("com.example.a2colej34.project21.hikebike",hikeBike);
        intent.putExtras(returnData);
        setResult(RESULT_OK, intent);
        finish();
    }
}

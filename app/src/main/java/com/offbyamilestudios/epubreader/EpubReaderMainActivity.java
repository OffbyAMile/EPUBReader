package com.offbyamilestudios.epubreader;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toolbar;

public class EpubReaderMainActivity extends Activity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epub_reader_main);

        //Call Toolbar and set for action bar substitute
        mToolbar = findViewById(R.id.toolbar);
        setActionBar(mToolbar);

    }
}

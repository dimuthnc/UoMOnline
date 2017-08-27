package lk.ac.mrt.uom.uomonline.ui;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import lk.ac.mrt.uom.uomonline.R;
import lk.ac.mrt.uom.uomonline.model.ArticleMinified;

public class NewsReadActivity extends AppCompatActivity {

    private CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_read);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArticleMinified articleMinified = (ArticleMinified) getIntent().getExtras().get("Article");
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        if (articleMinified.getTitle() !=null ){
            collapsingToolbarLayout.setTitle(articleMinified.getTitle());


        }
    }
}
package com.example.gr.myapplication3;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    TextView tvSeter;

    public final int[] images = new int[] { R.drawable.ic_sentiment_satisfied,R.drawable.ic_sentiment_dissatisfied,R.drawable.ic_sentiment_very_satisfied};
    public final String[] emojis = new String[]{":-)", ":-(", ":-D" };
    public final String[] _strEmoticonLabels = new String[] { "Happy", "Sad","VeryHappy", };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.emj1);
        tv1.setText("\ud83d\ude01");

        TextView tv2 = (TextView) findViewById(R.id.emj2);
        tv2.setText("\ud83d\ude02");

        TextView tv3 = (TextView) findViewById(R.id.emj3);
        tv3.setText("\ud83d\ude03");

        tvSeter = (TextView) findViewById(R.id.textView5);

        TextView tvhtml = (TextView) findViewById(R.id.tvHtml);

        String htmlText = "Hai <b>Vvasia</b> <img src=\"ic_sentiment_satisfied\"> Hello";

        //tvhtml.setText(Html.fromHtml(htmlText, new Html.ImageGetter()) );

        tvhtml.setText(Html.fromHtml(htmlText, new Html.ImageGetter() {

            @Override
            public Drawable getDrawable(String source) {
                int resourceId = getResources().getIdentifier(source, "drawable",getPackageName());
                Drawable drawable = getResources().getDrawable(resourceId);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                return drawable;
            }
        }, null));


    }


    // ---------- КНОПКИ --------------
    public void onAdd2Chat(View v){

        tvSeter.setText(((TextView) v).getText());

    }

}

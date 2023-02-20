package bd.com.bangal.bangalmasterpack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import bd.com.bangal.masterpacklib.ReactionPopup;
import bd.com.bangal.masterpacklib.ReactionsConfigBuilder;
import bd.com.bangal.socialviewcore.widget.SocialEditText;

public class TestActivity extends AppCompatActivity {

    SocialEditText bg_text,postText;

    private final String[] strings = {"wow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        sampleCenterLeft();
    }

        private void sampleCenterLeft() {
        ReactionPopup popup = new ReactionPopup(
                this,
                new ReactionsConfigBuilder(this)
                        .withReactions(new int[]{
                                R.drawable.ic_fb_wow,
                        })
                        .withReactionTexts(position -> strings[position])
                        .build());

        findViewById(R.id.facebook_btn).setOnTouchListener(popup);
    }
}
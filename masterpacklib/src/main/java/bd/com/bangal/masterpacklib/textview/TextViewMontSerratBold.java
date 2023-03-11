package bd.com.bangal.masterpacklib.textview;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class TextViewMontSerratBold extends AppCompatTextView {
    public TextViewMontSerratBold(Context context) {
        super(context);
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Montserrat_Bold.ttf"));
    }

    public TextViewMontSerratBold(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Montserrat_Bold.ttf"));
    }

    public TextViewMontSerratBold(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Montserrat_Bold.ttf"));
    }

}


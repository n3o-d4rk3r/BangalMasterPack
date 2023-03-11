package bd.com.bangal.masterpacklib.textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class TextViewMontSerratRegular extends AppCompatTextView {
    public TextViewMontSerratRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextViewMontSerratRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewMontSerratRegular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/montserrat_regular.ttf");
            setTypeface(tf);
        }
    }


}

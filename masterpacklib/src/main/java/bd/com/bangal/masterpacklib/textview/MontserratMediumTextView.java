package bd.com.bangal.masterpacklib.textview;

import android.content.Context;
import android.graphics.Typeface;

import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class MontserratMediumTextView extends AppCompatTextView {
    public MontserratMediumTextView(Context context) {
        super(context);
        setTypeface(Typeface.createFromAsset(context.getAssets(), "Montserrat_Medium.ttf"));
    }

    public MontserratMediumTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setTypeface(Typeface.createFromAsset(context.getAssets(), "Montserrat_Medium.ttf"));
    }

    public MontserratMediumTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(Typeface.createFromAsset(context.getAssets(), "Montserrat_Medium.ttf"));
    }

}

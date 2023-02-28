package bd.com.bangal.bangalmasterpack

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import bd.com.bangal.bangalmasterpack.databinding.ActivityMainBinding
import bd.com.bangal.masterpacklib.CameraVideoButton
import bd.com.bangal.masterpacklib.ReactionPopup
import bd.com.bangal.masterpacklib.ReactionsConfigBuilder
import bd.com.bangal.masterpacklib.toast.MotionToast
import bd.com.bangal.masterpacklib.toast.MotionToastStyle

class MainActivity : AppCompatActivity(), View.OnClickListener,
    CompoundButton.OnCheckedChangeListener {

    private lateinit var binding: ActivityMainBinding
    private val strings = arrayOf("wow")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.successBtn.setOnClickListener(this)

    }

        private fun setToastColors(newColorsEnabled: Boolean) {
        if (newColorsEnabled) {
            MotionToast.setSuccessBackgroundColor(R.color.success_bg_color)
            MotionToast.setErrorBackgroundColor(R.color.error_bg_color)
            MotionToast.setDeleteBackgroundColor(R.color.delete_bg_color)
            MotionToast.setWarningBackgroundColor(R.color.warning_bg_color)
            MotionToast.setInfoBackgroundColor(R.color.info_bg_color)
        } else {
            MotionToast.resetToastColors()
        }
    }

        override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.successBtn -> {
                MotionToast.createColorToast(
                    this,
                    "Post create 😍",
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                    MotionToastStyle.SUCCESS,
                    MotionToast.GRAVITY_BOTTOM,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.futurabold)
                )
            }
        }
    }

        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        setToastColors(isChecked)
    }

}

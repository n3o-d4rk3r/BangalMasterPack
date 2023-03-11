package bd.com.bangal.bangalmasterpack

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import bd.com.bangal.bangalmasterpack.databinding.ActivityMainBinding
import bd.com.bangal.masterpacklib.CameraVideoButton
import bd.com.bangal.masterpacklib.ReactionPopup
import bd.com.bangal.masterpacklib.ReactionsConfigBuilder
import bd.com.bangal.masterpacklib.tablayout.RoundTabLayout
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

        val adapter = ViewAdapter(supportFragmentManager)

        val viewPager = findViewById(R.id.view_pager_circle) as ViewPager
        viewPager.adapter = adapter

        val tabView = findViewById(R.id.circle_tab_view) as RoundTabLayout
        tabView.setupWithViewPager(viewPager)

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

        private inner class ViewAdapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getPageTitle(position: Int): CharSequence? {
            when (position) {
                0 -> return "All"
                1 -> return "Articles"
                2 -> return "Interviews"
                3 -> return "News"
                4 -> return "Events"
                5 -> return "Links"
                else -> return null
            }
        }

        override fun getItem(position: Int): Fragment {
            val fragment = HomeFragment()
            val bundle = Bundle()
            bundle.putCharSequence("title", getPageTitle(position))
            fragment.arguments = bundle
            return fragment
        }

        override fun getCount() = 6
    }

}

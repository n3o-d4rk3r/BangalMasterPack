package bd.com.bangal.bangalmasterpack

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import bd.com.bangal.masterpacklib.CameraVideoButton
import bd.com.bangal.masterpacklib.ReactionPopup
import bd.com.bangal.masterpacklib.ReactionsConfigBuilder

class MainActivity : AppCompatActivity() {

    private val strings = arrayOf("wow")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

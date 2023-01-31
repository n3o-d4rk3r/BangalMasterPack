package bd.com.bangal.bangalmasterpack

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import bd.com.bangal.masterpacklib.CameraVideoButton

class VideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val videoRecordButton = findViewById<CameraVideoButton>(R.id.button)
        videoRecordButton.setVideoDuration(10000)
        videoRecordButton.actionListener = object : CameraVideoButton.ActionListener {
            override fun onCancelled() {
                Log.v("TEST", "onCancelled")
            }

            override fun onStartRecord() {
                Log.v("TEST", "onStartRecord")
            }

            override fun onEndRecord() {
                Log.v("TEST", "onEndRecord")
            }

            override fun onDurationTooShortError() {
                Log.v("TEST", "onDurationTooShortError")
            }

            override fun onSingleTap() {
                Log.v("TEST", "onSingleTap")
            }

        }

        Handler().postDelayed(Runnable {
            videoRecordButton.cancelRecording()
        }, 5000)
    }
}

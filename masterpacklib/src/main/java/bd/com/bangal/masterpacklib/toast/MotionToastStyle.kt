package bd.com.bangal.masterpacklib.toast

import java.util.*

enum class MotionToastStyle {
    SUCCESS, ERROR, WARNING, INFO, DELETE, NO_INTERNET;

    fun getName(): String {
        if (this.name.contains("_")) {
            return this.name.replaceFirst("_", " ")
        }
        return this.name
    }
}
package com.facebook.flipper.android.utils

import android.content.Context

/**
 *
 * @author petterp
 */
class FlipperUtils {
    companion object {
        @JvmStatic
        fun shouldEnableFlipper(context: Context): Boolean {
            return false
        }
    }
}

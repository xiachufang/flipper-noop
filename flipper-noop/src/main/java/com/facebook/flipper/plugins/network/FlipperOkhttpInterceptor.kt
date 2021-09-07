package com.facebook.flipper.plugins.network

import com.facebook.flipper.core.FlipperPlugin
import okhttp3.Interceptor
import okhttp3.Response

/**
 *
 * @author petterp
 */
class FlipperOkhttpInterceptor(val plugin: FlipperPlugin) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request())
    }
}

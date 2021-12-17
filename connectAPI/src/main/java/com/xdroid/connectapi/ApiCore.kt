package com.xdroid.connectapi

import android.database.Observable
import com.google.gson.JsonObject
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Url
import java.lang.reflect.GenericDeclaration
import java.util.*

class ApiCore {

    /**
     declares static object
     use companion object where static function is needed.

     */
    companion object {
        /** val datatype value
         *
         * cannot be changes and must be declared at initial
         * similar as final String TAG = "tag";
         * */
        val TAG = "APICore"

        /** var -> values can be changed similar to int L;
         * Retrofit? => declares that if there is no value for core return null
         * it return default value
          */
        var core: Retrofit? = null

        private val client: OkHttpClient? = null
        private val request: GenericDefinition? = null


       /** This for declareing post get method to request data from the server */
        interface GenericDefinition{

            @POST
            fun post(@Url url: String?,@Body request: JsonObject?): Observable<JsonObject?>?
            /**        passes url value that can null */
                                        /** Passes JsonObject that can be null <> return type
                                         *  Observable<JsonObject?>? it can return null value*/

        }

    }
}
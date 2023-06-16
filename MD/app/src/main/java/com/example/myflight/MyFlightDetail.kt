package com.example.myflight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.myflight.databinding.ActivityMyFlightDetailBinding
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import cz.msebera.android.httpclient.Header
import org.json.JSONObject

class MyFlightDetail : AppCompatActivity() {

    companion object {
        private val TAG = MyFlightDetail::class.java.simpleName
    }

    private lateinit var binding: ActivityMyFlightDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMyFlightDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        getPredict()
    }

    private fun getPredict() {
        val client = AsyncHttpClient()
        val url = "https://my-flight-388317.et.r.appspot.com/predict"
        client.get(url, object : AsyncHttpResponseHandler() {
            override fun onSuccess(statusCode: Int, headers: Array<Header>, responseBody: ByteArray) {
                // Jika koneksi berhasil
                val result = String(responseBody)
                Log.d(TAG, result)
                try {
                    val responseObject = JSONObject(result)
                    val predict = responseObject.getString("predict")
                    binding.TBSchedule.text = predict
                } catch (e: Exception) {
                    Toast.makeText(this@MyFlightDetail, e.message, Toast.LENGTH_SHORT).show()
                    e.printStackTrace()
                }

            }

            override fun onFailure(statusCode: Int, headers: Array<Header>, responseBody: ByteArray, error: Throwable) {
                // Jika koneksi gagal
                val errorMessage = when (statusCode) {
                    401 -> "$statusCode : Bad Request"
                    403 -> "$statusCode : Forbidden"
                    404 -> "$statusCode : Not Found"
                    else -> "$statusCode : ${error.message}"
                }
                Toast.makeText(this@MyFlightDetail, errorMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }
}
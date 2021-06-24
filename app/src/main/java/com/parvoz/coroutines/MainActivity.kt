package com.parvoz.coroutines

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.parvoz.coroutines.learn.errorhandling.exceptionhandler.ExceptionHandlerActivity
import com.parvoz.coroutines.learn.errorhandling.supervisor.IgnoreErrorAndContinueActivity
import com.parvoz.coroutines.learn.errorhandling.trycatch.TryCatchActivity
import com.parvoz.coroutines.learn.retrofit.parallel.ParallelNetworkCallsActivity
import com.parvoz.coroutines.learn.retrofit.series.SeriesNetworkCallsActivity
import com.parvoz.coroutines.learn.retrofit.single.SingleNetworkCallActivity
import com.parvoz.coroutines.learn.room.RoomDBActivity
import com.parvoz.coroutines.learn.task.onetask.LongRunningTaskActivity
import com.parvoz.coroutines.learn.task.twotasks.TwoLongRunningTasksActivity
import com.parvoz.coroutines.learn.timeout.TimeoutActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startSingleNetworkCallActivity(view: View) {
        startActivity(Intent(this@MainActivity, SingleNetworkCallActivity::class.java))
    }

    fun startSeriesNetworkCallsActivity(view: View) {
        startActivity(Intent(this@MainActivity, SeriesNetworkCallsActivity::class.java))
    }

    fun startParallelNetworkCallsActivity(view: View) {
        startActivity(Intent(this@MainActivity, ParallelNetworkCallsActivity::class.java))
    }

    fun startRoomDatabaseActivity(view: View) {
        startActivity(Intent(this@MainActivity, RoomDBActivity::class.java))
    }

    fun startTimeoutActivity(view: View) {
        startActivity(Intent(this@MainActivity, TimeoutActivity::class.java))
    }

    fun startTryCatchActivity(view: View) {
        startActivity(Intent(this@MainActivity, TryCatchActivity::class.java))
    }

    fun startExceptionHandlerActivity(view: View) {
        startActivity(Intent(this@MainActivity, ExceptionHandlerActivity::class.java))
    }

    fun startIgnoreErrorAndContinueActivity(view: View) {
        startActivity(Intent(this@MainActivity, IgnoreErrorAndContinueActivity::class.java))
    }

    fun startLongRunningTaskActivity(view: View) {
        startActivity(Intent(this@MainActivity, LongRunningTaskActivity::class.java))
    }

    fun startTwoLongRunningTasksActivity(view: View) {
        startActivity(Intent(this@MainActivity, TwoLongRunningTasksActivity::class.java))
    }

}

package com.parvoz.coroutines.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.parvoz.coroutines.data.api.ApiHelper
import com.parvoz.coroutines.data.local.DatabaseHelper
import com.parvoz.coroutines.learn.errorhandling.exceptionhandler.ExceptionHandlerViewModel
import com.parvoz.coroutines.learn.errorhandling.supervisor.IgnoreErrorAndContinueViewModel
import com.parvoz.coroutines.learn.errorhandling.trycatch.TryCatchViewModel
import com.parvoz.coroutines.learn.retrofit.parallel.ParallelNetworkCallsViewModel
import com.parvoz.coroutines.learn.retrofit.series.SeriesNetworkCallsViewModel
import com.parvoz.coroutines.learn.retrofit.single.SingleNetworkCallViewModel
import com.parvoz.coroutines.learn.room.RoomDBViewModel
import com.parvoz.coroutines.learn.task.onetask.LongRunningTaskViewModel
import com.parvoz.coroutines.learn.task.twotasks.TwoLongRunningTasksViewModel
import com.parvoz.coroutines.learn.timeout.TimeoutViewModel

class ViewModelFactory(private val apiHelper: ApiHelper, private val dbHelper: DatabaseHelper) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SingleNetworkCallViewModel::class.java)) {
            return SingleNetworkCallViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(SeriesNetworkCallsViewModel::class.java)) {
            return SeriesNetworkCallsViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(ParallelNetworkCallsViewModel::class.java)) {
            return ParallelNetworkCallsViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(RoomDBViewModel::class.java)) {
            return RoomDBViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(TimeoutViewModel::class.java)) {
            return TimeoutViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(TryCatchViewModel::class.java)) {
            return TryCatchViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(ExceptionHandlerViewModel::class.java)) {
            return ExceptionHandlerViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(LongRunningTaskViewModel::class.java)) {
            return LongRunningTaskViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(TwoLongRunningTasksViewModel::class.java)) {
            return TwoLongRunningTasksViewModel(apiHelper, dbHelper) as T
        }
        if (modelClass.isAssignableFrom(IgnoreErrorAndContinueViewModel::class.java)) {
            return IgnoreErrorAndContinueViewModel(apiHelper, dbHelper) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}
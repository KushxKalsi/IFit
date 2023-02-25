package pl.bk20.forest.core.domain.util

import java.time.Duration

interface Timer {

    fun schedule(task: TimerTask, delay: Long, period: Duration)

    fun cancel()
}
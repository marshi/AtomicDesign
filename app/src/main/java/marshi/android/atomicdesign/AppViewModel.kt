package marshi.android.atomicdesign

import androidx.lifecycle.ViewModel
import marshi.android.atomicdesign.domain.PlusInterface
import javax.inject.Inject

class AppViewModel @Inject constructor(private val plus: PlusInterface) : ViewModel() {
    fun plus(a: Int, b: Int) = plus.exec(a, b)
}

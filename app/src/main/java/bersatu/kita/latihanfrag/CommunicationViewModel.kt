package bersatu.kita.latihanfrag

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel: ViewModel() {

    //digunakan untuk mengirim data secara live  dengan nilai name
    private val mName = MutableLiveData<String>()
    private val mtinggal = MutableLiveData<String>()
    val name: LiveData<String>
        get() = mName
    val tingal : LiveData<String>
        get() = mtinggal

    fun setTinggal(tingal:String){
        mtinggal.value = tingal
    }

    fun setName(name: String) {
        mName.value = name
    }
}

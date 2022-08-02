package com.example.homework13

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class ItemViewModel : ViewModel() {

    val responseData: MutableLiveData<ItemModel2>? = null
    val errorMsg: MutableLiveData<String>? = null
    init {
        getDelivery()
    }

    private fun getDelivery(){
        viewModelScope.launch {
            val response = RetrofitClient.getDeliveryService().getItems()
            if (response.isSuccessful){
                responseData?.postValue(response.body())
            }else{
                errorMsg?.postValue(response.errorBody().toString())
            }

        }


    }
}
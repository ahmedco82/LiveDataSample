package com.ahmedco.viewmodellivedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {


    private MutableLiveData<Integer> count = new MutableLiveData<>();

    public CounterViewModel() {
        count.setValue(0);
    }

    public void setCount(int count) {
        this.count.setValue(count);
    }

    public MutableLiveData<Integer> getCount() {
        return count;
    }

}
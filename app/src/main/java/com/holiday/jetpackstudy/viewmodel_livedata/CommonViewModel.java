package com.holiday.jetpackstudy.viewmodel_livedata;

import androidx.lifecycle.ViewModel;

/**
 * 屏幕旋转、语言切换后能存活，但是如果被系统杀掉了，就要靠onSavedInstanceState、ViewModelSavedState
 * ViewModelSavedState：todo
 */
public class CommonViewModel extends ViewModel {
    public String text;

    @Override
    protected void onCleared() {
        super.onCleared();
        //可以在这里清理资源
//        QrLog.e("CommonViewModel - onCleared");
    }
}

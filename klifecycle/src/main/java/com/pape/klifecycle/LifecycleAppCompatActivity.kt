package com.pape.klifecycle

import android.support.v7.app.AppCompatActivity

/**
 * @project: LifecycleHelper
 * @description: //默认实现一个AppCompatActivity被观察者
 * @author zzy05 zhangzhanyong@feinno.com
 * @date 2017/7/21 13:11
 * @updateUser zzy05
 * @update 2017/7/21 13:11
 * @version V1.0
 */
abstract class LifecycleAppCompatActivity : AppCompatActivity(), LifecycleRegistryOwner {

    protected val lifecycleRegistry: LifecycleRegistry by lazy { LifecycleRegistry(this) }

    override fun getLifecycle(): LifecycleRegistry {
        return lifecycleRegistry
    }

}
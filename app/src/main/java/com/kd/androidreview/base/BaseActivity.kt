package com.kd.androidreview.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

/**
 * @创建者 ykd
 * @描述 基类
 */
abstract class BaseActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getLayoutId()?.let { id ->
            setContentView(id)
        }

        initParams()
        initObserver()
        initListener()
        initView()
    }

    @LayoutRes
    abstract fun getLayoutId() :Int?

    fun initParams(){}

    abstract fun initObserver()

    abstract fun initListener()

    abstract fun initView()
}

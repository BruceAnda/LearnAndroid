package com.example.zhaoliang.learnandroid.activities.base

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.zhaoliang.learnandroid.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 基类列表Activity
 */
abstract class BaseListActivity : BaseActivity(), AdapterView.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list_view.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fillData())
        list_view.onItemClickListener = this
    }

    /**
     * 填充列表数据
     */
    abstract fun fillData(): Array<out String>?
}

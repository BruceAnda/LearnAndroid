package com.example.zhaoliang.learnandroid.activities

import android.view.View
import android.widget.AdapterView
import com.example.zhaoliang.learnandroid.R
import com.example.zhaoliang.learnandroid.activities.base.BaseListActivity

class MainActivity : BaseListActivity() {

    /**
     * 填充主界面列表数据
     */
    override fun fillData(): Array<out String>? {
        return resources.getStringArray(R.array.MainListDatas)
    }

    /**
     * 主界面列表项点击事件
     */
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        when (position) {
            0 -> println("你点击了" + position)
            1 -> println("你点击了" + position)
            2 -> println("你点击了" + position)
            3 -> println("你点击了" + position)
            4 -> println("你点击了" + position)
            5 -> println("你点击了" + position)
            6 -> println("你点击了" + position)
            7 -> println("你点击了" + position)
            8 -> println("你点击了" + position)
            9 -> println("你点击了" + position)
            10 -> println("你点击了" + position)
            else -> {
                println("特殊情况")
            }
        }
    }
}

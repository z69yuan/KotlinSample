package com.murk

import com.murk.annatation.apply.JvmUsage
import com.murk.annatation.apply.MkList

/**
 * main函数
 *
 * @author zfc on 1/17/23
 */

fun main() {
    println("hello world")
    MkList.doTest()
    JvmUsage.convertToString(MkList)
}
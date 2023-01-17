@file:JvmName("MkList")
package com.murk.annatation.apply

/**
 * Deprecated注解使用
 *
 * @author zfc on 1/17/23
 */

object MkList {

    @Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
    fun remove(index: Int) {
        println("remove method called , $index")
    }


    fun removeAt(index: Int) {
        println("removeAt method called , $index")
    }

    fun doTest() {
        remove(0)
    }

}
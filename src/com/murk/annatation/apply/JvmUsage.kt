package com.murk.annatation.apply

/**
 *
 *
 * @author zfc on 1/17/23
 */
class JvmUsage {

    companion object {
        @JvmName("MkListToString")
        @JvmStatic
        fun convertToString(list:MkList):String{
            return list.toString()
        }
    }

}
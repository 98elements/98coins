@file:JvmName("Main")

package com._98elements._98coins

import com._98elements._98coins.core.Blockchain

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val theBlockchain = Blockchain()
        val newBlockchain = theBlockchain.mineBlock(data = "1")
        val anotherBlockchain = newBlockchain.mineBlock(data = "2")

        println("Blockchain = $anotherBlockchain")
    }
}

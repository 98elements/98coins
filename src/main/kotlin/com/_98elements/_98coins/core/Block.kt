package com._98elements._98coins.core

import java.time.Instant

data class Block(val hash: String, val previousHash: String, val data: String, val timestamp: Long = Instant.now().epochSecond) {
    companion object {
        private const val GENESIS_HASH = "0000000000000000000000000000000000000000000000000000000000000000"
        private const val GENESIS_DATA = "<<genesis>>"
        private const val GENESIS_TIMESTAMP = 0L

        fun genesis(): Block {
            val newHash = BlockHash.calculate(GENESIS_HASH, GENESIS_DATA, GENESIS_TIMESTAMP)

            return Block(hash = newHash, previousHash = GENESIS_HASH, data = GENESIS_DATA, timestamp = GENESIS_TIMESTAMP)
        }
    }
}

package com._98elements._98coins.core

import com._98elements._98coins.hashing.SHA256Hash

object BlockHash {
    fun calculate(previousHash: String, data: String, timestamp: Long) =
            SHA256Hash.calculate("$previousHash$data$timestamp")
}
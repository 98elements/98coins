package com._98elements._98coins.core

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object BlockHashSpec: Spek({
    describe("calculating hash") {
        it("computes correct checksum") {
            val previousHash = "0".repeat(64)
            val data = "I'm a block"
            val timestamp = 0L

            val expectedHash = "8200b1526020e1d498959854a2d17cb8359ff0853d340505273dbf12a5b34ed1"

            assertEquals(expectedHash, BlockHash.calculate(previousHash, data, timestamp))
        }
    }
})

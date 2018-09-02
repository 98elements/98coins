package com._98elements._98coins.core

import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object BlockchainSpeck: Spek({
    describe("creating blockchain") {
        it("has genesis block in it") {
            val newBlockchain = Blockchain()

            assertAll(
                    { assertEquals(1, newBlockchain.blocks.size) },
                    { assertEquals(Block.genesis(), newBlockchain.blocks.first()) }
            )
        }
    }
})


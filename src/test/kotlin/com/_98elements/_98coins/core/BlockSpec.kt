package com._98elements._98coins.core

import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object BlockSpec : Spek({
    describe("creating genesis block") {
        it("sets up all fields correctly") {
            val genesisBlock = Block.genesis()

            assertAll(
                    { assertEquals("fa1788f78b25fe5ceee9d90258686c279dc1e869a722e08dd806147a104d8640", genesisBlock.hash) },
                    { assertEquals("0000000000000000000000000000000000000000000000000000000000000000", genesisBlock.previousHash) },
                    { assertEquals("<<genesis>>", genesisBlock.data) },
                    { assertEquals(0L, genesisBlock.timestamp) }
            )
        }
    }
})
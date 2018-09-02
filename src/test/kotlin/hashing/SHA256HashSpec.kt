package com._98elements._98coins.hashing

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object SHA256HashSpec: Spek({
    describe("calculating hash") {
        it("computes correct checksum") {
            val expectedHash = "185f8db32271fe25f561a6fc938b2e264306ec304eda518007d1764826381969"

            assertEquals(expectedHash, SHA256Hash.calculate("Hello"))
        }
    }
})

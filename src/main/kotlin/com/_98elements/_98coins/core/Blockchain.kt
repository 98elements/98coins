package com._98elements._98coins.core

data class Blockchain(val blocks: List<Block> = listOf(Block.genesis())) {
    fun mineBlock(data: String): Blockchain {
        val newBlock = Block.genesis()

        return Blockchain(blocks.plus(newBlock))
    }
}

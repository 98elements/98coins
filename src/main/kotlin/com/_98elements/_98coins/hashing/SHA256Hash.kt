package com._98elements._98coins.hashing

import java.security.MessageDigest

object SHA256Hash {
    private const val ALGORITHM = "SHA-256"
    private val messageDigest = MessageDigest.getInstance(ALGORITHM)

    fun calculate(input: String) = messageDigest.digest(input.toByteArray(Charsets.UTF_8)).fold("") {
        hash, byte -> hash + "%02x".format(byte)
    }
}
package ascii

import java.security.Key
import java.security.KeyFactory
import java.security.spec.KeySpec
import javax.crypto.Cipher
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.SecretKeySpec

fun main(args: Array<String>) {

    AESCrypt.decrypt(AESCrypt.encrypt("xiaoming", "1234567812345678"), "1234567812345678")
}

object AESCrypt {
    fun encrypt(input: String, pass: String): ByteArray {
        val cipher = Cipher.getInstance("AES")

        val des = "DES/ECB/PKCS5Padding"
//        val pass = "1234567812345678"
//        val input = "xiaoming"
        val keySpec = SecretKeySpec(pass.toByteArray(), "AES")
        cipher.init(Cipher.ENCRYPT_MODE, keySpec)
        val res = cipher.doFinal(input.toByteArray())
        println(res)
        return res
    }

    fun decrypt(input: ByteArray, pass: String) {
        val cipher = Cipher.getInstance("AES")
//        val pass = "1234567812345678"
//        val input = "xiaoming"
        val keySpec = SecretKeySpec(pass.toByteArray(), "AES")
        cipher.init(Cipher.DECRYPT_MODE, keySpec)
        val res = cipher.doFinal(input)
        println(String(res))
    }
}
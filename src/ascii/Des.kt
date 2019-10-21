package ascii

import com.sun.crypto.provider.DESCipher
import java.security.Key
import javax.crypto.Cipher
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.DESKeySpec


fun main(args: Array<String>) {

//    val input = "xiaoming"
//    val pass = "12345678"
//
//    val c = Cipher.getInstance("DES")
//    val s = SecretKeyFactory.getInstance("DES")
//    val keySpec = DESKeySpec(pass.toByteArray())
//    val key: Key? = s.generateSecret(keySpec)
//    c.init(Cipher.ENCRYPT_MODE, key)
//    val r = c.doFinal(input.toByteArray())
//    println(r)
    DESCrypt.decrypt(DESCrypt.encrypt("xiaoming","12345678"),"12345678")
}

object DESCrypt {
    fun encrypt(input: String, pass: String): ByteArray {
        val c = Cipher.getInstance("DES")
        val s = SecretKeyFactory.getInstance("DES")
        val keySpec = DESKeySpec(pass.toByteArray())
        val key: Key? = s.generateSecret(keySpec)
        c.init(Cipher.ENCRYPT_MODE, key)
        val r = c.doFinal(input.toByteArray())
        println(r)
        return r
    }

    fun decrypt(input: ByteArray, pass: String): String {
        val c = Cipher.getInstance("DES")
        val s = SecretKeyFactory.getInstance("DES")
        val keySpec = DESKeySpec(pass.toByteArray())
        val key: Key? = s.generateSecret(keySpec)
        c.init(Cipher.DECRYPT_MODE, key)
        val r = c.doFinal(input)
        println(String(r))
        return String(r)
    }
}
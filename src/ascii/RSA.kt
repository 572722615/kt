package ascii

import com.sun.org.apache.xml.internal.security.utils.Base64
import java.io.ByteArrayOutputStream
import java.security.KeyFactory
import java.security.KeyPairGenerator
import java.security.PrivateKey
import java.security.PublicKey
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import javax.crypto.Cipher

class RSACript {
    //分段
    fun encryptPrivate(input: String, privateKey: PrivateKey): String? {
        val cipher = Cipher.getInstance("RSA")
        cipher.init(Cipher.ENCRYPT_MODE, privateKey)
        var byteArray = input.toByteArray()
        val size = 117
        var temp: ByteArray? = null
        var result = ByteArrayOutputStream()
        var offset = 0
        while (byteArray.size - offset > 0) {
            if (byteArray.size - offset > size) {
                temp = cipher.doFinal(input.toByteArray(), offset, size)
                offset += size
            } else {
                temp = cipher.doFinal(input.toByteArray(), offset, byteArray.size - offset)
                offset = byteArray.size
            }
            result.write(temp)
        }

        return Base64.encode(result.toByteArray())
    }

    fun encryptPublic(input: String, publicKey: PublicKey): String? {
        val cipher = Cipher.getInstance("RSA")

        cipher.init(Cipher.ENCRYPT_MODE, publicKey)

        val encrypt = cipher.doFinal(input.toByteArray())
        return Base64.encode(encrypt)
    }

    fun decryptPrivate(input: String?, privateKey: PrivateKey): String {
        val res = Base64.decode(input)
        val cipher = Cipher.getInstance("RSA")

        cipher.init(Cipher.DECRYPT_MODE, privateKey)

        val encrypt = cipher.doFinal(res)
        return String(encrypt)
    }
}

fun main(args: Array<String>) {

    val keyPairGenerator = KeyPairGenerator.getInstance("RSA")
    val keyPair = keyPairGenerator.generateKeyPair()
    val publicKey = keyPair.public
    val privateKey = keyPair.private
//    val res = RSACript().encryptPublic("xiaoming", publicKey)
//    var res2 = RSACript().decryptPrivate(res,privateKey)
//    println(res2)
//    val res = RSACript().encryptPrivate("小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明v", privateKey)
//    val res2 = RSACript().encryptPublic("小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明小明", publicKey)
//    println(res)
//    println(res2)
//    val kf = KeyFactory.getInstance("RSA")
//    val privateKeyRes = kf.generatePrivate(PKCS8EncodedKeySpec(Base64.decode(privateKey.toString().toByteArray())))
//    val publicKeyRes = kf.generatePrivate(X509EncodedKeySpec(Base64.decode(publicKey.toString().toByteArray())))
//    println(privateKeyRes)
//    println(publicKeyRes)


}
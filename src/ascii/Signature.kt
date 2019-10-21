package ascii

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64
import java.security.KeyPairGenerator
import java.security.PrivateKey
import java.security.Signature


fun main(args: Array<String>) {
    //sign
    val keyPairGenerator = KeyPairGenerator.getInstance("RSA")
    val keyPair = keyPairGenerator.generateKeyPair()
    val sign = Sign.sign("xiaoming", keyPair.private)

    //verify
    val signature = Signature.getInstance("SHA256withRSA")
    signature.initVerify(keyPair.public)
    signature.update("xiaoming1".toByteArray())
    val verify = signature.verify(Base64.decode(sign))
    println(verify)
}

object Sign {
    fun sign(signName: String, privateKey: PrivateKey): String? {
        val signature = Signature.getInstance("SHA256withRSA")
        signature.initSign(privateKey)
        signature.update(signName.toByteArray())
        val sigh = signature.sign()
        println(Base64.encode(sigh))
        return Base64.encode(sigh)
    }

    fun printIn(){
//        println(JavaMain.`in`)
    }
}
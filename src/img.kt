import java.awt.image.BufferedImage
import java.awt.image.BufferedImage.TYPE_INT_RGB
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {
    var img = BufferedImage(100, 100, TYPE_INT_RGB)
    var width = 1..98
    var height = 1 until 99
    img.apply {
        for (i in width)
            for (j in height)
                setRGB(i, j, 0xff00000)
    }
    img.setRGB(0, 0, 0xff00000)
    ImageIO.write(img, "png", File("a.png"))
}
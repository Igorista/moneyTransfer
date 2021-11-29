import java.awt.geom.Arc2D

fun main(args: Array<String>) {
    val unit : Char = '\u20bd'
    val vkTranferapp = """
    VK money transfer
    Min sum to pay: 300 $unit
    Max sum to pay: 75 000 $unit"""
    println(vkTranferapp)

    val transferSum : Int = 4600
    val amount : Int = transferSum * 100
    val minCommision : Int = 3500
    val result = if (minCommision > amount * 75/10000)  minCommision else amount * 75/10000
    println("Коммисия за перевод составит: $result.коп")


}
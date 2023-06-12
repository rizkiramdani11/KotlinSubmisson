package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    println("Masukkan angka:")
    val input = readLine()

    try {
        val number = input?.toInt()
        println("Angka yang dimasukkan: $number")
    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan: ${e.message}")
    }


}
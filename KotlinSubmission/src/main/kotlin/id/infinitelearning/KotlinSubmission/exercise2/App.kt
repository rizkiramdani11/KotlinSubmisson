package id.infinitelearning.KotlinSubmission.exercise2

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    val evenNumbers = (1..100).filter { it % 2 == 0 }
    println(evenNumbers)

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    val monthMap = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

        val currentDate = LocalDate.now()
        val birthDate = LocalDate.of(2001, 11, 24)

        val monthNow = currentDate.month.toString()
        val birthMonth = birthDate.month.toString()

        val formatter = DateTimeFormatter.ofPattern("MMMM")

        val formattedMonthNow = monthNow.capitalize()
        val formattedBirthMonth = birthMonth.capitalize()

        val output = "Bulan saat ini $formattedMonthNow , Bulan Lahir $formattedBirthMonth"
        println(output)

    monthMap.forEach { (initial, name) ->
        println("$initial -> $name")
    }

}
import java.util.{ Date, Locale}
import java.text.DateFormat._

object FrenchDate {
    def main (args: Array[String]): Unit = {
        val ahora = new Date 
        val df = getDateInstance(LONG, Locale.FRANCE)
        println(df format ahora)
    }
}
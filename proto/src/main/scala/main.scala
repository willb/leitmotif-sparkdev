import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object <%= name.gsub /[^\p{Alnum}]/, '' %> {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("<%= name %>").setMaster("local")
    val sc = new SparkContext(conf)
    
    // your code goes here
    
    sc.stop()
  }
}
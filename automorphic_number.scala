# scala
import scala.io.StdIn._;
object automorphic{
	def main(args:Array[String]){
		print("Enter the number: ")
		var m =readInt();
		auto_number(m)
	}
	def auto_number(m:Int){
		for(n<-1 to m){
			var k =((n).toString()).length()
			var sq = n*n
			var sum=0
			var rem =0
			var div =1
			for(i<-1 to k){
				div*=10
			}
			rem=sq%div
			sum+=rem
			if(sum==n){
				println("Automorphic:"+n)
			}
		}
	}
}

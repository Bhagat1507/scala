import scala.io.StdIn._;
object factorial{
	def main(args:Array[String]){
		print("Enter the number: ")
		var n = readInt();
		factorial_num(n);
	}
	def factorial_num(n:Int){
		var sum = 1
		for(i<-1 to n){
			sum = sum * i	
		}
		print(sum)
	}
}
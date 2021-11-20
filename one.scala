import scala.io.StdIn._;
object average_two{
	def main(args:Array[String]){
		print("Enter the n1: ");
		var n1 = readInt();
		print("Enter the n2: ");
		var n2 = readInt();
		sum_average(n1,n2)
	}
	def sum_average(n1:Int, n2:Int){
		var sum = 0;
		var count = 0;
		for(i <- n1 to n2){
			sum += i;
			count += 1;
		}
		var average = sum/count;
		print("Average: "+average)
	}
}
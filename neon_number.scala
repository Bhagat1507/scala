import scala.io.StdIn._;
object neo_number{
	def main(args:Array[String]){
		print("Enter the Number: ")
		var m=readInt();
		neo(m)
		
	}
	def neo(m:Int){
		for(n<-1 to m){
			var sq=n*n
			var w = ((sq).toString()).length()
			var sum=0
			var rem=0
			for(i<-1 to w){
				rem= sq%10
				sum+=rem
				sq=sq/10
			}
			if(n==sum){
				println(n)
			}
		}
	}
}

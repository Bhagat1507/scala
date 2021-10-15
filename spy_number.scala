import scala.io.StdIn._;
object spy_number{
	def main(args:Array[String]){
		print("Enter the Number: ")
		var m=readInt();
		spy_number(m)
	}
	def spy_number(m:Int){
		for(n<-1 to m){
		var q=n
		var k=((n).toString()).length()
		var sum = 0
		var pro =1
		var rem = 0
		for(i<-1 to k){
			rem= q%10
			sum+=rem
			pro*=rem
			q=q/10
		}
		if(pro==sum){
			println("spy",n)
		}
		
		
		}
	}
}

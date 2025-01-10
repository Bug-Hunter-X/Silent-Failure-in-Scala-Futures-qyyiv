```scala
import scala.concurrent.{ExecutionContext, Future}

class MyClass(implicit ec: ExecutionContext) {
  def myMethod(i: Int): Future[Int] = Future {
    if (i == 0) throw new Exception("Something went wrong!")
    i * 2
  }
}

// In another part of the code
val myInstance = new MyClass
val resultFuture = myInstance.myMethod(0)
resultFuture.onComplete {
  case scala.util.Success(value) => println(s"Success: $value")
  case scala.util.Failure(exception) => println(s"Failure: ${exception.getMessage}")
}
```
# Silent Failure in Scala Futures

This example demonstrates a common issue in Scala when using Futures: unhandled exceptions that lead to silent failures. The code throws an exception inside a Future, but this exception doesn't prevent the program from continuing.  It doesn't print any useful error message.
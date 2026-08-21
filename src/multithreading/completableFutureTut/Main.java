package multithreading.completableFutureTut;

import java.util.concurrent.CompletableFuture;
/* What is CompletableFuture?
CompletableFuture is a class in Java's java.util.concurrent package that is used to perform asynchronous and non-blocking tasks and then define what should happen when those tasks finish.

Future vs CompletableFuture
This distinction is extremely important.

Future
A Future mainly allows you to say:
"I started something. Give me the result when I need it."
Future<Integer> future =
        executor.submit(() -> 100);

Integer result = future.get();
The problem is that get() blocks.

CompletableFuture allows you to say:
"When the result becomes available, automatically perform this next operation."

Example:
CompletableFuture<Integer> future =
        CompletableFuture.supplyAsync(() -> 100);

future.thenApply(value -> value * 2)
      .thenAccept(result ->
              System.out.println(result)
      );

Output:
200*/
public class Main {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                    System.out.println(
                            "Fetching user..."
                    );
                    return "Zubair";
                })
                .thenApply(name -> {
                    System.out.println(
                            "Processing name..."
                    );
                    return name.toUpperCase();
                })
                .thenApply(name -> {
                    return "Hello " + name;
                })
                .exceptionally(ex -> {
                    return "Something went wrong";
                });

        System.out.println(future.join());
    }
}

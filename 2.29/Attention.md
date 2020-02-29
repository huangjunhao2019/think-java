# 关于NextInt的几点注意
When you read a String followed by an int, everything works just fine. But
when you read an int followed by a String, something strange happens.
```java
System.out.print("What is your age? ");
age = in.nextInt();
System.out.print("What is your name? ");
name = in.nextLine();
System.out.printf("Hello %s, age %d\n", name, age);
```
Try running this example code. It doesn’t let you input your name, and it
immediately displays the output:
What is your name? Hello , age 45
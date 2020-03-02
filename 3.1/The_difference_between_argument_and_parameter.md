# The syntax difference between parameter and argument 
When you use a method, you provide the arguments. When you write a
method, you name the parameters.
Argument is a value, but parameter is a varaible. 
# 下面这个例子充分说明了Java中函数是值传递
```java
int hour = 11;
int minute = 59;
printTime(hour + 1, 0);
```

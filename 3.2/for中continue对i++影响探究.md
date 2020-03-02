# for循环加入continue后的影响
```java
import java.util.Scanner;
public class ForContinue{
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			if(i%2==0)
				continue;
			System.out.println(i);
		}
	}
}
```
执行结果是1,3,5,9，可以看出来，continue是略过了for中的body中的情况，直接去执行i++,并没有跳过i++，这是需要注意的，也就是说
```java
for(int i=1;i<10;i++)和
for(int i=1;i<10;)
{i++}
```
并不是等价的，因为continu的原因
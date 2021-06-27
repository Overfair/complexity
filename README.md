# Complexity Decrease

Java Project. The idea is to decrease the complexity of the code.

You can see an example below

Input:

```java
public int compare (int a, int b) {
    
    int return_value = 0;
    
    if (a > b) {
      return_value = a;
    } else {
      return_value =b;
    }

    return return_value;
  }
```

Output:

```java
  public int compare (int a, int b) {
    
    if (a > b) {
      return a;
    }
    return b;

  }
```
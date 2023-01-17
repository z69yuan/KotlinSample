# 目录
## 注解与反射
> 和Java不一样的是，Kotlin允许你对任意的表达式应用注解，而不是仅仅对类、函数的声明和类型。最常见的注解是@Suppress
### 注解的应用。

有哪些类型可以作为注解的参数呢?
- 基本数据类型、字符创、枚举、类引用、其他注解类型， 以及这些类型的数组。

> 指定类做实参， 需要在类型后加上`::class` , 如@MyAnnation(HelloWorld::class)
> 注解作为实参， 需要把`@` 去掉。


注解实参需要在 编译器是已知的。所以不能随意的将属性作为实参，要把属性当做实参，需要加上`const` 描述符。

### 注解目标
Kotlin语言相比与Java太过简洁了。 

```kotlin
class Goods {
    var price:String? = null
}
```
一个price属性的声明，除了包含成员变量本身，还有 getter/setter 方法。 因此在对齐使用注解时，就需要进步精确。确定注解点是Field还是getter、setter方法。

```kotlin
class Goods {
    @get:Rule
    var price:String? = null
}
```
就像上述代码一样，`@get:Rule`作用在了price成员的getter方法上。



Kotlin 中有哪些 **使用点目标**？

- property --Java的注解不能应用这种使用点目标。
- field --属性生成的字段
- get --属性的getter
- set --属性的setter
- receiver --扩展函数或者扩展属性的接收者参数
- param --构造方法的参数
- setparam --属性setter的参数
- delegate --为委托属性存储委托实例的字段
- file --包含在文件中声明的顶层函数和属性的类

任何应用到file目标的注解必须放在文件顶层，放在package指令之前。
@JvmName是常见的应用到文件的注解之一，他改了了对应类的名称。 

```kotlin
fun test(list:List<*>){

    @Suppress("UNCHECKED_CAST")
    val strings = list as List<String>
}
```















# 基于LL(1)文法分析技术的脚本语言Stone

Stone是本人看了《编译原理》（第二版）（只剩最后几章暂时未看）和《两周自制脚本语言》后，使用Java语言开发，基于LL(1)文法分析技术的一门脚本语言，除了支持顺序、选择和循环语法结构外，还支持数组、函数、输出语句以及OOP的封装、属性和创建对象等特性。

## 构建

软件构建环境需求：

* JDK v1.9+
* 操作系统需要有GUI系统，以支持Java Swing GUI

克隆代码到本地工作目录：

`git clone https://github.com/JohnGuoy/Stone.git`

构建：

```bash
cd ./Stone/
javac -classpath ./src/;./lib/gluonj.jar -d ./dist/ ./src/stone/ast/*.java
javac -classpath ./src/;./lib/gluonj.jar -d ./dist/ -encoding UTF-8 ./src/stone/*.java
javac -classpath ./src/;./lib/gluonj.jar -d ./dist/ -encoding UTF-8 ./src/chap6/*.java
javac -classpath ./src/;./lib/gluonj.jar -d ./dist/ -encoding UTF-8 ./src/chap7/*.java
javac -classpath ./src/;./lib/gluonj.jar -d ./dist/ -encoding UTF-8 ./src/chap8/*.java
javac -classpath ./src/;./lib/gluonj.jar -d ./dist/ -encoding UTF-8 ./src/chap9/*.java
javac -classpath ./src/;./lib/gluonj.jar -d ./dist/ -encoding UTF-8 ./src/chap10/*.java
javac -classpath ./src/;./lib/gluonj.jar -d ./dist/ -encoding UTF-8 ./src/Stone.java
```

## 运行

```bash
java -classpath ./dist/;./lib/gluonj.jar ./dist/Stone
```

在弹出的输入框中，输入以下示例代码运行和测试Stone脚本语言。

## 示例代码

支持//单行注释语法。

支持赋值=、加法+、减法-、乘法*、整除/、取余数%运算符，运算符优先级同Java语言的一样。

支持if-else和while。

支持print输出语句。

```python
sum = 0
i = 1
while i < 10 {
    sum = sum + i
    i = i + 1
}

print sum

if sum % 2 == 0 {
    print "even"
} else {
    print "odd"
}
```

支持函数。

```python
// 斐波那契函数
def fib(n){
    if n < 2 {
        n
    } else {
        fib(n - 1) + fib(n - 2)
    }
}

print fib(10)
```

支持简单OOP（封装、属性、new对象等，暂不支持继承和多态）。

```python
class Position{
    x = y = 0
    def move(nx, ny){
        x = nx
        y = ny
    }
}

p = Position.new
p.move(3, 4)
p.x = 10
print p.x + p.y
```

支持一维数组和多维数组。

```python
a = [2, 3, 4]
print a[1]
a[1] = "three"
print "a[1]=" + a[1]
b = [["one", 1], ["two", 2], ["three", 3]]
print b[0][0] + ", " + b[1][0] + ", " + b[2][0]
```

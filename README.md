# design-pattern
设计模式概述及uml类图
---
### 1.装饰者模式(Decrator)
![图片来自维基百科](https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Decorator_UML_class_diagram.svg/400px-Decorator_UML_class_diagram.svg.png)

 
>通过增加一个装饰类包裹原来的类，包裹的方式一般是通过将基本的对象作为修饰类的构造函数的参数，装饰类实现新的功能，如果不需要可以直接使用原来的类，装饰类和被装饰类有相同的接口。

目的： 通过包装原始代码来动态地向接口或抽象类添加责任

实现过程： 
1. 有一个抽象类Component
2. 被装饰类ConcreteComponent继承了此抽象类
3. 在装饰类中，Decrator 持有一个Component的引用
4. 通过构造函数初始化Component，在operation方法中调用Component的方法
5. 在ConcreteDecorator类中，覆盖Decrator的方法，并加入一些需要修改的内容。

### 2.适配器模式(Adapter)
>适配器模式把一个类的接口转换成客户端另一个接口，从而使不匹配的无法在一起工作的两个类在一起工作。有 **类适配器** 模式和 **对象适配器** 两种模式

目的： 把不兼容的两个接口放在一起工作

类适配器：是类间继承，
对象适配器：是对象之间的合成关系 
![image.png](http://upload-images.jianshu.io/upload_images/2550720-42d981b29e649e67.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
### 3.策略模式

>定义一组算法，把每个算法封装起来，使用时可以在他们之间自由的切换。

目的： 本模式使得算法可独立于使用它的客户而变化

实现： 1.普通策略
       2.枚举策略
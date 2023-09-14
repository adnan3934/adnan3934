#multiple inheritance in python
class A:
    def method1(self):
        print("Method 1 of class A")
class B:
    def method2(self):
        print("Method 2 of class B")
class C(B,A):
    def method3(self):
        print("Method 3 of class C of a,b")
c = C()
c.method1()
c.method2()
c.method3()

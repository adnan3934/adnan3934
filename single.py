class animal:
    name=''
    def eat(self):
        print("ani can eat")
class dog(animal):
    def eat(self):
        super().eat()
        print("dog eat bone")
l=dog()
l.eat()
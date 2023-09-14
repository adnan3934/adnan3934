#user defined exception
class mm(Exception):
    pass
agel=int(input("age ent"))
try:
    if agel<18:
        raise mm
    else:
        print("eligible to vote")
except mm:
    print("invalid age")

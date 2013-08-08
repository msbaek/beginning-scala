// method that takes a function that transforms and Int to an Int:
def with42(in: Int => Int) = in(42)
// pass a function that is applying the + method to 33
with42(33 +)


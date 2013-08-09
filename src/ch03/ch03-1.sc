val x = List(1, 2, 3, 4)
// find even numbers using collection operator
x.filter(a => a % 2 == 0)
x(1)
val a = Array(1, 2, 3)
a(1)
val m = Map("one" -> 1, "two" -> 2, "three" -> 3)

m("one")
// range
0 to 10

(1 to Integer.MAX_VALUE - 1).take(5)

"99 Red Ballons".toList
"99 Red Ballons".toList.filter(Character.isDigit)

"Elwood eats mice".takeWhile(c => c != ' ')

// from p.57
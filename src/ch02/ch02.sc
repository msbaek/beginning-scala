for {i <- 1 to 10}
  println(i)









// multilined string
def multilinedString = """Hello
Multiline
Word"""
println(multilinedString)


// class
class Bar(name: String)

new Bar("Working...")

// trait
trait Cat {
  def meow(): String
}

trait FuzzyCat extends Cat {
  override def meow(): String = "Meeeeeow"
}

trait OtherThing {
  def hello() = 4
}
class Yep extends FuzzyCat with OtherThing

// object
object Dude extends Yep
object Dude2 extends Yep {
  override def meow() = "Dude looks like a cat"
}
object OtherDude extends Yep {
  def twoMeows(param: Yep) = meow + ", " + param.meow()
}

OtherDude.meow()
OtherDude.twoMeows(Dude)
OtherDude.twoMeows(Dude2)

// embed an object
class HasYep {
  object myYep extends Yep {
    override def meow = "Moof"
  }
}
(new HasYep).myYep.meow

// p.26부터

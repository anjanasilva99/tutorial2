object Q4b extends App{

  def attendies(price : Int): Int = {
    return (120 + (15 -price) / 5 * 20)
  }

  def income(price : Int): Int = {
    return price * attendies(price)
  }

  def cost(price : Int): Int = {
    return (500 + 3 * attendies(price))
  }

  def profit(price : Int): Int = {
    return (income(price) - cost(price))
  }


    println(attendies(15))
    println(income(15))
    println(cost(15))
    println(profit(15))

}

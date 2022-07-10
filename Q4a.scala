object Q4a extends App{

    def working(hoursW : Int): Int = {
      return hoursW * 250
    }

    def OT(hoursO : Int): Int = {
      return hoursO * 85
    }

    def Income(hoursW:Int, hoursO:Int): Int = {
      return working(hoursW) + OT(hoursO)
    }

    def tax(income:Int): Double = {
      return income * 0.12
    }

    def takeHomeSalary(hoursW:Int,hoursO:Int): Double = {
      return Income(hoursW,hoursO) - tax(Income(hoursW,hoursO))
    }


      println(working(40))
      println(OT(30))
      println(Income(40, 30))
      println(tax(Income(40, 30)))
      println(takeHomeSalary(40, 30))



}

package ipv4
fun main() {
     println("***************IPV4 VALIDATION******************")
     println("ENTER IPV4 TO BE CHECKED")
     val ipv4 =readLine()


    // valid ipv4
    Check(
        "Given Valid ipv4, When checked ,Then it should return true",
        CheckValidIPv4("255.122.232.233"),
         true
    )

   //check if empty
    Check(
        "Given an empty ipv4 , When checked ,Then it should return  false",
       CheckValidIPv4(""),
        false
    )
    //out of range test
    Check(
        "Given an out of range ipv4 , When checked ,Then it should return  false",
        CheckValidIPv4("355.122.232.-1"),
        false
    )
    //ipv4 with more dots
    Check(
        "Given ipv4 with more dots, When checked ,Then it should return  false",
        CheckValidIPv4("1.3.4.255.."),
        false
    )
    //ipv4 with extra number of segments
    Check(
        "Given ipv4 with extra number of octets , When checked ,Then it should return false",
        CheckValidIPv4("123.255.255.233.2788"),
        false
    )
    //ipv4 with less number of segments
    Check(
        "Given ipv4 with less number of octets , When checked ,Then it should return false",
        CheckValidIPv4("123.255.2788"),
        false
    )
    //non_numeric_input
    Check(
        "Given ipv4 with non_numeric_input , When checked ,Then it should return false",
        CheckValidIPv4("123.255.2.A"),
        false
    )
    //ipv4 with extra space
    Check(
        "Given ipv4 with extra space , When checked ,Then it should return false",
        CheckValidIPv4(" 123.255.2. 1"),
        false
    )
    //ipv4 with lose segment
    Check(
        "Given ipv4 with lose segment , When checked ,Then it should return false",
        CheckValidIPv4("123..2.1"),
        false
    )
    //ipv4 with leading zero
    Check(
        "Given ipv4 with leading zero , When checked ,Then it should return false",
        CheckValidIPv4("00123.88.2.01"),
        false
    )

}
fun Check(name : String , result : Boolean  , correctResult : Boolean)
{
    if (result ==  correctResult)
    {
        println("Sucess ,$name")
    }
    else
    {
        println("Faild ,$name")
    }
}

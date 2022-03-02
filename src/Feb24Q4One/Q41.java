package Feb24Q4One;

public class Q41 {
    public static void main(String[] args) {
        SqlConnect obj = new SqlConnect();
        obj.setConnection();
        obj.alterTable();
        obj.displayFullTable();
        obj.fetchDetails();
        obj.updateSalary();
        obj.deleteEmployee();
    }
}
/*
::::::::::::::::::Data is:::::::::::::::::::::::
             id            name     designation             doj               exp          salary          status            city
          1001      Pathamesh               SDE     01/02/2022              2          32000        working           Pune
          1002          Rohit               SDE     02/02/2022              6          39000        working           null
          1004         Aditya               SDE     04/02/2022              5          38000        working           Pune
          1005         Rutuja               SDE     05/02/2022              6          36000        working           Pune
          1007         Sakshi               SDE     07/02/2022              2          33000        working       Buldhana
          1009          Pooja               SDE     09/02/2022              4          39000        working       Buldhana

::::::::::::::::::::::Data After Fetching 20000:::::::::::::::::::::::
             id            name     designation             doj               exp          salary          status            city
          1001      Pathamesh               SDE     01/02/2022              2          32000        working           Pune
          1004         Aditya               SDE     04/02/2022              5          38000        working           Pune
          1005         Rutuja               SDE     05/02/2022              6          36000        working           Pune

::::::::::::::::::Data is:::::::::::::::::::::::
             id            name     designation             doj               exp          salary          status            city
          1001      Pathamesh               SDE     01/02/2022              2          32000        working           Pune
          1002          Rohit               SDE     02/02/2022              6          40000        working           null
          1004         Aditya               SDE     04/02/2022              5          39000        working           Pune
          1005         Rutuja               SDE     05/02/2022              6          37000        working           Pune
          1007         Sakshi               SDE     07/02/2022              2          33000        working       Buldhana
          1009          Pooja               SDE     09/02/2022              4          40000        working       Buldhana

::::::::::::::::::Data is:::::::::::::::::::::::
             id            name     designation             doj               exp          salary          status            city
          1001      Pathamesh               SDE     01/02/2022              2          32000        working           Pune
          1002          Rohit               SDE     02/02/2022              6          40000        working           null
          1004         Aditya               SDE     04/02/2022              5          39000        working           Pune
          1005         Rutuja               SDE     05/02/2022              6          37000        working           Pune
          1007         Sakshi               SDE     07/02/2022              2          33000        working       Buldhana
          1009          Pooja               SDE     09/02/2022              4          40000        working       Buldhana


Process finished with exit code 0

 */
package Feb24Q4Two;

public class Q42 {
    public static void main(String[] args) {
        SQLConnect obj = new SQLConnect();
        obj.setConnection();
        obj.displayFullTable();
        obj.alterGender();
        obj.fetchDetails();
        obj.fetchDetails1();
        obj.insertRecord();
        obj.updateRecord();
        obj.removeStudent();
    }
}
/*

Connected to database

::::::::::::::::::Data is:::::::::::::::::::::::
             id            name            year      percentage              city
             1     prathamesh                FY             83           Pune
             2         ankush                SY             67         Mumbai
             3         aastha                TY             87           Pune
             4         rutuja                SY             95           Pune
             5         sakshi                LY             75         Mumbai
             6     shubhankar                LY             89           Pune
             7         akshay                TY             85         Mumbai
             8         aditya                FY             83           Pune
             9          rohit                TY             75         Mumbai
            10           neha                SY             79           Pune
            11          pooja                FY             90         Mumbai

Gender Column added successfully!!!!!

:::::::::::::::::::::::::::::::::::::::after gender added:::::::::::::
::::::::::::::::::Data is:::::::::::::::::::::::
             id            name            year      percentage              city
             1     prathamesh                FY             83           Pune
             2         ankush                SY             67         Mumbai
             3         aastha                TY             87           Pune
             4         rutuja                SY             95           Pune
             5         sakshi                LY             75         Mumbai
             6     shubhankar                LY             89           Pune
             7         akshay                TY             85         Mumbai
             8         aditya                FY             83           Pune
             9          rohit                TY             75         Mumbai
            10           neha                SY             79           Pune
            11          pooja                FY             90         Mumbai

::::::::::::::::::::::Data After Fetching percentage>70 and year='TY':::::::::::::::::::::::
             id            name            year      percentage              city
             3         aastha                TY             87           Pune
             7         akshay                TY             85         Mumbai
             9          rohit                TY             75         Mumbai

::::::::::::::::::::::Data After id between 1 and 10:::::::::::::::::::::::
             id            name            year      percentage              city
             1     prathamesh                FY             83           Pune
             2         ankush                SY             67         Mumbai
             3         aastha                TY             87           Pune
             4         rutuja                SY             95           Pune
             5         sakshi                LY             75         Mumbai
             6     shubhankar                LY             89           Pune
             7         akshay                TY             85         Mumbai
             8         aditya                FY             83           Pune
             9          rohit                TY             75         Mumbai
            10           neha                SY             79           Pune

::::::::::::::::::::::Data After insertion:::::::::::::::::::::::
::::::::::::::::::Data is:::::::::::::::::::::::
             id            name            year      percentage              city
             1     prathamesh                FY             83           Pune
             2         ankush                SY             67         Mumbai
             3         aastha                TY             87           Pune
             4         rutuja                SY             95           Pune
             5         sakshi                LY             75         Mumbai
             6     shubhankar                LY             89           Pune
             7         akshay                TY             85         Mumbai
             8         aditya                FY             83           Pune
             9          rohit                TY             75         Mumbai
            10           neha                SY             79           Pune
            11          pooja                FY             90         Mumbai
            12        pratham                SY             75           Pune
            13          rucha                FY             86         Mumbai
            14          gauri                TY             73           Pune

::::::::::::::::::::::Data After changing Mr and Mrs:::::::::::::::::::::::
::::::::::::::::::Data is:::::::::::::::::::::::
             id            name            year      percentage              city
             1     prathamesh                FY             83           Pune
             2         ankush                SY             67         Mumbai
             3         aastha                TY             87           Pune
             4         rutuja                SY             95           Pune
             5         sakshi                LY             75         Mumbai
             6     shubhankar                LY             89           Pune
             7         akshay                TY             85         Mumbai
             8         aditya                FY             83           Pune
             9          rohit                TY             75         Mumbai
            10           neha                SY             79           Pune
            11          pooja                FY             90         Mumbai
            12     Mr.pratham                SY             75           Pune
            13       Ms.rucha                FY             86         Mumbai
            14       Ms.gauri                TY             73           Pune

::::::::::::::::::::::::::::Date after removel::::::::::::::::::::::::::::::::
::::::::::::::::::Data is:::::::::::::::::::::::
             id            name            year      percentage              city
             1     prathamesh                FY             83           Pune
             2         ankush                SY             67         Mumbai
             3         aastha                TY             87           Pune
             4         rutuja                SY             95           Pune
             7         akshay                TY             85         Mumbai
             8         aditya                FY             83           Pune
             9          rohit                TY             75         Mumbai
            10           neha                SY             79           Pune
            11          pooja                FY             90         Mumbai
            12     Mr.pratham                SY             75           Pune
            13       Ms.rucha                FY             86         Mumbai
            14       Ms.gauri                TY             73           Pune


Process finished with exit code 0

 */
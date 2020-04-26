package modul_5;

/**
 *
 * @author Ham23 KEL71
 */
public class userService {
    private String[][] data = new String[2][3];
    private String[][] histories = new String[2][4];
    private String email, password, roles, martabak, onde, nogosari = "";
    
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"nama1kelompok71@gmail.com", "12345", "supedAdmin"},
            {"nama2kelompok71@gmail.com", "12345", "user"} 
        };
        String[][] histories =
        {
            {"nama1kelompok71@gmail.com", "Fisika Dasar", "Dasar Komputer dan Pemrograman", "26-04-2020"},
            {"nama2kelompok71@gmail.com", "Dasar Komputer dan Pemrograman", "Konsep Jaringan Komputer", "26-04-2020"}
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                    return true;
                }
            }
        }
        return false;
    }
    private boolean checkCredential2()
    {
    for(int i = 0; i < histories.length; i++)
        {
            if(histories[i][0].equals(email))
            {
                martabak = histories[i][1];
                onde = histories[i][2];
                nogosari = histories[i][3];
                return true;
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("Welcome " + roles);
            System.out.println("Logged it as user email " + email);
        }
        else
        {
            System.out.println("Invalid Login ");
        }
    }
    public void pinjaman()
    {
        boolean status = checkCredential2();
        if(status == true)
        {
            System.out.println(martabak);
            System.out.println(onde);
            System.out.println("Tanggal Pinjaman : " + nogosari);
        }
        else
        {
            System.out.println("Invalid Login ");
        }
    }
}

public class App{
    public static int twice(int a){
        int ans  =  a * 2;
        return ans;
    }
    public static void main(String[] args){
        int f_var = 12;
        int s_var = 31;
        int answer = twice(f_var) + twice(s_var);
        System.out.println(twice(f_var) + " + " + twice(s_var) + " = " + answer);
    }

}
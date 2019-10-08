public class Test3 {
    public static void main(String[] args) {
      Soldier2 s[] = {new Soldier2(), new Soldier2(), new Soldier2(), new Soldier2()};
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    private static class Soldier2 {
        static int count =1;
        static String name =" ";
        Soldier2(){
           this.name = "현재병사 번호 - ";
        }

        @Override
        public String toString() {
           return name+count++;
        }
    }
}

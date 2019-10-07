public class Test2 {
    public static void main(String[] args) {
        Soldier s[] = {new Soldier(), new Soldier(), new Soldier(), new Soldier()};
        System.out.println(Soldier.getCount());
        s[3]= null;
        Soldier.decreaseCount();
        System.out.println(Soldier.getCount());
    }

    private static class Soldier {
        static int count = 0;
        Soldier() {
            this.count++;
        }
        public static int getCount(){
            return count;
        }

        public static int decreaseCount() {
            count--;
            return count;
        }
    }
}

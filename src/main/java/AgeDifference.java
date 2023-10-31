public class AgeDifference {
    public static void main(String[] args) {
        final long AGE_UNIVERSE = 13000000000L;
        final long AGE_HUMANS = 100000;
        final long AGE_DIFFERENCE = AGE_UNIVERSE / AGE_HUMANS;

        System.out.println("Возраст вселенной " + AGE_UNIVERSE + " лет.");
        System.out.println("Возраст человечества " + AGE_HUMANS + " лет.");
        System.out.println("Возраст вселенной больше в " + AGE_DIFFERENCE + " раз больше человечества.");
    }
}
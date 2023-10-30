public class AgeDifference {
    public static void main(String[] args) {
        final long Age_Of_The_Universe = 13000000000L;
        final long Age_Of_The_Humans = 100000;
        long ageDifference = Age_Of_The_Universe / Age_Of_The_Humans;

        System.out.println("Возраст вселенной " + Age_Of_The_Universe + " лет.");
        System.out.println("Возраст человечества " + Age_Of_The_Humans + " лет.");
        System.out.println("Возраст вселенной больше в " + ageDifference + " раз больше человечества.");
    }
}
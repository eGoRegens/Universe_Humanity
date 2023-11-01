public class AgeDifference {
    public static void main(String[] args) {
        final long ageOfTheUniverse = 13000000000L;
        final long ageOfTheHumans = 100000;

        final long ageDifference = ageOfTheUniverse / ageOfTheHumans;

        System.out.println("Возраст вселенной " + ageOfTheUniverse + " лет.");
        System.out.println("Возраст человечества " + ageOfTheHumans + " лет.");
        System.out.println("Возраст вселенной больше в " + ageDifference + " раз больше человечества.");
    }
}
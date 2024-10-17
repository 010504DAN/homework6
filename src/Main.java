public class Main {
    public static void main(String[] args) {
        // Создание экземпляра оружия
        Weapon sword = new Weapon(WeaponType.SWORD, "Excalibur");
        Weapon bow = new Weapon(WeaponType.BOW, "Longbow");

        // Создание экземпляров Skeleton
        Skeleton skeleton1 = new Skeleton("Skeleton Archer 1", 50, bow, 10);
        Skeleton skeleton2 = new Skeleton("Skeleton Archer 2", 40, bow, 5);

        // Вывод информации о скелетах
        skeleton1.printInfo();
        System.out.println();
        skeleton2.printInfo();
    }
}

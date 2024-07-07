package interface_assignment.problem1;

public class AnimalTest {

  public static void main(String[] args) {
    Animal dog = new Dog(8);
    Animal chicken = new Chicken(3);
    Chicken cheatableChicken = new Chicken(5);

    for (int i = 0; i < 3; i++) {
      System.out.println(i + 1 + "시간 후");
      dog.run(i + 1);
      chicken.run(i + 1);
      if (cheatableChicken instanceof Cheatable) {  //조건: Chicken 객체가 Cheatable 일 때만
        cheatableChicken.fly();
      }

      System.out.println("개의 이동거리=" + dog.getDistance());
      System.out.println("닭의 이동거리=" + chicken.getDistance());
      System.out.println("나는 닭의 이동거리=" + cheatableChicken.getDistance());
    }
  }
}

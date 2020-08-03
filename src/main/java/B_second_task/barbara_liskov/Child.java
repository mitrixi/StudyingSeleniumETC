package B_second_task.barbara_liskov;

public class Child extends Parent {
    private int experience;

    public Child(int experience) {
        super(experience);
    }

    @Override
    public int getExperience() {
//        if (experience < 10)
//            try {
//                throw new Exception();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        System.out.println("");
//        return super.getExperience();
        return 55;
    }
}

public class Reptile extends Animal {

    public Reptile(String name, int age, String gender, int height) {
        super(name, age, gender, height);
    }

    @Override
    public void greet() {
    }

    @Override
    public String wantChild() {
        return "want a child form an egg!";
    }

    @Override
    public void eat() {
    }

    @Override
    public String getName() {
        return name;
    }
}

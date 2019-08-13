public   class Cat extends Animal {
    private String name;

    public Cat(String name, String name1) {
        super(name);
        this.name = name1;
    }
    @Override
    public void voice() {
    System.out.println("CatVoice");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        super(name);
    }



    @Override
    public void feed() {
    System.out.println("CatFeed");
    }
}

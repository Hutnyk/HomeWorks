public  class Dog extends Animal {
    private String name;

    public String getName() {
        return name;
    }
    public void voice(){
     System.out.println("DogVoice");
    }

    @Override
    public void feed() {
        System.out.println("DogFeed");
    }


    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        super(name);
    }
}

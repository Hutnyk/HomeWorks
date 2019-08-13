public  class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Cat("Bary"), new Dog("Jack")};

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
            animals[i].feed();
        }



    }
}
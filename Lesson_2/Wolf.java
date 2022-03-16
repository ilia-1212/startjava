public class Wolf {
    //пол, кличка, вес, возраст, окрас
    char sex;
    String nickname;
    float weight;
    int age;
    String color;

    //идти, сидеть, бежать, выть, охотиться
    void go() {
        System.out.println("идет");
    }

    void sit() {
        System.out.println("сидит");
    }

    void run() {
        System.out.println("бежит");
    }

    void bark() {
        System.out.println("воет/лает");
    }

    void hunt() {
        System.out.println("охотится");
    }
}
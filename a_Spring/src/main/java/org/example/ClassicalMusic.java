package org.example;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }
    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    public void doMyInit() {
        System.out.println("Doing my init, without destroy, because of prototype");
    }
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}

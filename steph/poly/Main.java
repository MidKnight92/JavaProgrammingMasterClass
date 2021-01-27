package com.viveros.steph.poly;

// Base Class
class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

// Children
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take over planet earth";
    }

}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override public String plot(){
        return "Imperial Forces try to take over the universe";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override public String plot(){
        return  "Kids try and escape a maze";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }

    // no plot method (to show poly at work)
}
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Movie randomMovie = randomMovie();
            System.out.println("Movie " + i + ": is " +  randomMovie.getName() + "\n" +  "Plot: " + randomMovie.plot() );
        }
    }

    public static Movie randomMovie(){
        int randomNum = (int) (Math.random() * 5) + 1;
        System.out.println("randomNum" + randomNum);

        // breaks are commented out because it is unreachable with the return (but just a reminder switch statements need a break)
        switch (randomNum){
            case 1:
                return new Jaws();
//                break;
            case 2:
                return new IndependenceDay();
//                break;
            case 3:
                return new StarWars();
//                break;
            case 4:
                return new MazeRunner();
//                break;
            case 5:
                return new Forgetable();
//                break;
            default:
                return null;  // Objects are set to null when declared or
        }
    }
}

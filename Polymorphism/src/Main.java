
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot() {
        return "A Shark eats lots of people";
    }
    public String getName() {
        return super.getName();
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }
    public String plot() {
        return "Aliens attempt to take over the earth";
    }
    public String getName() {
        return super.getName();
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }
    public String plot() {
        return "Kids try and escape a maze";
    }
    public String getName() {
        return super.getName();
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
    public String getName() {
        return super.getName();
    }
}

class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }
    public String getName() {
        return super.getName();
    }
}


public class Main {
    public static void main(String[] args) {
        for(int i = 0;i < 5;i++) {
            Movie movie = randomMovie();
            System.out.println("Movie number #" + i +  ": " + movie.getName() + "\n" +
                    "Plot : " + movie.plot());
        }
    }



    public static Movie randomMovie() {
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}

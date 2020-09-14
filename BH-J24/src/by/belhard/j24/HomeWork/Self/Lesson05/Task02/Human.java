package by.belhard.j24.HomeWork.Self.Lesson05.Task02;

public class Human {
private String pet;
    private String game;



    public Human(String pet, String game) {
        this.pet=pet;
        this.game=game;
    }

    public void SelfGame(){
        System.out.print("У человека есть " + pet + ", он с ней играет, " + pet +" "+game);
    }

    public void NoSelfGameCat(String pet1){
        if (pet1=="кошка"){
            System.out.print("Человек играет с чужой кошкой, она мурлыкает");
        }
        if (pet1=="собака"){
            System.out.print("Человек играет с чужой собакой, она прыгает и виляет хвостом");
        }
        if (pet1=="рыбка"){
            System.out.print("Человек играет с чужой рыбкой, она плавает по кругу");
        }

    }
}



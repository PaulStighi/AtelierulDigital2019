package Lab_2;

public class BoxingMatch {
    public Fighter F1, F2;

    public BoxingMatch(Fighter F1, Fighter F2) {
        this.F1 = F1;
        this.F2 = F2;
    }

    public String fight() {
        do {
            F1.attack(F2);

            if(F2.health > 0)   F2.attack(F1);
        }while(F1.health > 0 && F2.health > 0);

        if(F1.health > 0)   return (F1.name + " is the winner");
        else                return (F2.name + " is the winner");
    }
}

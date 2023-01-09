import java.util.Arrays;

public class TwoExercises {
    public class Car {
        public Car getMax(Car[] cars) {
            Car g = cars[0];

            for(int i=0; i<cars.length; i++){
                if (cars[i].maxSpeed > g.maxSpeed){
                    g = cars[i];
                } else if (cars[i].maxSpeed == g.maxSpeed){
                    if(cars[i].acceleration < g.acceleration){
                        return g;
                    } else return cars[i];
                }
            }
            return g;

        }

        ////DO NOT MODIFY ANYTHING BELOW THIS LINE

        int maxSpeed;
        int acceleration;

        public Car(int maxSpeed, int acceleration) {
            this.maxSpeed = maxSpeed;
            this.acceleration = acceleration;
        }

        @Override
        public String toString() {
            return "Car with maxSpeed=" + maxSpeed + " and acceleration=" + acceleration;
        }
    }

}

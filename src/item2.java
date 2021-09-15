public class item2 {
    // 1번째 점층적 생성자 패턴 Telescoping constructor pattern
    public class NutritionFacts {
        private final int servingSize;
        private final int servings;
        private final int calories;
        private final int fat;
        private final int sodium;
        private final int carbohydrate;

        public NutritionFacts(int servingSize, int servings){
            this(servingSize, servings);
        }

        public NutritionFacts(int servingSize, int servings, int calories){
            this(servingSize, servings, calories);
        }

        public NutritionFacts(int servingSize, int servings, int calories, int fat){
            this(servingSize, servings, calories, fat);
        }

        public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium){
            this(servingSize, servings, calories, fat, sodium);
        }

        public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate){
            this.servingSize = servingSize;
            this.servings = servings;
            this.calories = calories;
            this.fat = fat;
            this.sodium = sodium;
            this.carbohydrate = carbohydrate;
        }
    }

    NutritionFacts cocaCola = new NutritionFacts(100, 200, 300, 0, 35, 40);

    // 2번째 자바빈즈 패턴 JavaBeans pattern
    public class NutritionFacts{
        private int servingSize = -1;
        private int servings = -1;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public NutritionFacts(){}
        public void setServingSize(int val) { servingSize = val;}
        public void setServings(int val) {servings = val;}
        public void setCalories(int val) {calories = val;}
        public void setFat(int val) {fat = val;}
        public void setSodium(int val) {sodium = val;}
        public void setCarbohydrate(int val) {carbohydrate = val;}
    }

    NutritionFacts cocaCola = new NutritionFacts();
    cocaCola.setServingSize(100);
    cocaCola.setServings(200);
    cocaCola.setCalories(300);

    // 3번쨰 빌더 패턴 Builder pattern
    public class NutritionFacts{
        private final int servingSize;
        private final int servings;
        private final int calories;
        private final int fat;
        private final int sodium;
        private final int carbohydrate;

        public static class Builder {
            private final int servingSize;
            private final int servings;

            private int calories = 0;
            private int fat = 0;
            private int sodium = 0;
            private int carbohydrate = 0;

            public Builder(int servingSize, int servings){
                this.servingSize = servingSize;
                this.servings = servings;
            }

            public Builder calories(int val) { calories = val; return this;}
            public Builder fat(int val) { fat = val; return this;}
            public Builder sodium(int val) {sodium = val; return this;}
            public Builder carbohydrate(int val) {carbohydrate = val; return this;}

            public NutritionFacts build(){
                return new NutritionFacts(this);
            }
        }

        private NutritionFacts(Builder builder){
            servingSize = builder.servingSize;
            servings = builder.servings;
            calories = builder.calories;
            fat = builder.fat;
            sodium = builder.sodium;
            carbohydrate = builder.carbohydrate;
        }
    }

    NutritionFacts cocaCola = new NutritionFacts.Builder(100,200)
            .calories(300).sodium(30).carbohydrate(20).build();
}

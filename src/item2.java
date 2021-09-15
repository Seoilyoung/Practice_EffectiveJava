public class item2 {
    // 1번째 점층적 생성자 패턴 Telescoping constructor pattern
    public class NutritionFacts {
        private final int servingSize;
        private final int servings;
        private final int calories;
        private final int fat;
        private final int sodium;
        private final int carbonhydrate;

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

        public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbonhydrate){
            this.servingSize = servingSize;
            this.servings = servings;
            this.calories = calories;
            this.fat = fat;
            this.sodium = sodium;
            this.carbonhydrate = carbonhydrate;
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
        private int carbonhydrate = 0;

        public NutritionFacts(){}
        public void setServingSize(int val) { servingSize = val;}
        public void setServings(int val) {servings = val;}
        public void setCalories(int val) {calories = val;}
        public void setFat(int val) {fat = val;}
        public void setSodium(int val) {sodium = val;}
        public void setCarbonhydrate(int val) {carbonhydrate = val;}
    }

    NutritionFacts cocaCola = new NutritionFacts();
    cocaCola.setServingSize(100);
    cocaCola.setServings(200);
    cocaCola.setCalories(300);

    // 3번쨰 빌더 패턴 Builder pattern

}

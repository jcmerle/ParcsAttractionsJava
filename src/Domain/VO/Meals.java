package Domain.VO;

public enum Meals {
    BREAKFAST{
        @Override
        public String toString(){
            return "Breakfast";
        }
    },
    LUNCH{
        @Override
        public String toString(){
            return "Lunch";
        }
    },
    DINNER{
        @Override
        public String toString(){
            return "Dinner";
        }
    }
}

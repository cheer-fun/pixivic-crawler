package dev.cheerfun.pixivic.constant;

public class IllustsConstant {

    public static enum IllustsArtistGenderConstant {
        NULL(0, "不明"), MALE(1, "male"),
        FEMALE(2, "female");

        private int state;
        private String gender;

        IllustsArtistGenderConstant(int state, String gender) {
            this.state = state;
            this.gender = gender;
        }

        public int getState() {
            return state;
        }

        public String getGender() {
            return gender;
        }
    }
}

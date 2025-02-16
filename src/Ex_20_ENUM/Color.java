package Ex_20_ENUM;

public enum Color {

    RED("#123"),BLACK("#273469"),
    WHITE("#178236"),GREEN("#7263489");

   private String hexcode;
    Color(String hexcode)
            {
                this.hexcode = hexcode;
            }

            String getHexcode()
            {
                return this.hexcode;
            }


}

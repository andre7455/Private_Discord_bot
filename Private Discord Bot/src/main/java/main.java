import net.dv8tion.jda.api.JDABuilder;
public class main {
    public static void main(String[] args) {
        JDABuilder builder = JDABuilder.createDefault(args[0]);



        builder.build();
    }
}

import java.io.IOException;

public class RocketShipBlastOff {
public static void main(String[] args) throws IOException, InterruptedException {
	for(int i=10; i> -1; i--) {
		Runtime.getRuntime().exec("say "+i).waitFor();
	}
	Runtime.getRuntime().exec("say BLAST OFF!!!").waitFor();
}
}

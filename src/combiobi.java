import com.kingmang.lazurite.parser.pars.SourceLoader;

import java.io.IOException;

import static com.kingmang.lazurite.Main.RunProgram;


public class combiobi {
    public static void main(String[] args) throws IOException {
        RunProgram(SourceLoader.readSource("index.lzr"), false,false,false, 0);
    }


}

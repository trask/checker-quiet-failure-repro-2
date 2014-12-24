import java.io.File;

import static com.google.common.base.Preconditions.checkNotNull;

class Test {

    public void test() {
        File file = null;
        checkNotNull(file).getName();
    }
}

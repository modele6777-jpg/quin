package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qob implements Serializable {
    private static final long serialVersionUID = 0;
    private final int flags;
    private final String pattern;

    public qob(String str, int i) {
        this.pattern = str;
        this.flags = i;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.pattern, this.flags);
        patternCompile.getClass();
        return new rob(patternCompile);
    }
}

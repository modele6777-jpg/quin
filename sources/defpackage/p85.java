package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p85 {
    public static volatile p85 a;
    public static final p85 b;

    static {
        p85 p85Var = new p85();
        Map map = Collections.EMPTY_MAP;
        b = p85Var;
    }

    public static p85 a() {
        p85 p85Var;
        v0b v0bVar = v0b.c;
        p85 p85Var2 = a;
        if (p85Var2 != null) {
            return p85Var2;
        }
        synchronized (p85.class) {
            try {
                p85Var = a;
                if (p85Var == null) {
                    Class cls = l85.a;
                    p85 p85Var3 = null;
                    if (cls != null) {
                        try {
                            p85Var3 = (p85) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    p85Var = p85Var3 != null ? p85Var3 : b;
                    a = p85Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return p85Var;
    }
}

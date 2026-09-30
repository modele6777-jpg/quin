package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hmg {
    public static volatile hmg a;
    public static final hmg b;

    static {
        hmg hmgVar = new hmg();
        Map map = Collections.EMPTY_MAP;
        b = hmgVar;
    }

    public static hmg a() {
        hmg hmgVar = a;
        if (hmgVar != null) {
            return hmgVar;
        }
        synchronized (hmg.class) {
            try {
                hmg hmgVar2 = a;
                if (hmgVar2 != null) {
                    return hmgVar2;
                }
                int i = slg.a;
                hmg hmgVarS0 = lmg.s0();
                a = hmgVarS0;
                return hmgVarS0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

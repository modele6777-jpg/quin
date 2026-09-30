package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a63 {
    public static final Set a = qd0.I0(new String[]{"fortune_detail", "widget", "notification", "daily_fortune_guide", "tomorrow_fortune_push", "dev", "unknown"});

    public static final void a(l1f l1fVar, String str) {
        str.getClass();
        l1fVar.a("daily_card", "value");
        l1fVar.a("daily_card", "page_name");
        l1fVar.a(str, "trigger_by");
        l1fVar.a(str, "triggered_by");
    }

    public static final void b(cod codVar) {
        String str;
        int iOrdinal = codVar.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                str = "0";
            } else {
                if (iOrdinal == 3) {
                    return;
                }
                if (iOrdinal != 4) {
                    ap.c();
                    return;
                }
                str = "1";
            }
            x1f x1fVar = x1f.a;
            x1f.k(p05.a, new ks2(9, codVar, str), 2);
        }
    }

    public static final void c(String str, String str2) {
        x1f x1fVar = x1f.a;
        x1f.k(p05.a, new z53(str, str2, 0), 2);
    }
}

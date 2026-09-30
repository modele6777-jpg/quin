package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u5a implements p5a, hf8 {
    public static final /* synthetic */ int b = 0;
    public final ace a = new ace(new vy9(13));

    public final String a(String str) {
        Object dzbVar;
        hs3 hs3Var = xqa.s0;
        String str2 = (String) z5c.I(nu4.a, new r5a(hs3Var.a, hs3Var.b, null));
        if (v4e.Q(str2)) {
            return null;
        }
        try {
            xh7 xh7Var = fzc.a;
            xh7Var.getClass();
            p4e p4eVar = p4e.a;
            dzbVar = (String) ((Map) xh7Var.b(new qh6(p4eVar, p4eVar, 1), str2)).get(str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            d().g("Failed to decode experimentVariants from prefs: " + thA.getMessage());
        }
        return (String) (dzbVar instanceof dzb ? null : dzbVar);
    }
}

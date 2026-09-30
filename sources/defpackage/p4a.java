package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p4a {
    public static final rob a = new rob("[¥$€£₩]\\s*[0-9]+(?:[.,][0-9]+)?");

    public static final boolean a(z6e z6eVar, boolean z) {
        String strC;
        z6eVar.getClass();
        return z && z6eVar.h() == u7e.b && (strC = z6eVar.c()) != null && c5e.C(strC, "次月", false);
    }

    public static final String b(z6e z6eVar) {
        um8 um8VarB;
        String strB = z6eVar.b();
        if (strB != null) {
            if (v4e.Q(strB)) {
                strB = null;
            }
            if (strB != null) {
                return strB;
            }
        }
        String strC = z6eVar.c();
        if (strC == null || (um8VarB = rob.b(a, strC)) == null) {
            return null;
        }
        String strGroup = um8VarB.a.group();
        strGroup.getClass();
        return strGroup;
    }
}

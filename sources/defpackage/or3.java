package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class or3 {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    public static int a(b18 b18Var, boolean z) {
        return z ? ((c18) s72.F0(b18Var.l)).a + 1 : ((c18) s72.v0(b18Var.l)).a - 1;
    }

    public static int b(zw7 zw7Var, boolean z) {
        ks9 ks9Var = ks9.a;
        if (z) {
            ax7 ax7Var = (ax7) s72.F0(zw7Var.n);
            return (zw7Var.r == ks9Var ? ax7Var.x : ax7Var.y) + 1;
        }
        ax7 ax7Var2 = (ax7) s72.v0(zw7Var.n);
        return (zw7Var.r == ks9Var ? ax7Var2.x : ax7Var2.y) - 1;
    }
}

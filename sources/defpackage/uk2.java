package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uk2 {
    public static final q69 a;

    static {
        x3c x3cVar = s82.e;
        int i = x3cVar.c;
        rk2 rk2Var = new rk2(x3cVar, x3cVar, 1);
        int i2 = x3cVar.c;
        km9 km9Var = s82.x;
        int i3 = (km9Var.c << 6) | i2;
        tk2 tk2Var = new tk2(x3cVar, km9Var, 0);
        int i4 = (i2 << 6) | km9Var.c;
        tk2 tk2Var2 = new tk2(km9Var, x3cVar, 0);
        q69 q69Var = v67.a;
        q69 q69Var2 = new q69();
        q69Var2.i(i | (i << 6), rk2Var);
        q69Var2.i(i3, tk2Var);
        q69Var2.i(i4, tk2Var2);
        a = q69Var2;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sv8 {
    public static sv8 h;
    public final cv7 a;
    public final mue b;
    public final vw3 c;
    public final xp5 d;
    public final mue e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public sv8(cv7 cv7Var, mue mueVar, vw3 vw3Var, xp5 xp5Var) {
        this.a = cv7Var;
        this.b = mueVar;
        this.c = vw3Var;
        this.d = xp5Var;
        this.e = a6c.k(mueVar, cv7Var);
    }

    public final long a(int i, long j) {
        int i2;
        float f = this.g;
        float f2 = this.f;
        int i3 = 1;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = tv8.a;
            mue mueVar = this.e;
            pu4 pu4Var = pu4.a;
            xp5 xp5Var = this.d;
            vw3 vw3Var = this.c;
            tt ttVar = new tt(new xt(str, mueVar, pu4Var, pu4Var, xp5Var, vw3Var, false), 1, 1, ll2.b(0, 0, 0, 0, 15));
            i3 = 1;
            float f3 = new tt(new xt(tv8.b, mueVar, pu4Var, pu4Var, this.d, vw3Var, true), 2, 1, ll2.b(0, 0, 0, 0, 15)).f;
            float f4 = ttVar.f;
            float f5 = f3 - f4;
            this.g = f4;
            this.f = f5;
            f2 = f5;
            f = f4;
        }
        if (i != i3) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            i2 = iRound >= 0 ? iRound : 0;
            int iG = kl2.g(j);
            if (i2 > iG) {
                i2 = iG;
            }
        } else {
            i2 = kl2.i(j);
        }
        return ll2.a(kl2.j(j), kl2.h(j), i2, kl2.g(j));
    }
}

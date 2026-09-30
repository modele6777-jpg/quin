package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zp5 implements xp5 {
    public final bs a;
    public final cs b;
    public final lqb c;
    public final fq5 d;
    public final yea e;
    public final ot1 f;

    public zp5(bs bsVar, cs csVar) {
        lqb lqbVar = aq5.a;
        fq5 fq5Var = new fq5(aq5.b);
        yea yeaVar = new yea(0);
        this.a = bsVar;
        this.b = csVar;
        this.c = lqbVar;
        this.d = fq5Var;
        this.e = yeaVar;
        this.f = new ot1(27, this);
    }

    public final l9f a(i9f i9fVar) {
        lqb lqbVar = this.c;
        so5 so5Var = new so5(2, this, i9fVar);
        synchronized (((g3e) lqbVar.b)) {
            l9f l9fVar = (l9f) ((ej8) lqbVar.c).c(i9fVar);
            if (l9fVar != null) {
                if (l9fVar.b()) {
                    return l9fVar;
                }
            }
            try {
                l9f l9fVar2 = (l9f) so5Var.d(new i2e(19, lqbVar, i9fVar));
                synchronized (((g3e) lqbVar.b)) {
                    if (((ej8) lqbVar.c).c(i9fVar) == null && l9fVar2.b()) {
                        ((ej8) lqbVar.c).d(i9fVar, l9fVar2);
                    }
                }
                return l9fVar2;
            } catch (Exception e) {
                ho7.r("Could not load font", e);
                return null;
            }
        }
    }

    public final l9f b(yp5 yp5Var, ar5 ar5Var, int i, int i2) {
        int i3 = this.b.a;
        return a(new i9f(yp5Var, (i3 == 0 || i3 == Integer.MAX_VALUE) ? ar5Var : new ar5(mh3.o(ar5Var.a + i3, 1, 1000)), i, i2, null));
    }
}

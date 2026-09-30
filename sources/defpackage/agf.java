package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class agf extends q1 {
    public final txa a;
    public final int b;
    public final int c;
    public final String d;
    public final Integer e;
    public final ol9 f;
    public final int g;

    public agf(txa txaVar, int i, int i2, ol9 ol9Var, int i3) {
        int i4;
        String str = txaVar.b;
        Integer num = (i3 & 16) != 0 ? null : 0;
        ol9Var = (i3 & 32) != 0 ? null : ol9Var;
        str.getClass();
        this.a = txaVar;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = num;
        this.f = ol9Var;
        if (i2 < 10) {
            i4 = 1;
        } else if (i2 < 100) {
            i4 = 2;
        } else {
            if (i2 >= 1000) {
                qc0.j(tec.f(i2, "Max value ", " is too large"));
                throw null;
            }
            i4 = 3;
        }
        this.g = i4;
    }

    @Override // defpackage.q1
    public final txa a() {
        return this.a;
    }

    @Override // defpackage.q1
    public final Object b() {
        return this.e;
    }

    @Override // defpackage.q1
    public final String c() {
        return this.d;
    }

    @Override // defpackage.q1
    public final ol9 d() {
        return this.f;
    }
}

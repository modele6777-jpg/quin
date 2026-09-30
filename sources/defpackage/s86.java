package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s86 extends ewf implements hf8 {
    public final u96 b;
    public final n26 c;
    public final m8b d;
    public final s0e e;
    public final whb f;
    public lyd g;
    public long v;

    public s86(u96 u96Var) {
        q86 q86Var = q86.a;
        this.b = u96Var;
        this.c = q86Var;
        hf8.Q.getClass();
        this.d = ef8.a("GiftCardList");
        s0e s0eVarA = t0e.a(new p86(null, 0 == true ? 1 : 0, 15));
        this.e = s0eVarA;
        this.f = if9.n(s0eVarA);
        f();
    }

    @Override // defpackage.hf8
    public final m8b d() {
        throw null;
    }

    public final void f() {
        Object value;
        s0e s0eVar = this.e;
        wa6 wa6Var = ((p86) s0eVar.getValue()).a;
        long j = 1 + this.v;
        this.v = j;
        this.d.e("Gift card list load started: tab=" + wa6Var + ", generation=" + j);
        do {
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, p86.a((p86) value, null, null, true, null, 3)));
        lyd lydVar = this.g;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.g = ynb.V(hwf.a(this), null, null, new r86(this, wa6Var, j, null), 3);
    }
}

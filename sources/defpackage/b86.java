package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b86 extends ewf implements hf8 {
    public final u96 b;
    public final String c;
    public final m8b d;
    public final s0e e;
    public final whb f;

    public b86(u96 u96Var, String str) {
        this.b = u96Var;
        this.c = str;
        hf8.Q.getClass();
        this.d = ef8.a("GiftCardDetail");
        s0e s0eVarA = t0e.a(new z76(null, 7));
        this.e = s0eVarA;
        this.f = if9.n(s0eVarA);
        f();
    }

    @Override // defpackage.hf8
    public final m8b d() {
        throw null;
    }

    public final void f() {
        s0e s0eVar;
        Object value;
        this.d.e("Gift card detail load started: cardId=" + this.c);
        do {
            s0eVar = this.e;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, z76.a((z76) value, null, true, null, 1)));
        ynb.V(hwf.a(this), null, null, new a86(this, null), 3);
    }
}

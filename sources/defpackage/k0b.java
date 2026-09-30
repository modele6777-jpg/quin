package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0b extends m0b {
    public final nya d;
    public final k0b e;
    public final j22 f;
    public final mya g;
    public final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0b(nya nyaVar, u99 u99Var, bu3 bu3Var, ntd ntdVar, k0b k0bVar) {
        super(u99Var, bu3Var, ntdVar);
        nyaVar.getClass();
        u99Var.getClass();
        this.d = nyaVar;
        this.e = k0bVar;
        this.f = i7h.u(u99Var, nyaVar.q0());
        mya myaVar = (mya) oi5.f.e(nyaVar.p0());
        this.g = myaVar == null ? mya.CLASS : myaVar;
        this.h = oi5.g.e(nyaVar.p0()).booleanValue();
        oi5.h.getClass();
    }

    @Override // defpackage.m0b
    public final dx5 a() {
        return this.f.a();
    }
}

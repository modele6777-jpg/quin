package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0b extends l56 implements wt8 {
    public int b;
    public int c;
    public int d;
    public f0b e;
    public int f;
    public int g;
    public g0b v;

    public final Object clone() {
        e0b e0bVar = new e0b();
        e0bVar.e = f0b.ERROR;
        e0bVar.v = g0b.LANGUAGE_VERSION;
        e0bVar.k(j());
        return e0bVar;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        h0b h0bVarJ = j();
        if (h0bVarJ.b()) {
            return h0bVarJ;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        h0b h0bVar = null;
        try {
            try {
                h0b.b.getClass();
                k(new h0b(g72Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (h0bVar != null) {
                    k(h0bVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            h0b h0bVar2 = (h0b) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                h0bVar = h0bVar2;
                if (h0bVar != null) {
                    k(h0bVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        k((h0b) u56Var);
        return this;
    }

    public final h0b j() {
        h0b h0bVar = new h0b(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        h0bVar.version_ = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        h0bVar.versionFull_ = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        h0bVar.level_ = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        h0bVar.errorCode_ = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        h0bVar.message_ = this.g;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        h0bVar.versionKind_ = this.v;
        h0bVar.bitField0_ = i2;
        return h0bVar;
    }

    public final void k(h0b h0bVar) {
        if (h0bVar == h0b.a) {
            return;
        }
        if (h0bVar.B()) {
            int iU = h0bVar.u();
            this.b |= 1;
            this.c = iU;
        }
        if (h0bVar.C()) {
            int iV = h0bVar.v();
            this.b |= 2;
            this.d = iV;
        }
        if (h0bVar.z()) {
            f0b f0bVarS = h0bVar.s();
            f0bVarS.getClass();
            this.b |= 4;
            this.e = f0bVarS;
        }
        if (h0bVar.x()) {
            int iR = h0bVar.r();
            this.b |= 8;
            this.f = iR;
        }
        if (h0bVar.A()) {
            int iT = h0bVar.t();
            this.b |= 16;
            this.g = iT;
        }
        if (h0bVar.D()) {
            g0b g0bVarW = h0bVar.w();
            g0bVarW.getClass();
            this.b |= 32;
            this.v = g0bVarW;
        }
        this.a = this.a.c(h0bVar.unknownFields);
    }
}

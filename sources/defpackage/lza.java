package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lza extends l56 implements wt8 {
    public int b;
    public int c;
    public int d;
    public mza e;

    public final Object clone() {
        lza lzaVar = new lza();
        lzaVar.c = -1;
        lzaVar.e = mza.PACKAGE;
        lzaVar.k(j());
        return lzaVar;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        nza nzaVarJ = j();
        if (nzaVarJ.b()) {
            return nzaVarJ;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        nza nzaVar = null;
        try {
            try {
                nza.b.getClass();
                k(new nza(g72Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (nzaVar != null) {
                    k(nzaVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            nza nzaVar2 = (nza) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                nzaVar = nzaVar2;
                if (nzaVar != null) {
                    k(nzaVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        k((nza) u56Var);
        return this;
    }

    public final nza j() {
        nza nzaVar = new nza(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        nzaVar.parentQualifiedName_ = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        nzaVar.shortName_ = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        nzaVar.kind_ = this.e;
        nzaVar.bitField0_ = i2;
        return nzaVar;
    }

    public final void k(nza nzaVar) {
        if (nzaVar == nza.a) {
            return;
        }
        if (nzaVar.s()) {
            int iP = nzaVar.p();
            this.b |= 1;
            this.c = iP;
        }
        if (nzaVar.t()) {
            int iQ = nzaVar.q();
            this.b |= 2;
            this.d = iQ;
        }
        if (nzaVar.r()) {
            mza mzaVarO = nzaVar.o();
            mzaVarO.getClass();
            this.b |= 4;
            this.e = mzaVarO;
        }
        this.a = this.a.c(nzaVar.unknownFields);
    }
}

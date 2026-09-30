package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rza extends l56 implements wt8 {
    public int b;
    public sza c;
    public vza d;
    public int e;

    public final Object clone() {
        rza rzaVar = new rza();
        rzaVar.c = sza.INV;
        rzaVar.d = vza.a;
        rzaVar.k(j());
        return rzaVar;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        tza tzaVarJ = j();
        if (tzaVarJ.b()) {
            return tzaVarJ;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        tza tzaVar = null;
        try {
            try {
                tza.b.getClass();
                k(new tza(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (tzaVar != null) {
                    k(tzaVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            tza tzaVar2 = (tza) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                tzaVar = tzaVar2;
                if (tzaVar != null) {
                    k(tzaVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        k((tza) u56Var);
        return this;
    }

    public final tza j() {
        tza tzaVar = new tza(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        tzaVar.projection_ = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        tzaVar.type_ = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        tzaVar.typeId_ = this.e;
        tzaVar.bitField0_ = i2;
        return tzaVar;
    }

    public final void k(tza tzaVar) {
        vza vzaVar;
        if (tzaVar == tza.a) {
            return;
        }
        if (tzaVar.r()) {
            sza szaVarO = tzaVar.o();
            szaVarO.getClass();
            this.b |= 1;
            this.c = szaVarO;
        }
        if (tzaVar.s()) {
            vza vzaVarP = tzaVar.p();
            if ((this.b & 2) != 2 || (vzaVar = this.d) == vza.a) {
                this.d = vzaVarP;
            } else {
                uza uzaVarR0 = vza.r0(vzaVar);
                uzaVarR0.m(vzaVarP);
                this.d = uzaVarR0.k();
            }
            this.b |= 2;
        }
        if (tzaVar.t()) {
            int iQ = tzaVar.q();
            this.b |= 4;
            this.e = iQ;
        }
        this.a = this.a.c(tzaVar.unknownFields);
    }
}

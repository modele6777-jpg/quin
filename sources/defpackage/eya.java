package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eya extends l56 implements wt8 {
    public final /* synthetic */ int b;
    public int c;
    public int d;
    public Object e;

    public /* synthetic */ eya(int i) {
        this.b = i;
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                eya eyaVar = new eya(0);
                eyaVar.e = hya.a;
                eyaVar.l(j());
                return eyaVar;
            default:
                eya eyaVar2 = new eya(1);
                eyaVar2.e = z61.a;
                eyaVar2.m(k());
                return eyaVar2;
        }
    }

    @Override // defpackage.l56
    public final ut8 f() {
        switch (this.b) {
            case 0:
                iya iyaVarJ = j();
                if (iyaVarJ.b()) {
                    return iyaVarJ;
                }
                throw new qef();
            default:
                oya oyaVarK = k();
                if (oyaVarK.b()) {
                    return oyaVarK;
                }
                throw new qef();
        }
    }

    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        oya oyaVar = null;
        iya iyaVar = null;
        try {
            try {
                switch (this.b) {
                    case 0:
                        try {
                            iya.b.getClass();
                            l(new iya(g72Var, o85Var));
                            return this;
                        } catch (ab7 e) {
                            iya iyaVar2 = (iya) e.a();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                iyaVar = iyaVar2;
                                if (iyaVar != null) {
                                    l(iyaVar);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            oya.b.getClass();
                            m(new oya(g72Var));
                            return this;
                        } catch (ab7 e2) {
                            oya oyaVar2 = (oya) e2.a();
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                oyaVar = oyaVar2;
                                if (oyaVar != null) {
                                    m(oyaVar);
                                }
                                throw th;
                            }
                        }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        switch (this.b) {
            case 0:
                l((iya) u56Var);
                break;
            default:
                m((oya) u56Var);
                break;
        }
        return this;
    }

    public iya j() {
        iya iyaVar = new iya(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        iyaVar.nameId_ = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        iyaVar.value_ = (hya) this.e;
        iyaVar.bitField0_ = i2;
        return iyaVar;
    }

    public oya k() {
        oya oyaVar = new oya(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        oyaVar.pluginId_ = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        oyaVar.data_ = (z61) this.e;
        oyaVar.bitField0_ = i2;
        return oyaVar;
    }

    public void l(iya iyaVar) {
        hya hyaVar;
        if (iyaVar == iya.a) {
            return;
        }
        if (iyaVar.p()) {
            int iN = iyaVar.n();
            this.c |= 1;
            this.d = iN;
        }
        if (iyaVar.q()) {
            hya hyaVarO = iyaVar.o();
            if ((this.c & 2) != 2 || (hyaVar = (hya) this.e) == hya.a) {
                this.e = hyaVarO;
            } else {
                fya fyaVarK = fya.k();
                fyaVarK.l(hyaVar);
                fyaVarK.l(hyaVarO);
                this.e = fyaVarK.j();
            }
            this.c |= 2;
        }
        this.a = this.a.c(iyaVar.unknownFields);
    }

    public void m(oya oyaVar) {
        if (oyaVar == oya.a) {
            return;
        }
        if (oyaVar.q()) {
            int iO = oyaVar.o();
            this.c |= 1;
            this.d = iO;
        }
        if (oyaVar.p()) {
            z61 z61VarN = oyaVar.n();
            z61VarN.getClass();
            this.c |= 2;
            this.e = z61VarN;
        }
        this.a = this.a.c(oyaVar.unknownFields);
    }
}

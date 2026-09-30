package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hl7 extends l56 implements wt8 {
    public final /* synthetic */ int b;
    public int c;
    public int d;
    public int e;

    public /* synthetic */ hl7(int i) {
        this.b = i;
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                hl7 hl7Var = new hl7(0);
                hl7Var.l(j());
                return hl7Var;
            default:
                hl7 hl7Var2 = new hl7(1);
                hl7Var2.m(k());
                return hl7Var2;
        }
    }

    @Override // defpackage.l56
    public final ut8 f() {
        switch (this.b) {
            case 0:
                il7 il7VarJ = j();
                if (il7VarJ.b()) {
                    return il7VarJ;
                }
                throw new qef();
            default:
                jl7 jl7VarK = k();
                if (jl7VarK.b()) {
                    return jl7VarK;
                }
                throw new qef();
        }
    }

    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        jl7 jl7Var = null;
        il7 il7Var = null;
        try {
            try {
                switch (this.b) {
                    case 0:
                        try {
                            il7.b.getClass();
                            l(new il7(g72Var));
                            return this;
                        } catch (ab7 e) {
                            il7 il7Var2 = (il7) e.a();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                il7Var = il7Var2;
                                if (il7Var != null) {
                                    l(il7Var);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            jl7.b.getClass();
                            m(new jl7(g72Var));
                            return this;
                        } catch (ab7 e2) {
                            jl7 jl7Var2 = (jl7) e2.a();
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                jl7Var = jl7Var2;
                                if (jl7Var != null) {
                                    m(jl7Var);
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
                l((il7) u56Var);
                break;
            default:
                m((jl7) u56Var);
                break;
        }
        return this;
    }

    public il7 j() {
        il7 il7Var = new il7(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        il7Var.name_ = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        il7Var.desc_ = this.e;
        il7Var.bitField0_ = i2;
        return il7Var;
    }

    public jl7 k() {
        jl7 jl7Var = new jl7(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        jl7Var.name_ = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        jl7Var.desc_ = this.e;
        jl7Var.bitField0_ = i2;
        return jl7Var;
    }

    public void l(il7 il7Var) {
        if (il7Var == il7.a) {
            return;
        }
        if (il7Var.q()) {
            int iO = il7Var.o();
            this.c |= 1;
            this.d = iO;
        }
        if (il7Var.p()) {
            int iN = il7Var.n();
            this.c |= 2;
            this.e = iN;
        }
        this.a = this.a.c(il7Var.unknownFields);
    }

    public void m(jl7 jl7Var) {
        if (jl7Var == jl7.a) {
            return;
        }
        if (jl7Var.q()) {
            int iO = jl7Var.o();
            this.c |= 1;
            this.d = iO;
        }
        if (jl7Var.p()) {
            int iN = jl7Var.n();
            this.c |= 2;
            this.e = iN;
        }
        this.a = this.a.c(jl7Var.unknownFields);
    }
}

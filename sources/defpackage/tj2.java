package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tj2 extends r41 {
    public final i41 H0;

    public tj2(int i, i41 i41Var, a26 a26Var) {
        super(i, a26Var);
        this.H0 = i41Var;
        if (i41Var == i41.a) {
            cva.u(job.a.b(r41.class).r(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        qc0.o(tec.f(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // defpackage.r41
    public final boolean B() {
        return this.H0 == i41.b;
    }

    public final Object Q(Object obj, boolean z) {
        a26 a26Var;
        ebf ebfVarR;
        i41 i41Var = this.H0;
        i41 i41Var2 = i41.c;
        wef wefVar = wef.a;
        fzf fzfVar = null;
        if (i41Var == i41Var2) {
            Object objD = super.d(obj);
            if (!(objD instanceof qw1) || (objD instanceof pw1)) {
                return objD;
            }
            if (z && (a26Var = this.b) != null && (ebfVarR = vpf.r(a26Var, obj, null)) != null) {
                throw ebfVarR;
            }
        } else {
            Object obj2 = obj;
            Object obj3 = t41.d;
            sw1 sw1Var = (sw1) r41.v.get(this);
            while (true) {
                long andIncrement = r41.d.getAndIncrement(this);
                long j = 1152921504606846975L & andIncrement;
                boolean zY = y(andIncrement, false);
                int i = t41.b;
                long j2 = i;
                long j3 = j / j2;
                fzf fzfVar2 = fzfVar;
                int i2 = (int) (j % j2);
                if (sw1Var.d != j3) {
                    sw1 sw1VarN = n(j3, sw1Var);
                    if (sw1VarN != null) {
                        sw1Var = sw1VarN;
                    } else if (zY) {
                        return new pw1(u());
                    }
                    fzfVar = fzfVar2;
                }
                int iN = N(sw1Var, i2, obj2, j, obj3, zY);
                if (iN == 0) {
                    sw1Var.a();
                    return wefVar;
                }
                if (iN != 1) {
                    if (iN == 2) {
                        if (!zY) {
                            fzf fzfVar3 = obj3 instanceof fzf ? (fzf) obj3 : fzfVar2;
                            if (fzfVar3 != null) {
                                fzfVar3.a(sw1Var, i2 + i);
                            }
                            g((sw1Var.d * j2) + ((long) i2));
                            break;
                        }
                        sw1Var.i();
                        return new pw1(u());
                    }
                    if (iN == 3) {
                        qc0.p("unexpected");
                        return fzfVar2;
                    }
                    if (iN == 4) {
                        if (j < t()) {
                            sw1Var.a();
                        }
                        return new pw1(u());
                    }
                    if (iN == 5) {
                        sw1Var.a();
                    }
                    obj2 = obj;
                    fzfVar = fzfVar2;
                } else {
                    break;
                }
            }
        }
        return wefVar;
    }

    @Override // defpackage.r41, defpackage.qxc
    public final Object a(xn2 xn2Var, Object obj) throws Throwable {
        ebf ebfVarR;
        if (!(Q(obj, true) instanceof pw1)) {
            return wef.a;
        }
        a26 a26Var = this.b;
        if (a26Var == null || (ebfVarR = vpf.r(a26Var, obj, null)) == null) {
            throw u();
        }
        bzd.m(ebfVarR, u());
        throw ebfVarR;
    }

    @Override // defpackage.r41, defpackage.qxc
    public final Object d(Object obj) {
        return Q(obj, false);
    }
}

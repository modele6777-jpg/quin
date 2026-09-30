package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k41 implements fzf {
    public Object a = t41.p;
    public pl1 b;
    public final /* synthetic */ r41 c;

    public k41(r41 r41Var) {
        this.c = r41Var;
    }

    @Override // defpackage.fzf
    public final void a(rtc rtcVar, int i) {
        pl1 pl1Var = this.b;
        if (pl1Var != null) {
            pl1Var.a(rtcVar, i);
        }
    }

    public final Object b(zn2 zn2Var) {
        sw1 sw1VarL;
        Boolean bool;
        Object obj = this.a;
        boolean z = true;
        if (obj == t41.p || obj == t41.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r41.w;
            r41 r41Var = this.c;
            sw1 sw1Var = (sw1) atomicReferenceFieldUpdater.get(r41Var);
            while (!r41Var.z()) {
                long andIncrement = r41.e.getAndIncrement(r41Var);
                long j = t41.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (sw1Var.d != j2) {
                    sw1VarL = r41Var.l(j2, sw1Var);
                    if (sw1VarL == null) {
                        continue;
                    }
                } else {
                    sw1VarL = sw1Var;
                }
                Object objM = r41Var.M(sw1VarL, i, andIncrement, null);
                ig4 ig4Var = t41.m;
                w7 w7Var = null;
                if (objM == ig4Var) {
                    qc0.p("unreachable");
                    return null;
                }
                ig4 ig4Var2 = t41.o;
                if (objM == ig4Var2) {
                    if (andIncrement < r41Var.v()) {
                        sw1VarL.a();
                    }
                    sw1Var = sw1VarL;
                } else {
                    if (objM == t41.n) {
                        r41 r41Var2 = this.c;
                        pl1 pl1VarW = pa7.W(k99.D(zn2Var));
                        try {
                            this.b = pl1VarW;
                            Object objM2 = r41Var2.M(sw1VarL, i, andIncrement, this);
                            a26 a26Var = r41Var2.b;
                            if (objM2 != ig4Var) {
                                if (objM2 == ig4Var2) {
                                    if (andIncrement < r41Var2.v()) {
                                        sw1VarL.a();
                                    }
                                    sw1 sw1Var2 = (sw1) r41.w.get(r41Var2);
                                    while (true) {
                                        if (r41Var2.z()) {
                                            pl1 pl1Var = this.b;
                                            pl1Var.getClass();
                                            this.b = null;
                                            this.a = t41.l;
                                            Throwable thQ = r41Var.q();
                                            if (thQ != null) {
                                                pl1Var.g(new dzb(thQ));
                                                break;
                                            }
                                            pl1Var.g(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = r41.e.getAndIncrement(r41Var2);
                                        long j3 = t41.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (sw1Var2.d != j4) {
                                            sw1 sw1VarL2 = r41Var2.l(j4, sw1Var2);
                                            if (sw1VarL2 != null) {
                                                sw1Var2 = sw1VarL2;
                                            }
                                        }
                                        Object objM3 = r41Var2.M(sw1Var2, i2, andIncrement2, this);
                                        if (objM3 == t41.m) {
                                            a(sw1Var2, i2);
                                            break;
                                        }
                                        if (objM3 == t41.o) {
                                            if (andIncrement2 < r41Var2.v()) {
                                                sw1Var2.a();
                                            }
                                        } else {
                                            if (objM3 == t41.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            sw1Var2.a();
                                            this.a = objM3;
                                            this.b = null;
                                            bool = Boolean.TRUE;
                                            if (a26Var != null) {
                                                w7Var = new w7(a26Var, objM3, 9);
                                            }
                                        }
                                    }
                                } else {
                                    sw1VarL.a();
                                    this.a = objM2;
                                    this.b = null;
                                    bool = Boolean.TRUE;
                                    if (a26Var != null) {
                                        w7Var = new w7(a26Var, objM2, 9);
                                    }
                                }
                                pl1VarW.n(bool, w7Var);
                                break;
                            }
                            a(sw1VarL, i);
                            return pl1VarW.t();
                        } catch (Throwable th) {
                            pl1VarW.D();
                            throw th;
                        }
                    }
                    sw1VarL.a();
                    this.a = objM;
                }
            }
            this.a = t41.l;
            Throwable thQ2 = r41Var.q();
            if (thQ2 != null) {
                int i3 = vxd.a;
                throw thQ2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.a;
        ig4 ig4Var = t41.p;
        if (obj == ig4Var) {
            qc0.p("`hasNext()` has not been invoked");
            return null;
        }
        this.a = ig4Var;
        if (obj != t41.l) {
            return obj;
        }
        Throwable thS = this.c.s();
        int i = vxd.a;
        throw thS;
    }
}

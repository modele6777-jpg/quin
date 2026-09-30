package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ek2 implements zj2 {
    public final ija a;
    public final ija b;
    public final yj2 c;
    public final ThreadLocal d;
    public volatile boolean e;
    public final long f;

    public ek2(final a90 a90Var, final String str, int i) {
        str.getClass();
        this.c = new yj2();
        this.d = new ThreadLocal();
        qfc qfcVar = ar4.b;
        this.f = y41.T(30, gr4.SECONDS);
        if (i <= 0) {
            qc0.j("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i2 = 0;
        this.a = new ija(i, new x16() { // from class: ak2
            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                String str2 = str;
                a90 a90Var2 = a90Var;
                switch (i3) {
                    case 0:
                        q8c q8cVarP = a90Var2.p(str2);
                        p8c.o(q8cVarP, "PRAGMA query_only = 1");
                        return q8cVarP;
                    default:
                        return a90Var2.p(str2);
                }
            }
        });
        final int i3 = 1;
        this.b = new ija(1, new x16() { // from class: ak2
            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                String str2 = str;
                a90 a90Var2 = a90Var;
                switch (i4) {
                    case 0:
                        q8c q8cVarP = a90Var2.p(str2);
                        p8c.o(q8cVarP, "PRAGMA query_only = 1");
                        return q8cVarP;
                    default:
                        return a90Var2.p(str2);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0141  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #1 {all -> 0x01a5, blocks: (B:64:0x0126, B:69:0x0142, B:71:0x014d, B:86:0x01a9, B:87:0x01b0), top: B:109:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x017c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0184  */
    /* JADX WARN: Code duplicated, block: B:79:0x0188  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9 A[Catch: all -> 0x01a5, TRY_ENTER, TryCatch #1 {all -> 0x01a5, blocks: (B:64:0x0126, B:69:0x0142, B:71:0x014d, B:86:0x01a9, B:87:0x01b0), top: B:109:0x0126 }] */
    @Override // defpackage.zj2
    public final Object J0(boolean z, l26 l26Var, zn2 zn2Var) {
        bk2 bk2Var;
        mmb mmbVar;
        Throwable th;
        ija ijaVar;
        l26 l26Var2;
        yj2 yj2Var;
        pv2 pv2Var;
        ija ijaVar2;
        mmb mmbVar2;
        boolean z2;
        Object obj;
        mmb mmbVar3;
        qja qjaVar;
        boolean z3 = z;
        if (zn2Var instanceof bk2) {
            bk2Var = (bk2) zn2Var;
            int i = bk2Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bk2Var.label = i - Integer.MIN_VALUE;
            } else {
                bk2Var = new bk2(this, zn2Var);
            }
        } else {
            bk2Var = new bk2(this, zn2Var);
        }
        Object objP0 = bk2Var.result;
        bw2 bw2Var = bw2.a;
        int i2 = bk2Var.label;
        if (i2 != 0) {
            if (i2 == 1) {
                jzb.q(objP0);
                return objP0;
            }
            if (i2 == 2) {
                jzb.q(objP0);
                return objP0;
            }
            if (i2 == 3) {
                z3 = bk2Var.Z$0;
                yj2Var = (yj2) bk2Var.L$5;
                mmb mmbVar4 = (mmb) bk2Var.L$4;
                pv2 pv2Var2 = (pv2) bk2Var.L$3;
                mmb mmbVar5 = (mmb) bk2Var.L$2;
                ijaVar2 = (ija) bk2Var.L$1;
                l26Var2 = (l26) bk2Var.L$0;
                try {
                    jzb.q(objP0);
                    mmbVar2 = mmbVar4;
                    mmbVar = mmbVar5;
                    pv2Var = pv2Var2;
                    try {
                        mk2 mk2Var = (mk2) objP0;
                        mk2Var.getClass();
                        pv2Var.getClass();
                        mk2Var.c = pv2Var;
                        mk2Var.d = new Throwable();
                        if (this.a == this.b && z3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mmbVar2.element = new qja(yj2Var, mk2Var, z2);
                        obj = mmbVar.element;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        qja qjaVar2 = (qja) obj;
                        pv2 pv2VarI = i7h.I(new xj2(this.c, qjaVar2), new fwe(qjaVar2, this.d));
                        dk2 dk2Var = new dk2(l26Var2, mmbVar, null);
                        bk2Var.L$0 = ijaVar2;
                        bk2Var.L$1 = mmbVar;
                        bk2Var.L$2 = null;
                        bk2Var.L$3 = null;
                        bk2Var.L$4 = null;
                        bk2Var.L$5 = null;
                        bk2Var.label = 4;
                        objP0 = ynb.p0(pv2VarI, dk2Var, bk2Var);
                        if (objP0 != bw2Var) {
                            mmbVar3 = mmbVar;
                            ijaVar = ijaVar2;
                        }
                        return bw2Var;
                    } catch (Throwable th2) {
                        th = th2;
                        ijaVar = ijaVar2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    mmbVar = mmbVar5;
                    ijaVar = ijaVar2;
                    throw th;
                }
            }
            if (i2 != 4) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar3 = (mmb) bk2Var.L$1;
            ijaVar = (ija) bk2Var.L$0;
            try {
                jzb.q(objP0);
            } catch (Throwable th4) {
                mmbVar = mmbVar3;
                th = th4;
            }
            qjaVar = (qja) mmbVar3.element;
            if (qjaVar != null) {
                if (!qjaVar.e) {
                    qjaVar.e = true;
                    if (qjaVar.b.a.q()) {
                        p8c.o(qjaVar.b, "ROLLBACK TRANSACTION");
                    }
                }
                mk2 mk2Var2 = qjaVar.b;
                mk2Var2.c = null;
                mk2Var2.d = null;
                ijaVar.e(mk2Var2);
            }
            return objP0;
        }
        jzb.q(objP0);
        if (this.e) {
            p8c.x(21, "Connection pool is closed");
            throw null;
        }
        qja qjaVar3 = (qja) this.d.get();
        if (qjaVar3 == null) {
            xj2 xj2Var = (xj2) bk2Var.getContext().F0(this.c);
            qjaVar3 = xj2Var != null ? xj2Var.b : null;
        }
        if (qjaVar3 == null) {
            ija ijaVar3 = z3 ? this.a : this.b;
            mmbVar = new mmb();
            try {
                pv2 context = bk2Var.getContext();
                yj2 yj2Var2 = this.c;
                long j = this.f;
                mv0 mv0Var = new mv0(this, z3, 2);
                bk2Var.L$0 = l26Var;
                bk2Var.L$1 = ijaVar3;
                bk2Var.L$2 = mmbVar;
                bk2Var.L$3 = context;
                bk2Var.L$4 = mmbVar;
                bk2Var.L$5 = yj2Var2;
                bk2Var.Z$0 = z3;
                bk2Var.label = 3;
                Object objB = ijaVar3.b(j, mv0Var, bk2Var);
                if (objB != bw2Var) {
                    l26Var2 = l26Var;
                    yj2Var = yj2Var2;
                    pv2Var = context;
                    ijaVar2 = ijaVar3;
                    objP0 = objB;
                    mmbVar2 = mmbVar;
                    mk2 mk2Var3 = (mk2) objP0;
                    mk2Var3.getClass();
                    pv2Var.getClass();
                    mk2Var3.c = pv2Var;
                    mk2Var3.d = new Throwable();
                    if (this.a == this.b) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    mmbVar2.element = new qja(yj2Var, mk2Var3, z2);
                    obj = mmbVar.element;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    qja qjaVar4 = (qja) obj;
                    pv2 pv2VarI2 = i7h.I(new xj2(this.c, qjaVar4), new fwe(qjaVar4, this.d));
                    dk2 dk2Var2 = new dk2(l26Var2, mmbVar, null);
                    bk2Var.L$0 = ijaVar2;
                    bk2Var.L$1 = mmbVar;
                    bk2Var.L$2 = null;
                    bk2Var.L$3 = null;
                    bk2Var.L$4 = null;
                    bk2Var.L$5 = null;
                    bk2Var.label = 4;
                    objP0 = ynb.p0(pv2VarI2, dk2Var2, bk2Var);
                    if (objP0 != bw2Var) {
                        mmbVar3 = mmbVar;
                        ijaVar = ijaVar2;
                        qjaVar = (qja) mmbVar3.element;
                        if (qjaVar != null) {
                            if (!qjaVar.e) {
                                qjaVar.e = true;
                                if (qjaVar.b.a.q()) {
                                    p8c.o(qjaVar.b, "ROLLBACK TRANSACTION");
                                }
                            }
                            mk2 mk2Var4 = qjaVar.b;
                            mk2Var4.c = null;
                            mk2Var4.d = null;
                            ijaVar.e(mk2Var4);
                        }
                        return objP0;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                ijaVar = ijaVar3;
            }
        } else {
            if (!z3 && qjaVar3.c) {
                p8c.x(1, "Cannot upgrade connection from reader to writer");
                throw null;
            }
            if (bk2Var.getContext().F0(this.c) == null) {
                pv2 pv2VarI3 = i7h.I(new xj2(this.c, qjaVar3), new fwe(qjaVar3, this.d));
                ck2 ck2Var = new ck2(l26Var, qjaVar3, null);
                bk2Var.label = 1;
                Object objP1 = ynb.p0(pv2VarI3, ck2Var, bk2Var);
                if (objP1 != bw2Var) {
                    return objP1;
                }
            } else {
                bk2Var.label = 2;
                Object objZ = l26Var.z(qjaVar3, bk2Var);
                if (objZ != bw2Var) {
                    return objZ;
                }
            }
        }
        return bw2Var;
        try {
            throw th;
        } catch (Throwable th6) {
            try {
                qja qjaVar5 = (qja) mmbVar.element;
                if (qjaVar5 == null) {
                    throw th6;
                }
                if (!qjaVar5.e) {
                    qjaVar5.e = true;
                    if (qjaVar5.b.a.q()) {
                        p8c.o(qjaVar5.b, "ROLLBACK TRANSACTION");
                    }
                }
                mk2 mk2Var5 = qjaVar5.b;
                mk2Var5.c = null;
                mk2Var5.d = null;
                ijaVar.e(mk2Var5);
                throw th6;
            } catch (Throwable th7) {
                bzd.m(th, th7);
                throw th6;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.c();
        this.b.c();
    }

    public ek2(a90 a90Var) {
        this.c = new yj2();
        this.d = new ThreadLocal();
        qfc qfcVar = ar4.b;
        this.f = y41.T(30, gr4.SECONDS);
        ija ijaVar = new ija(1, new p(28, a90Var));
        this.a = ijaVar;
        this.b = ijaVar;
    }
}

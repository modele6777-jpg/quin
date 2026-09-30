package defpackage;

import android.database.SQLException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qja implements l2f, gdb {
    public final yj2 a;
    public final mk2 b;
    public final boolean c;
    public final ad0 d;
    public volatile boolean e;

    public qja(yj2 yj2Var, mk2 mk2Var, boolean z) {
        yj2Var.getClass();
        this.a = yj2Var;
        this.b = mk2Var;
        this.c = z;
        this.d = new ad0();
    }

    @Override // defpackage.l2f
    public final Boolean a(xn2 xn2Var) {
        if (this.e) {
            p8c.x(21, "Connection is recycled");
            throw null;
        }
        xj2 xj2Var = (xj2) ((zn2) xn2Var).getContext().F0(this.a);
        if (xj2Var != null && xj2Var.b == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.a.q());
        }
        p8c.x(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.l2f
    public final Object b(k2f k2fVar, l26 l26Var, gbe gbeVar) {
        if (this.e) {
            p8c.x(21, "Connection is recycled");
            throw null;
        }
        xj2 xj2Var = (xj2) gbeVar.getContext().F0(this.a);
        if (xj2Var != null && xj2Var.b == this) {
            return g(k2fVar, l26Var, gbeVar);
        }
        p8c.x(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.gdb
    public final q8c c() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.jja
    public final Object d(String str, a26 a26Var, zn2 zn2Var) {
        pja pjaVar;
        mk2 mk2Var;
        d99 d99Var;
        if (zn2Var instanceof pja) {
            pjaVar = (pja) zn2Var;
            int i = pjaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjaVar.label = i - Integer.MIN_VALUE;
            } else {
                pjaVar = new pja(this, zn2Var);
            }
        } else {
            pjaVar = new pja(this, zn2Var);
        }
        Object obj = pjaVar.result;
        bw2 bw2Var = bw2.a;
        int i2 = pjaVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            if (this.e) {
                p8c.x(21, "Connection is recycled");
                throw null;
            }
            xj2 xj2Var = (xj2) pjaVar.getContext().F0(this.a);
            if (xj2Var == null || xj2Var.b != this) {
                p8c.x(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            mk2Var = this.b;
            pjaVar.L$0 = str;
            pjaVar.L$1 = a26Var;
            pjaVar.L$2 = mk2Var;
            pjaVar.label = 1;
            if (mk2Var.b.b(pjaVar) == bw2Var) {
                d99Var = mk2Var;
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d99 d99Var2 = (d99) pjaVar.L$2;
            a26Var = (a26) pjaVar.L$1;
            String str2 = (String) pjaVar.L$0;
            jzb.q(obj);
            d99Var = d99Var2;
            str = str2;
        }
        try {
            d99Var = mk2Var;
            kja kjaVar = new kja(this, this.b.W0(str));
            try {
                Object objD = a26Var.d(kjaVar);
                cgg.t(kjaVar, null);
                d99Var.h(null);
                return objD;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    cgg.t(kjaVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            d99Var.h(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(k2f k2fVar, zn2 zn2Var) {
        mja mjaVar;
        d99 d99Var;
        ad0 ad0Var = this.d;
        if (zn2Var instanceof mja) {
            mjaVar = (mja) zn2Var;
            int i = mjaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mjaVar.label = i - Integer.MIN_VALUE;
            } else {
                mjaVar = new mja(this, zn2Var);
            }
        } else {
            mjaVar = new mja(this, zn2Var);
        }
        Object obj = mjaVar.result;
        int i2 = mjaVar.label;
        mk2 mk2Var = this.b;
        if (i2 == 0) {
            jzb.q(obj);
            mjaVar.L$0 = k2fVar;
            mjaVar.L$1 = mk2Var;
            mjaVar.label = 1;
            Object objB = mk2Var.b.b(mjaVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            d99Var = mk2Var;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d99 d99Var2 = (d99) mjaVar.L$1;
            k2f k2fVar2 = (k2f) mjaVar.L$0;
            jzb.q(obj);
            d99Var = d99Var2;
            k2fVar = k2fVar2;
        }
        try {
            int i3 = ad0Var.c;
            if (ad0Var.isEmpty()) {
                int iOrdinal = k2fVar.ordinal();
                if (iOrdinal == 0) {
                    p8c.o(mk2Var, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    p8c.o(mk2Var, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new rf9();
                    }
                    p8c.o(mk2Var, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                p8c.o(mk2Var, "SAVEPOINT '" + i3 + '\'');
            }
            ad0Var.addLast(new lja(i3));
            wef wefVar = wef.a;
            d99Var.h(null);
            return wefVar;
        } catch (Throwable th) {
            d99Var.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(boolean z, zn2 zn2Var) {
        nja njaVar;
        d99 d99Var;
        ad0 ad0Var = this.d;
        if (zn2Var instanceof nja) {
            njaVar = (nja) zn2Var;
            int i = njaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                njaVar.label = i - Integer.MIN_VALUE;
            } else {
                njaVar = new nja(this, zn2Var);
            }
        } else {
            njaVar = new nja(this, zn2Var);
        }
        Object obj = njaVar.result;
        int i2 = njaVar.label;
        mk2 mk2Var = this.b;
        if (i2 == 0) {
            jzb.q(obj);
            njaVar.L$0 = mk2Var;
            njaVar.Z$0 = z;
            njaVar.label = 1;
            Object objB = mk2Var.b.b(njaVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            d99Var = mk2Var;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = njaVar.Z$0;
            d99Var = (d99) njaVar.L$0;
            jzb.q(obj);
        }
        try {
            if (ad0Var.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            lja ljaVar = (lja) x72.k0(ad0Var);
            if (z) {
                ljaVar.getClass();
                if (ad0Var.isEmpty()) {
                    p8c.o(mk2Var, "END TRANSACTION");
                } else {
                    p8c.o(mk2Var, "RELEASE SAVEPOINT '" + ljaVar.a + '\'');
                }
            } else if (ad0Var.isEmpty()) {
                p8c.o(mk2Var, "ROLLBACK TRANSACTION");
            } else {
                p8c.o(mk2Var, "ROLLBACK TRANSACTION TO SAVEPOINT '" + ljaVar.a + '\'');
            }
            wef wefVar = wef.a;
            d99Var.h(null);
            return wefVar;
        } catch (Throwable th) {
            d99Var.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(k2f k2fVar, l26 l26Var, zn2 zn2Var) throws Throwable {
        oja ojaVar;
        SQLException e;
        Throwable th;
        int i;
        boolean z;
        if (zn2Var instanceof oja) {
            ojaVar = (oja) zn2Var;
            int i2 = ojaVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ojaVar.label = i2 - Integer.MIN_VALUE;
            } else {
                ojaVar = new oja(this, zn2Var);
            }
        } else {
            ojaVar = new oja(this, zn2Var);
        }
        Object objZ = ojaVar.result;
        int i3 = ojaVar.label;
        Object obj = bw2.a;
        try {
            if (i3 == 0) {
                jzb.q(objZ);
                if (k2fVar == null) {
                    k2fVar = k2f.a;
                }
                ojaVar.L$0 = l26Var;
                ojaVar.label = 1;
                if (e(k2fVar, ojaVar) != obj) {
                }
                return obj;
            }
            if (i3 == 1) {
                l26Var = (l26) ojaVar.L$0;
                jzb.q(objZ);
            } else {
                if (i3 != 2) {
                    if (i3 == 3 || i3 == 4) {
                        Object obj2 = ojaVar.L$0;
                        jzb.q(objZ);
                        return obj2;
                    }
                    if (i3 != 5) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) ojaVar.L$1;
                    th = (Throwable) ojaVar.L$0;
                    try {
                        jzb.q(objZ);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        bzd.m(th, e);
                        throw th;
                    }
                }
                i = ojaVar.I$0;
                jzb.q(objZ);
            }
            z = i != 0;
            ojaVar.L$0 = objZ;
            ojaVar.label = 3;
            if (f(z, ojaVar) != obj) {
                return obj;
            }
            return objZ;
            v0a v0aVar = new v0a(1, this);
            ojaVar.L$0 = null;
            ojaVar.I$0 = 1;
            ojaVar.label = 2;
            objZ = l26Var.z(v0aVar, ojaVar);
            if (objZ != obj) {
                i = 1;
                if (i != 0) {
                }
                ojaVar.L$0 = objZ;
                ojaVar.label = 3;
                if (f(z, ojaVar) != obj) {
                    return objZ;
                }
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    ojaVar.L$0 = th;
                    ojaVar.L$1 = th3;
                    ojaVar.label = 5;
                    if (f(false, ojaVar) != obj) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    bzd.m(th, e);
                    throw th;
                }
            }
        }
    }
}

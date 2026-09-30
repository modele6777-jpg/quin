package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xi5 implements sif {
    public final gh1 a;
    public final n0e b;
    public final lkf c;
    public final s0f d;
    public final pkf e;
    public ajf f;
    public volatile int g;
    public volatile vfc h;
    public za2 i;

    public xi5(gh1 gh1Var, n0e n0eVar, lkf lkfVar, s0f s0fVar, pkf pkfVar) {
        gh1Var.getClass();
        n0eVar.getClass();
        lkfVar.getClass();
        s0fVar.getClass();
        this.a = gh1Var;
        this.b = n0eVar;
        this.c = lkfVar;
        this.d = s0fVar;
        this.e = pkfVar;
        this.g = 2;
        y7h.b(wef.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zn2 zn2Var) {
        qi5 qi5Var;
        xi5 xi5Var;
        ya2 ya2Var;
        long j2;
        if (zn2Var instanceof qi5) {
            qi5Var = (qi5) zn2Var;
            int i = qi5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qi5Var.label = i - Integer.MIN_VALUE;
            } else {
                qi5Var = new qi5(this, zn2Var);
            }
        } else {
            qi5Var = new qi5(this, zn2Var);
        }
        Object obj = qi5Var.result;
        int i2 = qi5Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            za2 za2Var = new za2();
            r45 r45Var = new r45(5, za2Var);
            js3 js3Var = ga4.a;
            wg6 wg6Var = mk8.a;
            xi5Var = this;
            ri5 ri5Var = new ri5(j, xi5Var, r45Var, null);
            qi5Var.L$0 = za2Var;
            qi5Var.J$0 = j;
            qi5Var.label = 1;
            Object objP0 = ynb.p0(wg6Var, ri5Var, qi5Var);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
            ya2Var = za2Var;
            j2 = j;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = qi5Var.J$0;
            ya2Var = (ya2) qi5Var.L$0;
            jzb.q(obj);
            xi5Var = this;
        }
        return ynb.y(xi5Var.c.a, null, new si5(ya2Var, j2, null), 3);
    }

    @Override // defpackage.sif
    public final void b(ajf ajfVar) {
        this.f = ajfVar;
        d(this.g, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zn2 zn2Var) {
        ti5 ti5Var;
        int i;
        if (zn2Var instanceof ti5) {
            ti5Var = (ti5) zn2Var;
            int i2 = ti5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ti5Var.label = i2 - Integer.MIN_VALUE;
            } else {
                ti5Var = new ti5(this, zn2Var);
            }
        } else {
            ti5Var = new ti5(this, zn2Var);
        }
        Object obj = ti5Var.result;
        bw2 bw2Var = bw2.a;
        int i3 = ti5Var.label;
        if (i3 == 0) {
            jzb.q(obj);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "FlashControl: Waiting for any ongoing update to be completed");
            }
            int i4 = this.g;
            za2 za2VarB = this.i;
            if (za2VarB == null) {
                za2VarB = y7h.b(wef.a);
            }
            ti5Var.I$0 = i4;
            ti5Var.label = 1;
            if (za2VarB.U0(ti5Var) == bw2Var) {
                return bw2Var;
            }
            i = i4;
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = ti5Var.I$0;
            jzb.q(obj);
        }
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "awaitFlashModeUpdate: initialFlashMode = " + i);
        }
        return new Integer(i);
    }

    public final za2 d(int i, boolean z) {
        if (b21.F(3, "CXCP")) {
            StringBuilder sbN = ub3.n(i, "setFlashAsync: flashMode = ", ", requestControl = ");
            sbN.append(this.f);
            Log.d("CXCP", sbN.toString());
        }
        za2 za2Var = new za2();
        if (this.f == null) {
            za2Var.i0(new ye1("Camera is not active."));
            return za2Var;
        }
        this.g = i;
        za2 za2Var2 = this.i;
        if (z) {
            if (za2Var2 != null) {
                za2Var2.i0(new ye1("There is a new flash mode being set or camera was closed"));
            }
            this.i = null;
        } else if (za2Var2 != null) {
            lmg.o0(za2Var, za2Var2);
        }
        this.i = za2Var;
        n0e n0eVar = this.b;
        synchronized (n0eVar.d) {
            n0eVar.h = i;
        }
        lmg.o0(n0eVar.f(), za2Var);
        return za2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
    
        if (defpackage.pa7.u(r7, r1) == r2) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.zn2 r11) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xi5.e(zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(zn2 zn2Var) {
        vi5 vi5Var;
        if (zn2Var instanceof vi5) {
            vi5Var = (vi5) zn2Var;
            int i = vi5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vi5Var.label = i - Integer.MIN_VALUE;
            } else {
                vi5Var = new vi5(this, zn2Var);
            }
        } else {
            vi5Var = new vi5(this, zn2Var);
        }
        Object obj = vi5Var.result;
        bw2 bw2Var = bw2.a;
        int i2 = vi5Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            js3 js3Var = ga4.a;
            wg6 wg6Var = mk8.a;
            wi5 wi5Var = new wi5(this, null);
            vi5Var.label = 1;
            if (ynb.p0(wg6Var, wi5Var, vi5Var) == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        if (mh3.M(this.a.b)) {
            n0e n0eVar = this.b;
            synchronized (n0eVar.d) {
                n0eVar.j = false;
            }
            n0eVar.f();
        }
        if (this.e.l0()) {
            this.d.c(0, true, (6 & 4) == 0);
        }
        return wef.a;
    }

    @Override // defpackage.sif
    public final void reset() {
        this.g = 2;
        this.h = null;
        za2 za2Var = this.i;
        if (za2Var != null) {
            za2Var.i0(new ye1("There is a new flash mode being set or camera was closed"));
        }
        this.i = null;
        d(2, true);
    }
}

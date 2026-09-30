package defpackage;

import ai.askquin.datastore.reviewreward.ReviewRewardStore;
import ai.askquin.model.reviewreward.ReviewRewardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p1c {
    public final od3 a;

    public p1c(od3 od3Var) {
        this.a = od3Var;
    }

    public static void e(String str) {
        if (v4e.Q(str)) {
            qc0.j("accountId must not be blank");
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(String str, String str2, long j, zn2 zn2Var) {
        w0c w0cVar;
        mmb mmbVar;
        if (zn2Var instanceof w0c) {
            w0cVar = (w0c) zn2Var;
            int i = w0cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                w0cVar.label = i - Integer.MIN_VALUE;
            } else {
                w0cVar = new w0c(this, zn2Var);
            }
        } else {
            w0cVar = new w0c(this, zn2Var);
        }
        w0c w0cVar2 = w0cVar;
        Object obj = w0cVar2.result;
        int i2 = w0cVar2.label;
        if (i2 == 0) {
            jzb.q(obj);
            e(str);
            if (v4e.Q(str2)) {
                qc0.j("exposureId must not be blank");
                return null;
            }
            if (j <= 0) {
                qc0.j("exposedAtEpochMillis must be positive");
                return null;
            }
            mmb mmbVar2 = new mmb();
            x0c x0cVar = new x0c(str, mmbVar2, str2, j, null);
            w0cVar2.L$0 = null;
            w0cVar2.L$1 = null;
            w0cVar2.L$2 = mmbVar2;
            w0cVar2.J$0 = j;
            w0cVar2.label = 1;
            Object objA = this.a.a(x0cVar, w0cVar2);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
            mmbVar = mmbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) w0cVar2.L$2;
            jzb.q(obj);
        }
        return mmbVar.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, zn2 zn2Var) {
        y0c y0cVar;
        if (zn2Var instanceof y0c) {
            y0cVar = (y0c) zn2Var;
            int i = y0cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                y0cVar.label = i - Integer.MIN_VALUE;
            } else {
                y0cVar = new y0c(this, zn2Var);
            }
        } else {
            y0cVar = new y0c(this, zn2Var);
        }
        Object objB = y0cVar.result;
        int i2 = y0cVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            c1c c1cVarC = c(str);
            y0cVar.L$0 = null;
            y0cVar.label = 1;
            objB = tm7.B(c1cVarC, y0cVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
        }
        return Boolean.valueOf(((ReviewRewardState) objB).getStoreReturnPending());
    }

    public final c1c c(String str) {
        str.getClass();
        e(str);
        return new c1c(this.a.d, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, zn2 zn2Var) {
        d1c d1cVar;
        if (zn2Var instanceof d1c) {
            d1cVar = (d1c) zn2Var;
            int i = d1cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                d1cVar.label = i - Integer.MIN_VALUE;
            } else {
                d1cVar = new d1c(this, zn2Var);
            }
        } else {
            d1cVar = new d1c(this, zn2Var);
        }
        Object objB = d1cVar.result;
        int i2 = d1cVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            c1c c1cVarC = c(str);
            d1cVar.L$0 = null;
            d1cVar.label = 1;
            objB = tm7.B(c1cVarC, d1cVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
        }
        return ((ReviewRewardState) objB).getSnackbarExposure();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, ckb ckbVar, zn2 zn2Var) {
        h1c h1cVar;
        mmb mmbVar;
        if (zn2Var instanceof h1c) {
            h1cVar = (h1c) zn2Var;
            int i = h1cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                h1cVar.label = i - Integer.MIN_VALUE;
            } else {
                h1cVar = new h1c(this, zn2Var);
            }
        } else {
            h1cVar = new h1c(this, zn2Var);
        }
        Object obj = h1cVar.result;
        int i2 = h1cVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            e(str);
            mmb mmbVar2 = new mmb();
            i1c i1cVar = new i1c(str, ckbVar, mmbVar2, null);
            h1cVar.L$0 = null;
            h1cVar.L$1 = null;
            h1cVar.L$2 = mmbVar2;
            h1cVar.label = 1;
            Object objA = this.a.a(i1cVar, h1cVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
            mmbVar = mmbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) h1cVar.L$2;
            jzb.q(obj);
        }
        Object obj2 = mmbVar.element;
        if (obj2 != null) {
            return obj2;
        }
        qc0.p("Required value was null.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, String str2, zn2 zn2Var) {
        j1c j1cVar;
        mmb mmbVar;
        if (zn2Var instanceof j1c) {
            j1cVar = (j1c) zn2Var;
            int i = j1cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                j1cVar.label = i - Integer.MIN_VALUE;
            } else {
                j1cVar = new j1c(this, zn2Var);
            }
        } else {
            j1cVar = new j1c(this, zn2Var);
        }
        Object obj = j1cVar.result;
        int i2 = j1cVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            e(str);
            if (v4e.Q(str2)) {
                qc0.j("exposureId must not be blank");
                return null;
            }
            mmb mmbVar2 = new mmb();
            k1c k1cVar = new k1c(str, str2, mmbVar2, null);
            j1cVar.L$0 = null;
            j1cVar.L$1 = null;
            j1cVar.L$2 = mmbVar2;
            j1cVar.label = 1;
            Object objA = this.a.a(k1cVar, j1cVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
            mmbVar = mmbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) j1cVar.L$2;
            jzb.q(obj);
        }
        return mmbVar.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, zn2 zn2Var) {
        l1c l1cVar;
        mmb mmbVar;
        if (zn2Var instanceof l1c) {
            l1cVar = (l1c) zn2Var;
            int i = l1cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                l1cVar.label = i - Integer.MIN_VALUE;
            } else {
                l1cVar = new l1c(this, zn2Var);
            }
        } else {
            l1cVar = new l1c(this, zn2Var);
        }
        Object obj = l1cVar.result;
        int i2 = l1cVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            e(str);
            mmb mmbVar2 = new mmb();
            m1c m1cVar = new m1c(mmbVar2, str, null);
            l1cVar.L$0 = null;
            l1cVar.L$1 = mmbVar2;
            l1cVar.label = 1;
            Object objA = this.a.a(m1cVar, l1cVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
            mmbVar = mmbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) l1cVar.L$1;
            jzb.q(obj);
        }
        return mmbVar.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(xn2 xn2Var, a26 a26Var, String str) {
        n1c n1cVar;
        if (xn2Var instanceof n1c) {
            n1cVar = (n1c) xn2Var;
            int i = n1cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                n1cVar.label = i - Integer.MIN_VALUE;
            } else {
                n1cVar = new n1c(this, xn2Var);
            }
        } else {
            n1cVar = new n1c(this, xn2Var);
        }
        Object objA = n1cVar.result;
        int i2 = n1cVar.label;
        if (i2 == 0) {
            jzb.q(objA);
            e(str);
            o1c o1cVar = new o1c(null, a26Var, str);
            n1cVar.L$0 = str;
            n1cVar.L$1 = null;
            n1cVar.label = 1;
            objA = this.a.a(o1cVar, n1cVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) n1cVar.L$0;
            jzb.q(objA);
        }
        return bm8.B(((ReviewRewardStore) objA).getAccountStates(), str);
    }
}

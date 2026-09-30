package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z91 {
    public final hm9 a;

    public /* synthetic */ z91(hm9 hm9Var) {
        this.a = hm9Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(hm9 hm9Var, ae9 ae9Var, l26 l26Var, zn2 zn2Var) {
        y91 y91Var;
        l26 l26Var2;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (zn2Var instanceof y91) {
            y91Var = (y91) zn2Var;
            int i = y91Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                y91Var.label = i - Integer.MIN_VALUE;
            } else {
                y91Var = new y91(zn2Var);
            }
        } else {
            y91Var = new y91(zn2Var);
        }
        Object objA0 = y91Var.result;
        int i2 = y91Var.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objA0);
            y91Var.L$0 = null;
            y91Var.L$1 = null;
            y91Var.L$2 = l26Var;
            y91Var.L$3 = hm9Var;
            y91Var.label = 1;
            objA0 = bm8.a0(ae9Var, y91Var);
            if (objA0 != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable2 = (Closeable) y91Var.L$3;
                try {
                    jzb.q(objA0);
                    ym8.t(closeable2, null);
                    return objA0;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        ym8.t(closeable2, th);
                        throw th3;
                    }
                }
            }
            l26Var2 = (l26) y91Var.L$2;
            jzb.q(objA0);
            closeable = (Closeable) objA0;
            try {
                me9 me9VarZ = bm8.Z((ryb) closeable);
                y91Var.L$0 = null;
                y91Var.L$1 = null;
                y91Var.L$2 = null;
                y91Var.L$3 = closeable;
                y91Var.L$4 = null;
                y91Var.label = 3;
                objA0 = l26Var2.z(me9VarZ, y91Var);
                if (objA0 != bw2Var) {
                    closeable2 = closeable;
                    ym8.t(closeable2, null);
                    return objA0;
                }
                return bw2Var;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        hm9Var = (hm9) y91Var.L$3;
        l26Var = (l26) y91Var.L$2;
        jzb.q(objA0);
        btb btbVar = (btb) objA0;
        hm9Var.getClass();
        btbVar.getClass();
        cib cibVar = new cib(hm9Var, btbVar);
        y91Var.L$0 = null;
        y91Var.L$1 = null;
        y91Var.L$2 = l26Var;
        y91Var.L$3 = null;
        y91Var.label = 2;
        pl1 pl1Var = new pl1(1, k99.D(y91Var));
        pl1Var.v();
        pl1Var.x(new x(10, cibVar));
        FirebasePerfOkHttpClient.enqueue(cibVar, new jb1(pl1Var));
        objA0 = pl1Var.t();
        if (objA0 != bw2Var) {
            l26Var2 = l26Var;
            closeable = (Closeable) objA0;
            me9 me9VarZ2 = bm8.Z((ryb) closeable);
            y91Var.L$0 = null;
            y91Var.L$1 = null;
            y91Var.L$2 = null;
            y91Var.L$3 = closeable;
            y91Var.L$4 = null;
            y91Var.label = 3;
            objA0 = l26Var2.z(me9VarZ2, y91Var);
            if (objA0 != bw2Var) {
                closeable2 = closeable;
                ym8.t(closeable2, null);
                return objA0;
            }
        }
        return bw2Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z91) {
            return pa7.t(this.a, ((z91) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ")";
    }
}

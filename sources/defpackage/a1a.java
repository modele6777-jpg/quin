package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a1a implements l2f, gdb {
    public final l26 a;
    public final q8c b;
    public final AtomicInteger c;
    public k2f d;

    public a1a(l26 l26Var, q8c q8cVar) {
        q8cVar.getClass();
        this.a = l26Var;
        this.b = q8cVar;
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.l2f
    public final Boolean a(xn2 xn2Var) {
        return Boolean.valueOf(this.d != null || this.b.q());
    }

    @Override // defpackage.l2f
    public final Object b(k2f k2fVar, l26 l26Var, gbe gbeVar) {
        return this.a.z(new z0a(this, k2fVar, l26Var, null), gbeVar);
    }

    @Override // defpackage.gdb
    public final q8c c() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.jja
    public final Object d(String str, a26 a26Var, zn2 zn2Var) {
        x0a x0aVar;
        if (zn2Var instanceof x0a) {
            x0aVar = (x0a) zn2Var;
            int i = x0aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                x0aVar.label = i - Integer.MIN_VALUE;
            } else {
                x0aVar = new x0a(this, zn2Var);
            }
        } else {
            x0aVar = new x0a(this, zn2Var);
        }
        Object objA = x0aVar.result;
        int i2 = x0aVar.label;
        Object obj = bw2.a;
        if (i2 == 0) {
            jzb.q(objA);
            x0aVar.L$0 = str;
            x0aVar.L$1 = a26Var;
            x0aVar.label = 1;
            objA = a(x0aVar);
            if (objA != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                jzb.q(objA);
                return objA;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        a26Var = (a26) x0aVar.L$1;
        str = (String) x0aVar.L$0;
        jzb.q(objA);
        if (((Boolean) objA).booleanValue()) {
            y0a y0aVar = new y0a(this, str, a26Var, null);
            x0aVar.L$0 = null;
            x0aVar.L$1 = null;
            x0aVar.label = 2;
            Object objZ = this.a.z(y0aVar, x0aVar);
            return objZ == obj ? obj : objZ;
        }
        x8c x8cVarW0 = this.b.W0(str);
        try {
            Object objD = a26Var.d(x8cVarW0);
            cgg.t(x8cVarW0, null);
            return objD;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(x8cVarW0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(k2f k2fVar, l26 l26Var, zn2 zn2Var) {
        w0a w0aVar;
        if (zn2Var instanceof w0a) {
            w0aVar = (w0a) zn2Var;
            int i = w0aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                w0aVar.label = i - Integer.MIN_VALUE;
            } else {
                w0aVar = new w0a(this, zn2Var);
            }
        } else {
            w0aVar = new w0a(this, zn2Var);
        }
        Object objZ = w0aVar.result;
        int i2 = w0aVar.label;
        AtomicInteger atomicInteger = this.c;
        int i3 = 1;
        q8c q8cVar = this.b;
        try {
            if (i2 == 0) {
                jzb.q(objZ);
                int iOrdinal = k2fVar.ordinal();
                if (iOrdinal == 0) {
                    p8c.o(q8cVar, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    p8c.o(q8cVar, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        ap.c();
                        return null;
                    }
                    p8c.o(q8cVar, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.d = k2fVar;
                }
                Object v0aVar = new v0a(0, this);
                w0aVar.I$0 = 1;
                w0aVar.label = 1;
                objZ = l26Var.z(v0aVar, w0aVar);
                Object obj = bw2.a;
                if (objZ == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = w0aVar.I$0;
                jzb.q(objZ);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.d = null;
            }
            if (i3 != 0) {
                p8c.o(q8cVar, "END TRANSACTION");
                return objZ;
            }
            p8c.o(q8cVar, "ROLLBACK TRANSACTION");
            return objZ;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    p8c.o(q8cVar, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    bzd.m(th, e);
                }
                throw th2;
            }
        }
    }
}

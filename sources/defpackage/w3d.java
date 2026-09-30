package defpackage;

import io.sentry.android.core.b1;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w3d {
    public final yxe a;
    public final fc3 b;
    public final AtomicReference c;

    public w3d(pv2 pv2Var, yxe yxeVar, fc3 fc3Var) {
        pv2Var.getClass();
        yxeVar.getClass();
        fc3Var.getClass();
        this.a = yxeVar;
        this.b = fc3Var;
        this.c = new AtomicReference();
        ynb.V(jgb.k(pv2Var), null, null, new s3d(this, null), 3);
    }

    public final g0d a() throws Throwable {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object objI = z5c.I(nu4.a, new t3d(this, null));
            while (!atomicReference.compareAndSet(null, objI) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (g0d) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l == null || num == null) {
            return true;
        }
        this.a.getClass();
        return yxe.a().c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(g0d g0dVar, zn2 zn2Var) {
        u3d u3dVar;
        if (zn2Var instanceof u3d) {
            u3dVar = (u3d) zn2Var;
            int i = u3dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                u3dVar.label = i - Integer.MIN_VALUE;
            } else {
                u3dVar = new u3d(this, zn2Var);
            }
        } else {
            u3dVar = new u3d(this, zn2Var);
        }
        Object obj = u3dVar.result;
        int i2 = u3dVar.label;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                fc3 fc3Var = this.b;
                v3d v3dVar = new v3d(g0dVar, null);
                u3dVar.label = 1;
                Object objA = fc3Var.a(v3dVar, u3dVar);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
        } catch (IOException e) {
            b1.l("FirebaseSessions", "Failed to update config values: " + e);
        }
        return wef.a;
    }
}

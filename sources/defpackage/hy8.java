package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hy8 implements o05, whd {
    public final tx8 a;
    public final ze b;
    public final AtomicBoolean c;
    public final ace d;

    public hy8(tx8 tx8Var) {
        this.a = tx8Var;
        ze zeVar = new ze();
        zeVar.a = new Object();
        this.b = zeVar;
        this.c = new AtomicBoolean(false);
        this.d = new ace(new cy8(this, 0));
    }

    @Override // defpackage.o05
    public final void b(String str) {
        if (this.c.get()) {
            synchronized (this.b.a) {
                if (this.c.get() && str != null) {
                    this.a.g(str, true);
                }
            }
        }
    }

    @Override // defpackage.o05
    public final void c(String str, trd trdVar) throws JSONException {
        str.getClass();
        if (this.c.get()) {
            l1f l1fVar = new l1f();
            l1fVar.a(xh9.a().a(), "notification_permission");
            il ilVar = il.a;
            l1fVar.a(il.a(), "app_state");
            l1fVar.a("5.23.0", "app_version");
            l1fVar.a("android", "platform");
            ca2.a.getClass();
            l1fVar.a(ca2.c ? "global" : "cn", "region");
            hkg.j0().forEach(new al(new gl(2, l1fVar, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 23), 6));
            trdVar.d(l1fVar);
            JSONObject jSONObjectY = n16.Y(l1fVar.a);
            synchronized (this.b.a) {
                if (this.c.get()) {
                    this.a.k(str, jSONObjectY);
                }
            }
        }
    }

    @Override // defpackage.whd
    public final boolean d(s7a s7aVar) {
        if (!this.c.get()) {
            return false;
        }
        return ((Boolean) this.b.b(new jf6(21, this, s7aVar))).booleanValue();
    }

    @Override // defpackage.o05
    public final void e(a26 a26Var) {
        if (this.c.get()) {
            l1f l1fVar = new l1f();
            a26Var.d(l1fVar);
            this.b.b(new jf6(22, this, n16.Y(l1fVar.a)));
        }
    }

    @Override // defpackage.o05
    public final void f(String str) {
        if (this.c.get()) {
            synchronized (this.b.a) {
                if (this.c.get()) {
                    this.a.g(str, true);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(boolean z, boolean z2, zn2 zn2Var) throws Throwable {
        gy8 gy8Var;
        if (zn2Var instanceof gy8) {
            gy8Var = (gy8) zn2Var;
            int i = gy8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gy8Var.label = i - Integer.MIN_VALUE;
            } else {
                gy8Var = new gy8(this, zn2Var);
            }
        } else {
            gy8Var = new gy8(this, zn2Var);
        }
        Object objA = gy8Var.result;
        int i2 = gy8Var.label;
        AtomicBoolean atomicBoolean = this.c;
        if (i2 == 0) {
            jzb.q(objA);
            atomicBoolean.set(false);
            xx8 xx8Var = (xx8) this.d.getValue();
            gy8Var.Z$0 = z;
            gy8Var.Z$1 = z2;
            gy8Var.label = 1;
            objA = xx8Var.a(z, z2, gy8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = gy8Var.Z$1;
            jzb.q(objA);
        }
        atomicBoolean.set(z2);
        return objA;
    }

    @Override // defpackage.o05
    public final void reset() {
        this.b.b(new cy8(this, 2));
    }

    @Override // defpackage.o05
    public final void a() {
    }
}

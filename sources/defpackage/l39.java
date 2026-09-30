package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l39 implements j39 {
    public final Context a;
    public qn2 b;
    public final qz9 c = new qz9(1.0f);
    public lyd d;

    public l39(Context context) {
        this.a = context;
    }

    @Override // defpackage.pv2
    public final nv2 F0(ov2 ov2Var) {
        return i7h.s(this, ov2Var);
    }

    @Override // defpackage.pv2
    public final pv2 U(ov2 ov2Var) {
        return i7h.E(this, ov2Var);
    }

    @Override // defpackage.pv2
    public final Object V0(l26 l26Var, Object obj) {
        return l26Var.z(obj, this);
    }

    @Override // defpackage.j39
    public final float W() {
        q0e q0eVar;
        if (this.d == null) {
            Context context = this.a;
            w79 w79Var = g9g.a;
            synchronized (w79Var) {
                try {
                    Object objG = w79Var.g(context);
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        r41 r41VarA = urg.a(-1, null, null, 6);
                        ybc ybcVar = new ybc(new e9g(contentResolver, uriFor, new f9g(r41VarA, tq.r(Looper.getMainLooper())), r41VarA, context, null));
                        t8e t8eVarD = iqf.d();
                        js3 js3Var = ga4.a;
                        objG = if9.F(ybcVar, new qn2(i7h.I(t8eVarD, mk8.a)), new xzd(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        w79Var.m(context, objG);
                    }
                    q0eVar = (q0e) objG;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.c.k(((Number) q0eVar.getValue()).floatValue());
            qn2 qn2Var = this.b;
            if (qn2Var == null) {
                qc0.p("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.d = ynb.V(qn2Var, null, null, new k39(q0eVar, this, null), 3);
        }
        return this.c.j();
    }

    @Override // defpackage.pv2
    public final pv2 p0(pv2 pv2Var) {
        return i7h.I(this, pv2Var);
    }
}

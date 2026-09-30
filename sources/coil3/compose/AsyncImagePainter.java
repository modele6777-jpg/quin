package coil3.compose;

import android.os.Trace;
import defpackage.a26;
import defpackage.ald;
import defpackage.an2;
import defpackage.ar4;
import defpackage.aw2;
import defpackage.b21;
import defpackage.bn2;
import defpackage.bpa;
import defpackage.c82;
import defpackage.ch0;
import defpackage.crf;
import defpackage.dg7;
import defpackage.dw2;
import defpackage.fy9;
import defpackage.ga4;
import defpackage.gr4;
import defpackage.h3f;
import defpackage.hj6;
import defpackage.hld;
import defpackage.if9;
import defpackage.jgb;
import defpackage.k47;
import defpackage.k8e;
import defpackage.lyd;
import defpackage.m03;
import defpackage.m3f;
import defpackage.nu4;
import defpackage.nv2;
import defpackage.pa7;
import defpackage.pv2;
import defpackage.pw6;
import defpackage.q1c;
import defpackage.qfc;
import defpackage.qu3;
import defpackage.ru3;
import defpackage.rw6;
import defpackage.s0e;
import defpackage.sn4;
import defpackage.sv2;
import defpackage.sw6;
import defpackage.t0e;
import defpackage.vpb;
import defpackage.vz9;
import defpackage.wg0;
import defpackage.whb;
import defpackage.ww6;
import defpackage.x57;
import defpackage.xg0;
import defpackage.y41;
import defpackage.yg0;
import defpackage.ynb;
import defpackage.yw6;
import defpackage.z7c;
import defpackage.zdc;
import defpackage.zg0;
import defpackage.zv;
import defpackage.zw6;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/compose/AsyncImagePainter;", "Lfy9;", "Lvpb;", "wg0", "yg0", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = z7c.f)
public final class AsyncImagePainter extends fy9 implements vpb {
    public static final zv K0 = new zv(24);
    public ch0 F0;
    public wg0 G0;
    public final s0e H0;
    public final s0e I0;
    public final whb J0;
    public a26 Y;
    public c82 v;
    public boolean w;
    public dg7 x;
    public aw2 z;
    public final vz9 f = q1c.f(null);
    public float g = 1.0f;
    public long y = 9205357640488583168L;
    public a26 X = K0;
    public bn2 Z = an2.b;
    public int E0 = 1;

    public AsyncImagePainter(wg0 wg0Var) {
        this.G0 = wg0Var;
        this.H0 = t0e.a(wg0Var);
        s0e s0eVarA = t0e.a(xg0.a);
        this.I0 = s0eVarA;
        this.J0 = if9.n(s0eVarA);
    }

    @Override // defpackage.vpb
    public final void a() {
        dg7 dg7Var = this.x;
        if (dg7Var != null) {
            dg7Var.h(null);
        }
        this.x = null;
        Object objK = k();
        vpb vpbVar = objK instanceof vpb ? (vpb) objK : null;
        if (vpbVar != null) {
            vpbVar.a();
        }
        this.w = false;
    }

    @Override // defpackage.fy9
    public final boolean b(float f) {
        this.g = f;
        return true;
    }

    @Override // defpackage.vpb
    public final void c() {
        dg7 dg7Var = this.x;
        if (dg7Var != null) {
            dg7Var.h(null);
        }
        this.x = null;
        Object objK = k();
        vpb vpbVar = objK instanceof vpb ? (vpb) objK : null;
        if (vpbVar != null) {
            vpbVar.c();
        }
        this.w = false;
    }

    @Override // defpackage.vpb
    public final void d() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objK = k();
            vpb vpbVar = objK instanceof vpb ? (vpb) objK : null;
            if (vpbVar != null) {
                vpbVar.d();
            }
            l();
            this.w = true;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.fy9
    public final boolean e(c82 c82Var) {
        this.v = c82Var;
        return true;
    }

    @Override // defpackage.fy9
    /* JADX INFO: renamed from: i */
    public final long getE0() {
        fy9 fy9VarK = k();
        if (fy9VarK != null) {
            return fy9VarK.getE0();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.fy9
    public final void j(sn4 sn4Var) {
        long jF = sn4Var.f();
        if (!ald.a(this.y, jF)) {
            this.y = jF;
        }
        fy9 fy9VarK = k();
        if (fy9VarK != null) {
            fy9VarK.g(sn4Var, sn4Var.f(), this.g, this.v);
        }
    }

    public final fy9 k() {
        return (fy9) this.f.getValue();
    }

    public final void l() {
        wg0 wg0Var = this.G0;
        if (wg0Var == null) {
            return;
        }
        aw2 aw2Var = this.z;
        if (aw2Var == null) {
            pa7.g0("scope");
            throw null;
        }
        zg0 zg0Var = new zg0(this, wg0Var, null);
        pv2 coroutineContext = aw2Var.getCoroutineContext();
        int i = crf.b;
        nv2 nv2VarF0 = coroutineContext.F0(hj6.Z);
        sv2 sv2Var = nv2VarF0 instanceof sv2 ? (sv2) nv2VarF0 : null;
        dw2 dw2Var = dw2.d;
        lyd lydVarU = (sv2Var == null || sv2Var.equals(ga4.b)) ? ynb.U(aw2Var, ga4.b, dw2Var, zg0Var) : ynb.U(jgb.k(new qu3(aw2Var.getCoroutineContext())), new ru3(sv2Var), dw2Var, zg0Var);
        dg7 dg7Var = this.x;
        if (dg7Var != null) {
            dg7Var.h(null);
        }
        this.x = lydVarU;
    }

    public final void m(wg0 wg0Var) {
        if (pa7.t(this.G0, wg0Var)) {
            return;
        }
        this.G0 = wg0Var;
        if (wg0Var == null) {
            dg7 dg7Var = this.x;
            if (dg7Var != null) {
                dg7Var.h(null);
            }
            this.x = null;
        } else if (this.w) {
            l();
        }
        if (wg0Var != null) {
            this.H0.n(null, wg0Var);
        }
    }

    public final sw6 n(sw6 sw6Var, boolean z) {
        pw6 pw6VarA = sw6.a(sw6Var);
        pw6VarA.d = new k47(11, sw6Var, this);
        rw6 rw6Var = sw6Var.s;
        if (rw6Var.e == null) {
            pw6VarA.j = hld.S;
        }
        if (rw6Var.f == null) {
            bn2 bn2Var = this.Z;
            int i = crf.b;
            pw6VarA.k = (pa7.t(bn2Var, an2.b) || pa7.t(bn2Var, an2.e)) ? zdc.b : zdc.a;
        }
        if (rw6Var.g == null) {
            pw6VarA.l = bpa.b;
        }
        if (z) {
            nu4 nu4Var = nu4.a;
            pw6VarA.f = nu4Var;
            pw6VarA.g = nu4Var;
            pw6VarA.h = nu4Var;
        }
        return pw6VarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public final void o(yg0 yg0Var) {
        zw6 zw6Var;
        fy9 painter;
        a26 a26Var;
        Object painter2;
        vpb vpbVar;
        vpb vpbVar2;
        s0e s0eVar = this.I0;
        yg0 yg0Var2 = (yg0) s0eVar.getValue();
        yg0 yg0Var3 = (yg0) this.X.d(yg0Var);
        s0eVar.m(yg0Var3);
        bn2 bn2Var = this.Z;
        if (!(yg0Var3 instanceof AsyncImagePainter$State$Success)) {
            if (yg0Var3 instanceof AsyncImagePainter$State$Error) {
                zw6Var = ((AsyncImagePainter$State$Error) yg0Var3).a;
            } else {
                painter = null;
            }
            if (painter == null) {
                painter = yg0Var3.getPainter();
            }
            this.f.setValue(painter);
            if (yg0Var2.getPainter() != yg0Var3.getPainter()) {
                painter2 = yg0Var2.getPainter();
                if (painter2 instanceof vpb) {
                    vpbVar = (vpb) painter2;
                } else {
                    vpbVar = null;
                }
                if (vpbVar != null) {
                    vpbVar.c();
                }
                Object painter3 = yg0Var3.getPainter();
                vpbVar2 = painter3 instanceof vpb ? (vpb) painter3 : null;
                if (vpbVar2 != null) {
                    vpbVar2.d();
                }
            }
            a26Var = this.Y;
            if (a26Var != null) {
                a26Var.d(yg0Var3);
            }
        }
        zw6Var = ((AsyncImagePainter$State$Success) yg0Var3).a;
        m3f m3fVarA = ((h3f) b21.z(zw6Var.h(), yw6.a)).a(x57.c, zw6Var);
        if (m3fVarA instanceof m03) {
            fy9 painter4 = yg0Var2.getPainter();
            if (!(yg0Var2 instanceof AsyncImagePainter$State$Loading)) {
                painter4 = null;
            }
            fy9 painter5 = yg0Var3.getPainter();
            qfc qfcVar = ar4.b;
            painter = new CrossfadePainter(painter4, painter5, bn2Var, y41.T(((m03) m3fVarA).b, gr4.MILLISECONDS), ((zw6Var instanceof k8e) && ((k8e) zw6Var).g) ? false : true, ((Boolean) b21.z(zw6Var.h(), ww6.b)).booleanValue());
        } else {
            painter = null;
        }
        if (painter == null) {
            painter = yg0Var3.getPainter();
        }
        this.f.setValue(painter);
        if (yg0Var2.getPainter() != yg0Var3.getPainter()) {
            painter2 = yg0Var2.getPainter();
            if (painter2 instanceof vpb) {
                vpbVar = (vpb) painter2;
            } else {
                vpbVar = null;
            }
            if (vpbVar != null) {
                vpbVar.c();
            }
            Object painter6 = yg0Var3.getPainter();
            if (painter6 instanceof vpb) {
            }
            if (vpbVar2 != null) {
                vpbVar2.d();
            }
        }
        a26Var = this.Y;
        if (a26Var != null) {
            a26Var.d(yg0Var3);
        }
    }
}

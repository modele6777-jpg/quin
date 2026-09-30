package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bf1 implements ef1 {
    public final gh1 b;
    public final xi5 c;
    public final f2e d;
    public final s0f e;
    public final dj8 f;
    public final ceg g;
    public final wb1 h;
    public final ekf i;
    public final lkf j;

    public bf1(gh1 gh1Var, wy4 wy4Var, xi5 xi5Var, yn5 yn5Var, f2e f2eVar, s0f s0fVar, dj8 dj8Var, aeg aegVar, ceg cegVar, wb1 wb1Var, ekf ekfVar, lkf lkfVar, yuf yufVar) {
        gh1Var.getClass();
        wy4Var.getClass();
        xi5Var.getClass();
        yn5Var.getClass();
        f2eVar.getClass();
        s0fVar.getClass();
        dj8Var.getClass();
        aegVar.getClass();
        cegVar.getClass();
        wb1Var.getClass();
        ekfVar.getClass();
        lkfVar.getClass();
        yufVar.getClass();
        this.b = gh1Var;
        this.c = xi5Var;
        this.d = f2eVar;
        this.e = s0fVar;
        this.f = dj8Var;
        this.g = cegVar;
        this.h = wb1Var;
        this.i = ekfVar;
        this.j = lkfVar;
    }

    @Override // defpackage.ef1
    public final void a() {
        this.g.a();
    }

    @Override // defpackage.ef1
    public final void b(vzc vzcVar) {
        this.g.b(vzcVar);
    }

    @Override // defpackage.ef1
    public final void c(qh2 qh2Var) {
        qh2Var.getClass();
        wb1 wb1Var = this.h;
        mjg mjgVar = new mjg(7);
        qh2Var.g(new bo1(0, mjgVar, qh2Var));
        bs9 bs9VarD = bs9.d((k79) mjgVar.a);
        wb1Var.getClass();
        xb1 xb1Var = wb1Var.a;
        synchronized (xb1Var.a) {
            for (no0 no0Var : bs9VarD.b()) {
                no0Var.getClass();
                ((k79) xb1Var.c.b).n(no0Var, ph2.a, bs9VarD.c(no0Var));
            }
        }
        bm8.J(lmg.O(wb1Var.a.a(wb1Var.d, true), "addCaptureRequestOptions"));
    }

    @Override // defpackage.ef1
    public final void d(int i) {
        boolean z = true;
        this.c.d(i, true);
        if (i != 1 && i != 0) {
            z = false;
        }
        this.g.e(z);
    }

    @Override // defpackage.ef1
    public final void e(vfc vfcVar) {
        this.c.h = vfcVar;
    }

    @Override // defpackage.ef1
    public final m88 f(ArrayList arrayList, int i, int i2) {
        f2e f2eVar = this.d;
        f2eVar.getClass();
        za2 za2Var = new za2();
        ynb.V(f2eVar.b.f, null, null, new z1e(arrayList, i, i2, za2Var, f2eVar, null), 3);
        return bm8.J(lmg.O(za2Var, "Deferred.asListenableFuture"));
    }

    @Override // defpackage.ef1
    public final m88 g(boolean z) {
        Integer num;
        xg1 xg1Var = yg1.o;
        yg1 yg1Var = this.b.b;
        xg1Var.getClass();
        yg1Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key.getClass();
        int[] iArr = (int[]) ((nc1) yg1Var).c(key);
        if (!(iArr == null ? false : qd0.T(iArr, 6)) || ((num = (Integer) this.f.f.d()) != null && num.intValue() == -1)) {
            return bm8.J(bm8.d0(new t36(lmg.O(s0f.a(this.e, z, 6), "Deferred.asListenableFuture")), new vd9(21, new r82(22)), g94.a()));
        }
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "Unable to enable/disable torch when low-light boost is on.");
        }
        return new tx6(1, new IllegalStateException("Torch can not be enabled/disable when low-light boost is on!"));
    }

    @Override // defpackage.ef1
    public final qh2 h() {
        ssg ssgVar;
        xb1 xb1Var = this.h.a;
        synchronized (xb1Var.a) {
            od1 od1VarG = xb1Var.c.g();
            mjg mjgVar = new mjg(7);
            od1VarG.g(new bo1(0, mjgVar, od1VarG));
            ssgVar = new ssg(7, bs9.d((k79) mjgVar.a));
        }
        return ssgVar;
    }

    @Override // defpackage.ef1
    public final void i() {
        wb1 wb1Var = this.h;
        xb1 xb1Var = wb1Var.a;
        synchronized (xb1Var.a) {
            xb1Var.c = new vd9(8);
        }
        bm8.J(lmg.O(wb1Var.a.a(wb1Var.d, true), "clearCaptureRequestOptions"));
    }

    @Override // defpackage.ef1
    public final m88 j(int i) {
        pif pifVarH = this.i.h();
        if (pifVarH == null) {
            return new tx6(1, new ye1("Camera is not active."));
        }
        qn2 qn2Var = this.j.f;
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        la1Var.a = af1.class;
        try {
            la1Var.a = ynb.V(qn2Var, null, null, new ze1(la1Var, null, pifVarH, i, this, 1), 3);
            return pa1Var;
        } catch (Exception e) {
            pa1Var.a(e);
            return pa1Var;
        }
    }
}

package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dj8 implements sif {
    public final n0e a;
    public final lkf b;
    public ajf c;
    public final boolean d;
    public boolean e;
    public final v69 f;
    public final AtomicInteger g;
    public ya2 h;
    public nu3 i;

    public dj8(yg1 yg1Var, n0e n0eVar, lkf lkfVar, w92 w92Var) {
        n0eVar.getClass();
        lkfVar.getClass();
        w92Var.getClass();
        this.a = n0eVar;
        this.b = lkfVar;
        boolean z = false;
        if (yg1Var != null) {
            yg1.o.getClass();
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
            key.getClass();
            int[] iArr = (int[]) ((nc1) yg1Var).c(key);
            if (iArr == null ? false : qd0.T(iArr, 6)) {
                z = true;
            }
        }
        this.d = z;
        this.f = new v69(-1);
        this.g = new AtomicInteger(-1);
        if (z) {
            w92Var.a(new aj8(this), lkfVar.e);
        }
    }

    public final void a(List list) {
        if (this.d) {
            if (list.isEmpty()) {
                this.i = y7h.b(Boolean.FALSE);
            } else {
                this.i = ynb.y(this.b.f, null, new bj8(this, list, null), 3);
            }
        }
    }

    @Override // defpackage.sif
    public final void b(ajf ajfVar) {
        this.c = ajfVar;
        if (this.e) {
            if (ajfVar != null) {
                d(true, false);
            } else {
                c(this.f, 0);
            }
        }
    }

    public final void c(v69 v69Var, int i) {
        if (this.g.getAndSet(i) != i) {
            if (p8c.t()) {
                v69Var.k(Integer.valueOf(i));
            } else {
                v69Var.i(Integer.valueOf(i));
            }
        }
    }

    public final za2 d(boolean z, boolean z2) {
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "LowLightBoostControl#setLowLightBoostAsync: lowLightBoost = " + z);
        }
        za2 za2Var = new za2();
        if (this.d) {
            ynb.V(this.b.f, null, null, new cj8(null, this, za2Var, z, z2), 3);
            return za2Var;
        }
        za2Var.i0(new IllegalStateException("Low Light Boost is not supported!"));
        return za2Var;
    }

    @Override // defpackage.sif
    public final void reset() {
        ya2 ya2Var = this.h;
        if (ya2Var != null) {
            ((za2) ya2Var).i0(new ye1("There is a new enableLowLightBoost being set"));
        }
        this.h = null;
        d(false, true);
    }
}

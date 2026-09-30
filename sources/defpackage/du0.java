package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class du0 {
    public final au0 c;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object e = null;
    public float f = -1.0f;
    public float g = -1.0f;

    public du0(List list) {
        au0 cu0Var;
        if (list.isEmpty()) {
            cu0Var = new gec(13);
        } else {
            cu0Var = list.size() == 1 ? new cu0(list) : new bu0(list);
        }
        this.c = cu0Var;
    }

    public final void a(zt0 zt0Var) {
        this.a.add(zt0Var);
    }

    public final float b() {
        Interpolator interpolator;
        bp7 bp7VarP = this.c.p();
        if (bp7VarP == null || bp7VarP.c() || (interpolator = bp7VarP.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(c());
    }

    public final float c() {
        if (this.b) {
            return 0.0f;
        }
        bp7 bp7VarP = this.c.p();
        if (bp7VarP.c()) {
            return 0.0f;
        }
        return (this.d - bp7VarP.b()) / (bp7VarP.a() - bp7VarP.b());
    }

    public Object d() {
        float fC = c();
        au0 au0Var = this.c;
        if (au0Var.o(fC) && !h()) {
            return this.e;
        }
        bp7 bp7VarP = au0Var.p();
        Interpolator interpolator = bp7VarP.e;
        Interpolator interpolator2 = bp7VarP.f;
        Object objE = (interpolator == null || interpolator2 == null) ? e(bp7VarP, b()) : f(bp7VarP, fC, interpolator.getInterpolation(fC), interpolator2.getInterpolation(fC));
        this.e = objE;
        return objE;
    }

    public abstract Object e(bp7 bp7Var, float f);

    public Object f(bp7 bp7Var, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027 A[PHI: r3
  0x0027: PHI (r3v4 float) = (r3v3 float), (r3v1 float) binds: [B:20:0x003c, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public void g(float f) {
        au0 au0Var = this.c;
        if (au0Var.isEmpty()) {
            return;
        }
        float fV = this.f;
        if (fV == -1.0f) {
            fV = au0Var.v();
            this.f = fV;
        }
        float f2 = fV;
        if (f >= fV) {
            float fU = this.g;
            if (fU == -1.0f) {
                fU = au0Var.u();
                this.g = fU;
            }
            f2 = fU;
            if (f > fU) {
                if (f2 == -1.0f) {
                    f = au0Var.u();
                    this.g = f;
                } else {
                    f = f2;
                }
            }
        } else if (f2 == -1.0f) {
            f = au0Var.v();
            this.f = f;
        } else {
            f = f2;
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (!au0Var.q(f)) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((zt0) arrayList.get(i)).a();
            i++;
        }
    }

    public boolean h() {
        return false;
    }
}

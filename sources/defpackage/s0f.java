package defpackage;

import android.os.Build;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s0f implements sif {
    public final n0e a;
    public ajf b;
    public final boolean c;
    public r0f d;
    public final v69 e;
    public final boolean f;
    public final int g;
    public final v69 h;
    public za2 i;
    public za2 j;

    public s0f(gh1 gh1Var, n0e n0eVar, lkf lkfVar) {
        gh1Var.getClass();
        n0eVar.getClass();
        lkfVar.getClass();
        this.a = n0eVar;
        this.c = oa7.T(gh1Var);
        boolean z = false;
        this.e = new v69(0);
        xg1 xg1Var = yg1.o;
        yg1 yg1Var = gh1Var.b;
        xg1Var.getClass();
        yg1Var.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && v60.f(yg1Var)) {
            z = true;
        }
        this.f = z;
        int iD = i >= 35 ? v60.d(yg1Var) : 1;
        this.g = iD;
        if (i >= 35) {
            v60.e(yg1Var);
        }
        this.h = new v69(Integer.valueOf(iD));
    }

    public static za2 a(s0f s0fVar, boolean z, int i) {
        return s0fVar.c(z ? 1 : 0, (i & 2) != 0, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    @Override // defpackage.sif
    public final void b(ajf ajfVar) {
        boolean z;
        this.b = ajfVar;
        if (this.d != null) {
            Integer num = (Integer) this.e.d();
            if (num != null) {
                z = num.intValue() == 1;
            }
            a(this, z, 4);
        }
    }

    public final za2 c(int i, boolean z, boolean z2) {
        int i2;
        Object objE;
        n0e n0eVar = this.a;
        if (b21.F(3, "CXCP")) {
            StringBuilder sb = new StringBuilder("TorchControl#setTorchAsync: torch mode = ");
            sb.append((Object) ("TorchMode(value=" + i + ')'));
            Log.d("CXCP", sb.toString());
        }
        za2 za2Var = new za2();
        if (!z2 && !this.c) {
            za2Var.i0(new IllegalStateException("No flash unit"));
            return za2Var;
        }
        ajf ajfVar = this.b;
        if (ajfVar == null) {
            za2Var.i0(new ye1("Camera is not active."));
            return za2Var;
        }
        e(i);
        za2 za2Var2 = this.i;
        if (z) {
            if (za2Var2 != null) {
                za2Var2.i0(new ye1("There is a new enableTorch being set"));
            }
            this.i = null;
        } else if (za2Var2 != null) {
            lmg.o0(za2Var, za2Var2);
        }
        this.i = za2Var;
        Integer num = i == 0 ? null : 1;
        synchronized (n0eVar.d) {
            n0eVar.k = num;
        }
        n0eVar.f();
        List list = th.b;
        th thVarN = x57.N(n0eVar.e());
        if (thVarN != null) {
            i2 = thVarN.a;
        } else {
            if (b21.F(5, "CXCP")) {
                b1.l("CXCP", "TorchControl#setTorchAsync: Failed to convert ae mode of value " + n0eVar.e() + " with AeMode.fromIntOrNull, fallback to AeMode.ON");
            }
            i2 = 1;
        }
        if (i == 0) {
            objE = ajfVar.e(i2);
        } else {
            if (i == 1) {
                Integer num2 = (Integer) this.h.d();
                if (num2 != null) {
                    f(num2.intValue());
                }
            } else {
                f(this.g);
            }
            objE = ajfVar.a();
        }
        ule uleVar = new ule(21);
        objE.getClass();
        ((rg7) objE).E(new w6(objE, za2Var, uleVar, 23));
        return za2Var;
    }

    public final void e(int i) {
        this.d = new r0f(i);
        int i2 = i != 1 ? 0 : 1;
        boolean zT = p8c.t();
        v69 v69Var = this.e;
        if (zT) {
            v69Var.k(Integer.valueOf(i2));
        } else {
            v69Var.i(Integer.valueOf(i2));
        }
    }

    public final void f(int i) {
        nu3 nu3VarB;
        za2 za2Var = new za2();
        if (Build.VERSION.SDK_INT < 35 || !this.f) {
            za2Var.i0(new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return;
        }
        za2 za2Var2 = this.j;
        if (za2Var2 != null) {
            if (za2Var2 != null) {
                za2Var2.i0(new ye1("There is a new torch strength being set"));
            }
            this.j = null;
        }
        this.j = za2Var;
        za2Var.E(new trd(16, this));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        v60.g(linkedHashMap, i);
        ajf ajfVar = this.b;
        if (ajfVar == null || (nu3VarB = ajf.b(ajfVar, linkedHashMap)) == null) {
            za2Var.i0(new ye1("Camera is not active."));
        } else {
            lmg.o0(nu3VarB, za2Var);
        }
    }

    @Override // defpackage.sif
    public final void reset() {
        za2 za2Var = this.i;
        if (za2Var != null) {
            za2Var.i0(new ye1("There is a new enableTorch being set"));
        }
        this.i = null;
        za2 za2Var2 = this.j;
        if (za2Var2 != null) {
            za2Var2.i0(new ye1("There is a new torch strength being set"));
        }
        this.j = null;
        if (this.d != null) {
            e(0);
            a(this, false, 6);
            this.d = null;
        }
    }
}

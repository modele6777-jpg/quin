package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ng8 extends lg8 implements tn8 {
    public final yf9 J0;
    public LinkedHashMap L0;
    public yn8 N0;
    public final e79 O0;
    public long K0 = 0;
    public final og8 M0 = new og8(this);

    public ng8(yf9 yf9Var) {
        this.J0 = yf9Var;
        e79 e79Var = ok9.a;
        this.O0 = new e79();
    }

    @Override // defpackage.lg8
    public final LayoutNode A0() {
        return this.J0.J0;
    }

    @Override // defpackage.lg8
    public final yn8 B0() {
        yn8 yn8Var = this.N0;
        if (yn8Var != null) {
            return yn8Var;
        }
        throw kv2.d("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.lg8
    public final lg8 C0() {
        yf9 yf9Var = this.J0.N0;
        if (yf9Var != null) {
            return yf9Var.f1();
        }
        return null;
    }

    @Override // defpackage.cea, defpackage.tn8
    public final Object E() {
        return this.J0.E();
    }

    @Override // defpackage.lg8
    public final long E0() {
        return this.K0;
    }

    @Override // defpackage.lg8
    public final void R0() {
        b0(this.K0, 0.0f, null);
    }

    public final long T0() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public void U0() {
        B0().b();
    }

    public final void Y0(long j) {
        if (!w67.b(this.K0, j)) {
            this.K0 = j;
            yf9 yf9Var = this.J0;
            rg8 rg8Var = yf9Var.J0.getLayoutDelegate().q;
            if (rg8Var != null) {
                rg8Var.r0();
            }
            lg8.J0(yf9Var);
        }
        if (this.Z) {
            return;
        }
        r0(B0());
    }

    public final long Z0(ng8 ng8Var, boolean z) {
        long jD = 0;
        while (!this.equals(ng8Var)) {
            if (!this.z || !z) {
                jD = w67.d(jD, this.K0);
            }
            yf9 yf9Var = this.J0.N0;
            yf9Var.getClass();
            this = yf9Var.f1();
            this.getClass();
        }
        return jD;
    }

    public final void a1(yn8 yn8Var) {
        LinkedHashMap linkedHashMap;
        if (yn8Var != null) {
            f0((((long) yn8Var.c()) & 4294967295L) | (((long) yn8Var.d()) << 32));
        } else {
            f0(0L);
        }
        if (!pa7.t(this.N0, yn8Var) && yn8Var != null && ((((linkedHashMap = this.L0) != null && !linkedHashMap.isEmpty()) || !yn8Var.a().isEmpty()) && !pa7.t(yn8Var.a(), this.L0))) {
            rg8 rg8Var = this.J0.J0.getLayoutDelegate().q;
            rg8Var.getClass();
            rg8Var.H0.f();
            LinkedHashMap linkedHashMap2 = this.L0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.L0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(yn8Var.a());
        }
        this.N0 = yn8Var;
    }

    @Override // defpackage.cea
    public final void b0(long j, float f, a26 a26Var) {
        Y0(j);
        if (this.Y) {
            return;
        }
        U0();
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.J0.getDensity();
    }

    @Override // defpackage.ga7
    public final cv7 getLayoutDirection() {
        return this.J0.J0.P0;
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.J0.h0();
    }

    @Override // defpackage.lg8, defpackage.ga7
    public final boolean k0() {
        return true;
    }

    @Override // defpackage.lg8
    public final lg8 s0() {
        yf9 yf9Var = this.J0.M0;
        if (yf9Var != null) {
            return yf9Var.f1();
        }
        return null;
    }

    @Override // defpackage.lg8
    public final bv7 t0() {
        return this.M0;
    }

    @Override // defpackage.lg8
    public final boolean u0() {
        return this.N0 != null;
    }
}

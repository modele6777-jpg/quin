package coil3.compose;

import defpackage.a19;
import defpackage.ald;
import defpackage.ar4;
import defpackage.bn2;
import defpackage.c82;
import defpackage.dec;
import defpackage.fy9;
import defpackage.mh3;
import defpackage.sn4;
import defpackage.sz9;
import defpackage.vd9;
import defpackage.z7c;
import defpackage.zxe;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/CrossfadePainter;", "Lfy9;", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = z7c.f)
public final class CrossfadePainter extends fy9 {
    public final long E0;
    public c82 Y;
    public fy9 Z;
    public final fy9 f;
    public final bn2 g;
    public final long v;
    public final boolean w;
    public zxe y;
    public boolean z;
    public final sz9 x = new sz9(0);
    public float X = 1.0f;

    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    public CrossfadePainter(fy9 fy9Var, fy9 fy9Var2, bn2 bn2Var, long j, boolean z, boolean z2) {
        this.f = fy9Var2;
        this.g = bn2Var;
        this.v = j;
        this.w = z;
        this.Z = fy9Var;
        long e0 = fy9Var != null ? fy9Var.getE0() : 0L;
        long e1 = fy9Var2 != null ? fy9Var2.getE0() : 0L;
        boolean z3 = e0 != 9205357640488583168L;
        boolean z4 = e1 != 9205357640488583168L;
        if (z2) {
            if (z4) {
                e0 = e1;
            } else if (!z3) {
                if (z3) {
                    e0 = 9205357640488583168L;
                } else {
                    e0 = 9205357640488583168L;
                }
            }
        } else if (z3 || !z4) {
            e0 = 9205357640488583168L;
        } else {
            e0 = (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (e0 >> 32)), Float.intBitsToFloat((int) (e1 >> 32))))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (e0 & 4294967295L)), Float.intBitsToFloat((int) (e1 & 4294967295L))))));
        }
        this.E0 = e0;
    }

    @Override // defpackage.fy9
    public final boolean b(float f) {
        this.X = f;
        return true;
    }

    @Override // defpackage.fy9
    public final boolean e(c82 c82Var) {
        this.Y = c82Var;
        return true;
    }

    @Override // defpackage.fy9
    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getE0() {
        return this.E0;
    }

    @Override // defpackage.fy9
    public final void j(sn4 sn4Var) {
        boolean z = this.z;
        fy9 fy9Var = this.f;
        if (z) {
            k(sn4Var, fy9Var, this.X);
            return;
        }
        zxe zxeVar = this.y;
        if (zxeVar == null) {
            zxeVar = new zxe(a19.a());
            this.y = zxeVar;
        }
        float fD = ar4.d(zxe.a(zxeVar.a)) / ar4.d(this.v);
        float fN = mh3.n(fD, 0.0f, 1.0f);
        float f = this.X;
        float f2 = fN * f;
        if (this.w) {
            f -= f2;
        }
        this.z = fD >= 1.0f;
        k(sn4Var, this.Z, f);
        k(sn4Var, fy9Var, f2);
        if (this.z) {
            this.Z = null;
        } else {
            sz9 sz9Var = this.x;
            sz9Var.k(sz9Var.j() + 1);
        }
    }

    public final void k(sn4 sn4Var, fy9 fy9Var, float f) {
        if (fy9Var == null || f <= 0.0f) {
            return;
        }
        long jF = sn4Var.f();
        long e0 = fy9Var.getE0();
        long jM = (e0 == 9205357640488583168L || ald.e(e0) || jF == 9205357640488583168L || ald.e(jF)) ? jF : dec.m(e0, this.g.k(e0, jF));
        if (jF == 9205357640488583168L || ald.e(jF)) {
            fy9Var.g(sn4Var, jM, f, this.Y);
            return;
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jF >> 32)) - Float.intBitsToFloat((int) (jM >> 32))) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jF & 4294967295L)) - Float.intBitsToFloat((int) (jM & 4294967295L))) / 2.0f;
        ((vd9) sn4Var.v0().c).z(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            fy9Var.g(sn4Var, jM, f, this.Y);
        } finally {
            float f2 = -fIntBitsToFloat;
            float f3 = -fIntBitsToFloat2;
            ((vd9) sn4Var.v0().c).z(f2, f3, f2, f3);
        }
    }
}

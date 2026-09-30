package androidx.compose.ui.draw;

import defpackage.ald;
import defpackage.bn2;
import defpackage.c82;
import defpackage.cea;
import defpackage.dec;
import defpackage.fy9;
import defpackage.i09;
import defpackage.im2;
import defpackage.kl2;
import defpackage.kv7;
import defpackage.l1;
import defpackage.lg8;
import defpackage.ll2;
import defpackage.pn4;
import defpackage.qu4;
import defpackage.tn8;
import defpackage.vd9;
import defpackage.vv7;
import defpackage.xl1;
import defpackage.yi;
import defpackage.yn8;
import defpackage.z7c;
import defpackage.zn8;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Lkv7;", "Li09;", "Lpn4;", "Lfy9;", "painter", "Lfy9;", "l1", "()Lfy9;", "q1", "(Lfy9;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class PainterNode extends i09 implements kv7, pn4 {
    public bn2 E0;
    public float F0;
    public c82 G0;
    public yi Z;
    private fy9 painter;

    public PainterNode(fy9 fy9Var, yi yiVar, bn2 bn2Var, float f, c82 c82Var) {
        this.painter = fy9Var;
        this.Z = yiVar;
        this.E0 = bn2Var;
        this.F0 = f;
        this.G0 = c82Var;
    }

    public static boolean n1(long j) {
        return !ald.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean o1(long j) {
        return !ald.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.kv7
    public final int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        if (!m1()) {
            return tn8Var.n(i);
        }
        long jP1 = p1(ll2.b(0, 0, 0, i, 7));
        return Math.max(kl2.j(jP1), tn8Var.n(i));
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        cea ceaVarV = tn8Var.v(p1(j));
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 12));
    }

    @Override // defpackage.kv7
    public final int h(lg8 lg8Var, tn8 tn8Var, int i) {
        if (!m1()) {
            return tn8Var.q(i);
        }
        long jP1 = p1(ll2.b(0, 0, 0, i, 7));
        return Math.max(kl2.j(jP1), tn8Var.q(i));
    }

    @Override // defpackage.kv7
    public final int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        if (!m1()) {
            return tn8Var.b(i);
        }
        long jP1 = p1(ll2.b(0, i, 0, 0, 13));
        return Math.max(kl2.i(jP1), tn8Var.b(i));
    }

    /* JADX INFO: renamed from: l1, reason: from getter */
    public final fy9 getPainter() {
        return this.painter;
    }

    public final boolean m1() {
        return this.painter.i() != 9205357640488583168L;
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        long jI = this.painter.i();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(o1(jI) ? Float.intBitsToFloat((int) (jI >> 32)) : Float.intBitsToFloat((int) (((vv7) im2Var).a.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(n1(jI) ? Float.intBitsToFloat((int) (jI & 4294967295L)) : Float.intBitsToFloat((int) (((vv7) im2Var).a.f() & 4294967295L)))) & 4294967295L);
        vv7 vv7Var = (vv7) im2Var;
        xl1 xl1Var = vv7Var.a;
        long jM = (Float.intBitsToFloat((int) (xl1Var.f() >> 32)) == 0.0f || Float.intBitsToFloat((int) (xl1Var.f() & 4294967295L)) == 0.0f) ? 0L : dec.m(jFloatToRawIntBits, this.E0.k(jFloatToRawIntBits, xl1Var.f()));
        long jA = this.Z.a((((long) Math.round(Float.intBitsToFloat((int) (jM >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (xl1Var.f() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (xl1Var.f() & 4294967295L)))) & 4294967295L), vv7Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((vd9) xl1Var.b.c).I(f, f2);
        try {
            this.painter.g(im2Var, jM, this.F0, this.G0);
            ((vd9) xl1Var.b.c).I(-f, -f2);
            vv7Var.a();
        } catch (Throwable th) {
            ((vd9) xl1Var.b.c).I(-f, -f2);
            throw th;
        }
    }

    public final long p1(long j) {
        boolean z = false;
        boolean z2 = kl2.d(j) && kl2.c(j);
        if (kl2.f(j) && kl2.e(j)) {
            z = true;
        }
        if ((!m1() && z2) || z) {
            return kl2.a(j, kl2.h(j), 0, kl2.g(j), 0, 10);
        }
        long jI = this.painter.i();
        int iRound = o1(jI) ? Math.round(Float.intBitsToFloat((int) (jI >> 32))) : kl2.j(j);
        int iRound2 = n1(jI) ? Math.round(Float.intBitsToFloat((int) (jI & 4294967295L))) : kl2.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ll2.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(ll2.g(iRound, j))) << 32);
        if (m1()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!o1(this.painter.i()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.painter.i() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!n1(this.painter.i()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.i() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : dec.m(jFloatToRawIntBits2, this.E0.k(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return kl2.a(j, ll2.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, ll2.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    public final void q1(fy9 fy9Var) {
        this.painter = fy9Var;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + this.Z + ", alpha=" + this.F0 + ", colorFilter=" + this.G0 + ")";
    }

    @Override // defpackage.kv7
    public final int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        if (!m1()) {
            return tn8Var.V(i);
        }
        long jP1 = p1(ll2.b(0, i, 0, 0, 13));
        return Math.max(kl2.i(jP1), tn8Var.V(i));
    }
}

package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xl1 implements sn4 {
    public final wl1 a;
    public final ta0 b;
    public rt c;
    public rt d;

    public xl1() {
        vw3 vw3Var = rs0.n;
        wl1 wl1Var = new wl1();
        wl1Var.a = vw3Var;
        wl1Var.b = cv7.a;
        wl1Var.c = lu4.a;
        wl1Var.d = 0L;
        this.a = wl1Var;
        this.b = new ta0(this);
    }

    public static dy9 a(xl1 xl1Var, long j, un4 un4Var, float f, int i) {
        dy9 dy9VarC = xl1Var.c(un4Var);
        if (f != 1.0f) {
            j = y72.b(j, y72.c(j) * f);
        }
        rt rtVar = (rt) dy9VarC;
        long jA = rtVar.a();
        int i2 = y72.l;
        if (!faf.a(jA, j)) {
            rtVar.f(j);
        }
        if (rtVar.c != null) {
            rtVar.j(null);
        }
        if (!pa7.t(rtVar.d, null)) {
            rtVar.g(null);
        }
        if (rtVar.b != i) {
            rtVar.e(i);
        }
        if (rtVar.a.isFilterBitmap()) {
            return dy9VarC;
        }
        rtVar.h(1);
        return dy9VarC;
    }

    @Override // defpackage.sn4
    public final void B(long j, long j2, long j3, float f, un4 un4Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.s(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), a(this, j, un4Var, f, i));
    }

    @Override // defpackage.sn4
    public final void I0(zt ztVar, long j, un4 un4Var) {
        this.a.c.d(ztVar, a(this, j, un4Var, 1.0f, 3));
    }

    @Override // defpackage.sn4
    public final void M0(b41 b41Var, long j, long j2, long j3, float f, un4 un4Var, c82 c82Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.c.b(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), b(b41Var, un4Var, f, c82Var, i, 1));
    }

    @Override // defpackage.sn4
    public final void Q(long j, float f, long j2, un4 un4Var) {
        this.a.c.p(f, j2, a(this, j, un4Var, 1.0f, 3));
    }

    @Override // defpackage.sn4
    public final void W0(b41 b41Var, long j, long j2, float f, un4 un4Var, c82 c82Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.c.s(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), b(b41Var, un4Var, f, c82Var, i, 1));
    }

    @Override // defpackage.sn4
    public final void X0(long j, float f, float f2, long j2, long j3, un4 un4Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, un4Var, 1.0f, 3));
    }

    public final dy9 b(b41 b41Var, un4 un4Var, float f, c82 c82Var, int i, int i2) {
        dy9 dy9VarC = c(un4Var);
        if (b41Var != null) {
            b41Var.a(f, f(), dy9VarC);
        } else {
            rt rtVar = (rt) dy9VarC;
            if (rtVar.c != null) {
                rtVar.j(null);
            }
            long jA = rtVar.a();
            long j = y72.b;
            if (!faf.a(jA, j)) {
                rtVar.f(j);
            }
            if (rtVar.a.getAlpha() / 255.0f != f) {
                rtVar.d(f);
            }
        }
        rt rtVar2 = (rt) dy9VarC;
        if (!pa7.t(rtVar2.d, c82Var)) {
            rtVar2.g(c82Var);
        }
        if (rtVar2.b != i) {
            rtVar2.e(i);
        }
        if (rtVar2.a.isFilterBitmap() == i2) {
            return dy9VarC;
        }
        rtVar2.h(i2);
        return dy9VarC;
    }

    public final dy9 c(un4 un4Var) {
        if (pa7.t(un4Var, oe5.a)) {
            rt rtVar = this.c;
            if (rtVar != null) {
                return rtVar;
            }
            rt rtVarH = urg.h();
            rtVarH.n(0);
            this.c = rtVarH;
            return rtVarH;
        }
        if (!(un4Var instanceof d5e)) {
            ap.c();
            return null;
        }
        rt rtVarH2 = this.d;
        if (rtVarH2 == null) {
            rtVarH2 = urg.h();
            rtVarH2.n(1);
            this.d = rtVarH2;
        }
        Paint paint = rtVarH2.a;
        float strokeWidth = paint.getStrokeWidth();
        d5e d5eVar = (d5e) un4Var;
        au auVar = d5eVar.e;
        float f = d5eVar.a;
        if (strokeWidth != f) {
            rtVarH2.m(f);
        }
        int iB = rtVarH2.b();
        int i = d5eVar.c;
        if (iB != i) {
            rtVarH2.k(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = d5eVar.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iC = rtVarH2.c();
        int i2 = d5eVar.d;
        if (iC != i2) {
            rtVarH2.l(i2);
        }
        if (!pa7.t(rtVarH2.e, auVar)) {
            rtVarH2.i(auVar);
        }
        return rtVarH2;
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.a.a.getDensity();
    }

    @Override // defpackage.sn4
    public final cv7 getLayoutDirection() {
        return this.a.b;
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.a.a.h0();
    }

    @Override // defpackage.sn4
    public final void i(float f, float f2, long j, ibb ibbVar) {
        this.a.c.p(f, j, b(ibbVar, oe5.a, f2, null, 3, 1));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.sn4
    public final void m(long j, long j2, long j3, float f, int i, au auVar, int i2) {
        vl1 vl1Var = this.a.c;
        rt rtVarH = this.d;
        if (rtVarH == null) {
            rtVarH = urg.h();
            rtVarH.n(1);
            this.d = rtVarH;
        }
        rt rtVar = rtVarH;
        Paint paint = rtVar.a;
        long jA = rtVar.a();
        int i3 = y72.l;
        if (!faf.a(jA, j)) {
            rtVar.f(j);
        }
        if (rtVar.c != null) {
            rtVar.j(null);
        }
        if (!pa7.t(rtVar.d, null)) {
            rtVar.g(null);
        }
        if (rtVar.b != i2) {
            rtVar.e(i2);
        }
        if (paint.getStrokeWidth() != f) {
            rtVar.m(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (rtVar.b() != i) {
            rtVar.k(i);
        }
        if (rtVar.c() != 0) {
            rtVar.l(0);
        }
        if (!pa7.t(rtVar.e, auVar)) {
            rtVar.i(auVar);
        }
        if (!paint.isFilterBitmap()) {
            rtVar.h(1);
        }
        vl1Var.a(j2, j3, rtVar);
    }

    @Override // defpackage.sn4
    public final void m0(long j, long j2, long j3, long j4, un4 un4Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.b(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, un4Var, 1.0f, 3));
    }

    @Override // defpackage.sn4
    public final void o(cv6 cv6Var, long j, float f, c82 c82Var, int i) {
        this.a.c.q(cv6Var, j, b(null, oe5.a, f, c82Var, i, 1));
    }

    @Override // defpackage.sn4
    public final ta0 v0() {
        return this.b;
    }

    @Override // defpackage.sn4
    public final void x(zt ztVar, b41 b41Var, float f, un4 un4Var, c82 c82Var, int i) {
        this.a.c.d(ztVar, b(b41Var, un4Var, f, c82Var, i, 1));
    }

    @Override // defpackage.sn4
    public final void z(cv6 cv6Var, long j, long j2, long j3, long j4, float f, c82 c82Var, int i, int i2) {
        this.a.c.j(cv6Var, j, j2, j3, j4, b(null, oe5.a, f, c82Var, i, i2));
    }
}

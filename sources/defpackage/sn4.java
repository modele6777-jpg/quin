package defpackage;

import android.graphics.Paint;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface sn4 extends sw3 {
    static void A(sn4 sn4Var, cv6 cv6Var, long j, float f, c82 c82Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 16) != 0) {
            c82Var = null;
        }
        c82 c82Var2 = c82Var;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        sn4Var.o(cv6Var, j2, f2, c82Var2, i);
    }

    static void I(sn4 sn4Var, ibb ibbVar, float f, long j, int i) {
        sn4Var.i(f, (i & 8) != 0 ? 1.0f : 0.3f, j, ibbVar);
    }

    static void K0(sn4 sn4Var, long j, long j2, long j3, long j4, un4 un4Var, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        sn4Var.m0(j, j5, (i & 4) != 0 ? d0(sn4Var.f(), j5) : j3, j4, (i & 16) != 0 ? oe5.a : un4Var);
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
    static void L0(vv7 vv7Var, b41 b41Var, long j, long j2, float f, float f2) {
        xl1 xl1Var = vv7Var.a;
        vl1 vl1Var = xl1Var.a.c;
        rt rtVarH = xl1Var.d;
        if (rtVarH == null) {
            rtVarH = urg.h();
            rtVarH.n(1);
            xl1Var.d = rtVarH;
        }
        Paint paint = rtVarH.a;
        if (b41Var != null) {
            b41Var.a(f2, xl1Var.f(), rtVarH);
        } else if (paint.getAlpha() / 255.0f != f2) {
            rtVarH.d(f2);
        }
        if (!pa7.t(rtVarH.d, null)) {
            rtVarH.g(null);
        }
        if (rtVarH.b != 3) {
            rtVarH.e(3);
        }
        if (paint.getStrokeWidth() != f) {
            rtVarH.m(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (rtVarH.b() != 0) {
            rtVarH.k(0);
        }
        if (rtVarH.c() != 0) {
            rtVarH.l(0);
        }
        if (!pa7.t(rtVarH.e, null)) {
            rtVarH.i(null);
        }
        if (!paint.isFilterBitmap()) {
            rtVarH.h(1);
        }
        vl1Var.a(j, j2, rtVarH);
    }

    static void O0(sn4 sn4Var, b41 b41Var, long j, long j2, float f, un4 un4Var, c82 c82Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        sn4Var.W0(b41Var, j3, (i2 & 4) != 0 ? d0(sn4Var.f(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? oe5.a : un4Var, (i2 & 32) != 0 ? null : c82Var, (i2 & 64) != 0 ? 3 : i);
    }

    static void R(sn4 sn4Var, zt ztVar, long j, un4 un4Var, int i) {
        if ((i & 8) != 0) {
            un4Var = oe5.a;
        }
        sn4Var.I0(ztVar, j, un4Var);
    }

    static void T(sn4 sn4Var, b41 b41Var, long j, long j2, long j3, float f, un4 un4Var, c82 c82Var, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j;
        sn4Var.M0(b41Var, j4, (i2 & 4) != 0 ? d0(sn4Var.f(), j4) : j2, j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? oe5.a : un4Var, (i2 & 64) != 0 ? null : c82Var, (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? 3 : i);
    }

    static void V0(sn4 sn4Var, long j, long j2, long j3, float f, int i, au auVar, int i2) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            auVar = null;
        }
        sn4Var.m(j, j2, j3, f, i, auVar, (i2 & 256) != 0 ? 3 : 0);
    }

    static long d0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static void g0(sn4 sn4Var, cv6 cv6Var, long j, long j2, long j3, long j4, float f, c82 c82Var, int i, int i2) {
        long height;
        long j5 = (i2 & 2) != 0 ? 0L : j;
        if ((i2 & 4) != 0) {
            height = (((long) ((ks) cv6Var).a.getHeight()) & 4294967295L) | (((long) ((ks) cv6Var).a.getWidth()) << 32);
        } else {
            height = j2;
        }
        sn4Var.z(cv6Var, j5, height, (i2 & 8) != 0 ? 0L : j3, (i2 & 16) != 0 ? height : j4, (i2 & 32) != 0 ? 1.0f : f, (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : c82Var, (i2 & 256) != 0 ? 3 : 16, (i2 & 512) != 0 ? 1 : i);
    }

    static void j0(vv7 vv7Var, ke6 ke6Var, a26 a26Var) {
        vv7Var.F0(db6.P0(vv7Var.a.f()), a26Var, ke6Var);
    }

    static void s(sn4 sn4Var, zt ztVar, b41 b41Var, float f, d5e d5eVar, c82 c82Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        un4 un4Var = d5eVar;
        if ((i2 & 8) != 0) {
            un4Var = oe5.a;
        }
        un4 un4Var2 = un4Var;
        if ((i2 & 16) != 0) {
            c82Var = null;
        }
        c82 c82Var2 = c82Var;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        sn4Var.x(ztVar, b41Var, f2, un4Var2, c82Var2, i);
    }

    static void w0(sn4 sn4Var, long j, float f, long j2, un4 un4Var, int i) {
        if ((i & 2) != 0) {
            f = ald.c(sn4Var.f()) / 2.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            j2 = sn4Var.H0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            un4Var = oe5.a;
        }
        sn4Var.Q(j, f2, j3, un4Var);
    }

    static void y0(sn4 sn4Var, long j, long j2, long j3, float f, d5e d5eVar, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j2;
        sn4Var.B(j, j4, (i2 & 4) != 0 ? d0(sn4Var.f(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? oe5.a : d5eVar, (i2 & 64) != 0 ? 3 : i);
    }

    void B(long j, long j2, long j3, float f, un4 un4Var, int i);

    default void F0(long j, a26 a26Var, ke6 ke6Var) {
        ke6Var.e(this, getLayoutDirection(), j, new rn4(this, a26Var));
    }

    default long H0() {
        return dec.f(v0().z());
    }

    void I0(zt ztVar, long j, un4 un4Var);

    void M0(b41 b41Var, long j, long j2, long j3, float f, un4 un4Var, c82 c82Var, int i);

    void Q(long j, float f, long j2, un4 un4Var);

    void W0(b41 b41Var, long j, long j2, float f, un4 un4Var, c82 c82Var, int i);

    void X0(long j, float f, float f2, long j2, long j3, un4 un4Var);

    default long f() {
        return v0().z();
    }

    cv7 getLayoutDirection();

    void i(float f, float f2, long j, ibb ibbVar);

    void m(long j, long j2, long j3, float f, int i, au auVar, int i2);

    void m0(long j, long j2, long j3, long j4, un4 un4Var);

    void o(cv6 cv6Var, long j, float f, c82 c82Var, int i);

    ta0 v0();

    void x(zt ztVar, b41 b41Var, float f, un4 un4Var, c82 c82Var, int i);

    void z(cv6 cv6Var, long j, long j2, long j3, long j4, float f, c82 c82Var, int i, int i2);
}

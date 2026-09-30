package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nae {
    public static final pr4 a = new pr4(0, new ond(16));

    public static final void a(j09 j09Var, x4d x4dVar, long j, long j2, float f, float f2, q11 q11Var, dd2 dd2Var, l46 l46Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j09Var = g09.a;
        }
        if ((i2 & 2) != 0) {
            x4dVar = g21.f;
        }
        if ((i2 & 4) != 0) {
            j = ((m82) l46Var.k(o82.a)).p;
        }
        if ((i2 & 8) != 0) {
            j2 = o82.b(j, l46Var);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            q11Var = null;
        }
        pr4 pr4Var = a;
        float f3 = f + ((yi4) l46Var.k(pr4Var)).a;
        mh3.b(new e1b[]{ib8.f(j2, em2.a), pr4Var.a(new yi4(f3))}, af1.b0(421772006, new kae(j09Var, x4dVar, j, f3, q11Var, f2, dd2Var), l46Var), l46Var, 56);
    }

    public static final void b(boolean z, x16 x16Var, j09 j09Var, boolean z2, x4d x4dVar, long j, float f, q11 q11Var, t69 t69Var, dd2 dd2Var, l46 l46Var, int i, int i2) {
        long jB = o82.b(j, l46Var);
        float f2 = (i2 & 256) != 0 ? 0.0f : f;
        t69 t69Var2 = (i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : t69Var;
        if (t69Var2 == null) {
            l46Var.f0(1528143336);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            t69Var2 = (t69) objR;
        } else {
            l46Var.f0(-227800369);
        }
        l46Var.r(false);
        t69 t69Var3 = t69Var2;
        pr4 pr4Var = a;
        float f3 = ((yi4) l46Var.k(pr4Var)).a + 0.0f;
        mh3.b(new e1b[]{ib8.f(jB, em2.a), pr4Var.a(new yi4(f3))}, af1.b0(1508735219, new mae(j09Var, x4dVar, j, f3, q11Var, z, t69Var3, z2, x16Var, f2, dd2Var), l46Var), l46Var, 56);
    }

    public static final void c(x16 x16Var, j09 j09Var, boolean z, x4d x4dVar, long j, long j2, float f, float f2, q11 q11Var, t69 t69Var, dd2 dd2Var, l46 l46Var, int i, int i2) {
        boolean z2 = (i2 & 4) != 0 ? true : z;
        x4d x4dVar2 = (i2 & 8) != 0 ? g21.f : x4dVar;
        long j3 = (i2 & 16) != 0 ? ((m82) l46Var.k(o82.a)).p : j;
        long jB = (i2 & 32) != 0 ? o82.b(j3, l46Var) : j2;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        float f4 = (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? 0.0f : f2;
        q11 q11Var2 = (i2 & 256) != 0 ? null : q11Var;
        t69 t69Var2 = (i2 & 512) == 0 ? t69Var : null;
        if (t69Var2 == null) {
            l46Var.f0(-1701037204);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            t69Var2 = (t69) objR;
        } else {
            l46Var.f0(2023337163);
        }
        l46Var.r(false);
        t69 t69Var3 = t69Var2;
        pr4 pr4Var = a;
        float f5 = ((yi4) l46Var.k(pr4Var)).a + f3;
        mh3.b(new e1b[]{ib8.f(jB, em2.a), pr4Var.a(new yi4(f5))}, af1.b0(849208527, new lae(j09Var, x4dVar2, j3, f5, q11Var2, t69Var3, z2, x16Var, f4, dd2Var), l46Var), l46Var, 56);
    }

    public static final j09 d(j09 j09Var, x4d x4dVar, long j, q11 q11Var, float f) {
        x4d x4dVar2;
        j09 j09VarZ;
        j09 j09VarX = g09.a;
        if (f > 0.0f) {
            x4dVar2 = x4dVar;
            j09VarZ = bzd.z(j09VarX, 0.0f, 0.0f, 0.0f, f, x4dVar2, 124895);
        } else {
            x4dVar2 = x4dVar;
            j09VarZ = j09VarX;
        }
        j09 j09VarD = j09Var.D(j09VarZ);
        if (q11Var != null) {
            j09VarX = db6.x(j09VarX, q11Var.a, q11Var.b, x4dVar2);
        }
        return oa7.E(tm7.o(j09VarD.D(j09VarX), j, x4dVar2), x4dVar2);
    }

    public static final long e(long j, float f, l46 l46Var) {
        m82 m82Var = (m82) l46Var.k(o82.a);
        boolean zBooleanValue = ((Boolean) l46Var.k(o82.b)).booleanValue();
        long j2 = m82Var.p;
        int i = y72.l;
        if (!faf.a(j, j2) || !zBooleanValue) {
            return j;
        }
        if (yi4.b(f, 0.0f)) {
            return j2;
        }
        return abg.r(y72.b(m82Var.t, ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f), j2);
    }
}

package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.text.Spanned;
import com.google.android.filament.Engine;
import com.google.android.filament.Material;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w6c {
    public static final v6c a(float f, float f2, float f3, float f4, float f5, float f6) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        return new v6c(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final v6c b(hkb hkbVar, long j, long j2, long j3, long j4) {
        return new v6c(hkbVar.a, hkbVar.b, hkbVar.c, hkbVar.d, j, j2, j3, j4);
    }

    public static final void c(boolean z, pu1 pu1Var, a26 a26Var, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i) {
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(738209611);
        int i2 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.e(pu1Var == null ? -1 : pu1Var.ordinal()) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var3) ? 131072 : 65536);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            int i4 = 11;
            i8c i8cVar = sf2.a;
            if (z) {
                l46Var.f0(1770182411);
                Object objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = new fnc(i4);
                    l46Var.p0(objR);
                }
                dec.b("page_view", (a26) objR, l46Var, 390);
                l46Var.r(false);
            } else {
                l46Var.f0(1770316951);
                l46Var.r(false);
            }
            String strQ = afc.q(R.string.seasonal_role_title, l46Var);
            boolean z2 = pu1Var != null;
            boolean z3 = ((i2 & 14) == 4) | ((i2 & 458752) == 131072);
            Object objR2 = l46Var.R();
            if (z3 || objR2 == i8cVar) {
                objR2 = new on2(z, x16Var3, i4);
                l46Var.p0(objR2);
            }
            xxb.d(2, strQ, z2, x16Var, (x16) objR2, x16Var2, af1.b0(810736554, new sqc(i3, pu1Var, a26Var), l46Var), l46Var, (i2 & 7168) | 1572870 | ((i2 << 3) & 458752));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jt(z, pu1Var, a26Var, x16Var, x16Var2, x16Var3, i, 10);
        }
    }

    public static final tjd d(tt7 tt7Var) {
        tt7Var.getClass();
        jgf jgfVarK0 = tt7Var.k0();
        tjd tjdVar = jgfVarK0 instanceof tjd ? (tjd) jgfVarK0 : null;
        if (tjdVar != null) {
            return tjdVar;
        }
        pd4.i(tt7Var, "This is should be simple type: ");
        return null;
    }

    public static float e(int i) {
        Set set = d7g.b;
        if (i == 2) {
            return 900.0f;
        }
        return i == 1 ? 480.0f : 0.0f;
    }

    public static final void f(long j) {
        xue[] xueVarArr = wue.b;
        if ((j & 1095216660480L) == 0) {
            k37.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void g(long j, long j2) {
        xue[] xueVarArr = wue.b;
        if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
            k37.a("Cannot perform operation for Unspecified type.");
        }
        if (xue.a(wue.b(j), wue.b(j2))) {
            return;
        }
        k37.a("Cannot perform operation for " + xue.b(wue.b(j)) + " and " + xue.b(wue.b(j2)));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[RETURN] */
    public static final sa1 h(sa1 sa1Var, wnb wnbVar, List list, boolean z) {
        List parameters = wnbVar.getParameters();
        if (parameters == null || !parameters.isEmpty()) {
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                if (sqf.i(((aob) it.next()).u())) {
                }
            }
            if (!sqf.i(wnbVar.getReturnType())) {
                return sa1Var;
            }
        } else if (!sqf.i(wnbVar.getReturnType())) {
            return sa1Var;
        }
        return new nrf(sa1Var, wnbVar, list, z);
    }

    public static final long i(double d) {
        return r(8589934592L, (float) d);
    }

    public static final Method j(Class cls, wnb wnbVar) {
        wnbVar.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            r82.h("No unbox method found in inline class: ", cls, " (calling ", wnbVar);
            return null;
        }
    }

    public static final long k(double d) {
        return r(4294967296L, (float) d);
    }

    public static final long l(int i) {
        return r(4294967296L, i);
    }

    public static final boolean m(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean n(yn7 yn7Var) {
        if (yn7Var.o()) {
            return false;
        }
        um7 um7VarB = yn7Var.B();
        em7 em7Var = um7VarB instanceof em7 ? (em7) um7VarB : null;
        Class clsT = em7Var != null ? af1.T(em7Var) : null;
        return (clsT == null || clsT.equals(Void.TYPE)) ? false : true;
    }

    public static final boolean o(v6c v6cVar) {
        long j = v6cVar.e;
        return (j >>> 32) == (4294967295L & j) && j == v6cVar.f && j == v6cVar.g && j == v6cVar.h;
    }

    public static final boolean p(bob bobVar) {
        hq7 hq7VarU;
        List listA = bobVar.a();
        if (listA == null || !listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                if (((aob) it.next()).t() != on7.a) {
                    return false;
                }
            }
        }
        String name = bobVar.getName();
        xm7 xm7VarS = bobVar.s();
        String str = null;
        nm7 nm7Var = xm7VarS instanceof nm7 ? (nm7) xm7VarS : null;
        if (nm7Var != null && (hq7VarU = nm7Var.U()) != null) {
            str = hq7VarU.m;
        }
        return pa7.t(name, str);
    }

    public static final Material q(Context context, Engine engine) {
        context.getClass();
        try {
            InputStream inputStreamOpen = context.getAssets().open("filament/tarot_box_lit.filamat");
            try {
                inputStreamOpen.getClass();
                byte[] bArrP0 = lmg.p0(inputStreamOpen);
                inputStreamOpen.close();
                try {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArrP0.length);
                    byteBufferAllocateDirect.put(bArrP0);
                    byteBufferAllocateDirect.flip();
                    long jNBuilderBuild = Material.nBuilderBuild(engine.getNativeObject(), byteBufferAllocateDirect, byteBufferAllocateDirect.remaining(), 0, 1, 0);
                    if (jNBuilderBuild != 0) {
                        return new Material(jNBuilderBuild);
                    }
                    throw new IllegalStateException("Couldn't create Material");
                } catch (Exception e) {
                    tec.t(hf8.Q, "TarotBox3D", "Failed to build Filament box material", e);
                    return null;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ym8.t(inputStreamOpen, th);
                    throw th2;
                }
            }
        } catch (IOException e2) {
            hf8.Q.getClass();
            ef8.a("TarotBox3D").h("Filament material asset missing: filament/tarot_box_lit.filamat", e2);
            return null;
        }
    }

    public static final long r(long j, float f) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        xue[] xueVarArr = wue.b;
        return jFloatToRawIntBits;
    }

    public static final tjd s(tjd tjdVar, List list, e7f e7fVar) {
        tjdVar.getClass();
        list.getClass();
        e7fVar.getClass();
        if (list.isEmpty() && e7fVar == tjdVar.a0()) {
            return tjdVar;
        }
        if (list.isEmpty()) {
            return tjdVar.n0(e7fVar);
        }
        if (!(tjdVar instanceof oy4)) {
            return rxg.T(e7fVar, tjdVar.c0(), list, tjdVar.i0());
        }
        oy4 oy4Var = (oy4) tjdVar;
        j7f j7fVar = oy4Var.b;
        my4 my4Var = oy4Var.c;
        qy4 qy4Var = oy4Var.d;
        boolean z = oy4Var.f;
        String[] strArr = oy4Var.g;
        return new oy4(j7fVar, my4Var, qy4Var, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static tt7 t(tt7 tt7Var, List list, h10 h10Var, int i) {
        if ((i & 2) != 0) {
            h10Var = tt7Var.getAnnotations();
        }
        tt7Var.getClass();
        if ((list.isEmpty() || list == tt7Var.Z()) && h10Var == tt7Var.getAnnotations()) {
            return tt7Var;
        }
        e7f e7fVarA0 = tt7Var.a0();
        if ((h10Var instanceof te5) && ((te5) h10Var).isEmpty()) {
            h10Var = hj6.c;
        }
        e7f e7fVarN = jzb.n(e7fVarA0, h10Var);
        jgf jgfVarK0 = tt7Var.k0();
        if (jgfVarK0 instanceof bj5) {
            bj5 bj5Var = (bj5) jgfVarK0;
            return rxg.E(s(bj5Var.b, list, e7fVarN), s(bj5Var.c, list, e7fVarN));
        }
        if (jgfVarK0 instanceof tjd) {
            return s((tjd) jgfVarK0, list, e7fVarN);
        }
        ap.c();
        return null;
    }

    public static /* synthetic */ tjd u(tjd tjdVar, List list, e7f e7fVar, int i) {
        if ((i & 1) != 0) {
            list = tjdVar.Z();
        }
        if ((i & 2) != 0) {
            e7fVar = tjdVar.a0();
        }
        return s(tjdVar, list, e7fVar);
    }

    public static final String v(gbd gbdVar) {
        gbdVar.getClass();
        int iOrdinal = gbdVar.ordinal();
        if (iOrdinal == 0) {
            return "qq";
        }
        if (iOrdinal == 1) {
            return "qq_zone";
        }
        if (iOrdinal == 2) {
            return "wechat";
        }
        if (iOrdinal == 3) {
            return "wechat_moments";
        }
        if (iOrdinal == 4) {
            return "share";
        }
        ap.c();
        return null;
    }

    public static final Class w(yn7 yn7Var) {
        um7 um7VarB = yn7Var != null ? yn7Var.B() : null;
        em7 em7Var = um7VarB instanceof em7 ? (em7) um7VarB : null;
        if (em7Var != null && em7Var.q()) {
            if (!sqf.k(yn7Var)) {
                return af1.R(em7Var);
            }
            yn7 yn7VarS = sqf.s(yn7Var);
            if (yn7VarS != null && !sqf.k(yn7VarS) && !n(yn7VarS)) {
                return af1.R(em7Var);
            }
        }
        return null;
    }

    public static final void x(String str, String str2) {
        b6d b6dVar = new b6d("button_click", bm8.H(new iy9("btn", "share"), new iy9("page_name", str), new iy9("pathway", str2)));
        x1f x1fVar = x1f.a;
        x1f.k(p05.a, new fbd(b6dVar, 1), 2);
    }

    public static final void y(b6d b6dVar) {
        x1f x1fVar = x1f.a;
        x1f.g(new r05(b6dVar.a), m1f.a, new fbd(b6dVar, 0));
    }

    public static int z(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}

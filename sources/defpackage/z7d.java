package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z7d implements n26 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ l26 g;
    public final /* synthetic */ x16 v;

    public /* synthetic */ z7d(String str, Object obj, boolean z, boolean z2, int i, boolean z3, l26 l26Var, x16 x16Var) {
        this.a = str;
        this.b = obj;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = z3;
        this.g = l26Var;
        this.v = x16Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        j09 j09Var = (j09) obj;
        l46 l46Var = (l46) obj2;
        ((Integer) obj3).getClass();
        j09Var.getClass();
        l46Var.f0(-428773780);
        a26 a26Var = (a26) l46Var.k(d8d.a);
        Object obj4 = this.b;
        final boolean z = this.c;
        final boolean z2 = this.d;
        if (a26Var == null) {
            j09 j09VarY = dj6.y(this.e, this.g, j09Var, obj4, this.a, z, z2, this.f);
            l46Var.r(false);
            return j09VarY;
        }
        final Context applicationContext = ((Context) l46Var.k(uq.b)).getApplicationContext();
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = af1.E(l46Var);
            l46Var.p0(objR);
        }
        final aw2 aw2Var = (aw2) objR;
        final e89 e89VarI = q1c.i(a26Var, l46Var);
        final e89 e89VarI2 = q1c.i(l46Var.k(sad.d), l46Var);
        Object objR2 = l46Var.R();
        if (objR2 == i8cVar) {
            objR2 = kv2.f(0, l46Var);
        }
        final s69 s69Var = (s69) objR2;
        sz9 sz9Var = (sz9) s69Var;
        int iJ = sz9Var.j();
        boolean zE = l46Var.e(iJ) | l46Var.g(obj4) | l46Var.h(z2);
        Object objR3 = l46Var.R();
        if (zE || objR3 == i8cVar) {
            objR3 = new LinkedHashSet();
            l46Var.p0(objR3);
        }
        final Set set = (Set) objR3;
        boolean zG = l46Var.g(obj4) | l46Var.h(z2) | l46Var.e(sz9Var.j());
        Object objR4 = l46Var.R();
        if (zG || objR4 == i8cVar) {
            objR4 = new dg7[1];
            l46Var.p0(objR4);
        }
        final dg7[] dg7VarArr = (dg7[]) objR4;
        boolean zI = l46Var.i(dg7VarArr);
        Object objR5 = l46Var.R();
        if (zI || objR5 == i8cVar) {
            objR5 = new ckb(22, dg7VarArr);
            l46Var.p0(objR5);
        }
        af1.g(dg7VarArr, (a26) objR5, l46Var);
        boolean zH = l46Var.h(z2) | l46Var.i(set) | l46Var.h(z);
        final x16 x16Var = this.v;
        boolean zG2 = l46Var.g(x16Var) | zH | l46Var.i(dg7VarArr) | l46Var.i(aw2Var) | l46Var.i(applicationContext) | l46Var.g(e89VarI) | l46Var.g(e89VarI2);
        Object objR6 = l46Var.R();
        if (zG2 || objR6 == i8cVar) {
            a26 a26Var2 = new a26() { // from class: a8d
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r19v0 */
                /* JADX WARN: Type inference failed for: r19v1 */
                /* JADX WARN: Type inference failed for: r19v2 */
                /* JADX WARN: Type inference failed for: r19v3, types: [android.graphics.Picture] */
                /* JADX WARN: Type inference failed for: r19v4, types: [android.graphics.Picture] */
                /* JADX WARN: Type inference failed for: r3v11 */
                /* JADX WARN: Type inference failed for: r3v3, types: [int] */
                /* JADX WARN: Type inference failed for: r3v4 */
                /* JADX WARN: Type inference failed for: r3v5, types: [s69] */
                /* JADX WARN: Type inference failed for: r3v9 */
                /* JADX WARN: Type inference failed for: r5v2, types: [android.graphics.Picture] */
                @Override // defpackage.a26
                public final Object d(Object obj5) throws Throwable {
                    ?? r3;
                    e89 e89Var;
                    wef wefVar;
                    ?? r19;
                    dg7[] dg7VarArr2 = dg7VarArr;
                    aw2 aw2Var2 = aw2Var;
                    Context context = applicationContext;
                    e89 e89Var2 = e89VarI;
                    e89 e89Var3 = e89VarI2;
                    s69 s69Var2 = s69Var;
                    im2 im2Var = (im2) obj5;
                    im2Var.getClass();
                    vv7 vv7Var = (vv7) im2Var;
                    xl1 xl1Var = vv7Var.a;
                    vv7Var.a();
                    boolean z3 = z2;
                    wef wefVar2 = wef.a;
                    if (z3) {
                        long jIntBitsToFloat = (((long) ((int) Float.intBitsToFloat((int) (xl1Var.f() & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (xl1Var.f() >> 32)))) << 32);
                        int i = (int) (jIntBitsToFloat >> 32);
                        if (i > 0 && (r3 = (int) (jIntBitsToFloat & 4294967295L)) > 0) {
                            if (set.add(new e77(jIntBitsToFloat))) {
                                ?? picture = new Picture();
                                try {
                                    Canvas canvasBeginRecording = picture.beginRecording(i, r3);
                                    canvasBeginRecording.getClass();
                                    try {
                                        canvasBeginRecording.drawColor(z ? -1 : -16777216);
                                        try {
                                            vw3 vw3Var = new vw3(((vv7) im2Var).a.getDensity(), ((vv7) im2Var).a.h0());
                                            cv7 layoutDirection = vv7Var.getLayoutDirection();
                                            Canvas canvas = mp.a;
                                            lp lpVar = new lp();
                                            lpVar.a = canvasBeginRecording;
                                            r19 = picture;
                                            try {
                                                long jF = ((vv7) im2Var).a.f();
                                                xl1 xl1Var2 = ((vv7) im2Var).a;
                                                sw3 sw3VarU = xl1Var2.b.u();
                                                cv7 cv7VarW = xl1Var2.b.w();
                                                vl1 vl1VarP = xl1Var2.b.p();
                                                e89Var = e89Var3;
                                                try {
                                                    try {
                                                        long jZ = xl1Var2.b.z();
                                                        wefVar = wefVar2;
                                                        try {
                                                            ta0 ta0Var = xl1Var2.b;
                                                            ke6 ke6Var = (ke6) ta0Var.d;
                                                            ta0Var.P(vw3Var);
                                                            ta0Var.Q(layoutDirection);
                                                            ta0Var.O(lpVar);
                                                            ta0Var.R(jF);
                                                            ta0Var.d = null;
                                                            lpVar.g();
                                                            try {
                                                                vv7Var.a();
                                                                lpVar.o();
                                                                ta0 ta0Var2 = xl1Var2.b;
                                                                ta0Var2.P(sw3VarU);
                                                                ta0Var2.Q(cv7VarW);
                                                                ta0Var2.O(vl1VarP);
                                                                ta0Var2.R(jZ);
                                                                ta0Var2.d = ke6Var;
                                                                try {
                                                                    r19.endRecording();
                                                                    x16 x16Var2 = x16Var;
                                                                    long jB = x16Var2 != null ? ((e77) x16Var2.invoke()).a : d8d.b((double) r3, i);
                                                                    dg7 dg7Var = dg7VarArr2[0];
                                                                    if (dg7Var != null) {
                                                                        dg7Var.h(null);
                                                                    }
                                                                    try {
                                                                        dg7VarArr2[0] = ynb.V(aw2Var2, null, null, new c8d(context, r19, jIntBitsToFloat, jB, e89Var2, e89Var, s69Var2, null), 3);
                                                                        return wefVar;
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                        e89Var = e89Var;
                                                                        r3 = s69Var2;
                                                                        hf8.Q.getClass();
                                                                        ef8.a("ShareFileCapture").c("Failed to record share image", e);
                                                                        ((a26) e89Var.getValue()).d(new lad(new q50(r3, 10)));
                                                                        return wefVar;
                                                                    }
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                    r3 = s69Var2;
                                                                }
                                                            } catch (Throwable th) {
                                                                try {
                                                                    lpVar.o();
                                                                    ta0 ta0Var3 = xl1Var2.b;
                                                                    ta0Var3.P(sw3VarU);
                                                                    ta0Var3.Q(cv7VarW);
                                                                    ta0Var3.O(vl1VarP);
                                                                    ta0Var3.R(jZ);
                                                                    ta0Var3.d = ke6Var;
                                                                    throw th;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    r19.endRecording();
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            r19.endRecording();
                                                            throw th;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    r19.endRecording();
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                r19.endRecording();
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            r19 = picture;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    e89Var = e89Var3;
                                    r3 = s69Var2;
                                    wefVar = wefVar2;
                                }
                            }
                        }
                    }
                    return wefVar2;
                }
            };
            l46Var.p0(a26Var2);
            objR6 = a26Var2;
        }
        j09 j09VarU = b21.u(j09Var, (a26) objR6);
        l46Var.r(false);
        return j09VarU;
    }
}

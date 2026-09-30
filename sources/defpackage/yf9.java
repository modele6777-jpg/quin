package defpackage;

import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yf9 extends lg8 implements tn8, bv7 {
    public static final d59 m1 = new d59(22);
    public static final d59 n1 = new d59(23);
    public static final g0c o1 = new g0c();
    public static final wu7 p1 = new wu7();
    public static final float[] q1 = zm8.a();
    public static final wf9 r1 = new wf9();
    public static final jy4 s1 = new jy4(15);
    public final LayoutNode J0;
    public boolean K0;
    public boolean L0;
    public yf9 M0;
    public yf9 N0;
    public boolean O0;
    public boolean P0;
    public a26 Q0;
    public sw3 R0;
    public cv7 S0;
    public yn8 U0;
    public e79 V0;
    public float X0;
    public v79 Y0;
    public wu7 Z0;
    public hkb b1;
    public hkb c1;
    public boolean d1;
    public boolean e1;
    public ke6 f1;
    public vl1 g1;
    public rk6 h1;
    public final vf9 i1;
    public boolean j1;
    public ew9 k1;
    public ke6 l1;
    public float T0 = 0.8f;
    public long W0 = 0;
    public x4d a1 = g21.f;

    public yf9(LayoutNode layoutNode) {
        this.J0 = layoutNode;
        this.R0 = layoutNode.O0;
        this.S0 = layoutNode.P0;
        hkb hkbVar = hkb.e;
        this.b1 = hkbVar;
        this.c1 = hkbVar;
        this.i1 = new vf9(this, 1);
    }

    public static yf9 D1(bv7 bv7Var) {
        yf9 yf9Var;
        og8 og8Var = bv7Var instanceof og8 ? (og8) bv7Var : null;
        if (og8Var != null && (yf9Var = og8Var.a.J0) != null) {
            return yf9Var;
        }
        bv7Var.getClass();
        return (yf9) bv7Var;
    }

    @Override // defpackage.lg8
    public final LayoutNode A0() {
        return this.J0;
    }

    public final void A1() {
        if (this.k1 != null) {
            if (this.l1 != null) {
                this.l1 = null;
            }
            H1(null, false);
            this.J0.t0(false);
        }
    }

    @Override // defpackage.lg8
    public final yn8 B0() {
        yn8 yn8Var = this.U0;
        if (yn8Var != null) {
            return yn8Var;
        }
        qc0.p("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [i09] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [p89] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [p89] */
    public final void B1(yn8 yn8Var) {
        yf9 yf9Var;
        yn8 yn8Var2 = this.U0;
        if (yn8Var != yn8Var2) {
            this.U0 = yn8Var;
            LayoutNode layoutNode = this.J0;
            int i = 0;
            if (yn8Var2 == null || yn8Var.d() != yn8Var2.d() || yn8Var.c() != yn8Var2.c()) {
                int iD = yn8Var.d();
                int iC = yn8Var.c();
                ew9 ew9Var = this.k1;
                if (ew9Var != null) {
                    ((ne6) ew9Var).e((((long) iD) << 32) | (((long) iC) & 4294967295L));
                } else if (layoutNode.X() && (yf9Var = this.N0) != null) {
                    yf9Var.p1();
                }
                f0((((long) iC) & 4294967295L) | (((long) iD) << 32));
                if (this.Q0 != null) {
                    I1(false);
                }
                boolean zG = zf9.g(4);
                i09 i09VarH1 = h1();
                if (zG || (i09VarH1 = i09VarH1.e) != null) {
                    for (i09 i09VarK1 = k1(zG); i09VarK1 != null && (i09VarK1.d & 4) != 0; i09VarK1 = i09VarK1.f) {
                        if ((i09VarK1.c & 4) != 0) {
                            ?? M0 = i09VarK1;
                            ?? p89Var = 0;
                            while (M0 != 0) {
                                if (M0 instanceof pn4) {
                                    ((pn4) M0).V();
                                } else if ((M0.c & 4) != 0 && (M0 instanceof sv3)) {
                                    i09 i09Var = ((sv3) M0).E0;
                                    int i2 = 0;
                                    M0 = M0;
                                    p89Var = p89Var;
                                    while (i09Var != null) {
                                        if ((i09Var.c & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                p89Var = p89Var;
                                                M0 = i09Var;
                                            } else {
                                                if (p89Var == 0) {
                                                    p89Var = new p89(0, new i09[16]);
                                                }
                                                if (M0 != 0) {
                                                    p89Var.b(M0);
                                                    M0 = 0;
                                                }
                                                p89Var.b(i09Var);
                                            }
                                        }
                                        i09Var = i09Var.f;
                                        M0 = M0;
                                        p89Var = p89Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M0 = vd0.m0(p89Var);
                            }
                        }
                        if (i09VarK1 == i09VarH1) {
                            break;
                        }
                    }
                }
                Owner owner = layoutNode.Z;
                if (owner != null) {
                    ((AndroidComposeView) owner).v(layoutNode);
                }
                layoutNode.j0(this);
            }
            e79 e79Var = this.V0;
            if ((e79Var == null || e79Var.e == 0) && yn8Var.a().isEmpty()) {
                return;
            }
            e79 e79Var2 = this.V0;
            Map mapA = yn8Var.a();
            if (e79Var2 != null && e79Var2.e == mapA.size()) {
                Object[] objArr = e79Var2.b;
                int[] iArr = e79Var2.c;
                long[] jArr = e79Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapA.get((zi) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            layoutNode.getLayoutDelegate().p.N0.f();
            e79 e79Var3 = this.V0;
            if (e79Var3 == null) {
                e79 e79Var4 = ok9.a;
                e79Var3 = new e79();
                this.V0 = e79Var3;
            }
            e79Var3.a();
            for (Map.Entry entry : yn8Var.a().entrySet()) {
                e79Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // defpackage.bv7
    public final long C(long j) {
        if (!h1().Y) {
            i37.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        bv7 bv7VarS = vd0.S(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) wv7.a(this.J0);
        androidComposeView.A();
        return O(bv7VarS, hl9.f(zm8.b(j, androidComposeView.o1), bv7VarS.N(0L)), true);
    }

    @Override // defpackage.lg8
    public final lg8 C0() {
        return this.N0;
    }

    public final void C1(i09 i09Var, xf9 xf9Var, long j, sl6 sl6Var, int i, boolean z, float f) {
        int i2;
        i79 i79Var = sl6Var.a;
        if (i09Var == null) {
            o1(xf9Var, j, sl6Var, i, z);
            return;
        }
        if (!xf9Var.e(i09Var)) {
            C1(dj6.T(i09Var, xf9Var.d()), xf9Var, j, sl6Var, i, z, f);
            return;
        }
        if (!xf9Var.c(i09Var)) {
            w1(dj6.T(i09Var, xf9Var.d()), xf9Var, j, sl6Var, i, z, f, false);
            return;
        }
        x69 x69Var = sl6Var.b;
        int i3 = sl6Var.c;
        int i4 = i79Var.b;
        if (i3 != i4 - 1) {
            long jC = sl6Var.c();
            int i5 = sl6Var.c;
            int i6 = i79Var.b;
            int i7 = i6 - 1;
            sl6Var.c = i7;
            sl6Var.d(i6, i79Var.b);
            sl6Var.c++;
            i79Var.h(i09Var);
            x69Var.a(mh3.c(f, z, false));
            w1(dj6.T(i09Var, xf9Var.d()), xf9Var, j, sl6Var, i, z, f, false);
            sl6Var.c = i7;
            long jC2 = sl6Var.c();
            if (sl6Var.c + 1 >= i79Var.b - 1 || dj6.B(jC, jC2) <= 0) {
                sl6Var.d(sl6Var.c + 1, i79Var.b);
            } else {
                int i8 = i5 + 1;
                boolean zN = dj6.N(jC2);
                int i9 = sl6Var.c;
                sl6Var.d(i8, zN ? i9 + 2 : i9 + 1);
            }
            sl6Var.c = i5;
            return;
        }
        int i10 = i3 + 1;
        sl6Var.d(i10, i4);
        sl6Var.c++;
        i79Var.h(i09Var);
        x69Var.a(mh3.c(f, z, false));
        w1(dj6.T(i09Var, xf9Var.d()), xf9Var, j, sl6Var, i, z, f, false);
        sl6Var.c = i3;
        if (i10 == i79Var.b - 1 || dj6.N(sl6Var.c())) {
            int i11 = sl6Var.c;
            int i12 = i11 + 1;
            i79Var.m(i12);
            if (i12 < 0 || i12 >= (i2 = x69Var.b)) {
                r3.i("Index must be between 0 and size");
                return;
            }
            long[] jArr = x69Var.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                qd0.b0(jArr, jArr, i12, i11 + 2, i2);
            }
            x69Var.b--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [i09] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [i09] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.cea, defpackage.tn8
    public final Object E() {
        LayoutNode layoutNode = this.J0;
        if (!layoutNode.V0.i(64)) {
            return null;
        }
        h1();
        Object objB = null;
        for (i09 i09Var = (zde) layoutNode.V0.f; i09Var != null; i09Var = i09Var.e) {
            if ((i09Var.c & 64) != 0) {
                ?? M0 = i09Var;
                ?? p89Var = 0;
                while (M0 != 0) {
                    if (M0 instanceof xz9) {
                        objB = ((xz9) M0).b(layoutNode.O0, objB);
                    } else if ((M0.c & 64) != 0 && (M0 instanceof sv3)) {
                        i09 i09Var2 = ((sv3) M0).E0;
                        int i = 0;
                        M0 = M0;
                        p89Var = p89Var;
                        while (i09Var2 != null) {
                            if ((i09Var2.c & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    p89Var = p89Var;
                                    M0 = i09Var2;
                                } else {
                                    if (p89Var == 0) {
                                        p89Var = new p89(0, new i09[16]);
                                    }
                                    if (M0 != 0) {
                                        p89Var.b(M0);
                                        M0 = 0;
                                    }
                                    p89Var.b(i09Var2);
                                }
                            }
                            i09Var2 = i09Var2.f;
                            M0 = M0;
                            p89Var = p89Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M0 = vd0.m0(p89Var);
                }
            }
        }
        return objB;
    }

    @Override // defpackage.lg8
    public final long E0() {
        return this.W0;
    }

    public final hkb E1() {
        if (h1().Y) {
            bv7 bv7VarS = vd0.S(this);
            v79 v79Var = this.Y0;
            if (v79Var == null) {
                v79Var = new v79();
                this.Y0 = v79Var;
            }
            long jY0 = Y0(g1());
            float f = i1() ? this.b1.a : 0.0f;
            float f2 = i1() ? this.b1.b : 0.0f;
            float fY = i1() ? this.b1.c : Y();
            float fX = i1() ? this.b1.d : X();
            int i = (int) (jY0 >> 32);
            v79Var.b = f - Float.intBitsToFloat(i);
            int i2 = (int) (jY0 & 4294967295L);
            v79Var.c = f2 - Float.intBitsToFloat(i2);
            v79Var.d = Float.intBitsToFloat(i) + fY;
            v79Var.e = Float.intBitsToFloat(i2) + fX;
            while (this != bv7VarS) {
                this.z1(v79Var, false, true);
                if (!v79Var.b()) {
                    this = this.N0;
                    this.getClass();
                }
            }
            return new hkb(v79Var.b, v79Var.c, v79Var.d, v79Var.e);
        }
        return hkb.e;
    }

    public final void F1(yf9 yf9Var, float[] fArr) {
        float[] fArrA;
        if (pa7.t(yf9Var, this)) {
            return;
        }
        yf9 yf9Var2 = this.N0;
        yf9Var2.getClass();
        yf9Var2.F1(yf9Var, fArr);
        if (!w67.b(this.W0, 0L)) {
            float[] fArr2 = q1;
            zm8.d(fArr2);
            long j = this.W0;
            zm8.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            zm8.e(fArr, fArr2);
        }
        ew9 ew9Var = this.k1;
        if (ew9Var == null || (fArrA = ((ne6) ew9Var).a()) == null) {
            return;
        }
        zm8.e(fArr, fArrA);
    }

    @Override // defpackage.bv7
    public final bv7 G() {
        boolean z = h1().Y;
        LayoutNode layoutNode = this.J0;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (LayoutNode layoutNodeF = layoutNode; layoutNodeF != null; layoutNodeF = layoutNodeF.F()) {
                sb.append("\n|");
                sb.append(layoutNodeF);
                sb.append(" isAttached=");
                sb.append(layoutNodeF.W());
                sb.append(" modifier=");
                sb.append(layoutNodeF.Z0);
                sb.append(" tail=");
                sb.append(h1());
            }
            i37.c(sb.toString());
        }
        r1();
        return layoutNode.getOuterCoordinator$ui().N0;
    }

    public final void G1(yf9 yf9Var, float[] fArr) {
        while (!this.equals(yf9Var)) {
            ew9 ew9Var = this.k1;
            if (ew9Var != null) {
                zm8.e(fArr, ((ne6) ew9Var).b());
            }
            long j = this.W0;
            if (!w67.b(j, 0L)) {
                float[] fArr2 = q1;
                zm8.d(fArr2);
                zm8.f(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                zm8.e(fArr, fArr2);
            }
            this = this.N0;
            this.getClass();
        }
    }

    public final void H1(a26 a26Var, boolean z) {
        Owner owner;
        p89 p89Var;
        Reference referencePoll;
        if (a26Var != null && this.l1 != null) {
            i37.a("layerBlock can't be provided when explicitLayer is provided");
        }
        int i = 0;
        LayoutNode layoutNode = this.J0;
        boolean z2 = (!z && this.Q0 == a26Var && pa7.t(this.R0, layoutNode.O0) && this.S0 == layoutNode.P0) ? false : true;
        this.R0 = layoutNode.O0;
        this.S0 = layoutNode.P0;
        boolean zW = layoutNode.W();
        vf9 vf9Var = this.i1;
        if (zW && a26Var != null) {
            this.Q0 = a26Var;
            if (this.k1 != null) {
                if (z2) {
                    I1(true);
                    return;
                }
                return;
            }
            Owner ownerA = wv7.a(layoutNode);
            rk6 rk6Var = this.h1;
            if (rk6Var == null) {
                rk6 rk6Var2 = new rk6(14, this, new vf9(this, i));
                this.h1 = rk6Var2;
                rk6Var = rk6Var2;
            }
            ew9 ew9VarE = ((AndroidComposeView) ownerA).e(rk6Var, vf9Var, null);
            ne6 ne6Var = (ne6) ew9VarE;
            ne6Var.e(this.c);
            ne6Var.d(this.W0);
            this.k1 = ew9VarE;
            I1(true);
            layoutNode.Y0 = true;
            vf9Var.invoke();
            return;
        }
        this.Q0 = null;
        ew9 ew9Var = this.k1;
        if (ew9Var != null) {
            ne6 ne6Var2 = (ne6) ew9Var;
            if (!lmg.k0(ne6Var2.b())) {
                layoutNode.j0(this);
            }
            ne6Var2.d = null;
            ne6Var2.e = null;
            ne6Var2.g = true;
            ne6Var2.f(false);
            ie6 ie6Var = ne6Var2.b;
            if (ie6Var != null) {
                ie6Var.a(ne6Var2.a);
                AndroidComposeView androidComposeView = ne6Var2.c;
                lqb lqbVar = androidComposeView.E1;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) lqbVar.c;
                    p89Var = (p89) lqbVar.b;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        p89Var.j(referencePoll);
                    }
                } while (referencePoll != null);
                p89Var.b(new WeakReference(ne6Var2, (ReferenceQueue) lqbVar.c));
                androidComposeView.S0.l(ne6Var2);
            }
            this.k1 = null;
            layoutNode.Y0 = true;
            vf9Var.invoke();
            if (h1().Y && layoutNode.X() && (owner = layoutNode.Z) != null) {
                ((AndroidComposeView) owner).v(layoutNode);
            }
        }
        this.j1 = false;
    }

    public final void I1(boolean z) {
        char c;
        boolean z2;
        LayoutNode layoutNode;
        x16 x16Var;
        int i;
        x16 x16Var2;
        if (this.l1 != null) {
            return;
        }
        ew9 ew9Var = this.k1;
        a26 a26Var = this.Q0;
        if (ew9Var == null) {
            if (a26Var == null) {
                return;
            }
            i37.c("null layer with a non-null layerBlock");
            return;
        }
        if (a26Var == null) {
            throw kv2.d("updateLayerParameters requires a non-null layerBlock");
        }
        g0c g0cVar = o1;
        g0cVar.a();
        LayoutNode layoutNode2 = this.J0;
        g0cVar.I0 = layoutNode2.O0;
        g0cVar.J0 = layoutNode2.P0;
        g0cVar.G0 = db6.Y0(this.c);
        imb imbVar = new imb();
        wv7.a(layoutNode2).getSnapshotObserver().a.d(this, m1, new n25(a26Var, this, imbVar, 15));
        wu7 wu7Var = this.Z0;
        if (wu7Var == null) {
            wu7Var = new wu7();
            this.Z0 = wu7Var;
        }
        wu7 wu7Var2 = p1;
        wu7Var2.getClass();
        wu7Var2.a = wu7Var.a;
        wu7Var2.b = wu7Var.b;
        wu7Var2.c = wu7Var.c;
        wu7Var2.d = wu7Var.d;
        wu7Var2.e = wu7Var.e;
        wu7Var2.f = wu7Var.f;
        wu7Var2.g = wu7Var.g;
        wu7Var2.h = wu7Var.h;
        wu7Var2.i = wu7Var.i;
        wu7Var.a = g0cVar.b;
        wu7Var.b = g0cVar.c;
        wu7Var.c = g0cVar.e;
        wu7Var.d = g0cVar.f;
        wu7Var.e = g0cVar.x;
        wu7Var.f = g0cVar.y;
        wu7Var.g = g0cVar.z;
        wu7Var.h = g0cVar.X;
        wu7Var.i = g0cVar.Y;
        ne6 ne6Var = (ne6) ew9Var;
        AndroidComposeView androidComposeView = ne6Var.c;
        int i2 = g0cVar.a | ne6Var.Y;
        ne6Var.z = g0cVar.J0;
        sw3 sw3Var = g0cVar.I0;
        ne6Var.y = sw3Var;
        if ((1048576 & i2) != 0) {
            ke6 ke6Var = ne6Var.a;
            g0cVar.H0.getClass();
            int iD0 = sw3Var.D0(0.0f);
            g0cVar.H0.getClass();
            int iD1 = sw3Var.D0(0.0f);
            g0cVar.H0.getClass();
            int iD2 = sw3Var.D0(0.0f);
            g0cVar.H0.getClass();
            int iD3 = sw3Var.D0(0.0f);
            ke6Var.v = iD0;
            ke6Var.w = iD1;
            ke6Var.x = iD2;
            ke6Var.y = iD3;
            ke6Var.a.x(iD0, iD1, iD2, iD3);
            ne6Var.c();
        }
        int i3 = i2 & 4096;
        if (i3 != 0) {
            ne6Var.Z = g0cVar.Y;
        }
        if ((i2 & 1) != 0) {
            ke6 ke6Var2 = ne6Var.a;
            float f = g0cVar.b;
            me6 me6Var = ke6Var2.a;
            if (me6Var.c() != f) {
                me6Var.B(f);
            }
        }
        if ((i2 & 2) != 0) {
            ke6 ke6Var3 = ne6Var.a;
            float f2 = g0cVar.c;
            me6 me6Var2 = ke6Var3.a;
            if (me6Var2.N() != f2) {
                me6Var2.o(f2);
            }
        }
        if ((i2 & 4) != 0) {
            ne6Var.a.f(g0cVar.d);
        }
        if ((i2 & 8) != 0) {
            ke6 ke6Var4 = ne6Var.a;
            float f3 = g0cVar.e;
            me6 me6Var3 = ke6Var4.a;
            if (me6Var3.E() != f3) {
                me6Var3.I(f3);
            }
        }
        if ((i2 & 16) != 0) {
            ke6 ke6Var5 = ne6Var.a;
            float f4 = g0cVar.f;
            me6 me6Var4 = ke6Var5.a;
            if (me6Var4.y() != f4) {
                me6Var4.g(f4);
            }
        }
        if ((i2 & 32) != 0) {
            ke6 ke6Var6 = ne6Var.a;
            float f5 = g0cVar.g;
            me6 me6Var5 = ke6Var6.a;
            if (me6Var5.M() != f5) {
                me6Var5.d(f5);
                ke6Var6.g = true;
                ke6Var6.a();
            }
            if (g0cVar.g > 0.0f && !ne6Var.I0 && (x16Var2 = ne6Var.e) != null) {
                x16Var2.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            ke6 ke6Var7 = ne6Var.a;
            long j = g0cVar.v;
            me6 me6Var6 = ke6Var7.a;
            long jU = me6Var6.u();
            int i4 = y72.l;
            if (!faf.a(j, jU)) {
                me6Var6.A(j);
            }
        }
        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            ke6 ke6Var8 = ne6Var.a;
            long j2 = g0cVar.w;
            me6 me6Var7 = ke6Var8.a;
            long jZ = me6Var7.z();
            int i5 = y72.l;
            if (!faf.a(j2, jZ)) {
                me6Var7.J(j2);
            }
        }
        if ((i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            ke6 ke6Var9 = ne6Var.a;
            float f6 = g0cVar.z;
            me6 me6Var8 = ke6Var9.a;
            if (me6Var8.s() != f6) {
                me6Var8.f(f6);
            }
        }
        if ((i2 & 256) != 0) {
            ke6 ke6Var10 = ne6Var.a;
            float f7 = g0cVar.x;
            me6 me6Var9 = ke6Var10.a;
            if (me6Var9.G() != f7) {
                me6Var9.O(f7);
            }
        }
        if ((i2 & 512) != 0) {
            ke6 ke6Var11 = ne6Var.a;
            float f8 = g0cVar.y;
            me6 me6Var10 = ke6Var11.a;
            if (me6Var10.q() != f8) {
                me6Var10.b(f8);
            }
        }
        if ((i2 & 2048) != 0) {
            ke6 ke6Var12 = ne6Var.a;
            float f9 = g0cVar.X;
            me6 me6Var11 = ke6Var12.a;
            if (me6Var11.C() != f9) {
                me6Var11.L(f9);
            }
        }
        if (i3 != 0) {
            c = ' ';
            boolean zA = r2f.a(ne6Var.Z, r2f.b);
            ke6 ke6Var13 = ne6Var.a;
            if (!zA) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(r2f.b(ne6Var.Z) * ((int) (ne6Var.f >> 32)))) << 32) | (((long) Float.floatToRawIntBits(r2f.c(ne6Var.Z) * ((int) (ne6Var.f & 4294967295L)))) & 4294967295L);
                if (!hl9.c(ke6Var13.z, jFloatToRawIntBits)) {
                    ke6Var13.z = jFloatToRawIntBits;
                    ke6Var13.a.t(jFloatToRawIntBits);
                }
            } else if (!hl9.c(ke6Var13.z, 9205357640488583168L)) {
                ke6Var13.z = 9205357640488583168L;
                ke6Var13.a.t(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i2 & 16384) != 0) {
            ne6Var.a.g(g0cVar.E0);
        }
        if ((131072 & i2) != 0) {
            ne6Var.a.h(g0cVar.K0);
        }
        if ((262144 & i2) != 0) {
            ke6 ke6Var14 = ne6Var.a;
            c82 c82Var = g0cVar.L0;
            me6 me6Var12 = ke6Var14.a;
            if (!pa7.t(me6Var12.n(), c82Var)) {
                me6Var12.w(c82Var);
            }
        }
        if ((524288 & i2) != 0) {
            ke6 ke6Var15 = ne6Var.a;
            int i6 = g0cVar.M0;
            me6 me6Var13 = ke6Var15.a;
            if (me6Var13.P() != i6) {
                me6Var13.j(i6);
            }
        }
        if ((32768 & i2) != 0) {
            ke6 ke6Var16 = ne6Var.a;
            int i7 = g0cVar.F0;
            if (i7 == 0) {
                i = 0;
            } else if (i7 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i7 != 2) {
                    qc0.p("Not supported composition strategy");
                    return;
                }
            }
            me6 me6Var14 = ke6Var16.a;
            if (me6Var14.m() != i) {
                me6Var14.H(i);
            }
        }
        if ((i2 & 7963) != 0) {
            ne6Var.F0 = true;
            ne6Var.G0 = true;
        }
        if (pa7.t(ne6Var.E0, g0cVar.N0)) {
            layoutNode2 = layoutNode2;
            imbVar = imbVar;
            z2 = false;
        } else {
            vs9 vs9Var = g0cVar.N0;
            ne6Var.E0 = vs9Var;
            if (vs9Var == null) {
                layoutNode2 = layoutNode2;
                imbVar = imbVar;
            } else {
                ke6 ke6Var17 = ne6Var.a;
                if (vs9Var instanceof ts9) {
                    hkb hkbVar = ((ts9) vs9Var).a;
                    float f10 = hkbVar.a;
                    float f11 = hkbVar.b;
                    ke6Var17.i((((long) Float.floatToRawIntBits(f10)) << c) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (((long) Float.floatToRawIntBits(hkbVar.c - f10)) << c) | (((long) Float.floatToRawIntBits(hkbVar.d - f11)) & 4294967295L), 0.0f);
                } else {
                    if (vs9Var instanceof ss9) {
                        zt ztVar = ((ss9) vs9Var).a;
                        ke6Var17.k = null;
                        ke6Var17.i = 9205357640488583168L;
                        ke6Var17.h = 0L;
                        ke6Var17.j = 0.0f;
                        ke6Var17.g = true;
                        ke6Var17.n = false;
                        ke6Var17.l = ztVar;
                        ke6Var17.a();
                    } else {
                        if (!(vs9Var instanceof us9)) {
                            ap.c();
                            return;
                        }
                        us9 us9Var = (us9) vs9Var;
                        zt ztVar2 = us9Var.b;
                        if (ztVar2 != null) {
                            ke6Var17.k = null;
                            ke6Var17.i = 9205357640488583168L;
                            ke6Var17.h = 0L;
                            ke6Var17.j = 0.0f;
                            ke6Var17.g = true;
                            ke6Var17.n = false;
                            ke6Var17.l = ztVar2;
                            ke6Var17.a();
                        } else {
                            v6c v6cVar = us9Var.a;
                            ke6Var17.i((((long) Float.floatToRawIntBits(v6cVar.a)) << c) | (((long) Float.floatToRawIntBits(v6cVar.b)) & 4294967295L), (((long) Float.floatToRawIntBits(v6cVar.b())) << c) | (((long) Float.floatToRawIntBits(v6cVar.a())) & 4294967295L), Float.intBitsToFloat((int) (v6cVar.h >> c)));
                        }
                    }
                    if (Build.VERSION.SDK_INT < 33 && (((vs9Var instanceof ss9) || ((vs9Var instanceof us9) && !w6c.o(((us9) vs9Var).a))) && (x16Var = ne6Var.e) != null)) {
                        x16Var.invoke();
                    }
                }
                if (Build.VERSION.SDK_INT < 33) {
                    x16Var.invoke();
                }
            }
            z2 = true;
        }
        ne6Var.Y = g0cVar.a;
        if (i2 != 0 || z2) {
            ViewParent parent = androidComposeView.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(androidComposeView, androidComposeView);
            }
            if (AndroidComposeView.l()) {
                androidComposeView.M(0.0f);
            }
        }
        boolean z3 = this.P0;
        this.P0 = g0cVar.E0;
        this.T0 = g0cVar.d;
        boolean z4 = wu7Var2.a == wu7Var.a && wu7Var2.b == wu7Var.b && wu7Var2.c == wu7Var.c && wu7Var2.d == wu7Var.d && wu7Var2.e == wu7Var.e && wu7Var2.f == wu7Var.f && wu7Var2.g == wu7Var.g && wu7Var2.h == wu7Var.h && r2f.a(wu7Var2.i, wu7Var.i);
        if (!z || (z4 && z3 == this.P0 && !imbVar.element)) {
            layoutNode = layoutNode2;
        } else {
            layoutNode = layoutNode2;
            Owner owner = layoutNode.Z;
            if (owner != null) {
                ((AndroidComposeView) owner).v(layoutNode);
            }
        }
        if (z4) {
            return;
        }
        layoutNode.j0(this);
        if (layoutNode.e1 > 0) {
            AndroidComposeView androidComposeView2 = (AndroidComposeView) wv7.a(layoutNode);
            fz3 fz3Var = (fz3) androidComposeView2.i1.f;
            if (layoutNode.e1 > 0) {
                ((p89) fz3Var.b).b(layoutNode);
                layoutNode.d1 = true;
            }
            androidComposeView2.F(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    public final boolean J1(long j) {
        boolean z;
        boolean z2;
        boolean zS;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        ew9 ew9Var = this.k1;
        if (ew9Var == null || !this.P0) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        ke6 ke6Var = ((ne6) ew9Var).a;
        if (ke6Var.A) {
            vs9 vs9VarD = ke6Var.d();
            if (vs9VarD instanceof ts9) {
                hkb hkbVar = ((ts9) vs9VarD).a;
                if (hkbVar.a > fIntBitsToFloat || fIntBitsToFloat >= hkbVar.c || hkbVar.b > fIntBitsToFloat2 || fIntBitsToFloat2 >= hkbVar.d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (vs9VarD instanceof us9) {
                v6c v6cVar = ((us9) vs9VarD).a;
                float f = v6cVar.a;
                long j2 = v6cVar.f;
                long j3 = v6cVar.h;
                long j4 = v6cVar.g;
                float f2 = v6cVar.d;
                float f3 = v6cVar.b;
                z = false;
                float f4 = v6cVar.c;
                z2 = true;
                long j5 = v6cVar.e;
                if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
                    int i = (int) (j5 >> 32);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= v6cVar.b()) {
                        int i3 = (int) (j3 >> 32);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= v6cVar.b()) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= v6cVar.a()) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= v6cVar.a()) {
                                    float fIntBitsToFloat3 = Float.intBitsToFloat(i) + f;
                                    float fIntBitsToFloat4 = Float.intBitsToFloat(i5) + f3;
                                    float fIntBitsToFloat5 = f4 - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i7) + f3;
                                    float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat8 = f2 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat9 = f2 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat10 = Float.intBitsToFloat(i3) + f;
                                    if (fIntBitsToFloat < fIntBitsToFloat3 && fIntBitsToFloat2 < fIntBitsToFloat4) {
                                        zS = xxb.s(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, v6cVar.e);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat10 && fIntBitsToFloat2 > fIntBitsToFloat9) {
                                        zS = xxb.s(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat10, fIntBitsToFloat9, v6cVar.h);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) {
                                        zS = (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) ? z2 : xxb.s(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, v6cVar.g);
                                    } else {
                                        zS = xxb.s(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, v6cVar.f);
                                    }
                                } else {
                                    zt ztVarA = cu.a();
                                    zt.c(ztVarA, v6cVar);
                                    zS = xxb.r(fIntBitsToFloat, fIntBitsToFloat2, ztVarA);
                                }
                            } else {
                                zt ztVarA2 = cu.a();
                                zt.c(ztVarA2, v6cVar);
                                zS = xxb.r(fIntBitsToFloat, fIntBitsToFloat2, ztVarA2);
                            }
                        } else {
                            zt ztVarA3 = cu.a();
                            zt.c(ztVarA3, v6cVar);
                            zS = xxb.r(fIntBitsToFloat, fIntBitsToFloat2, ztVarA3);
                        }
                    } else {
                        zt ztVarA4 = cu.a();
                        zt.c(ztVarA4, v6cVar);
                        zS = xxb.r(fIntBitsToFloat, fIntBitsToFloat2, ztVarA4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(vs9VarD instanceof ss9)) {
                    ap.c();
                    return false;
                }
                zS = xxb.r(fIntBitsToFloat, fIntBitsToFloat2, ((ss9) vs9VarD).a);
            }
            zS = z;
        } else {
            z = false;
            z2 = true;
        }
        return zS ? z2 : z;
    }

    @Override // defpackage.bv7
    public final long K(bv7 bv7Var, long j) {
        return O(bv7Var, j, true);
    }

    @Override // defpackage.bv7
    public final long L(long j) {
        if (!h1().Y) {
            i37.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return O(vd0.S(this), ((AndroidComposeView) wv7.a(this.J0)).G(j), true);
    }

    @Override // defpackage.bv7
    public final hkb M(bv7 bv7Var, boolean z) {
        if (!h1().Y) {
            i37.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!bv7Var.h()) {
            i37.c("LayoutCoordinates " + bv7Var + " is not attached!");
        }
        yf9 yf9VarD1 = D1(bv7Var);
        yf9VarD1.r1();
        yf9 yf9VarD2 = d1(yf9VarD1);
        v79 v79Var = this.Y0;
        if (v79Var == null) {
            v79Var = new v79();
            this.Y0 = v79Var;
        }
        v79Var.b = 0.0f;
        v79Var.c = 0.0f;
        v79Var.d = (int) (bv7Var.l() >> 32);
        v79Var.e = (int) (bv7Var.l() & 4294967295L);
        while (yf9VarD1 != yf9VarD2) {
            yf9VarD1.z1(v79Var, z, false);
            if (v79Var.b()) {
                return hkb.e;
            }
            yf9VarD1 = yf9VarD1.N0;
            yf9VarD1.getClass();
        }
        T0(yf9VarD2, v79Var, z);
        return new hkb(v79Var.b, v79Var.c, v79Var.d, v79Var.e);
    }

    @Override // defpackage.bv7
    public final long N(long j) {
        if (!h1().Y) {
            i37.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        r1();
        while (this != null) {
            LayoutNode layoutNode = this.J0;
            if (this == layoutNode.getOuterCoordinator$ui() && !layoutNode.c) {
                long jB = wv7.a(layoutNode).getRectManager().b(layoutNode);
                if (!w67.b(jB, 9223372034707292159L)) {
                    return qn4.M(j, jB);
                }
            }
            ew9 ew9Var = this.k1;
            if (ew9Var != null) {
                ne6 ne6Var = (ne6) ew9Var;
                float[] fArrB = ne6Var.b();
                if (!ne6Var.H0) {
                    j = zm8.b(j, fArrB);
                }
            }
            j = qn4.M(j, this.W0);
            this = this.N0;
        }
        return j;
    }

    @Override // defpackage.bv7
    public final long O(bv7 bv7Var, long j, boolean z) {
        if (bv7Var instanceof og8) {
            og8 og8Var = (og8) bv7Var;
            og8Var.a.J0.r1();
            return og8Var.O(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        yf9 yf9VarD1 = D1(bv7Var);
        yf9VarD1.r1();
        yf9 yf9VarD2 = d1(yf9VarD1);
        while (yf9VarD1 != yf9VarD2) {
            ew9 ew9Var = yf9VarD1.k1;
            if (ew9Var != null) {
                ne6 ne6Var = (ne6) ew9Var;
                float[] fArrB = ne6Var.b();
                if (!ne6Var.H0) {
                    j = zm8.b(j, fArrB);
                }
            }
            if (z || !yf9VarD1.z) {
                j = qn4.M(j, yf9VarD1.W0);
            }
            yf9VarD1 = yf9VarD1.N0;
            yf9VarD1.getClass();
        }
        return U0(yf9VarD2, j, z);
    }

    @Override // defpackage.lg8
    public final void R0() {
        ke6 ke6Var = this.l1;
        long j = this.W0;
        if (ke6Var != null) {
            e0(j, this.X0, ke6Var);
        } else {
            b0(j, this.X0, this.Q0);
        }
    }

    public final void T0(yf9 yf9Var, v79 v79Var, boolean z) {
        if (yf9Var == this) {
            return;
        }
        yf9 yf9Var2 = this.N0;
        if (yf9Var2 != null) {
            yf9Var2.T0(yf9Var, v79Var, z);
        }
        long j = this.W0;
        float f = (int) (j >> 32);
        v79Var.b -= f;
        v79Var.d -= f;
        float f2 = (int) (j & 4294967295L);
        v79Var.c -= f2;
        v79Var.e -= f2;
        ew9 ew9Var = this.k1;
        if (ew9Var != null) {
            ne6 ne6Var = (ne6) ew9Var;
            float[] fArrA = ne6Var.a();
            if (!ne6Var.H0) {
                if (fArrA == null) {
                    v79Var.b = 0.0f;
                    v79Var.c = 0.0f;
                    v79Var.d = 0.0f;
                    v79Var.e = 0.0f;
                } else {
                    zm8.c(fArrA, v79Var);
                }
            }
            if (this.P0 && z) {
                long j2 = this.c;
                v79Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long U0(yf9 yf9Var, long j, boolean z) {
        if (yf9Var == this) {
            return j;
        }
        yf9 yf9Var2 = this.N0;
        return (yf9Var2 == null || pa7.t(yf9Var, yf9Var2)) ? e1(j, z) : e1(yf9Var2.U0(yf9Var, j, z), z);
    }

    public final long Y0(long j) {
        float fY;
        float fX;
        if (i1()) {
            hkb hkbVar = this.b1;
            fY = hkbVar.c - hkbVar.a;
        } else {
            fY = Y();
        }
        if (i1()) {
            hkb hkbVar2 = this.b1;
            fX = hkbVar2.d - hkbVar2.b;
        } else {
            fX = X();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fY;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - fX;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float Z0(long j, long j2) {
        if (Y() >= Float.intBitsToFloat((int) (j2 >> 32)) && X() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jY0 = Y0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jY0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jY0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - Y());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - X()))) & 4294967295L);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) <= fIntBitsToFloat2) {
            return hl9.e(jFloatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void a1(vl1 vl1Var, ke6 ke6Var) {
        ew9 ew9Var = this.k1;
        if (ew9Var == null) {
            long j = this.W0;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            vl1Var.n(f, f2);
            b1(vl1Var, ke6Var);
            vl1Var.n(-f, -f2);
            return;
        }
        ne6 ne6Var = (ne6) ew9Var;
        xl1 xl1Var = ne6Var.X;
        ne6Var.g();
        ne6Var.I0 = ne6Var.a.a.M() > 0.0f;
        ta0 ta0Var = xl1Var.b;
        ta0Var.O(vl1Var);
        ta0Var.d = ke6Var;
        i7h.r(xl1Var, ne6Var.a);
    }

    public final void b1(vl1 vl1Var, ke6 ke6Var) {
        yf9 yf9Var;
        vl1 vl1Var2;
        ke6 ke6Var2;
        i09 i09VarJ1 = j1(4);
        if (i09VarJ1 == null) {
            x1(vl1Var, ke6Var);
            return;
        }
        LayoutNode layoutNode = this.J0;
        layoutNode.getClass();
        vv7 sharedDrawScope = wv7.a(layoutNode).getSharedDrawScope();
        long jY0 = db6.Y0(this.c);
        sharedDrawScope.getClass();
        p89 p89Var = null;
        while (i09VarJ1 != null) {
            if (i09VarJ1 instanceof pn4) {
                yf9Var = this;
                vl1Var2 = vl1Var;
                ke6Var2 = ke6Var;
                sharedDrawScope.b(vl1Var2, jY0, yf9Var, (pn4) i09VarJ1, ke6Var2);
            } else {
                yf9Var = this;
                vl1Var2 = vl1Var;
                ke6Var2 = ke6Var;
                if ((i09VarJ1.c & 4) != 0 && (i09VarJ1 instanceof sv3)) {
                    int i = 0;
                    for (i09 i09Var = ((sv3) i09VarJ1).E0; i09Var != null; i09Var = i09Var.f) {
                        if ((i09Var.c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                i09VarJ1 = i09Var;
                            } else {
                                if (p89Var == null) {
                                    p89Var = new p89(0, new i09[16]);
                                }
                                if (i09VarJ1 != null) {
                                    p89Var.b(i09VarJ1);
                                    i09VarJ1 = null;
                                }
                                p89Var.b(i09Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                vl1Var = vl1Var2;
                this = yf9Var;
                ke6Var = ke6Var2;
            }
            i09VarJ1 = vd0.m0(p89Var);
            vl1Var = vl1Var2;
            this = yf9Var;
            ke6Var = ke6Var2;
        }
    }

    @Override // defpackage.bv7
    public final long c(long j) {
        long jN = N(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) wv7.a(this.J0);
        androidComposeView.A();
        return zm8.b(jN, androidComposeView.n1);
    }

    public abstract void c1();

    public final yf9 d1(yf9 yf9Var) {
        LayoutNode layoutNodeF = yf9Var.J0;
        LayoutNode layoutNode = this.J0;
        if (layoutNodeF == layoutNode) {
            i09 i09VarH1 = yf9Var.h1();
            i09 i09VarH2 = h1();
            if (!i09VarH2.a.Y) {
                i37.c("visitLocalAncestors called on an unattached node");
            }
            for (i09 i09Var = i09VarH2.a.e; i09Var != null; i09Var = i09Var.e) {
                if ((i09Var.c & 2) != 0 && i09Var == i09VarH1) {
                    return yf9Var;
                }
            }
            return this;
        }
        while (layoutNodeF.F0 > layoutNode.F0) {
            layoutNodeF = layoutNodeF.F();
            layoutNodeF.getClass();
        }
        LayoutNode layoutNodeF2 = layoutNode;
        while (layoutNodeF2.F0 > layoutNodeF.F0) {
            layoutNodeF2 = layoutNodeF2.F();
            layoutNodeF2.getClass();
        }
        while (layoutNodeF != layoutNodeF2) {
            layoutNodeF = layoutNodeF.F();
            layoutNodeF2 = layoutNodeF2.F();
            if (layoutNodeF == null || layoutNodeF2 == null) {
                qc0.j("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (layoutNodeF2 != layoutNode) {
            if (layoutNodeF != yf9Var.J0) {
                return (c47) layoutNodeF.V0.d;
            }
            return yf9Var;
        }
        return this;
    }

    @Override // defpackage.cea
    public abstract void e0(long j, float f, ke6 ke6Var);

    public final long e1(long j, boolean z) {
        if (z || !this.z) {
            long j2 = this.W0;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
            j = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        ew9 ew9Var = this.k1;
        if (ew9Var != null) {
            ne6 ne6Var = (ne6) ew9Var;
            float[] fArrA = ne6Var.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!ne6Var.H0) {
                return zm8.b(j, fArrA);
            }
        }
        return j;
    }

    public abstract ng8 f1();

    public final long g1() {
        return this.R0.N0(this.J0.Q0.d());
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.J0.O0.getDensity();
    }

    @Override // defpackage.ga7
    public final cv7 getLayoutDirection() {
        return this.J0.P0;
    }

    @Override // defpackage.bv7
    public final boolean h() {
        return h1().Y;
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.J0.O0.h0();
    }

    public abstract i09 h1();

    public final boolean i1() {
        return this.d1 && !this.b1.h();
    }

    @Override // defpackage.bv7
    public final void j(float[] fArr) {
        Owner ownerA = wv7.a(this.J0);
        yf9 yf9VarD1 = D1(vd0.S(this));
        G1(yf9VarD1, fArr);
        if (ownerA instanceof AndroidComposeView) {
            ((AndroidComposeView) ownerA).p(fArr);
            return;
        }
        long jR = yf9VarD1.r(0L);
        if ((9223372034707292159L & jR) != 9205357640488583168L) {
            zm8.f(fArr, Float.intBitsToFloat((int) (jR >> 32)), Float.intBitsToFloat((int) (jR & 4294967295L)));
        }
    }

    public final i09 j1(int i) {
        boolean zG = zf9.g(i);
        i09 i09VarH1 = h1();
        if (!zG && (i09VarH1 = i09VarH1.e) == null) {
            return null;
        }
        for (i09 i09VarK1 = k1(zG); i09VarK1 != null && (i09VarK1.d & i) != 0; i09VarK1 = i09VarK1.f) {
            if ((i09VarK1.c & i) != 0) {
                return i09VarK1;
            }
            if (i09VarK1 == i09VarH1) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.bv7
    public final void k(bv7 bv7Var, float[] fArr) {
        yf9 yf9VarD1 = D1(bv7Var);
        yf9VarD1.r1();
        yf9 yf9VarD2 = d1(yf9VarD1);
        zm8.d(fArr);
        yf9VarD1.G1(yf9VarD2, fArr);
        F1(yf9VarD2, fArr);
    }

    public final i09 k1(boolean z) {
        i09 i09VarH1;
        LayoutNode layoutNode = this.J0;
        if (layoutNode.getOuterCoordinator$ui() == this) {
            return (i09) layoutNode.V0.g;
        }
        yf9 yf9Var = this.N0;
        if (!z) {
            if (yf9Var != null) {
                return yf9Var.h1();
            }
            return null;
        }
        if (yf9Var == null || (i09VarH1 = yf9Var.h1()) == null) {
            return null;
        }
        return i09VarH1.f;
    }

    @Override // defpackage.bv7
    public final long l() {
        return this.c;
    }

    public final void l1(i09 i09Var, xf9 xf9Var, long j, sl6 sl6Var, int i, boolean z) {
        if (i09Var == null) {
            o1(xf9Var, j, sl6Var, i, z);
            return;
        }
        if (!xf9Var.e(i09Var)) {
            l1(dj6.T(i09Var, xf9Var.d()), xf9Var, j, sl6Var, i, z);
            return;
        }
        int i2 = sl6Var.c;
        i79 i79Var = sl6Var.a;
        sl6Var.d(i2 + 1, i79Var.b);
        sl6Var.c++;
        i79Var.h(i09Var);
        sl6Var.b.a(mh3.c(-1.0f, z, false));
        l1(dj6.T(i09Var, xf9Var.d()), xf9Var, j, sl6Var, i, z);
        sl6Var.c = i2;
    }

    public final void m1(i09 i09Var, xf9 xf9Var, long j, sl6 sl6Var, int i, boolean z, float f) {
        if (i09Var == null) {
            o1(xf9Var, j, sl6Var, i, z);
            return;
        }
        if (!xf9Var.e(i09Var)) {
            m1(dj6.T(i09Var, xf9Var.d()), xf9Var, j, sl6Var, i, z, f);
            return;
        }
        int i2 = sl6Var.c;
        i79 i79Var = sl6Var.a;
        sl6Var.d(i2 + 1, i79Var.b);
        sl6Var.c++;
        i79Var.h(i09Var);
        sl6Var.b.a(mh3.c(f, z, false));
        w1(dj6.T(i09Var, xf9Var.d()), xf9Var, j, sl6Var, i, z, f, true);
        sl6Var.c = i2;
    }

    public final void n1(xf9 xf9Var, long j, sl6 sl6Var, int i, boolean z) {
        boolean z2;
        i79 i79Var = sl6Var.a;
        i09 i09VarJ1 = j1(xf9Var.d());
        boolean z3 = false;
        if (!J1(j)) {
            if (i == 1) {
                float fZ0 = Z0(j, g1());
                if ((Float.floatToRawIntBits(fZ0) & Integer.MAX_VALUE) < 2139095040) {
                    if (sl6Var.c != i79Var.b - 1) {
                        if (dj6.B(sl6Var.c(), mh3.c(fZ0, false, false)) <= 0) {
                            return;
                        }
                    }
                    m1(i09VarJ1, xf9Var, j, sl6Var, i, false, fZ0);
                    return;
                }
                return;
            }
            return;
        }
        if (i09VarJ1 == null) {
            o1(xf9Var, j, sl6Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < Y() && fIntBitsToFloat2 < X()) {
            l1(i09VarJ1, xf9Var, j, sl6Var, i, z);
            return;
        }
        float fZ1 = i == 1 ? Z0(j, g1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fZ1) & Integer.MAX_VALUE) < 2139095040) {
            if (sl6Var.c == i79Var.b - 1) {
                z2 = z;
            } else {
                z2 = z;
                if (dj6.B(sl6Var.c(), mh3.c(fZ1, z2, false)) > 0) {
                }
            }
            z3 = true;
        } else {
            z2 = z;
        }
        w1(i09VarJ1, xf9Var, j, sl6Var, i, z2, fZ1, z3);
    }

    public void o1(xf9 xf9Var, long j, sl6 sl6Var, int i, boolean z) {
        yf9 yf9Var = this.M0;
        if (yf9Var != null) {
            yf9Var.n1(xf9Var, yf9Var.e1(j, true), sl6Var, i, z);
        }
    }

    public final void p1() {
        ew9 ew9Var = this.k1;
        if (ew9Var != null) {
            ((ne6) ew9Var).c();
            return;
        }
        yf9 yf9Var = this.N0;
        if (yf9Var != null) {
            yf9Var.p1();
        }
    }

    public final boolean q1() {
        if (this.k1 != null && this.T0 <= 0.0f) {
            return true;
        }
        yf9 yf9Var = this.N0;
        if (yf9Var != null) {
            return yf9Var.q1();
        }
        return false;
    }

    @Override // defpackage.bv7
    public final long r(long j) {
        if (!h1().Y) {
            i37.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((AndroidComposeView) wv7.a(this.J0)).q(N(j));
    }

    public final void r1() {
        this.J0.getLayoutDelegate().b();
    }

    @Override // defpackage.lg8
    public final lg8 s0() {
        return this.M0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [i09] */
    /* JADX WARN: Type inference failed for: r7v7, types: [i09] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [p89] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void s1() {
        i09 i09VarH1;
        boolean zG = zf9.g(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        i09 i09VarK1 = k1(zG);
        if (i09VarK1 == null || (i09VarK1.a.d & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            return;
        }
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            if (!zG) {
                i09VarH1 = h1().e;
                if (i09VarH1 == null) {
                }
                iqf.p(irdVarJ, irdVarL, a26VarE);
            }
            i09VarH1 = h1();
            for (i09 i09VarK2 = k1(zG); i09VarK2 != null && (i09VarK2.d & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0; i09VarK2 = i09VarK2.f) {
                if ((i09VarK2.c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    ?? M0 = i09VarK2;
                    ?? p89Var = 0;
                    while (M0 != 0) {
                        if (M0 instanceof co8) {
                            ((co8) M0).a(this.c);
                        } else if ((M0.c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 && (M0 instanceof sv3)) {
                            i09 i09Var = ((sv3) M0).E0;
                            int i = 0;
                            M0 = M0;
                            p89Var = p89Var;
                            while (i09Var != null) {
                                if ((i09Var.c & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    i++;
                                    if (i == 1) {
                                        p89Var = p89Var;
                                        M0 = i09Var;
                                    } else {
                                        if (p89Var == 0) {
                                            p89Var = new p89(0, new i09[16]);
                                        }
                                        if (M0 != 0) {
                                            p89Var.b(M0);
                                            M0 = 0;
                                        }
                                        p89Var.b(i09Var);
                                    }
                                }
                                i09Var = i09Var.f;
                                M0 = M0;
                                p89Var = p89Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M0 = vd0.m0(p89Var);
                    }
                }
                if (i09VarK2 == i09VarH1) {
                    break;
                }
            }
            iqf.p(irdVarJ, irdVarL, a26VarE);
        } catch (Throwable th) {
            iqf.p(irdVarJ, irdVarL, a26VarE);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [i09] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void t1() {
        boolean zG = zf9.g(4194304);
        i09 i09VarH1 = h1();
        if (!zG && (i09VarH1 = i09VarH1.e) == null) {
            return;
        }
        for (i09 i09VarK1 = k1(zG); i09VarK1 != null && (i09VarK1.d & 4194304) != 0; i09VarK1 = i09VarK1.f) {
            if ((i09VarK1.c & 4194304) != 0) {
                ?? M0 = i09VarK1;
                ?? p89Var = 0;
                while (M0 != 0) {
                    if (M0 instanceof zu7) {
                        ((zu7) M0).p(this);
                    } else if ((M0.c & 4194304) != 0 && (M0 instanceof sv3)) {
                        i09 i09Var = ((sv3) M0).E0;
                        int i = 0;
                        M0 = M0;
                        p89Var = p89Var;
                        while (i09Var != null) {
                            if ((i09Var.c & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    p89Var = p89Var;
                                    M0 = i09Var;
                                } else {
                                    if (p89Var == 0) {
                                        p89Var = new p89(0, new i09[16]);
                                    }
                                    if (M0 != 0) {
                                        p89Var.b(M0);
                                        M0 = 0;
                                    }
                                    p89Var.b(i09Var);
                                }
                            }
                            i09Var = i09Var.f;
                            M0 = M0;
                            p89Var = p89Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M0 = vd0.m0(p89Var);
                }
            }
            if (i09VarK1 == i09VarH1) {
                return;
            }
        }
    }

    @Override // defpackage.lg8
    public final boolean u0() {
        return this.U0 != null;
    }

    public final void u1() {
        this.O0 = true;
        this.i1.invoke();
        A1();
        if (w67.b(this.W0, 0L)) {
            return;
        }
        this.J0.j0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [i09] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final void v1() {
        boolean zG = zf9.g(1048576);
        i09 i09VarK1 = k1(zG);
        if (i09VarK1 == null || (i09VarK1.a.d & 1048576) == 0) {
            return;
        }
        i09 i09VarH1 = h1();
        if (!zG && (i09VarH1 = i09VarH1.e) == null) {
            return;
        }
        for (i09 i09VarK2 = k1(zG); i09VarK2 != null && (i09VarK2.d & 1048576) != 0; i09VarK2 = i09VarK2.f) {
            if ((i09VarK2.c & 1048576) != 0) {
                ?? M0 = i09VarK2;
                ?? p89Var = 0;
                while (M0 != 0) {
                    if (M0 instanceof mff) {
                        ((mff) M0).Y0();
                    } else if ((M0.c & 1048576) != 0 && (M0 instanceof sv3)) {
                        i09 i09Var = ((sv3) M0).E0;
                        int i = 0;
                        M0 = M0;
                        p89Var = p89Var;
                        while (i09Var != null) {
                            if ((i09Var.c & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    p89Var = p89Var;
                                    M0 = i09Var;
                                } else {
                                    if (p89Var == 0) {
                                        p89Var = new p89(0, new i09[16]);
                                    }
                                    if (M0 != 0) {
                                        p89Var.b(M0);
                                        M0 = 0;
                                    }
                                    p89Var.b(i09Var);
                                }
                            }
                            i09Var = i09Var.f;
                            M0 = M0;
                            p89Var = p89Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M0 = vd0.m0(p89Var);
                }
            }
            if (i09VarK2 == i09VarH1) {
                return;
            }
        }
    }

    @Override // defpackage.lg8, defpackage.fw9
    public final boolean w() {
        return (this.k1 == null || this.O0 || !this.J0.W()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01d8 A[PHI: r3
  0x01d8: PHI (r3v18 ??) = (r3v1 ??), (r3v1 ??), (r3v20 ??) binds: [B:58:0x01a1, B:60:0x01a5, B:74:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [i09] */
    /* JADX WARN: Type inference failed for: r2v22, types: [i09] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18, types: [p89] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [p89] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r4v13 */
    public final void w1(i09 i09Var, xf9 xf9Var, long j, sl6 sl6Var, int i, boolean z, float f, boolean z2) {
        char c;
        int i2;
        ?? M0;
        i79 i79Var = sl6Var.a;
        if (i09Var == null) {
            o1(xf9Var, j, sl6Var, i, z);
            return;
        }
        if (!xf9Var.e(i09Var)) {
            w1(dj6.T(i09Var, xf9Var.d()), xf9Var, j, sl6Var, i, z, f, z2);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            ?? r2 = i09Var;
            ?? p89Var = 0;
            while (r2 != 0) {
                if (r2 instanceof ria) {
                    long jR = ((ria) r2).r();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    LayoutNode layoutNode = this.J0;
                    cv7 cv7Var = layoutNode.P0;
                    int i5 = t0f.b;
                    long j2 = Long.MIN_VALUE & jR;
                    cv7 cv7Var2 = cv7.a;
                    if (j2 == 0 || cv7Var == cv7Var2) {
                        c = 30;
                        i2 = (int) jR;
                    } else {
                        c = 30;
                        i2 = (int) (jR >> 30);
                    }
                    if (fIntBitsToFloat < (-(i2 & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= Y() + (((j2 == 0 || layoutNode.P0 == cv7Var2) ? (int) (jR >> c) : (int) jR) & 32767)) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i6) < (-(((int) (jR >> 15)) & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= (((int) (jR >> 45)) & 32767) + X()) {
                        break;
                    }
                    x69 x69Var = sl6Var.b;
                    int i7 = sl6Var.c;
                    int i8 = i79Var.b;
                    if (i7 == i8 - 1) {
                        sl6Var.d(i7 + 1, i8);
                        sl6Var.c++;
                        i79Var.h(i09Var);
                        x69Var.a(mh3.c(0.0f, z, true));
                        w1(dj6.T(i09Var, xf9Var.d()), xf9Var, j, sl6Var, i3, z, f, z2);
                        sl6Var.c = i7;
                        return;
                    }
                    long jC = sl6Var.c();
                    int i9 = sl6Var.c;
                    if (!dj6.N(jC)) {
                        if (dj6.K(jC) > 0.0f) {
                            int i10 = sl6Var.c;
                            sl6Var.d(i10 + 1, i79Var.b);
                            sl6Var.c++;
                            i79Var.h(i09Var);
                            x69Var.a(mh3.c(0.0f, z, true));
                            w1(dj6.T(i09Var, xf9Var.d()), xf9Var, j, sl6Var, i, z, f, z2);
                            sl6Var.c = i10;
                            return;
                        }
                        return;
                    }
                    int i11 = i79Var.b;
                    int i12 = i11 - 1;
                    sl6Var.c = i12;
                    sl6Var.d(i11, i79Var.b);
                    sl6Var.c++;
                    i79Var.h(i09Var);
                    x69Var.a(mh3.c(0.0f, z, true));
                    w1(dj6.T(i09Var, xf9Var.d()), xf9Var, j, sl6Var, i, z, f, z2);
                    sl6Var.c = i12;
                    if (dj6.K(sl6Var.c()) < 0.0f) {
                        sl6Var.d(i9 + 1, sl6Var.c + 1);
                    }
                    sl6Var.c = i9;
                    return;
                }
                if ((r2.c & 16) == 0 || !(r2 instanceof sv3)) {
                    M0 = r2;
                    p89Var = p89Var;
                    M0 = vd0.m0(p89Var);
                } else {
                    i09 i09Var2 = ((sv3) r2).E0;
                    int i13 = 0;
                    while (i09Var2 != null) {
                        if ((i09Var2.c & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                M0 = r2;
                                p89Var = p89Var;
                                p89Var = p89Var;
                                M0 = i09Var2;
                            } else {
                                if (p89Var == 0) {
                                    p89Var = new p89(0, new i09[16]);
                                }
                                if (M0 != 0) {
                                    p89Var.b(M0);
                                    M0 = 0;
                                }
                                p89Var.b(i09Var2);
                            }
                        } else {
                            M0 = r2;
                            p89Var = p89Var;
                        }
                        i09Var2 = i09Var2.f;
                        M0 = M0;
                        p89Var = p89Var;
                    }
                    if (i13 == 1) {
                        M0 = r2;
                        p89Var = p89Var;
                    } else {
                        M0 = r2;
                        p89Var = p89Var;
                        M0 = vd0.m0(p89Var);
                    }
                }
                i3 = i;
                r2 = M0;
                p89Var = p89Var;
            }
        }
        if (z2) {
            m1(i09Var, xf9Var, j, sl6Var, i, z, f);
        } else {
            C1(i09Var, xf9Var, j, sl6Var, i, z, f);
        }
    }

    public abstract void x1(vl1 vl1Var, ke6 ke6Var);

    public final void y1(long j, float f, a26 a26Var, ke6 ke6Var) {
        int i = 0;
        LayoutNode layoutNode = this.J0;
        if (ke6Var != null) {
            if (a26Var != null) {
                i37.a("both ways to create layers shouldn't be used together");
            }
            if (this.l1 != ke6Var) {
                this.l1 = null;
                H1(null, false);
                this.l1 = ke6Var;
            }
            if (this.k1 == null) {
                Owner ownerA = wv7.a(layoutNode);
                rk6 rk6Var = this.h1;
                if (rk6Var == null) {
                    rk6 rk6Var2 = new rk6(14, this, new vf9(this, i));
                    this.h1 = rk6Var2;
                    rk6Var = rk6Var2;
                }
                vf9 vf9Var = this.i1;
                ew9 ew9VarE = ((AndroidComposeView) ownerA).e(rk6Var, vf9Var, ke6Var);
                ne6 ne6Var = (ne6) ew9VarE;
                ne6Var.e(this.c);
                ne6Var.d(j);
                this.k1 = ew9VarE;
                layoutNode.Y0 = true;
                vf9Var.invoke();
            }
        } else {
            if (this.l1 != null) {
                this.l1 = null;
                H1(null, false);
            }
            H1(a26Var, false);
        }
        if (!w67.b(this.W0, j)) {
            ((AndroidComposeView) wv7.a(layoutNode)).M(-4.0f);
            this.W0 = j;
            ew9 ew9Var = this.k1;
            if (ew9Var != null) {
                ((ne6) ew9Var).d(j);
            } else {
                yf9 yf9Var = this.N0;
                if (yf9Var != null) {
                    yf9Var.p1();
                }
            }
            layoutNode.j0(this);
            lg8.J0(this);
            Owner owner = layoutNode.Z;
            if (owner != null) {
                ((AndroidComposeView) owner).v(layoutNode);
            }
        }
        this.X0 = f;
        if (this == layoutNode.getOuterCoordinator$ui()) {
            wv7.a(layoutNode).getRectManager().g(layoutNode);
        }
        if (this.Z) {
            return;
        }
        r0(B0());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    public final void z1(v79 v79Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        ew9 ew9Var = this.k1;
        if (ew9Var != null) {
            if (this.P0) {
                if (z2) {
                    long jG1 = g1();
                    float f = v79Var.b;
                    float f2 = v79Var.c;
                    if (v79Var.d >= 0.0f) {
                        long j = this.c;
                        if (f > ((int) (j >> 32)) || v79Var.e < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jG1 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG1 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (v79Var.d - v79Var.b)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (v79Var.e - v79Var.c)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.c;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jG1 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jG1 & 4294967295L);
                    v79Var.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.c;
                    v79Var.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (v79Var.b()) {
                    return;
                }
            }
            ne6 ne6Var = (ne6) ew9Var;
            float[] fArrB = ne6Var.b();
            if (!ne6Var.H0) {
                if (fArrB == null) {
                    v79Var.b = 0.0f;
                    v79Var.c = 0.0f;
                    v79Var.d = 0.0f;
                    v79Var.e = 0.0f;
                } else {
                    zm8.c(fArrB, v79Var);
                }
            }
        }
        long j4 = this.W0;
        float f9 = (int) (j4 >> 32);
        v79Var.b += f9;
        v79Var.d += f9;
        float f10 = (int) (j4 & 4294967295L);
        v79Var.c += f10;
        v79Var.e += f10;
    }

    @Override // defpackage.lg8
    public final bv7 t0() {
        return this;
    }
}

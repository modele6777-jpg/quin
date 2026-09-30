package defpackage;

import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oo5 extends i09 implements ug2, al9, p09, mff, rv3 {
    public final l26 E0;
    public boolean F0;
    public boolean G0;
    public final int H0;
    public tcc I0;
    public final boolean Z;

    public oo5(int i, int i2, l26 l26Var) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        l26Var = (i2 & 4) != 0 ? null : l26Var;
        this.Z = z;
        this.E0 = l26Var;
        this.H0 = i;
    }

    public static boolean t1(oo5 oo5Var) {
        return oo5Var.s1(7);
    }

    @Override // defpackage.al9
    public final void A0() {
        r1();
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    @Override // defpackage.i09
    public final void e1() {
        bo5 bo5Var;
        int iOrdinal = q1().ordinal();
        if (iOrdinal == 0) {
            bo5Var = (bo5) vd0.t0(this).getFocusOwner();
            bo5Var.c(8, true, false);
            if (this.Z) {
                bo5Var.a.D();
            }
            bo5Var.d.a();
        } else if (iOrdinal == 1) {
            zn5 focusOwner = vd0.t0(this).getFocusOwner();
            oo5 oo5VarX = vpf.x(this);
            if (oo5VarX != null && oo5VarX.Z) {
                bo5 bo5Var2 = (bo5) focusOwner;
                bo5Var2.a.D();
                bo5Var2.d.a();
            }
        } else if (iOrdinal == 2) {
            bo5Var = (bo5) vd0.t0(this).getFocusOwner();
            bo5Var.c(8, true, false);
            if (this.Z) {
                bo5Var.a.D();
            }
            bo5Var.d.a();
        } else if (iOrdinal != 3) {
            ap.c();
            return;
        }
        tcc tccVar = this.I0;
        if (tccVar != null) {
            ((gg7) tccVar).z();
        }
        this.I0 = null;
    }

    @Override // defpackage.i09
    public final void f1() {
        if (q1().b()) {
            ((bo5) vd0.t0(this).getFocusOwner()).c(8, true, true);
        }
    }

    public final boolean l1(int i) {
        int iOrdinal = t72.P(this, i).ordinal();
        if (iOrdinal == 0) {
            return t72.Q(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        ap.c();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [i09] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [i09] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [p89] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [p89] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void m1(jo5 jo5Var, jo5 jo5Var2) {
        wo0 wo0Var;
        l26 l26Var;
        bo5 bo5Var = (bo5) vd0.t0(this).getFocusOwner();
        oo5 oo5VarG = bo5Var.g();
        if (!jo5Var.equals(jo5Var2) && (l26Var = this.E0) != null) {
            l26Var.z(jo5Var, jo5Var2);
        }
        i09 i09Var = this.a;
        if (!i09Var.Y) {
            i37.c("visitAncestors called on an unattached node");
        }
        i09 i09Var2 = this.a;
        LayoutNode layoutNodeS0 = vd0.s0(this);
        while (layoutNodeS0 != null) {
            if ((((i09) layoutNodeS0.V0.g).d & 5120) != 0) {
                while (i09Var2 != null) {
                    int i = i09Var2.c;
                    if ((i & 5120) != 0) {
                        if (i09Var2 != i09Var && (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? M0 = i09Var2;
                            ?? p89Var = 0;
                            while (M0 != 0) {
                                if (M0 instanceof nn5) {
                                    nn5 nn5Var = (nn5) M0;
                                    if (oo5VarG == bo5Var.g()) {
                                        nn5Var.r0(jo5Var2);
                                    }
                                } else if ((M0.c & 4096) != 0 && (M0 instanceof sv3)) {
                                    i09 i09Var3 = ((sv3) M0).E0;
                                    int i2 = 0;
                                    M0 = M0;
                                    p89Var = p89Var;
                                    while (i09Var3 != null) {
                                        if ((i09Var3.c & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                p89Var = p89Var;
                                                M0 = i09Var3;
                                            } else {
                                                if (p89Var == 0) {
                                                    p89Var = new p89(0, new i09[16]);
                                                }
                                                if (M0 != 0) {
                                                    p89Var.b(M0);
                                                    M0 = 0;
                                                }
                                                p89Var.b(i09Var3);
                                            }
                                        }
                                        i09Var3 = i09Var3.f;
                                        M0 = M0;
                                        p89Var = p89Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M0 = vd0.m0(p89Var);
                            }
                        }
                    }
                    i09Var2 = i09Var2.e;
                }
            }
            layoutNodeS0 = layoutNodeS0.F();
            i09Var2 = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [i09] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [i09] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [p89] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [p89] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final do5 n1() {
        boolean z;
        wo0 wo0Var;
        do5 do5Var = new do5();
        do5Var.a = true;
        fo5 fo5Var = fo5.b;
        do5Var.b = fo5Var;
        do5Var.c = fo5Var;
        do5Var.d = fo5Var;
        do5Var.e = fo5Var;
        do5Var.f = fo5Var;
        do5Var.g = fo5Var;
        do5Var.h = fo5Var;
        do5Var.i = fo5Var;
        do5Var.j = new hl4(22);
        do5Var.k = new hl4(23);
        do5Var.l = hj6.J0;
        int i = this.H0;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((m47) ((o47) ((n47) eb3.H(this, zg2.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                qc0.p("Unknown Focusability");
                return null;
            }
            z = false;
        }
        do5Var.a = z;
        i09 i09Var = this.a;
        if (!i09Var.Y) {
            i37.c("visitAncestors called on an unattached node");
        }
        i09 i09Var2 = this.a;
        LayoutNode layoutNodeS0 = vd0.s0(this);
        loop0: while (layoutNodeS0 != null) {
            if ((((i09) layoutNodeS0.V0.g).d & 3072) != 0) {
                while (i09Var2 != null) {
                    int i2 = i09Var2.c;
                    if ((i2 & 3072) != 0) {
                        if (i09Var2 != i09Var && (i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? p89Var = 0;
                            ?? M0 = i09Var2;
                            while (M0 != 0) {
                                if (M0 instanceof eo5) {
                                    ((eo5) M0).K(do5Var);
                                } else if ((M0.c & 2048) != 0 && (M0 instanceof sv3)) {
                                    i09 i09Var3 = ((sv3) M0).E0;
                                    int i3 = 0;
                                    while (i09Var3 != null) {
                                        if ((i09Var3.c & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                M0 = M0;
                                                p89Var = p89Var;
                                                p89Var = p89Var;
                                                M0 = i09Var3;
                                            } else {
                                                if (p89Var == 0) {
                                                    p89Var = new p89(0, new i09[16]);
                                                }
                                                if (M0 != 0) {
                                                    p89Var.b(M0);
                                                    M0 = 0;
                                                }
                                                p89Var.b(i09Var3);
                                            }
                                        } else {
                                            M0 = M0;
                                            p89Var = p89Var;
                                        }
                                        i09Var3 = i09Var3.f;
                                        M0 = M0;
                                        p89Var = p89Var;
                                    }
                                    if (i3 == 1) {
                                        M0 = M0;
                                        p89Var = p89Var;
                                    } else {
                                        M0 = M0;
                                        p89Var = p89Var;
                                    }
                                }
                                M0 = vd0.m0(p89Var);
                            }
                        }
                    }
                    i09Var2 = i09Var2.e;
                }
            }
            layoutNodeS0 = layoutNodeS0.F();
            i09Var2 = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
        }
        return do5Var;
    }

    public final hkb o1(bv7 bv7Var) {
        hkb hkbVar = n1().l;
        if (hkbVar != hj6.J0) {
            return bv7Var == null ? hkbVar : hkbVar.k(bv7.e(bv7Var, vd0.r0(this), 6));
        }
        return bv7Var != null ? bv7Var.M(vd0.r0(this), false) : z5c.g(0L, db6.Y0(vd0.r0(this).c));
    }

    public final yy7 p1() {
        wo0 wo0Var;
        Object obj;
        if (!this.a.Y) {
            i37.c("visitAncestors called on an unattached node");
        }
        i09 i09Var = this.a.e;
        LayoutNode layoutNodeS0 = vd0.s0(this);
        loop0: while (layoutNodeS0 != null) {
            if ((((i09) layoutNodeS0.V0.g).d & 8388640) != 0) {
                while (i09Var != null) {
                    int i = i09Var.c;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(i09Var instanceof yy7)) {
                                if (i09Var instanceof sv3) {
                                    i09Var = null;
                                    for (i09 i09Var2 = ((sv3) i09Var).E0; i09Var2 != null; i09Var2 = i09Var2.f) {
                                        if (i09Var2 instanceof yy7) {
                                            i09Var = i09Var2;
                                        }
                                    }
                                } else {
                                    i09Var = null;
                                }
                            }
                            yy7 yy7Var = (yy7) i09Var;
                            if (yy7Var != null) {
                                return yy7Var;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (i09Var instanceof p09) {
                                obj = i09Var;
                            } else if (i09Var instanceof sv3) {
                                obj = null;
                                for (i09 i09Var3 = ((sv3) i09Var).E0; i09Var3 != null; i09Var3 = i09Var3.f) {
                                    if (i09Var3 instanceof p09) {
                                        obj = i09Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            p09 p09Var = (p09) obj;
                            if (p09Var != null) {
                                x57 x57VarE0 = p09Var.e0();
                                c1b c1bVar = ok8.b;
                                if (x57VarE0.J(c1bVar)) {
                                    return (yy7) p09Var.e0().O(c1bVar);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i09Var = i09Var.e;
                }
            }
            layoutNodeS0 = layoutNodeS0.F();
            i09Var = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
        }
        return null;
    }

    public final ko5 q1() {
        oo5 oo5VarG;
        wo0 wo0Var;
        boolean z = this.Y;
        ko5 ko5Var = ko5.c;
        if (!z || (oo5VarG = ((bo5) vd0.t0(this).getFocusOwner()).g()) == null) {
            return ko5Var;
        }
        if (this == oo5VarG) {
            return ko5.a;
        }
        if (oo5VarG.Y) {
            if (!oo5VarG.a.Y) {
                i37.c("visitAncestors called on an unattached node");
            }
            i09 i09Var = oo5VarG.a.e;
            LayoutNode layoutNodeS0 = vd0.s0(oo5VarG);
            while (layoutNodeS0 != null) {
                if ((((i09) layoutNodeS0.V0.g).d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    while (i09Var != null) {
                        if ((i09Var.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            i09 i09VarM0 = i09Var;
                            p89 p89Var = null;
                            while (i09VarM0 != null) {
                                if (i09VarM0 instanceof oo5) {
                                    if (this == ((oo5) i09VarM0)) {
                                        return ko5.b;
                                    }
                                } else if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                    int i = 0;
                                    for (i09 i09Var2 = ((sv3) i09VarM0).E0; i09Var2 != null; i09Var2 = i09Var2.f) {
                                        if ((i09Var2.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            i++;
                                            if (i == 1) {
                                                i09VarM0 = i09Var2;
                                            } else {
                                                if (p89Var == null) {
                                                    p89Var = new p89(0, new i09[16]);
                                                }
                                                if (i09VarM0 != null) {
                                                    p89Var.b(i09VarM0);
                                                    i09VarM0 = null;
                                                }
                                                p89Var.b(i09Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                i09VarM0 = vd0.m0(p89Var);
                            }
                        }
                        i09Var = i09Var.e;
                    }
                }
                layoutNodeS0 = layoutNodeS0.F();
                i09Var = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
            }
        }
        return ko5Var;
    }

    public final void r1() {
        int iOrdinal = q1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                ap.c();
                return;
            }
        }
        mmb mmbVar = new mmb();
        if9.C(this, new jt3(19, mmbVar, this));
        Object obj = mmbVar.element;
        if (obj == null) {
            pa7.g0("focusProperties");
            throw null;
        }
        if (((co5) obj).a()) {
            return;
        }
        ((bo5) vd0.t0(this).getFocusOwner()).c(8, true, true);
    }

    public final boolean s1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return n1().a ? l1(i) : uyb.r(this, i, new xp(i, 8));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.mff
    public final void Y0() {
    }

    @Override // defpackage.i09
    public final void d1() {
    }
}

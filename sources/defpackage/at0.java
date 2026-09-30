package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class at0 extends i09 implements kv7, pn4, wwc, ria, p09, xz9, zu7, mb6, nn5, eo5, ho5, fw9, z41 {
    public zs0 E0;
    public HashSet F0;
    public h09 Z;

    @Override // defpackage.ria
    public final void E(hia hiaVar, iia iiaVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        h09 h09Var = this.Z;
        h09Var.getClass();
        szc szcVar = ((via) h09Var).d;
        via viaVar = (via) szcVar.e;
        List list = hiaVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            oia oiaVar = (oia) list.get(i);
            if (xo1.l(oiaVar) || xo1.n(oiaVar)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((oia) list.get(i2)).c()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (viaVar.c) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                oia oiaVar2 = (oia) list.get(i3);
                if (!xo1.l(oiaVar2) && !xo1.n(oiaVar2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        uia uiaVar = (uia) szcVar.c;
        uia uiaVar2 = uia.c;
        iia iiaVar2 = iia.c;
        if (uiaVar != uiaVar2) {
            if (iiaVar == iia.a && z3) {
                szcVar.d = hiaVar;
                szcVar.E(hiaVar, !z || viaVar.c);
            }
            if (iiaVar == iia.b && z && hiaVar == ((hia) szcVar.d) && viaVar.c) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((oia) list.get(i4)).a();
                }
            }
            if (iiaVar == iiaVar2 && !z3 && hiaVar != ((hia) szcVar.d)) {
                szcVar.E(hiaVar, true);
            }
        }
        if (iiaVar == iiaVar2) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    szcVar.c = uia.a;
                    ((via) szcVar.e).c = false;
                    szcVar.d = null;
                    break;
                } else if (!xo1.n((oia) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (hiaVar == ((hia) szcVar.d) && z) {
                int size6 = list.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (((oia) list.get(i6)).c()) {
                        if (viaVar.c) {
                            break;
                        }
                        szcVar.U(hiaVar);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((oia) list.get(i7)).a();
                }
            }
        }
    }

    @Override // defpackage.kv7
    public final int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        h09 h09Var = this.Z;
        h09Var.getClass();
        return ((iv7) h09Var).d(new ua7(lg8Var, lg8Var.getLayoutDirection()), new gr3(tn8Var, lo8.a, mo8.a, 1), ll2.b(0, 0, 0, i, 7)).d();
    }

    @Override // defpackage.ria
    public final boolean J0() {
        h09 h09Var = this.Z;
        h09Var.getClass();
        ((via) h09Var).d.getClass();
        return true;
    }

    @Override // defpackage.eo5
    public final void K(co5 co5Var) {
        h09 h09Var = this.Z;
        i37.c("applyFocusProperties called on wrong node");
        h09Var.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [i09] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [i09] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.p09
    public final Object L(c1b c1bVar) {
        wo0 wo0Var;
        c1b c1bVar2 = b21.l;
        this.F0.add(c1bVar2);
        if (!this.a.Y) {
            i37.c("visitAncestors called on an unattached node");
        }
        i09 i09Var = this.a.e;
        LayoutNode layoutNodeS0 = vd0.s0(this);
        while (layoutNodeS0 != null) {
            if ((((i09) layoutNodeS0.V0.g).d & 32) != 0) {
                while (i09Var != null) {
                    if ((i09Var.c & 32) != 0) {
                        ?? M0 = i09Var;
                        ?? p89Var = 0;
                        while (M0 != 0) {
                            if (M0 instanceof p09) {
                                p09 p09Var = (p09) M0;
                                if (p09Var.e0().J(c1bVar2)) {
                                    return p09Var.e0().O(c1bVar2);
                                }
                            } else if ((M0.c & 32) != 0 && (M0 instanceof sv3)) {
                                i09 i09Var2 = ((sv3) M0).E0;
                                int i = 0;
                                M0 = M0;
                                p89Var = p89Var;
                                while (i09Var2 != null) {
                                    if ((i09Var2.c & 32) != 0) {
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
                    i09Var = i09Var.e;
                }
            }
            layoutNodeS0 = layoutNodeS0.F();
            i09Var = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
        }
        return c1bVar2.a.invoke();
    }

    @Override // defpackage.ria
    public final void N() {
        h09 h09Var = this.Z;
        h09Var.getClass();
        szc szcVar = ((via) h09Var).d;
        uia uiaVar = (uia) szcVar.c;
        via viaVar = (via) szcVar.e;
        if (uiaVar == uia.b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            ((uw) viaVar.a()).d(motionEventObtain);
            motionEventObtain.recycle();
            szcVar.c = uia.a;
            viaVar.c = false;
            szcVar.d = null;
        }
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        h09 h09Var = this.Z;
        h09Var.getClass();
        twc twcVarT0 = ((uwc) h09Var).T0();
        hxcVar.getClass();
        twc twcVar = (twc) hxcVar;
        w79 w79Var = twcVar.a;
        if (twcVarT0.c) {
            twcVar.c = true;
        }
        if (twcVarT0.d) {
            twcVar.d = true;
        }
        w79 w79Var2 = twcVarT0.a;
        Object[] objArr = w79Var2.b;
        Object[] objArr2 = w79Var2.c;
        long[] jArr = w79Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        gxc gxcVar = (gxc) obj;
                        if (!w79Var.b(gxcVar)) {
                            w79Var.m(gxcVar, obj2);
                        } else if (obj2 instanceof f6) {
                            Object objG = w79Var.g(gxcVar);
                            objG.getClass();
                            f6 f6Var = (f6) objG;
                            String str = f6Var.a;
                            if (str == null) {
                                str = ((f6) obj2).a;
                            }
                            m26 m26Var = f6Var.b;
                            if (m26Var == null) {
                                m26Var = ((f6) obj2).b;
                            }
                            w79Var.m(gxcVar, new f6(str, m26Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.pn4
    public final void V() {
        qn4.G(this);
    }

    @Override // defpackage.ria
    public final void W() {
        h09 h09Var = this.Z;
        h09Var.getClass();
        ((via) h09Var).d.getClass();
    }

    @Override // defpackage.xz9
    public final Object b(sw3 sw3Var, Object obj) {
        h09 h09Var = this.Z;
        h09Var.getClass();
        return ((wz9) h09Var).b(sw3Var, obj);
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        h09 h09Var = this.Z;
        h09Var.getClass();
        return ((iv7) h09Var).d(zn8Var, tn8Var, j);
    }

    @Override // defpackage.i09
    public final void d1() {
        l1(true);
    }

    @Override // defpackage.rv3
    public final void e() {
        if (this.Z instanceof via) {
            N();
        }
    }

    @Override // defpackage.p09
    public final x57 e0() {
        zs0 zs0Var = this.E0;
        return zs0Var != null ? zs0Var : ru4.s;
    }

    @Override // defpackage.i09
    public final void e1() {
        m1();
    }

    @Override // defpackage.z41
    public final long f() {
        return db6.Y0(vd0.p0(this, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).c);
    }

    @Override // defpackage.z41
    public final sw3 getDensity() {
        return vd0.s0(this).O0;
    }

    @Override // defpackage.z41
    public final cv7 getLayoutDirection() {
        return vd0.s0(this).P0;
    }

    @Override // defpackage.kv7
    public final int h(lg8 lg8Var, tn8 tn8Var, int i) {
        h09 h09Var = this.Z;
        h09Var.getClass();
        return ((iv7) h09Var).d(new ua7(lg8Var, lg8Var.getLayoutDirection()), new gr3(tn8Var, lo8.b, mo8.a, 1), ll2.b(0, 0, 0, i, 7)).d();
    }

    @Override // defpackage.kv7
    public final int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        h09 h09Var = this.Z;
        h09Var.getClass();
        return ((iv7) h09Var).d(new ua7(lg8Var, lg8Var.getLayoutDirection()), new gr3(tn8Var, lo8.b, mo8.b, 1), ll2.b(0, i, 0, 0, 13)).c();
    }

    @Override // defpackage.mb6
    public final void l0(yf9 yf9Var) {
        h09 h09Var = this.Z;
        h09Var.getClass();
        ((aqe) h09Var).l0(yf9Var);
    }

    public final void l1(boolean z) {
        if (!this.Y) {
            i37.c("initializeModifier called on unattached node");
        }
        h09 h09Var = this.Z;
        if ((this.c & 32) != 0 && (h09Var instanceof q09)) {
            q09 q09Var = (q09) h09Var;
            c1b c1bVar = tu3.a;
            zs0 zs0Var = this.E0;
            if (zs0Var == null || !zs0Var.J(c1bVar)) {
                zs0 zs0Var2 = new zs0();
                zs0Var2.s = q09Var;
                this.E0 = zs0Var2;
                zde zdeVar = (zde) vd0.s0(this).V0.f;
                zdeVar.getClass();
                if (zdeVar.Z) {
                    o09 modifierLocalManager = vd0.t0(this).getModifierLocalManager();
                    i79 i79Var = modifierLocalManager.b;
                    if (i79Var == null) {
                        i79Var = new i79();
                        modifierLocalManager.b = i79Var;
                    }
                    i79Var.h(this);
                    i79 i79Var2 = modifierLocalManager.c;
                    if (i79Var2 == null) {
                        i79Var2 = new i79();
                        modifierLocalManager.c = i79Var2;
                    }
                    i79Var2.h(c1bVar);
                    modifierLocalManager.a();
                }
            } else {
                zs0Var.s = q09Var;
                o09 modifierLocalManager2 = vd0.t0(this).getModifierLocalManager();
                i79 i79Var3 = modifierLocalManager2.b;
                if (i79Var3 == null) {
                    i79Var3 = new i79();
                    modifierLocalManager2.b = i79Var3;
                }
                i79Var3.h(this);
                i79 i79Var4 = modifierLocalManager2.c;
                if (i79Var4 == null) {
                    i79Var4 = new i79();
                    modifierLocalManager2.c = i79Var4;
                }
                i79Var4.h(c1bVar);
                modifierLocalManager2.a();
            }
        }
        if ((this.c & 4) != 0 && !z) {
            rs0.E(this);
        }
        if ((this.c & 2) != 0) {
            zde zdeVar2 = (zde) vd0.s0(this).V0.f;
            zdeVar2.getClass();
            if (zdeVar2.Z) {
                yf9 yf9Var = this.v;
                yf9Var.getClass();
                ((nv7) yf9Var).L1(this);
                ew9 ew9Var = yf9Var.k1;
                if (ew9Var != null) {
                    ((ne6) ew9Var).c();
                }
            }
            if (!z) {
                rs0.E(this);
                vd0.s0(this).S();
            }
        }
        if (h09Var instanceof gx7) {
            gx7 gx7Var = (gx7) h09Var;
            LayoutNode layoutNodeS0 = vd0.s0(this);
            switch (gx7Var.a) {
                case 0:
                    ((jx7) gx7Var.b).j = layoutNodeS0;
                    break;
                case 1:
                    ((j18) gx7Var.b).l = layoutNodeS0;
                    break;
                default:
                    ((yx9) gx7Var.b).x.setValue(layoutNodeS0);
                    break;
            }
        }
        if ((this.c & 256) != 0 && (h09Var instanceof aqe)) {
            zde zdeVar3 = (zde) vd0.s0(this).V0.f;
            zdeVar3.getClass();
            if (zdeVar3.Z) {
                vd0.s0(this).S();
            }
        }
        int i = this.c;
        if ((i & 16) != 0 && (h09Var instanceof via)) {
            ((via) h09Var).d.b = this.v;
        }
        if ((i & 8) != 0) {
            ((AndroidComposeView) vd0.t0(this)).y();
        }
    }

    public final void m1() {
        if (!this.Y) {
            i37.c("unInitializeModifier called on unattached node");
        }
        h09 h09Var = this.Z;
        if ((this.c & 32) != 0 && (h09Var instanceof q09)) {
            o09 modifierLocalManager = vd0.t0(this).getModifierLocalManager();
            c1b c1bVar = tu3.a;
            i79 i79Var = modifierLocalManager.d;
            if (i79Var == null) {
                i79Var = new i79();
                modifierLocalManager.d = i79Var;
            }
            i79Var.h(vd0.s0(this));
            i79 i79Var2 = modifierLocalManager.e;
            if (i79Var2 == null) {
                i79Var2 = new i79();
                modifierLocalManager.e = i79Var2;
            }
            i79Var2.h(c1bVar);
            modifierLocalManager.a();
        }
        if ((this.c & 8) != 0) {
            ((AndroidComposeView) vd0.t0(this)).y();
        }
    }

    public final void n1() {
        if (this.Y) {
            this.F0.clear();
            gw9 snapshotObserver = vd0.t0(this).getSnapshotObserver();
            snapshotObserver.a.d(this, nk8.b, new p(10, this));
        }
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        h09 h09Var = this.Z;
        h09Var.getClass();
        ((vv7) im2Var).a();
    }

    @Override // defpackage.nn5
    public final void r0(jo5 jo5Var) {
        h09 h09Var = this.Z;
        i37.c("onFocusEvent called on wrong node");
        h09Var.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.Z.toString();
    }

    @Override // defpackage.kv7
    public final int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        h09 h09Var = this.Z;
        h09Var.getClass();
        return ((iv7) h09Var).d(new ua7(lg8Var, lg8Var.getLayoutDirection()), new gr3(tn8Var, lo8.a, mo8.b, 1), ll2.b(0, i, 0, 0, 13)).c();
    }

    @Override // defpackage.fw9
    public final boolean w() {
        return this.Y;
    }

    @Override // defpackage.zu7, defpackage.co8
    public final void a(long j) {
    }

    @Override // defpackage.zu7
    public final void p(bv7 bv7Var) {
    }
}

package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ywc {
    public final i09 a;
    public final boolean b;
    public final LayoutNode c;
    public final twc d;
    public ywc e;
    public final int f;

    public ywc(i09 i09Var, boolean z, LayoutNode layoutNode, twc twcVar) {
        this.a = i09Var;
        this.b = z;
        this.c = layoutNode;
        this.d = twcVar;
        this.f = layoutNode.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [i09] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [i09] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
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
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final hkb a(yf9 yf9Var) {
        ?? M0;
        ywc ywcVarL = l();
        if (ywcVarL == null) {
            return hkb.e;
        }
        i09 i09Var = (i09) ywcVarL.c.V0.g;
        if ((i09Var.d & 8) == 0) {
            M0 = 0;
            break;
        }
        loop0: while (true) {
            if (i09Var != null) {
                if ((i09Var.c & 8) != 0) {
                    M0 = i09Var;
                    ?? p89Var = 0;
                    while (M0 != 0) {
                        if (M0 instanceof wwc) {
                            if (((wwc) M0).k()) {
                                break loop0;
                            }
                        } else if ((M0.c & 8) != 0 && (M0 instanceof sv3)) {
                            i09 i09Var2 = ((sv3) M0).E0;
                            int i = 0;
                            while (i09Var2 != null) {
                                if ((i09Var2.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        M0 = M0;
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
                                    M0 = M0;
                                    p89Var = p89Var;
                                }
                                i09Var2 = i09Var2.f;
                                M0 = M0;
                                p89Var = p89Var;
                            }
                            if (i == 1) {
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
                if ((i09Var.d & 8) != 0) {
                    i09Var = i09Var.f;
                }
            }
            M0 = 0;
            break;
        }
        wwc wwcVar = (wwc) M0;
        yf9 yf9VarP0 = wwcVar != null ? vd0.p0(wwcVar, 8) : null;
        return yf9VarP0 == null ? ywcVarL.a(yf9Var) : yf9VarP0.M(yf9Var, true);
    }

    public final ywc b(i5c i5cVar, a26 a26Var) {
        twc twcVar = new twc();
        twcVar.c = false;
        twcVar.d = false;
        a26Var.d(twcVar);
        ywc ywcVar = new ywc(new xwc(a26Var), false, new LayoutNode(true, this.f + (i5cVar != null ? 1000000000 : 2000000000)), twcVar);
        ywcVar.e = this;
        return ywcVar;
    }

    public final void c(LayoutNode layoutNode, ArrayList arrayList) {
        p89 p89VarK = layoutNode.K();
        Object[] objArr = p89VarK.a;
        int i = p89VarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.W() && !layoutNode2.f1) {
                if (layoutNode2.V0.i(8)) {
                    arrayList.add(fdc.a(layoutNode2, this.b));
                } else {
                    c(layoutNode2, arrayList);
                }
            }
        }
    }

    public final yf9 d() {
        if (!n()) {
            wwc wwcVarF = f();
            return wwcVarF != null ? vd0.p0(wwcVarF, 8) : (c47) this.c.V0.d;
        }
        ywc ywcVarL = l();
        if (ywcVarL != null) {
            return ywcVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            ywc ywcVar = (ywc) arrayList.get(size2);
            if (ywcVar.o()) {
                arrayList2.add(ywcVar);
            } else if (!ywcVar.d.d) {
                ywcVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [i09] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [i09] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final wwc f() {
        ?? M0;
        boolean z;
        ?? r0;
        boolean z2 = this.d.c;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        LayoutNode layoutNode = this.c;
        if (!z2) {
            i09 i09Var = (i09) layoutNode.V0.g;
            if ((i09Var.d & 8) != 0) {
                loop3: while (i09Var != null) {
                    if ((i09Var.c & 8) != 0) {
                        M0 = i09Var;
                        ?? p89Var = 0;
                        while (true) {
                            if (M0 != 0) {
                                if (M0 instanceof wwc) {
                                    if (((wwc) M0).k()) {
                                        r4 = M0;
                                    }
                                } else if ((M0.c & 8) != 0 && (M0 instanceof sv3)) {
                                    i09 i09Var2 = ((sv3) M0).E0;
                                    int i = 0;
                                    while (i09Var2 != null) {
                                        if ((i09Var2.c & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                M0 = M0;
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
                                            M0 = M0;
                                            p89Var = p89Var;
                                        }
                                        i09Var2 = i09Var2.f;
                                        M0 = M0;
                                        p89Var = p89Var;
                                    }
                                    if (i == 1) {
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
                    if ((i09Var.d & 8) == 0) {
                        break;
                    }
                    i09Var = i09Var.f;
                }
            }
        } else {
            i09 i09Var3 = (i09) layoutNode.V0.g;
            if ((i09Var3.d & 8) != 0) {
                M0 = 0;
                while (i09Var3 != null) {
                    if ((i09Var3.c & 8) != 0) {
                        i09 i09VarM0 = i09Var3;
                        p89 p89Var2 = null;
                        while (i09VarM0 != null) {
                            if (i09VarM0 instanceof wwc) {
                                wwc wwcVar = (wwc) i09VarM0;
                                if (wwcVar.k()) {
                                    if (wwcVar.S0()) {
                                        r0 = M0;
                                        r0 = M0;
                                        return wwcVar;
                                    }
                                    if (M0 == 0) {
                                        r0 = wwcVar;
                                    }
                                }
                                r0 = M0;
                                z = false;
                                M0 = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                M0 = M0;
                                if ((i09VarM0.c & 8) != 0 && (i09VarM0 instanceof sv3)) {
                                    int i2 = 0;
                                    for (i09 i09Var4 = ((sv3) i09VarM0).E0; i09Var4 != null; i09Var4 = i09Var4.f) {
                                        if ((i09Var4.c & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                i09VarM0 = i09Var4;
                                            } else {
                                                if (p89Var2 == null) {
                                                    p89Var2 = new p89(0, new i09[16]);
                                                }
                                                if (i09VarM0 != null) {
                                                    p89Var2.b(i09VarM0);
                                                    i09VarM0 = null;
                                                }
                                                p89Var2.b(i09Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                M0 = M0;
                            }
                            i09VarM0 = vd0.m0(p89Var2);
                        }
                    }
                    if ((i09Var3.d & 8) == 0) {
                        break;
                    }
                    i09Var3 = i09Var3.f;
                    M0 = M0;
                }
                r4 = M0;
            }
        }
        return (wwc) r4;
    }

    public final hkb g() {
        yf9 yf9VarD = d();
        if (yf9VarD != null) {
            if (!yf9VarD.h1().Y) {
                yf9VarD = null;
            }
            if (yf9VarD != null) {
                return vd0.S(yf9VarD).M(yf9VarD, true);
            }
        }
        return hkb.e;
    }

    public final hkb h() {
        yf9 yf9VarD = d();
        if (yf9VarD != null) {
            if (!yf9VarD.h1().Y) {
                yf9VarD = null;
            }
            if (yf9VarD != null) {
                return vd0.N(yf9VarD, true);
            }
        }
        return hkb.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return pu4.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!o()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final twc k() {
        boolean zO = o();
        twc twcVar = this.d;
        if (!zO) {
            return twcVar;
        }
        twc twcVarD = twcVar.d();
        p(new ArrayList(), twcVarD);
        return twcVarD;
    }

    public final ywc l() {
        LayoutNode layoutNodeF;
        ywc ywcVar = this.e;
        if (ywcVar != null) {
            return ywcVar;
        }
        LayoutNode layoutNode = this.c;
        boolean z = this.b;
        if (!z) {
            layoutNodeF = null;
            break;
        }
        layoutNodeF = layoutNode.F();
        while (true) {
            if (layoutNodeF == null) {
                layoutNodeF = null;
                break;
            }
            twc twcVarH = layoutNodeF.H();
            if (twcVarH != null && twcVarH.c) {
                break;
            }
            layoutNodeF = layoutNodeF.F();
        }
        if (layoutNodeF == null) {
            for (LayoutNode layoutNodeF2 = layoutNode.F(); layoutNodeF2 != null; layoutNodeF2 = layoutNodeF2.F()) {
                if (layoutNodeF2.V0.i(8)) {
                    layoutNodeF = layoutNodeF2;
                }
            }
            layoutNodeF = null;
        }
        if (layoutNodeF == null) {
            return null;
        }
        return fdc.a(layoutNodeF, z);
    }

    public final hkb m() {
        Object objF = f();
        if (objF == null) {
            return ((c47) this.c.V0.d).E1();
        }
        i09 i09Var = ((i09) objF).a;
        Object objG = this.d.a.g(swc.b);
        if (objG == null) {
            objG = null;
        }
        return scc.i(i09Var, objG != null, true);
    }

    public final boolean n() {
        return this.e != null;
    }

    public final boolean o() {
        return this.b && this.d.c;
    }

    public final void p(ArrayList arrayList, twc twcVar) {
        if (this.d.d) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            ywc ywcVar = (ywc) arrayList.get(size2);
            if (!ywcVar.o()) {
                twcVar.f(ywcVar.d);
                ywcVar.p(arrayList, twcVar);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (n()) {
            return pu4.a;
        }
        c(this.c, arrayList);
        if (z) {
            twc twcVar = this.d;
            w79 w79Var = twcVar.a;
            Object objG = w79Var.g(cxc.z);
            if (objG == null) {
                objG = null;
            }
            i5c i5cVar = (i5c) objG;
            if (i5cVar != null && twcVar.c && !arrayList.isEmpty()) {
                arrayList.add(b(i5cVar, new ckb(17, i5cVar)));
            }
            gxc gxcVar = cxc.a;
            if (w79Var.c(gxcVar) && !arrayList.isEmpty() && twcVar.c) {
                Object objG2 = w79Var.g(gxcVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) s72.x0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new alc(str, 4)));
                }
            }
        }
        return arrayList;
    }
}

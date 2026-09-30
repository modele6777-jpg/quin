package defpackage;

import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gw7 implements ue2 {
    public final String E0;
    public final p89 X;
    public int Y;
    public int Z;
    public final LayoutNode a;
    public lg2 b;
    public t6e c;
    public int d;
    public int e;
    public final w79 f;
    public final w79 g;
    public final bw7 v;
    public final yv7 w;
    public final w79 x;
    public final s6e y;
    public final w79 z;

    public gw7(LayoutNode layoutNode, t6e t6eVar) {
        this.a = layoutNode;
        this.c = t6eVar;
        long[] jArr = jec.a;
        this.f = new w79();
        this.g = new w79();
        this.v = new bw7(this);
        this.w = new yv7(this);
        this.x = new w79();
        this.y = new s6e();
        this.z = new w79();
        this.X = new p89(0, new Object[16]);
        this.E0 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void c(zv7 zv7Var) {
        x79 x79Var;
        p2a p2aVar = zv7Var.f;
        if (p2aVar != null) {
            p2aVar.h.set(r2a.b);
            bw bwVar = p2aVar.k;
            if (((x79) bwVar.d).d()) {
                x79Var = (x79) bwVar.d;
                x79 x79Var2 = mec.a;
                bwVar.d = new x79();
                ((p89) bwVar.c).g();
            } else {
                x79Var = null;
            }
            bwVar.e();
            rg2 rg2Var = p2aVar.a;
            rg2Var.F0 = null;
            if (x79Var != null) {
                rg2Var.J0.y = x79Var;
                rg2Var.L0 = 2;
            }
            zv7Var.f = null;
            rg2 rg2Var2 = zv7Var.c;
            if (rg2Var2 != null) {
                rg2Var2.p();
            }
            zv7Var.c = null;
        }
    }

    public final void a(zv7 zv7Var, boolean z) {
        p2a p2aVar = zv7Var.f;
        if (p2aVar != null) {
            ird irdVarJ = iqf.j();
            a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
            ird irdVarL = iqf.l(irdVarJ);
            try {
                LayoutNode layoutNode = this.a;
                layoutNode.G0 = true;
                if (z) {
                    while (!p2aVar.c()) {
                        try {
                            p2aVar.e(new ho7(3));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                p2aVar.a();
                zv7Var.f = null;
                layoutNode.G0 = false;
                iqf.p(irdVarJ, irdVarL, a26VarE);
            } catch (Throwable th2) {
                iqf.p(irdVarJ, irdVarL, a26VarE);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // defpackage.ue2
    public final void b() {
        rg2 rg2Var;
        LayoutNode layoutNode = this.a;
        layoutNode.G0 = true;
        w79 w79Var = this.f;
        Object[] objArr = w79Var.c;
        long[] jArr = w79Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (rg2Var = ((zv7) objArr[(i << 3) + i3]).c) != null) {
                            rg2Var.p();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        layoutNode.o0();
        layoutNode.G0 = false;
        w79Var.a();
        this.g.a();
        this.Z = 0;
        this.Y = 0;
        this.x.a();
        h();
    }

    @Override // defpackage.ue2
    public final void d() {
        i(true);
    }

    public final p6e e(Object obj) {
        return !this.a.W() ? new ew7() : new fw7(this, obj);
    }

    public final void f(int i) {
        boolean z;
        boolean z2 = false;
        this.Y = 0;
        List listQ = this.a.q();
        g79 g79Var = (g79) listQ;
        int i2 = (((p89) g79Var.b).c - this.Z) - 1;
        if (i <= i2) {
            this.y.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.f.g((LayoutNode) g79Var.get(i3));
                    objG.getClass();
                    this.y.a.b(((zv7) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.c.k(this.y);
            ird irdVarJ = iqf.j();
            a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
            ird irdVarL = iqf.l(irdVarJ);
            z = false;
            while (i2 >= i) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((g79) listQ).get(i2);
                    Object objG2 = this.f.g(layoutNode);
                    objG2.getClass();
                    zv7 zv7Var = (zv7) objG2;
                    Object obj = zv7Var.a;
                    if (this.y.a.a(obj)) {
                        this.Y++;
                        if (((Boolean) zv7Var.g.getValue()).booleanValue()) {
                            wn8 wn8VarZ = layoutNode.z();
                            sv7 sv7Var = sv7.c;
                            wn8VarZ.z = sv7Var;
                            rg8 rg8VarY = layoutNode.y();
                            if (rg8VarY != null) {
                                rg8VarY.x = sv7Var;
                            }
                            l(zv7Var, false);
                            if (zv7Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        LayoutNode layoutNode2 = this.a;
                        layoutNode2.G0 = true;
                        this.f.k(layoutNode);
                        rg2 rg2Var = zv7Var.c;
                        if (rg2Var != null) {
                            rg2Var.p();
                        }
                        this.a.p0(i2, 1);
                        layoutNode2.G0 = false;
                    }
                    this.g.k(obj);
                    i2--;
                } catch (Throwable th) {
                    iqf.p(irdVarJ, irdVarL, a26VarE);
                    throw th;
                }
            }
            iqf.p(irdVarJ, irdVarL, a26VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (qrd.c) {
                x79 x79Var = qrd.j.h;
                if (x79Var != null && x79Var.d()) {
                    z2 = true;
                }
            }
            if (z2) {
                qrd.c();
            }
        }
        h();
    }

    public final void g(Object obj) {
        h();
        LayoutNode layoutNode = (LayoutNode) this.x.k(obj);
        LayoutNode layoutNode2 = this.a;
        if (layoutNode != null) {
            if (this.Z <= 0) {
                i37.c("No pre-composed items to dispose");
            }
            int i = ((p89) ((g79) layoutNode2.q()).b).i(layoutNode);
            if (i < ((p89) ((g79) layoutNode2.q()).b).c - this.Z) {
                i37.c("Item is not in pre-composed item range");
            }
            this.Y++;
            this.Z--;
            zv7 zv7Var = (zv7) this.f.g(layoutNode);
            if (zv7Var != null) {
                c(zv7Var);
            }
            int i2 = (((p89) ((g79) layoutNode2.q()).b).c - this.Z) - this.Y;
            j(i, i2);
            f(i2);
        }
        if (this.X.h(obj)) {
            LayoutNode.u0(layoutNode2, true, 6);
        }
    }

    public final void h() {
        int i = ((p89) ((g79) this.a.q()).b).c;
        int i2 = this.f.e;
        if (i2 != i) {
            i37.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.Y;
        int i4 = this.Z;
        if ((i - i3) - i4 < 0) {
            StringBuilder sbN = ib8.n(i, i3, "Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ");
            sbN.append(i4);
            i37.a(sbN.toString());
        }
        int i5 = this.x.e;
        int i6 = this.Z;
        if (i5 == i6) {
            return;
        }
        i37.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void i(boolean z) {
        this.Z = 0;
        this.x.a();
        List listQ = this.a.q();
        int i = ((p89) ((g79) listQ).b).c;
        if (this.Y != i) {
            this.Y = i;
            ird irdVarJ = iqf.j();
            a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
            ird irdVarL = iqf.l(irdVarJ);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((g79) listQ).get(i2);
                    zv7 zv7Var = (zv7) this.f.g(layoutNode);
                    if (zv7Var != null && ((Boolean) zv7Var.g.getValue()).booleanValue()) {
                        wn8 wn8VarZ = layoutNode.z();
                        sv7 sv7Var = sv7.c;
                        wn8VarZ.z = sv7Var;
                        rg8 rg8VarY = layoutNode.y();
                        if (rg8VarY != null) {
                            rg8VarY.x = sv7Var;
                        }
                        l(zv7Var, z);
                        zv7Var.a = m6e.a;
                    }
                } catch (Throwable th) {
                    iqf.p(irdVarJ, irdVarL, a26VarE);
                    throw th;
                }
            }
            iqf.p(irdVarJ, irdVarL, a26VarE);
            this.g.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        LayoutNode layoutNode = this.a;
        layoutNode.G0 = true;
        layoutNode.h0(i, i2, 1);
        layoutNode.G0 = false;
    }

    public final void k(Object obj, l26 l26Var, boolean z) {
        LayoutNode layoutNode = this.a;
        if (layoutNode.W()) {
            h();
            if (this.g.c(obj)) {
                return;
            }
            this.z.k(obj);
            w79 w79Var = this.x;
            Object objG = w79Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((p89) ((g79) layoutNode.q()).b).i(objG), ((p89) ((g79) layoutNode.q()).b).c);
                    this.Z++;
                } else {
                    int i = ((p89) ((g79) layoutNode.q()).b).c;
                    LayoutNode layoutNode2 = new LayoutNode(2);
                    layoutNode.G0 = true;
                    layoutNode.N(i, layoutNode2);
                    layoutNode.G0 = false;
                    this.Z++;
                    objG = layoutNode2;
                }
                w79Var.m(obj, objG);
            }
            m((LayoutNode) objG, obj, z, l26Var);
        }
    }

    public final void l(zv7 zv7Var, boolean z) {
        rg2 rg2Var;
        if (z || !zv7Var.h) {
            zv7Var.g = q1c.f(Boolean.FALSE);
        } else {
            zv7Var.g.setValue(Boolean.FALSE);
        }
        if (zv7Var.f != null) {
            c(zv7Var);
            return;
        }
        if (z) {
            rg2 rg2Var2 = zv7Var.c;
            if (rg2Var2 != null) {
                rg2Var2.n();
                return;
            }
            return;
        }
        qs9 outOfFrameExecutor = wv7.a(this.a).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            ((AndroidComposeView) outOfFrameExecutor).E(new zv6(8, zv7Var));
        } else {
            if (zv7Var.h || (rg2Var = zv7Var.c) == null) {
                return;
            }
            rg2Var.n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bd, B:64:0x00d2, B:66:0x00d6, B:78:0x011a, B:67:0x00e3, B:68:0x00ee, B:70:0x00f2, B:72:0x0107, B:76:0x0111, B:75:0x010c, B:77:0x0117, B:62:0x00c0, B:56:0x0092, B:58:0x00a0, B:81:0x0124, B:82:0x012e), top: B:85:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bd, B:64:0x00d2, B:66:0x00d6, B:78:0x011a, B:67:0x00e3, B:68:0x00ee, B:70:0x00f2, B:72:0x0107, B:76:0x0111, B:75:0x010c, B:77:0x0117, B:62:0x00c0, B:56:0x0092, B:58:0x00a0, B:81:0x0124, B:82:0x012e), top: B:85:0x0076 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(LayoutNode layoutNode, Object obj, boolean z, l26 l26Var) {
        boolean z2;
        rg2 rg2Var;
        w79 w79Var = this.f;
        Object objG = w79Var.g(layoutNode);
        Object obj2 = objG;
        if (objG == null) {
            dd2 dd2Var = qn4.f;
            zv7 zv7Var = new zv7();
            zv7Var.a = obj;
            zv7Var.b = dd2Var;
            zv7Var.c = null;
            zv7Var.g = q1c.f(Boolean.TRUE);
            w79Var.m(layoutNode, zv7Var);
            obj2 = zv7Var;
        }
        zv7 zv7Var2 = (zv7) obj2;
        boolean z3 = zv7Var2.b != l26Var;
        if (zv7Var2.f != null) {
            if (z3) {
                c(zv7Var2);
            } else if (z) {
                return;
            } else {
                a(zv7Var2, true);
            }
        }
        rg2 rg2Var2 = zv7Var2.c;
        if (rg2Var2 != null) {
            synchronized (rg2Var2.d) {
                z2 = rg2Var2.Y.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || zv7Var2.d) {
            zv7Var2.b = l26Var;
            if (zv7Var2.f != null) {
                i37.a("new subcompose call while paused composition is still active");
            }
            ird irdVarJ = iqf.j();
            a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
            ird irdVarL = iqf.l(irdVarJ);
            try {
                LayoutNode layoutNode2 = this.a;
                layoutNode2.G0 = true;
                rg2 rg2Var3 = zv7Var2.c;
                lg2 lg2Var = this.b;
                if (lg2Var == null) {
                    i37.d("parent composition reference not set");
                    throw new nt7();
                }
                if (rg2Var3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = qcg.a;
                        rg2Var = new rg2(lg2Var, new taf(layoutNode));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = qcg.a;
                        rg2Var = new rg2(lg2Var, new taf(layoutNode));
                    }
                    rg2Var3 = rg2Var;
                } else {
                    if (rg2Var3.L0 == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams3 = qcg.a;
                            rg2Var = new rg2(lg2Var, new taf(layoutNode));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = qcg.a;
                            rg2Var = new rg2(lg2Var, new taf(layoutNode));
                        }
                        rg2Var3 = rg2Var;
                    }
                }
                zv7Var2.c = rg2Var3;
                l26 dd2Var2 = zv7Var2.b;
                if (wv7.a(this.a).getOutOfFrameExecutor() != null) {
                    zv7Var2.h = false;
                } else {
                    zv7Var2.h = true;
                    dd2Var2 = new dd2(new rk6(5, zv7Var2, dd2Var2), true, 1524156494);
                }
                if (z) {
                    if (zv7Var2.e) {
                        rg2Var3.k();
                        rg2Var3.t();
                        zv7Var2.f = rg2Var3.m(true, dd2Var2);
                    } else {
                        zv7Var2.f = rg2Var3.m(rg2Var3.k(), dd2Var2);
                    }
                } else if (zv7Var2.e) {
                    rg2Var3.k();
                    rg2Var3.t();
                    l46 l46Var = rg2Var3.K0;
                    l46Var.z = 0;
                    l46Var.y = true;
                    rg2Var3.a.a(rg2Var3, dd2Var2);
                    if (l46Var.F || l46Var.z != 0) {
                        epa.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    l46Var.z = -1;
                    l46Var.y = false;
                } else {
                    rg2Var3.B(dd2Var2);
                }
                zv7Var2.e = false;
                layoutNode2.G0 = false;
                iqf.p(irdVarJ, irdVarL, a26VarE);
                zv7Var2.d = false;
            } catch (Throwable th) {
                iqf.p(irdVarJ, irdVarL, a26VarE);
                throw th;
            }
        }
    }

    public final LayoutNode n(Object obj) {
        w79 w79Var;
        int i;
        if (this.Y == 0) {
            return null;
        }
        g79 g79Var = (g79) this.a.q();
        int i2 = ((p89) g79Var.b).c - this.Z;
        int i3 = i2 - this.Y;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            w79Var = this.f;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = w79Var.g((LayoutNode) g79Var.get(i5));
            objG.getClass();
            if (pa7.t(((zv7) objG).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objG2 = w79Var.g((LayoutNode) g79Var.get(i4));
                objG2.getClass();
                zv7 zv7Var = (zv7) objG2;
                Object obj2 = zv7Var.a;
                if (obj2 == m6e.a || this.c.N(obj, obj2)) {
                    zv7Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.Y--;
        LayoutNode layoutNode = (LayoutNode) g79Var.get(i3);
        Object objG3 = w79Var.g(layoutNode);
        objG3.getClass();
        zv7 zv7Var2 = (zv7) objG3;
        zv7Var2.g = q1c.f(Boolean.TRUE);
        zv7Var2.e = true;
        zv7Var2.d = true;
        return layoutNode;
    }
}

package defpackage;

import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;
import androidx.sqlite.driver.SupportSQLiteDriver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ld5 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public ld5(sd3 sd3Var, gt4 gt4Var, v5c v5cVar) {
        int i;
        Object ek2Var;
        this.a = 2;
        t5c t5cVar = sd3Var.g;
        g9e g9eVar = sd3Var.c;
        s8c s8cVar = sd3Var.p;
        String str = sd3Var.b;
        this.d = sd3Var;
        this.e = gt4Var;
        Object obj = sd3Var.e;
        this.f = obj == null ? pu4.a : obj;
        h9e h9eVarA = null;
        if (s8cVar != null) {
            this.h = null;
            if (s8cVar.y()) {
                ek2Var = new d1a(new a90(this, s8cVar), str == null ? ":memory:" : str, v5cVar);
            } else if (str == null) {
                ek2Var = new ek2(new a90(this, s8cVar));
            } else {
                a90 a90Var = new a90(this, s8cVar);
                int iOrdinal = t5cVar.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        cva.v(t5cVar, "Can't get max number of reader for journal mode '");
                        throw null;
                    }
                    i = 4;
                }
                int iOrdinal2 = t5cVar.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    cva.v(t5cVar, "Can't get max number of writers for journal mode '");
                    throw null;
                }
                ek2Var = new ek2(a90Var, str, i);
            }
            this.g = ek2Var;
        } else {
            if (g9eVar == null) {
                qc0.j("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            h9eVarA = g9eVar.a(new xs6(sd3Var.a, str, new sug(this, gt4Var.a), false, false));
            this.h = h9eVarA;
            this.g = new d1a(new SupportSQLiteDriver(h9eVarA), str == null ? ":memory:" : str, v5cVar);
        }
        boolean z = t5cVar == t5c.b;
        if (h9eVarA != null) {
            h9eVarA.setWriteAheadLoggingEnabled(z);
        }
    }

    public static void b(q8c q8cVar) {
        x8c x8cVarW0 = q8cVar.W0("PRAGMA busy_timeout");
        try {
            x8cVarW0.R0();
            long j = x8cVarW0.getLong(0);
            cgg.t(x8cVarW0, null);
            if (j < 3000) {
                p8c.o(q8cVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(x8cVarW0, th);
                throw th2;
            }
        }
    }

    public static boolean e(LayoutNode layoutNode, kl2 kl2Var) {
        if (layoutNode.w == null) {
            return false;
        }
        boolean zA0 = kl2Var != null ? layoutNode.a0(kl2Var) : LayoutNode.b0(layoutNode);
        LayoutNode layoutNodeF = layoutNode.F();
        if (zA0 && layoutNodeF != null) {
            if (layoutNodeF.w == null) {
                LayoutNode.u0(layoutNodeF, false, 3);
                return zA0;
            }
            if (layoutNode.C() == sv7.a) {
                LayoutNode.s0(layoutNodeF, false, 3);
                return zA0;
            }
            if (layoutNode.C() == sv7.b) {
                layoutNodeF.r0(false);
            }
        }
        return zA0;
    }

    public static boolean f(LayoutNode layoutNode, kl2 kl2Var) {
        boolean zM0 = kl2Var != null ? layoutNode.m0(kl2Var) : LayoutNode.n0(layoutNode);
        LayoutNode layoutNodeF = layoutNode.F();
        if (zM0 && layoutNodeF != null) {
            if (layoutNode.B() == sv7.a) {
                LayoutNode.u0(layoutNodeF, false, 3);
                return zM0;
            }
            if (layoutNode.B() == sv7.b) {
                layoutNodeF.t0(false);
            }
        }
        return zM0;
    }

    public static boolean k(LayoutNode layoutNode) {
        rg8 rg8Var;
        uv7 uv7Var;
        if (layoutNode.x()) {
            return (layoutNode.C() == sv7.c && ((rg8Var = layoutNode.getLayoutDelegate().q) == null || (uv7Var = rg8Var.H0) == null || !uv7Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean l(LayoutNode layoutNode) {
        if (!layoutNode.A()) {
            return false;
        }
        do {
            if (layoutNode.B() == sv7.c && !layoutNode.getLayoutDelegate().p.N0.e()) {
                LayoutNode layoutNodeF = layoutNode.F();
                if ((layoutNodeF != null ? layoutNodeF.u() : null) != qv7.a) {
                    return false;
                }
            }
            layoutNode = layoutNode.F();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.X());
        return true;
    }

    public static boolean m(LayoutNode layoutNode) {
        return layoutNode.X() || layoutNode.Y() || l(layoutNode) || pa7.t(layoutNode.Z(), Boolean.TRUE) || k(layoutNode) || layoutNode.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [i09] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [i09] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void a() {
        p89 p89Var = (p89) this.g;
        Object[] objArr = p89Var.a;
        int i = p89Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            wo0 wo0Var = ((LayoutNode) objArr[i2]).V0;
            c47 c47Var = (c47) wo0Var.d;
            boolean zG = zf9.g(4194304);
            i09 i09Var = c47Var.t1;
            if (zG || (i09Var = i09Var.e) != null) {
                d59 d59Var = yf9.m1;
                for (i09 i09VarK1 = c47Var.k1(zG); i09VarK1 != null && (i09VarK1.d & 4194304) != 0; i09VarK1 = i09VarK1.f) {
                    if ((i09VarK1.c & 4194304) != 0) {
                        ?? M0 = i09VarK1;
                        ?? p89Var2 = 0;
                        while (M0 != 0) {
                            if (M0 instanceof zu7) {
                                ((zu7) M0).p((c47) wo0Var.d);
                            } else if ((M0.c & 4194304) != 0 && (M0 instanceof sv3)) {
                                i09 i09Var2 = ((sv3) M0).E0;
                                int i3 = 0;
                                M0 = M0;
                                p89Var2 = p89Var2;
                                while (i09Var2 != null) {
                                    if ((i09Var2.c & 4194304) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            p89Var2 = p89Var2;
                                            M0 = i09Var2;
                                        } else {
                                            if (p89Var2 == 0) {
                                                p89Var2 = new p89(0, new i09[16]);
                                            }
                                            if (M0 != 0) {
                                                p89Var2.b(M0);
                                                M0 = 0;
                                            }
                                            p89Var2.b(i09Var2);
                                        }
                                    }
                                    i09Var2 = i09Var2.f;
                                    M0 = M0;
                                    p89Var2 = p89Var2;
                                }
                                if (i3 == 1) {
                                }
                            }
                            M0 = vd0.m0(p89Var2);
                        }
                    }
                    if (i09VarK1 == i09Var) {
                        break;
                    }
                }
            }
        }
        p89Var.g();
    }

    public void c(q8c q8cVar) throws Throwable {
        Object dzbVar;
        gt4 gt4Var = (gt4) this.e;
        b(q8cVar);
        sd3 sd3Var = (sd3) this.d;
        t5c t5cVar = sd3Var.g;
        t5c t5cVar2 = t5c.b;
        if (t5cVar == t5cVar2) {
            p8c.o(q8cVar, "PRAGMA journal_mode = WAL");
        } else {
            p8c.o(q8cVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (sd3Var.g == t5cVar2) {
            p8c.o(q8cVar, "PRAGMA synchronous = NORMAL");
        } else {
            p8c.o(q8cVar, "PRAGMA synchronous = FULL");
        }
        x8c x8cVarW0 = q8cVar.W0("PRAGMA user_version");
        try {
            x8cVarW0.R0();
            int i = (int) x8cVarW0.getLong(0);
            cgg.t(x8cVarW0, null);
            int i2 = gt4Var.a;
            int i3 = gt4Var.a;
            if (i != i2) {
                p8c.o(q8cVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        q(q8cVar);
                    } else {
                        r(q8cVar, i, i3);
                    }
                    p8c.o(q8cVar, "PRAGMA user_version = " + i3);
                    dzbVar = wef.a;
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                if (!(dzbVar instanceof dzb)) {
                    p8c.o(q8cVar, "END TRANSACTION");
                }
                Throwable thA = ezb.a(dzbVar);
                if (thA != null) {
                    p8c.o(q8cVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            s(q8cVar);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                cgg.t(x8cVarW0, th2);
                throw th3;
            }
        }
    }

    public void d(boolean z) {
        fz3 fz3Var = (fz3) this.f;
        p89 p89Var = (p89) fz3Var.b;
        if (z) {
            LayoutNode layoutNode = (LayoutNode) this.d;
            if (layoutNode.e1 > 0) {
                p89Var.g();
                p89Var.b(layoutNode);
                layoutNode.d1 = true;
            }
        }
        if (p89Var.c != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                fz3Var.n();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void g() {
        p89 p89Var = (p89) this.h;
        int i = p89Var.c;
        if (i != 0) {
            Object[] objArr = p89Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                un8 un8Var = (un8) objArr[i2];
                if (un8Var.a.W()) {
                    boolean z = un8Var.b;
                    LayoutNode layoutNode = un8Var.a;
                    boolean z2 = un8Var.c;
                    if (z) {
                        LayoutNode.s0(layoutNode, z2, 2);
                    } else {
                        LayoutNode.u0(layoutNode, z2, 2);
                    }
                }
            }
            p89Var.g();
        }
    }

    public void h(LayoutNode layoutNode) {
        p89 p89VarL = layoutNode.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (pa7.t(layoutNode2.Z(), Boolean.TRUE) && !layoutNode2.f1) {
                if (((ta0) this.e).h(layoutNode2)) {
                    layoutNode2.c0();
                }
                h(layoutNode2);
            }
        }
    }

    public void i(LayoutNode layoutNode, boolean z) {
        if (!this.b) {
            i37.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? layoutNode.x() : layoutNode.A()) {
            i37.a("node not yet measured");
        }
        j(layoutNode, z);
    }

    public void j(LayoutNode layoutNode, boolean z) {
        rg8 rg8Var;
        uv7 uv7Var;
        p89 p89VarL = layoutNode.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            sv7 sv7Var = sv7.a;
            if ((!z && (layoutNode2.B() == sv7Var || layoutNode2.getLayoutDelegate().p.N0.e())) || (z && (layoutNode2.C() == sv7Var || ((rg8Var = layoutNode2.getLayoutDelegate().q) != null && (uv7Var = rg8Var.H0) != null && uv7Var.e())))) {
                if (b21.G(layoutNode2) && !z) {
                    if (layoutNode2.x() && ((ta0) this.e).h(layoutNode2)) {
                        u(layoutNode2, true);
                    } else {
                        i(layoutNode2, true);
                    }
                }
                if (z ? layoutNode2.x() : layoutNode2.A()) {
                    u(layoutNode2, z);
                }
                if (!(z ? layoutNode2.x() : layoutNode2.A())) {
                    j(layoutNode2, z);
                }
            }
        }
        if (z ? layoutNode.x() : layoutNode.A()) {
            u(layoutNode, z);
        }
    }

    public boolean n(x16 x16Var) {
        boolean z;
        boolean z2;
        LayoutNode layoutNode;
        boolean z3;
        boolean zU;
        ta0 ta0Var = (ta0) this.e;
        ssg ssgVar = (ssg) ta0Var.c;
        LayoutNode layoutNode2 = (LayoutNode) this.d;
        if (!layoutNode2.W()) {
            i37.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.X()) {
            i37.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            i37.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (((kl2) this.i) != null) {
            this.b = true;
            this.c = true;
            try {
                if (ta0Var.J()) {
                    z = false;
                    while (true) {
                        ssg ssgVar2 = (ssg) ta0Var.b;
                        ktd ktdVar = (ktd) ssgVar2.b;
                        ssg ssgVar3 = (ssg) ta0Var.d;
                        ktd ktdVar2 = (ktd) ssgVar3.b;
                        if (!((ktd) ssgVar.b).isEmpty()) {
                            layoutNode = (LayoutNode) ((ktd) ssgVar.b).first();
                            ssgVar.N(layoutNode);
                            z3 = layoutNode.w != null;
                            z2 = false;
                        } else if (!ktdVar2.isEmpty()) {
                            layoutNode = (LayoutNode) ktdVar2.first();
                            ssgVar3.N(layoutNode);
                            z3 = layoutNode.w != null;
                            z2 = true;
                        } else {
                            if (ktdVar.isEmpty()) {
                                break;
                            }
                            LayoutNode layoutNode3 = (LayoutNode) ktdVar.first();
                            ssgVar2.N(layoutNode3);
                            z2 = true;
                            layoutNode = layoutNode3;
                            z3 = false;
                        }
                        if (z2) {
                            zU = t(layoutNode, z3);
                        } else {
                            zU = u(layoutNode, z3);
                            if (layoutNode.v()) {
                                ta0Var.b(layoutNode, cb7.b);
                            }
                            if (layoutNode.t()) {
                                ta0Var.b(layoutNode, cb7.d);
                            }
                        }
                        if (layoutNode == layoutNode2 && zU) {
                            z = true;
                        }
                    }
                    if (x16Var != null) {
                        x16Var.invoke();
                    }
                } else {
                    z = false;
                }
                this.b = false;
                this.c = false;
                z4 = z;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.b = false;
                    this.c = false;
                    throw th2;
                }
            }
        }
        a();
        return z4;
    }

    public void o(LayoutNode layoutNode, long j) {
        LayoutNode layoutNode2 = (LayoutNode) this.d;
        if (layoutNode.f1) {
            return;
        }
        if (layoutNode == layoutNode2) {
            i37.a("measureAndLayout called on root");
        }
        if (!layoutNode2.W()) {
            i37.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.X()) {
            i37.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            i37.a("performMeasureAndLayout called during measure layout");
        }
        if (((kl2) this.i) != null) {
            this.b = true;
            this.c = false;
            try {
                ta0 ta0Var = (ta0) this.e;
                ((ssg) ta0Var.c).N(layoutNode);
                ((ssg) ta0Var.d).N(layoutNode);
                ((ssg) ta0Var.b).N(layoutNode);
                if (e(layoutNode, new kl2(j)) || layoutNode.v()) {
                    if (pa7.t(layoutNode.Z(), Boolean.TRUE)) {
                        layoutNode.c0();
                    }
                }
                h(layoutNode);
                f(layoutNode, new kl2(j));
                if (layoutNode.t() && layoutNode.X()) {
                    layoutNode.q0();
                    fz3 fz3Var = (fz3) this.f;
                    if (layoutNode.e1 > 0) {
                        ((p89) fz3Var.b).b(layoutNode);
                        layoutNode.d1 = true;
                    }
                }
                g();
                this.b = false;
                this.c = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.b = false;
                    this.c = false;
                    throw th2;
                }
            }
        }
        a();
    }

    public void p() {
        LayoutNode layoutNode = (LayoutNode) this.d;
        ta0 ta0Var = (ta0) this.e;
        if (ta0Var.J()) {
            if (!layoutNode.W()) {
                i37.a("performMeasureAndLayout called with unattached root");
            }
            if (!layoutNode.X()) {
                i37.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.b) {
                i37.a("performMeasureAndLayout called during measure layout");
            }
            if (((kl2) this.i) != null) {
                this.b = true;
                this.c = false;
                try {
                    if ((((ktd) ((ssg) ta0Var.b).b).isEmpty() || ((ktd) ((ssg) ta0Var.c).b).isEmpty()) ? false : true) {
                        if (layoutNode.w != null) {
                            w(layoutNode, true);
                        } else {
                            v(layoutNode);
                        }
                    }
                    w(layoutNode, false);
                    this.b = false;
                    this.c = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.b = false;
                        this.c = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public void q(q8c q8cVar) {
        gt4 gt4Var = (gt4) this.e;
        q8cVar.getClass();
        x8c x8cVarW0 = q8cVar.W0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (x8cVarW0.R0() && x8cVarW0.getLong(0) == 0) {
                z = true;
            }
            cgg.t(x8cVarW0, null);
            gt4Var.a(q8cVar);
            if (!z) {
                c6c c6cVarV = gt4Var.v(q8cVar);
                if (!c6cVarV.a) {
                    cva.k(c6cVarV.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            y(q8cVar);
            gt4Var.r(q8cVar);
            Iterator it = ((List) this.f).iterator();
            while (it.hasNext()) {
                ((s5c) it.next()).getClass();
                if (q8cVar instanceof e9e) {
                    ((e9e) q8cVar).a.getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(x8cVarW0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    public void r(q8c q8cVar, int i, int i2) {
        boolean z;
        gt4 gt4Var = (gt4) this.e;
        q8cVar.getClass();
        sd3 sd3Var = (sd3) this.d;
        List listZ = qk2.z(sd3Var.d, i, i2);
        if (listZ != null) {
            gt4Var.u(q8cVar);
            Iterator it = listZ.iterator();
            while (it.hasNext()) {
                ((nv8) it.next()).a(q8cVar);
            }
            c6c c6cVarV = gt4Var.v(q8cVar);
            if (!c6cVarV.a) {
                cva.k(c6cVarV.b, "Migration didn't properly handle: ");
                return;
            } else {
                gt4Var.t(q8cVar);
                y(q8cVar);
                return;
            }
        }
        sd3Var.getClass();
        if (i <= i2 || !sd3Var.k) {
            Set set = sd3Var.l;
            if (!sd3Var.j || (set != null && set.contains(Integer.valueOf(i)))) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (sd3Var.o) {
            x8c x8cVarW0 = q8cVar.W0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                c78 c78VarW = t72.w();
                while (x8cVarW0.R0()) {
                    String strT0 = x8cVarW0.t0(0);
                    if (!c5e.C(strT0, "sqlite_", false) && !strT0.equals("android_metadata")) {
                        c78VarW.add(new iy9(strT0, Boolean.valueOf(pa7.t(x8cVarW0.t0(1), "view"))));
                    }
                }
                c78 c78VarN = c78VarW.n();
                cgg.t(x8cVarW0, null);
                ListIterator listIterator = c78VarN.listIterator(0);
                while (true) {
                    ql6 ql6Var = (ql6) listIterator;
                    if (!ql6Var.hasNext()) {
                        break;
                    }
                    iy9 iy9Var = (iy9) ql6Var.next();
                    String str = (String) iy9Var.a();
                    if (((Boolean) iy9Var.b()).booleanValue()) {
                        p8c.o(q8cVar, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        p8c.o(q8cVar, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    cgg.t(x8cVarW0, th);
                    throw th2;
                }
            }
        } else {
            gt4Var.c(q8cVar);
        }
        Iterator it2 = ((List) this.f).iterator();
        while (it2.hasNext()) {
            ((s5c) it2.next()).getClass();
            if (q8cVar instanceof e9e) {
                ((e9e) q8cVar).a.getClass();
            }
        }
        gt4Var.a(q8cVar);
    }

    public void s(q8c q8cVar) throws Throwable {
        Object dzbVar;
        q8cVar.getClass();
        gt4 gt4Var = (gt4) this.e;
        x8c x8cVarW0 = q8cVar.W0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = x8cVarW0.R0() && x8cVarW0.getLong(0) != 0;
            cgg.t(x8cVarW0, null);
            if (z) {
                x8c x8cVarW1 = q8cVar.W0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strT0 = x8cVarW1.R0() ? x8cVarW1.t0(0) : null;
                    cgg.t(x8cVarW1, null);
                    if (!((String) gt4Var.b).equals(strT0) && !((String) gt4Var.c).equals(strT0)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) gt4Var.b) + ", found: " + strT0).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        cgg.t(x8cVarW1, th);
                        throw th2;
                    }
                }
            } else {
                p8c.o(q8cVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    c6c c6cVarV = gt4Var.v(q8cVar);
                    if (!c6cVarV.a) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + c6cVarV.b).toString());
                    }
                    gt4Var.t(q8cVar);
                    y(q8cVar);
                    dzbVar = wef.a;
                    if (!(dzbVar instanceof dzb)) {
                        p8c.o(q8cVar, "END TRANSACTION");
                    }
                    Throwable thA = ezb.a(dzbVar);
                    if (thA != null) {
                        p8c.o(q8cVar, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    dzbVar = new dzb(th3);
                }
            }
            gt4Var.s(q8cVar);
            for (s5c s5cVar : (List) this.f) {
                s5cVar.getClass();
                if (q8cVar instanceof e9e) {
                    s5cVar.a(((e9e) q8cVar).a);
                }
            }
            this.b = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cgg.t(x8cVarW0, th4);
                throw th5;
            }
        }
    }

    public boolean t(LayoutNode layoutNode, boolean z) {
        kl2 kl2Var;
        LayoutNode layoutNodeF;
        LayoutNode layoutNode2 = (LayoutNode) this.d;
        boolean zF = false;
        if (!layoutNode.f1 && m(layoutNode)) {
            if (layoutNode == layoutNode2) {
                kl2Var = (kl2) this.i;
                kl2Var.getClass();
            } else {
                kl2Var = null;
            }
            if (z) {
                zF = layoutNode.x() ? e(layoutNode, kl2Var) : false;
                if ((zF || layoutNode.v()) && pa7.t(layoutNode.Z(), Boolean.TRUE)) {
                    layoutNode.c0();
                }
            } else {
                zF = layoutNode.A() ? f(layoutNode, kl2Var) : false;
                if (layoutNode.t() && (layoutNode == layoutNode2 || ((layoutNodeF = layoutNode.F()) != null && layoutNodeF.X() && layoutNode.Y()))) {
                    if (layoutNode == layoutNode2) {
                        layoutNode.l0();
                    } else {
                        layoutNode.q0();
                    }
                    fz3 fz3Var = (fz3) this.f;
                    if (layoutNode.e1 > 0) {
                        ((p89) fz3Var.b).b(layoutNode);
                        layoutNode.d1 = true;
                    }
                }
            }
            g();
        }
        return zF;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return s72.D0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public boolean u(LayoutNode layoutNode, boolean z) {
        kl2 kl2Var;
        boolean zF = false;
        if (!layoutNode.f1 && m(layoutNode)) {
            if (layoutNode == ((LayoutNode) this.d)) {
                kl2Var = (kl2) this.i;
                kl2Var.getClass();
            } else {
                kl2Var = null;
            }
            if (z) {
                if (layoutNode.x()) {
                    zF = e(layoutNode, kl2Var);
                }
            } else if (layoutNode.A()) {
                zF = f(layoutNode, kl2Var);
            }
            g();
        }
        return zF;
    }

    public void v(LayoutNode layoutNode) {
        p89 p89VarL = layoutNode.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.B() == sv7.a || layoutNode2.getLayoutDelegate().p.N0.e()) {
                if (b21.G(layoutNode2)) {
                    w(layoutNode2, true);
                } else {
                    v(layoutNode2);
                }
            }
        }
    }

    public void w(LayoutNode layoutNode, boolean z) {
        kl2 kl2Var;
        if (layoutNode.f1) {
            return;
        }
        if (layoutNode == ((LayoutNode) this.d)) {
            kl2Var = (kl2) this.i;
            kl2Var.getClass();
        } else {
            kl2Var = null;
        }
        if (z) {
            e(layoutNode, kl2Var);
        } else {
            f(layoutNode, kl2Var);
        }
    }

    public boolean x(LayoutNode layoutNode, boolean z) {
        int iOrdinal = layoutNode.u().ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                ((p89) this.h).b(new un8(layoutNode, false, z));
            } else {
                if (iOrdinal != 4) {
                    ap.c();
                    return false;
                }
                if (!layoutNode.A() || z) {
                    layoutNode.g0();
                    if (!layoutNode.f1 && (layoutNode.X() || l(layoutNode))) {
                        LayoutNode layoutNodeF = layoutNode.F();
                        if (layoutNodeF == null || !layoutNodeF.A()) {
                            ((ta0) this.e).b(layoutNode, cb7.c);
                        }
                        if (!this.c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void y(q8c q8cVar) {
        p8c.o(q8cVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        p8c.o(q8cVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((gt4) this.e).b) + "')");
    }

    public void z(long j) {
        LayoutNode layoutNode = (LayoutNode) this.d;
        kl2 kl2Var = (kl2) this.i;
        if (kl2Var == null ? false : kl2.b(kl2Var.a, j)) {
            return;
        }
        if (this.b) {
            i37.a("updateRootConstraints called while measuring");
        }
        this.i = new kl2(j);
        if (layoutNode.W()) {
            if (layoutNode.w != null) {
                layoutNode.f0();
            }
            layoutNode.g0();
            ((ta0) this.e).b(layoutNode, layoutNode.w != null ? cb7.a : cb7.c);
        }
    }

    public ld5(sd3 sd3Var, a4c a4cVar, v5c v5cVar) {
        this.a = 2;
        this.d = sd3Var;
        this.e = new p5c(-1, "", "");
        List list = sd3Var.e;
        pu4 pu4Var = pu4.a;
        this.f = list == null ? pu4Var : list;
        s72.R0(list == null ? pu4Var : list, new q5c(new ckb(7, this)));
        Executor executor = sd3Var.h;
        Executor executor2 = sd3Var.i;
        executor.getClass();
        executor2.getClass();
        throw new wg9(0);
    }

    public ld5(LayoutNode layoutNode) {
        this.a = 1;
        this.d = layoutNode;
        this.e = new ta0(21);
        this.f = new fz3(26);
        this.g = new p89(0, new LayoutNode[16]);
        this.h = new p89(0, new un8[16]);
    }

    public ld5(boolean z, boolean z2, e1a e1aVar, Long l, Long l2, Long l3, Long l4, Map map) {
        this.a = 0;
        map.getClass();
        this.b = z;
        this.c = z2;
        this.d = e1aVar;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = bm8.X(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld5(boolean z, boolean z2, e1a e1aVar, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, e1aVar, l, l2, l3, l4, qu4.a);
        this.a = 0;
    }
}

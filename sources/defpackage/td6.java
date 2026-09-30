package defpackage;

import io.sentry.android.core.b1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class td6 implements Closeable {
    public Map E0;
    public Map F0;
    public final List G0;
    public vd6 H0;
    public final sh0 X;
    public ctb Y;
    public Map Z;
    public final bg1 a;
    public final Map b;
    public final Map c;
    public final List d;
    public final aw2 e;
    public final qn2 f;
    public final tva g;
    public final Object v;
    public volatile boolean w;
    public vd6 x;
    public ctb y;
    public final Map z;

    public td6(bg1 bg1Var, Map map, Map map2, ArrayList arrayList, List list, aw2 aw2Var, sv2 sv2Var) throws Throwable {
        aw2Var.getClass();
        this.a = bg1Var;
        this.b = map;
        this.c = map2;
        this.d = list;
        this.e = aw2Var;
        qn2 qn2VarK = jgb.k(i7h.I(sv2Var, new wv2("CXCP-GraphLoop")));
        this.f = qn2VarK;
        int i = 0;
        Class<td6> cls = td6.class;
        tva tvaVar = new tva(new uj3(1, this, cls, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", i, 20), new gl(2, this, cls, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, 18));
        if (!tvaVar.c.a()) {
            qc0.p("ProcessingQueue cannot be re-started!");
            throw null;
        }
        if (ynb.V(qn2VarK, null, null, new rva(tvaVar, null), 3).isCancelled()) {
            tvaVar.b(null);
        }
        this.g = tvaVar;
        this.v = new Object();
        qu4 qu4Var = qu4.a;
        this.z = qu4Var;
        this.X = vpf.m(true);
        this.Z = qu4Var;
        this.E0 = qu4Var;
        this.F0 = map2;
        this.G0 = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d6 -> B:37:0x00f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ee -> B:36:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ff -> B:39:0x0100). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object E(java.util.List r18, int r19, defpackage.kd6 r20, defpackage.xn2 r21) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td6.E(java.util.List, int, kd6, xn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7 A[PHI: r3 r9 r12
  0x00d7: PHI (r3v5 int) = (r3v3 int), (r3v8 int) binds: [B:32:0x009f, B:47:0x00d5] A[DONT_GENERATE, DONT_INLINE]
  0x00d7: PHI (r9v8 java.util.List) = (r9v7 java.util.List), (r9v9 java.util.List) binds: [B:32:0x009f, B:47:0x00d5] A[DONT_GENERATE, DONT_INLINE]
  0x00d7: PHI (r12v6 int) = (r12v5 int), (r12v7 int) binds: [B:32:0x009f, B:47:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009f -> B:48:0x00d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c3 -> B:47:0x00d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d2 -> B:47:0x00d5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object G(java.util.List r12, defpackage.xn2 r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td6.G(java.util.List, xn2):java.lang.Object");
    }

    public final void N(List list, int i, ld6 ld6Var) {
        ctb ctbVar = this.Y;
        if (ctbVar == null && i == 0) {
            list.remove(i);
            return;
        }
        if (this.X.b() && ctbVar != null) {
            if (h(ld6Var.a, false, t72.H(ctbVar))) {
                list.remove(i);
                return;
            }
        }
        if (i > 0) {
            int i2 = i - 1;
            if (((md6) list.get(i2)) instanceof jd6) {
                x(i2, list, false);
            } else {
                qc0.p("Check failed.");
            }
        }
    }

    public final boolean R() {
        Boolean boolValueOf;
        vd6 vd6Var = this.H0;
        if (vd6Var == null) {
            return false;
        }
        ctb ctbVar = this.Y;
        if (ctbVar != null) {
            boolValueOf = Boolean.valueOf(vd6Var.d(true, t72.H(ctbVar), this.b, this.Z, this.F0, this.G0));
        } else {
            boolValueOf = null;
        }
        return pa7.t(boolValueOf, Boolean.TRUE);
    }

    public final void U(boolean z) {
        this.X.a = z ? 1 : 0;
        if (z) {
            this.g.c(fd6.b);
        }
    }

    public final void W(vd6 vd6Var) {
        synchronized (this.v) {
            vd6 vd6Var2 = this.x;
            this.x = vd6Var;
            if (this.w) {
                this.x = null;
                if (vd6Var != null) {
                    ynb.V(this.e, null, null, new sd6(vd6Var, null), 3);
                }
                return;
            }
            if (vd6Var2 != vd6Var) {
                this.g.c(new kd6(vd6Var2, vd6Var));
            }
            if (vd6Var == null) {
                int size = this.d.size();
                for (int i = 0; i < size; i++) {
                    ((nd6) this.d.get(i)).a();
                }
            }
        }
    }

    public final void b(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ctb ctbVar = (ctb) list.get(i);
            List list2 = this.G0;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((atb) list2.get(i2)).k0(ctbVar);
            }
        }
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ctb ctbVar2 = (ctb) list.get(i3);
            int size4 = ctbVar2.d.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((atb) ctbVar2.d.get(i4)).k0(ctbVar2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.v) {
            try {
                if (this.w) {
                    return;
                }
                this.w = true;
                vd6 vd6Var = this.x;
                if (vd6Var != null) {
                    ynb.V(this.e, null, null, new od6(vd6Var, null), 3);
                }
                this.x = null;
                this.g.c(fd6.c);
                int size = this.d.size();
                for (int i = 0; i < size; i++) {
                    ((nd6) this.d.get(i)).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(Map map, boolean z, List list) throws Throwable {
        Map mapJ;
        vd6 vd6Var = this.H0;
        if (vd6Var == null) {
            return false;
        }
        Map map2 = this.Z;
        if (map.isEmpty()) {
            mapJ = this.F0;
        } else {
            fl8 fl8Var = new fl8();
            Map map3 = this.E0;
            map3.getClass();
            fl8Var.putAll(map3);
            fl8Var.putAll(map);
            fl8Var.putAll(this.c);
            mapJ = fl8Var.j();
        }
        boolean zD = vd6Var.d(z, list, this.b, map2, mapJ, this.G0);
        if (!zD) {
            if (z) {
                b1.l("CXCP", "Failed to repeat with " + s72.X0(list));
                return zD;
            }
            if (map.isEmpty()) {
                b1.l("CXCP", "Failed to submit capture with " + list);
                return zD;
            }
            b1.l("CXCP", "Failed to trigger with " + s72.X0(list) + " and " + map);
        }
        return zD;
    }

    public final ctb l() {
        ctb ctbVar;
        synchronized (this.v) {
            ctbVar = this.y;
        }
        return ctbVar;
    }

    public final String toString() {
        return "GraphLoop(" + this.a + ')';
    }

    public final void u(List list, int i, gd6 gd6Var, boolean z) {
        if (this.X.b()) {
            if (h(qu4.a, false, gd6Var.a)) {
                list.remove(i);
                return;
            }
        }
        if (!z || i <= 0) {
            return;
        }
        int i2 = i - 1;
        if (((md6) list.get(i2)) instanceof jd6) {
            x(i2, list, false);
        } else {
            qc0.p("Check failed.");
        }
    }

    public final void x(int i, List list, boolean z) {
        int i2;
        int i3 = i;
        while (true) {
            int i4 = 0;
            if (-1 >= i3) {
                if (!z || (i2 = i + 1) >= list.size()) {
                    return;
                }
                md6 md6Var = (md6) list.get(i2);
                if (md6Var instanceof gd6) {
                    u(list, i2, (gd6) md6Var, false);
                    return;
                } else {
                    if (md6Var instanceof ld6) {
                        N(list, i2, (ld6) md6Var);
                        return;
                    }
                    return;
                }
            }
            md6 md6Var2 = (md6) list.get(i3);
            if (md6Var2 instanceof jd6) {
                ctb ctbVar = ((jd6) md6Var2).a;
                if (h(qu4.a, true, t72.H(ctbVar))) {
                    this.Y = ctbVar;
                    list.remove(i3);
                    while (i4 < i3) {
                        if (((md6) list.get(i4)) instanceof jd6) {
                            list.remove(i4);
                            i3--;
                        } else {
                            i4++;
                        }
                    }
                    return;
                }
            }
            i3--;
        }
    }
}

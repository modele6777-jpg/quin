package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lpd implements ng2, Iterable, zm7 {
    public int b;
    public int d;
    public int e;
    public boolean g;
    public int v;
    public HashMap x;
    public q69 y;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public final Object f = new Object();
    public ArrayList w = new ArrayList();

    public static final void f(opd opdVar, int i) {
        while (opdVar.v >= 0 && opdVar.u <= i) {
            opdVar.N();
            opdVar.i();
        }
    }

    public final int c(f46 f46Var) {
        if (this.g) {
            wf2.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!f46Var.a()) {
            epa.a("Anchor refers to a group that was removed");
        }
        return f46Var.a;
    }

    public final void d() {
        this.x = new HashMap();
    }

    public final w79 e(ac0 ac0Var, qk9 qk9Var) {
        int i;
        Object[] objArr = qk9Var.a;
        int i2 = qk9Var.b;
        byte b = 0;
        byte b2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        for (int i7 = 0; i7 < i2; i7++) {
            if (!j(nk8.l(((g49) objArr[i7]).e))) {
                i79 i79Var = new i79();
                Object[] objArr2 = qk9Var.a;
                int i8 = qk9Var.b;
                for (int i9 = i3; i9 < i8; i9++) {
                    Object obj = objArr2[i9];
                    if (j(nk8.l(((g49) obj).e))) {
                        i79Var.h(obj);
                    }
                }
                qk9Var = i79Var;
                break;
            }
        }
        ckb ckbVar = new ckb(27, this);
        int i10 = 1;
        int i11 = 1;
        boolean z2 = true;
        if (qk9Var.b > 1) {
            Comparable comparable = (Comparable) ckbVar.d(qk9Var.b(i5));
            int i12 = qk9Var.b;
            int i13 = i11;
            while (i13 < i12) {
                Comparable comparable2 = (Comparable) ckbVar.d(qk9Var.b(i13));
                if (comparable.compareTo(comparable2) > 0) {
                    i79 i79Var2 = new i79(qk9Var.b);
                    Object[] objArr3 = qk9Var.a;
                    int i14 = qk9Var.b;
                    for (int i15 = i4; i15 < i14; i15++) {
                        i79Var2.h(objArr3[i15]);
                    }
                    g79 g79Var = i79Var2.c;
                    if (g79Var == null) {
                        g79Var = new g79(b2 == true ? 1 : 0, i79Var2);
                        i79Var2.c = g79Var;
                    }
                    if (((i79) g79Var.b).b > i10) {
                        w72.f0(g79Var, new y85(b == true ? 1 : 0, ckbVar));
                    }
                    qk9Var = i79Var2;
                    break;
                }
                i13++;
                comparable = comparable2;
            }
        }
        if (qk9Var.d()) {
            w79 w79Var = jec.b;
            w79Var.getClass();
            return w79Var;
        }
        long[] jArr = jec.a;
        w79 w79Var2 = new w79();
        opd opdVarI = i();
        try {
            Object[] objArr4 = qk9Var.a;
            int i16 = qk9Var.b;
            for (int i17 = i6; i17 < i16; i17++) {
                g49 g49Var = (g49) objArr4[i17];
                int iC = opdVarI.c(nk8.l(g49Var.e));
                int iF = opdVarI.F(opdVarI.b, iC);
                f(opdVarI, iF);
                f(opdVarI, iF);
                while (true) {
                    i = opdVarI.t;
                    if (i == iF || i == opdVarI.u) {
                        break;
                        break;
                    }
                    if (iF < opdVarI.t(i) + i) {
                        opdVarI.Q();
                    } else {
                        opdVarI.M();
                    }
                }
                if (i != iF) {
                    wf2.a("Unexpected slot table structure");
                }
                opdVarI.Q();
                opdVarI.a(iC - opdVarI.t);
                w79Var2.m(g49Var, wf2.c(g49Var.c, g49Var, opdVarI, ac0Var));
            }
            f(opdVarI, Integer.MAX_VALUE);
            return w79Var2;
        } finally {
            opdVarI.e(z);
        }
    }

    public final kpd g() {
        if (this.g) {
            qc0.p("Cannot read while a writer is pending");
            return null;
        }
        this.e++;
        return new kpd(this);
    }

    public final opd i() {
        if (this.g) {
            wf2.a("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            wf2.a("Cannot start a writer when a reader is pending");
        }
        this.g = true;
        this.v++;
        return new opd(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ff6(this, 0, this.b);
    }

    public final boolean j(f46 f46Var) {
        int iC;
        return f46Var.a() && (iC = npd.c(this.w, f46Var.a, this.b)) >= 0 && pa7.t(this.w.get(iC), f46Var);
    }

    public final n46 k(int i) {
        int i2;
        ArrayList arrayList;
        int iC;
        HashMap map = this.x;
        if (map != null) {
            if (this.g) {
                wf2.a("use active SlotWriter to crate an anchor for location instead");
            }
            f46 f46Var = (i < 0 || i >= (i2 = this.b) || (iC = npd.c((arrayList = this.w), i, i2)) < 0) ? null : (f46) arrayList.get(iC);
            if (f46Var != null) {
                return (n46) map.get(f46Var);
            }
        }
        return null;
    }
}

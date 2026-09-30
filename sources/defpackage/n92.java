package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n92 extends b1 {
    public x16 Z0;
    public boolean a1;
    public final y69 b1;
    public final y69 c1;
    public oia d1;
    public lyd e1;
    public lyd f1;
    public boolean g1;
    public boolean h1;
    public long i1;
    public boolean j1;
    public z17 k1;
    public lyd l1;
    public lyd m1;
    public boolean n1;
    public boolean o1;
    public long p1;
    public boolean q1;

    public n92(x16 x16Var, x16 x16Var2, t69 t69Var, boolean z) {
        super(t69Var, null, z, true, null, null, x16Var);
        this.Z0 = x16Var2;
        this.a1 = true;
        y69 y69Var = of8.a;
        this.b1 = new y69();
        this.c1 = new y69();
        this.i1 = -1L;
        this.p1 = -1L;
    }

    @Override // defpackage.h27
    public final void C(os osVar, iia iiaVar) {
        ArrayList arrayList = (ArrayList) osVar.c;
        w1();
        if (this.K0 && this.O0 == null) {
            u66 u66Var = new u66(this);
            l1(u66Var);
            this.O0 = u66Var;
        }
        int i = 0;
        if (iiaVar != iia.b) {
            if (iiaVar != iia.c || this.k1 == null || this.o1) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                z17 z17Var = (z17) arrayList.get(i);
                if (z17Var.i && z17Var != this.k1) {
                    C1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.k1 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (g21.z((z17) arrayList.get(i2))) {
                    z17 z17Var2 = (z17) arrayList.get(0);
                    z17Var2.i = true;
                    this.k1 = z17Var2;
                    if (this.K0) {
                        lyd lydVar = this.m1;
                        if (lydVar != null && lydVar.b()) {
                            ((rvf) eb3.H(this, zg2.t)).getClass();
                            if (z17Var2.b - this.p1 < 40) {
                                this.q1 = true;
                                return;
                            }
                            this.n1 = true;
                            lyd lydVar2 = this.m1;
                            if (lydVar2 != null) {
                                lydVar2.h(null);
                            }
                            this.m1 = null;
                        }
                        this.o1 = false;
                        u1(z17Var2);
                        if (this.Z0 != null) {
                            this.l1 = ynb.V(Z0(), null, null, new l92(this, null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.o1) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                z17 z17Var3 = (z17) arrayList.get(i3);
                if (!z17Var3.h || z17Var3.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((z17) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            z17 z17Var4 = (z17) arrayList.get(0);
            z17Var4.i = true;
            long j = z17Var4.b;
            z17 z17Var5 = this.k1;
            z17Var5.getClass();
            D1(j, z17Var5);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            z17 z17Var6 = (z17) arrayList.get(i4);
            if (z17Var6.i || !z17Var6.h || z17Var6.d) {
                float f = ((rvf) eb3.H(this, zg2.t)).f();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    z17 z17Var7 = (z17) arrayList.get(i5);
                    long j2 = z17Var7.c;
                    z17 z17Var8 = this.k1;
                    z17Var8.getClass();
                    boolean z = Math.abs(hl9.d(hl9.f(j2, z17Var8.c))) > f;
                    if (z17Var7.i || z) {
                        C1(true);
                        return;
                    }
                }
                return;
            }
        }
        z17 z17Var9 = (z17) arrayList.get(0);
        z17Var9.i = true;
        long j3 = z17Var9.b;
        z17 z17Var10 = this.k1;
        z17Var10.getClass();
        D1(j3, z17Var10);
    }

    public final void C1(boolean z) {
        if (z) {
            this.k1 = null;
            lyd lydVar = this.l1;
            if (lydVar != null) {
                lydVar.h(null);
            }
            this.l1 = null;
            lyd lydVar2 = this.m1;
            if (lydVar2 != null) {
                lydVar2.h(null);
            }
            this.m1 = null;
            this.n1 = false;
            this.o1 = false;
            this.p1 = -1L;
            this.q1 = false;
        } else {
            this.d1 = null;
            lyd lydVar3 = this.e1;
            if (lydVar3 != null) {
                lydVar3.h(null);
            }
            this.e1 = null;
            lyd lydVar4 = this.f1;
            if (lydVar4 != null) {
                lydVar4.h(null);
            }
            this.f1 = null;
            this.g1 = false;
            this.h1 = false;
            this.i1 = -1L;
            this.j1 = false;
        }
        s1(z);
    }

    public final void D1(long j, z17 z17Var) {
        if (this.K0 && !this.q1) {
            t1(z17Var.c, true);
            this.p1 = j;
            if (!this.o1 && !this.n1) {
                A1();
            }
        }
        this.k1 = null;
        this.q1 = false;
        this.n1 = false;
        lyd lydVar = this.l1;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.l1 = null;
        this.o1 = false;
    }

    @Override // defpackage.b1, defpackage.ria
    public final void E(hia hiaVar, iia iiaVar, long j) {
        super.E(hiaVar, iiaVar, j);
        if (iiaVar != iia.b) {
            if (iiaVar != iia.c || this.d1 == null || this.h1) {
                return;
            }
            List list = hiaVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                oia oiaVar = (oia) list.get(i);
                if (oiaVar.c() && oiaVar != this.d1) {
                    C1(false);
                    return;
                }
            }
            return;
        }
        if (this.d1 == null) {
            if (ffe.f(hiaVar, true, false)) {
                oia oiaVar2 = (oia) hiaVar.a.get(0);
                oiaVar2.a();
                this.d1 = oiaVar2;
                if (this.K0) {
                    lyd lydVar = this.f1;
                    if (lydVar != null && lydVar.b()) {
                        ((rvf) eb3.H(this, zg2.t)).getClass();
                        if (oiaVar2.b - this.i1 < 40) {
                            this.j1 = true;
                            return;
                        }
                        this.g1 = true;
                        lyd lydVar2 = this.f1;
                        if (lydVar2 != null) {
                            lydVar2.h(null);
                        }
                        this.f1 = null;
                    }
                    this.h1 = false;
                    v1(oiaVar2);
                    if (this.Z0 != null) {
                        this.e1 = ynb.V(Z0(), null, null, new k92(this, null), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = hiaVar.c == 2;
        List list2 = hiaVar.a;
        if (z && !this.h1 && this.K0 && this.Z0 != null) {
            lyd lydVar3 = this.e1;
            if (lydVar3 != null) {
                lydVar3.h(null);
            }
            this.e1 = null;
            x16 x16Var = this.Z0;
            if (x16Var != null) {
                x16Var.invoke();
            }
            if (this.a1) {
                ((afa) ((eh6) eb3.H(this, zg2.l))).a(0);
            }
            this.h1 = true;
        }
        if (this.h1) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!xo1.n((oia) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((oia) list2.get(i3)).a();
                    }
                    return;
                }
            }
            oia oiaVar3 = (oia) list2.get(0);
            oiaVar3.a();
            long j2 = oiaVar3.b;
            oia oiaVar4 = this.d1;
            oiaVar4.getClass();
            E1(j2, oiaVar4);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!xo1.m((oia) list2.get(i4))) {
                long jR1 = r1(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    oia oiaVar5 = (oia) list2.get(i5);
                    if (oiaVar5.c() || xo1.E(oiaVar5, j, jR1)) {
                        C1(false);
                        return;
                    }
                }
                return;
            }
        }
        oia oiaVar6 = (oia) list2.get(0);
        oiaVar6.a();
        long j3 = oiaVar6.b;
        oia oiaVar7 = this.d1;
        oiaVar7.getClass();
        E1(j3, oiaVar7);
    }

    public final void E1(long j, oia oiaVar) {
        if (this.K0 && !this.j1) {
            t1(oiaVar.c, false);
            this.i1 = j;
            if (!this.h1 && !this.g1) {
                A1();
            }
        }
        this.d1 = null;
        this.j1 = false;
        this.g1 = false;
        lyd lydVar = this.e1;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.e1 = null;
        this.h1 = false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:2: B:24:0x0071->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:36:0x00a2 BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009f], SYNTHETIC] */
    public final void F1() {
        char c;
        long j;
        long j2;
        y69 y69Var = this.b1;
        Object[] objArr = y69Var.c;
        long[] jArr = y69Var.a;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((dg7) objArr[(i << 3) + i3]).h(null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        y69Var.a();
        y69 y69Var2 = this.c1;
        Object[] objArr2 = y69Var2.c;
        long[] jArr2 = y69Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((j92) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        y69Var2.a();
    }

    @Override // defpackage.ria
    public final void N() {
        yq6 yq6Var;
        t69 t69Var = this.F0;
        if (t69Var != null && (yq6Var = this.S0) != null) {
            ((u69) t69Var).b(new zq6(yq6Var));
        }
        this.S0 = null;
        C1(false);
    }

    @Override // defpackage.i09
    public final void f1() {
        F1();
    }

    @Override // defpackage.b1
    public final void o1(hxc hxcVar) {
        if (this.Z0 != null) {
            p pVar = new p(25, this);
            wn7[] wn7VarArr = exc.a;
            hxcVar.c(swc.c, new f6(null, pVar));
        }
    }

    @Override // defpackage.h27
    public final void t0() {
        C1(true);
    }

    @Override // defpackage.b1
    public final void x1() {
        F1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // defpackage.b1
    public final boolean y1(KeyEvent keyEvent) {
        boolean z;
        long jQ = nk8.q(keyEvent);
        if (this.Z0 != null) {
            y69 y69Var = this.b1;
            if (y69Var.e(jQ) == null) {
                y69Var.i(jQ, ynb.V(Z0(), null, null, new m92(this, null), 3));
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // defpackage.b1
    public final void z1(KeyEvent keyEvent) {
        long jQ = nk8.q(keyEvent);
        y69 y69Var = this.b1;
        boolean z = false;
        if (y69Var.e(jQ) != null) {
            dg7 dg7Var = (dg7) y69Var.e(jQ);
            if (dg7Var != null) {
                if (dg7Var.b()) {
                    dg7Var.h(null);
                } else {
                    z = true;
                }
            }
            y69Var.g(jQ);
        }
        if (z) {
            return;
        }
        A1();
    }
}

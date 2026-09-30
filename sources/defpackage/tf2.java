package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tf2 {
    public final l46 a;
    public uv1 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final f77 d = new f77(1, false);
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public tf2(l46 l46Var, uv1 uv1Var) {
        this.a = l46Var;
        this.b = uv1Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            rr9 rr9Var = this.b.l;
            rr9Var.U(or9.d);
            rr9Var.n[rr9Var.o - rr9Var.l[rr9Var.m - 1].b] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        uv1 uv1Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        uv1Var.getClass();
        if (size != 0) {
            rr9 rr9Var2 = uv1Var.l;
            rr9Var2.U(oq9.d);
            vfh.L(rr9Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                rr9 rr9Var = this.b.l;
                rr9Var.U(er9.d);
                int i3 = rr9Var.o - rr9Var.l[rr9Var.m - 1].b;
                int[] iArr = rr9Var.n;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                rr9 rr9Var2 = this.b.l;
                rr9Var2.U(zq9.d);
                int i6 = rr9Var2.o - rr9Var2.l[rr9Var2.m - 1].b;
                int[] iArr2 = rr9Var2.n;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        kpd kpdVar = this.a.G;
        int i = z ? kpdVar.i : kpdVar.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            wf2.a("Tried to seek backward");
        }
        if (i2 > 0) {
            rr9 rr9Var = this.b.l;
            rr9Var.U(hq9.d);
            rr9Var.n[rr9Var.o - rr9Var.l[rr9Var.m - 1].b] = i2;
            this.f = i;
        }
    }

    public final void e() {
        kpd kpdVar = this.a.G;
        if (kpdVar.c > 0) {
            int i = kpdVar.i;
            f77 f77Var = this.d;
            if (f77Var.c(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.l.U(uq9.d);
                    this.c = true;
                }
                if (i > 0) {
                    f46 f46VarA = kpdVar.a(i);
                    f77Var.e(i);
                    d(false);
                    rr9 rr9Var = this.b.l;
                    rr9Var.U(tq9.d);
                    vfh.L(rr9Var, 0, f46VarA);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                wf2.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}

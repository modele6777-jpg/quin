package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s71 implements v03 {
    public final /* synthetic */ int a;
    public ArrayList b;

    public s71(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ArrayList(32);
                break;
            case 2:
            default:
                this.b = null;
                break;
            case 3:
                this.b = new ArrayList();
                break;
        }
    }

    @Override // defpackage.v03
    public long a(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((w03) arrayList.get(0)).b) {
            return ((w03) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((w03) arrayList.get(i)).b;
            if (j < j2) {
                long j3 = ((w03) arrayList.get(i - 1)).d;
                return (j3 == -9223372036854775807L || j3 <= j || j3 >= j2) ? j2 : j3;
            }
        }
        long j4 = ((w03) abg.B(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // defpackage.v03
    public boolean b(w03 w03Var, long j) {
        boolean z;
        ArrayList arrayList = this.b;
        long j2 = w03Var.b;
        pa7.A(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = w03Var.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((w03) arrayList.get(size)).b) {
                arrayList.add(size + 1, w03Var);
                return z;
            }
            if (((w03) arrayList.get(size)).b <= j) {
                z = false;
            }
        }
        arrayList.add(0, w03Var);
        return z;
    }

    @Override // defpackage.v03
    public jy6 c(long j) {
        int iK = k(j);
        if (iK == 0) {
            ey6 ey6Var = jy6.b;
            return yob.e;
        }
        w03 w03Var = (w03) this.b.get(iK - 1);
        long j2 = w03Var.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return w03Var.a;
        }
        ey6 ey6Var2 = jy6.b;
        return yob.e;
    }

    @Override // defpackage.v03
    public void clear() {
        this.b.clear();
    }

    @Override // defpackage.v03
    public long d(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || j < ((w03) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((w03) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                w03 w03Var = (w03) arrayList.get(i - 1);
                long j3 = w03Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? w03Var.b : j3;
            }
        }
        w03 w03Var2 = (w03) abg.B(arrayList);
        long j4 = w03Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? w03Var2.b : j4;
    }

    @Override // defpackage.v03
    public void e(long j) {
        ArrayList arrayList = this.b;
        int iK = k(j);
        if (iK == 0) {
            return;
        }
        long j2 = ((w03) arrayList.get(iK - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iK--;
        }
        arrayList.subList(0, iK).clear();
    }

    public void f(r71 r71Var) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int i = 0;
        while (true) {
            int size = this.b.size();
            ArrayList arrayList = this.b;
            if (i >= size) {
                arrayList.add(r71Var);
                return;
            } else {
                if (((r71) arrayList.get(i)).a.b > r71Var.a.b) {
                    this.b.add(i, r71Var);
                    return;
                }
                i++;
            }
        }
    }

    public void g(s71 s71Var) {
        if (s71Var.b == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList(s71Var.b.size());
        }
        Iterator it = s71Var.b.iterator();
        while (it.hasNext()) {
            f((r71) it.next());
        }
    }

    public void h() {
        this.b.add(l1a.c);
    }

    public void i(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b.add(new m1a(f, f2, f3, f4, f5, f6));
    }

    public void j(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b.add(new u1a(f, f2, f3, f4, f5, f6));
    }

    public int k(long j) {
        ArrayList arrayList = this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((w03) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    public void l(float f) {
        this.b.add(new n1a(f));
    }

    public void m(float f) {
        this.b.add(new v1a(f));
    }

    public void n(float f, float f2) {
        this.b.add(new o1a(f, f2));
    }

    public void o(float f, float f2) {
        this.b.add(new w1a(f, f2));
    }

    public void p(float f, float f2) {
        this.b.add(new p1a(f, f2));
    }

    public void q(float f, float f2, float f3, float f4) {
        this.b.add(new r1a(f, f2, f3, f4));
    }

    public void r(float f, float f2, float f3, float f4) {
        this.b.add(new z1a(f, f2, f3, f4));
    }

    public void s(float f) {
        this.b.add(new c2a(f));
    }

    public void t(float f) {
        this.b.add(new b2a(f));
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (this.b == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    sb.append(((r71) it.next()).toString());
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public s71(c78 c78Var) {
        this.a = 2;
        c78Var.getClass();
        this.b = new ArrayList(c78Var);
    }
}

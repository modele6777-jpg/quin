package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f69 extends ftb {
    public static final oq8 f;
    public static final oq8 g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final a71 b;
    public final List c;
    public final oq8 d;
    public long e;

    static {
        rob robVar = oq8.e;
        f = kj0.c0("multipart/mixed");
        kj0.c0("multipart/alternative");
        kj0.c0("multipart/digest");
        kj0.c0("multipart/parallel");
        g = kj0.c0("multipart/form-data");
        h = new byte[]{58, 32};
        i = new byte[]{13, 10};
        j = new byte[]{45, 45};
    }

    public f69(a71 a71Var, oq8 oq8Var, List list) {
        oq8Var.getClass();
        this.b = a71Var;
        this.c = list;
        rob robVar = oq8.e;
        this.d = kj0.c0(oq8Var + "; boundary=" + a71Var.t());
        this.e = -1L;
    }

    @Override // defpackage.ftb
    public final long a() {
        long j2 = this.e;
        if (j2 != -1) {
            return j2;
        }
        long jE = e(null, true);
        this.e = jE;
        return jE;
    }

    @Override // defpackage.ftb
    public final oq8 b() {
        return this.d;
    }

    @Override // defpackage.ftb
    public final boolean c() {
        List list = this.c;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((e69) it.next()).b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ftb
    public final void d(u41 u41Var) {
        e(u41Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(u41 u41Var, boolean z) {
        f41 f41Var;
        u41 f41Var2;
        if (z) {
            f41Var2 = new f41();
            f41Var = f41Var2;
        } else {
            f41Var = 0;
            f41Var2 = u41Var;
        }
        List list = this.c;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            a71 a71Var = this.b;
            byte[] bArr = j;
            byte[] bArr2 = i;
            if (i2 >= size) {
                f41Var2.getClass();
                f41Var2.write(bArr);
                f41Var2.X0(a71Var);
                f41Var2.write(bArr);
                f41Var2.write(bArr2);
                if (!z) {
                    return j2;
                }
                f41Var.getClass();
                long j3 = j2 + f41Var.b;
                f41Var.b();
                return j3;
            }
            e69 e69Var = (e69) list.get(i2);
            si6 si6Var = e69Var.a;
            ftb ftbVar = e69Var.b;
            f41Var2.getClass();
            f41Var2.write(bArr);
            f41Var2.X0(a71Var);
            f41Var2.write(bArr2);
            int size2 = si6Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                f41Var2.i0(xdc.i(si6Var, i3)).write(h).i0(xdc.k(si6Var, i3)).write(bArr2);
            }
            oq8 oq8VarB = ftbVar.b();
            if (oq8VarB != null) {
                f41Var2.i0("Content-Type: ").i0(oq8VarB.a).write(bArr2);
            }
            long jA = ftbVar.a();
            if (jA == -1 && z) {
                f41Var.getClass();
                f41Var.b();
                return -1L;
            }
            f41Var2.write(bArr2);
            if (z) {
                j2 += jA;
            } else {
                ftbVar.d(f41Var2);
            }
            f41Var2.write(bArr2);
            i2++;
        }
    }
}

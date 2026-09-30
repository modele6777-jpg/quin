package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class am9 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final d0a g = new d0a(255);

    public final boolean a(m95 m95Var, boolean z) throws l0a, EOFException {
        boolean zD;
        boolean zD2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        d0a d0aVar = this.g;
        d0aVar.J(27);
        try {
            zD = m95Var.d(d0aVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zD = false;
        }
        if (zD && d0aVar.B() == 1332176723) {
            if (d0aVar.z() == 0) {
                this.a = d0aVar.z();
                this.b = d0aVar.p();
                d0aVar.q();
                d0aVar.q();
                d0aVar.q();
                int iZ = d0aVar.z();
                this.c = iZ;
                this.d = iZ + 27;
                d0aVar.J(iZ);
                try {
                    zD2 = m95Var.d(d0aVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zD2 = false;
                }
                if (zD2) {
                    for (int i = 0; i < this.c; i++) {
                        int iZ2 = d0aVar.z();
                        this.f[i] = iZ2;
                        this.e += iZ2;
                    }
                    return true;
                }
            } else if (!z) {
                throw l0a.b("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(m95 m95Var, long j) {
        boolean zD;
        pa7.A(m95Var.getPosition() == m95Var.e());
        d0a d0aVar = this.g;
        d0aVar.J(4);
        while (true) {
            if (j != -1 && m95Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                zD = m95Var.d(d0aVar.a, 0, 4, true);
            } catch (EOFException unused) {
                zD = false;
            }
            if (!zD) {
                break;
            }
            d0aVar.M(0);
            if (d0aVar.B() == 1332176723) {
                m95Var.k();
                return true;
            }
            m95Var.l(1);
        }
        do {
            if (j != -1 && m95Var.getPosition() >= j) {
                break;
            }
        } while (m95Var.g(1) != -1);
        return false;
    }
}

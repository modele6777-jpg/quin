package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ai5 extends h3e {
    public bi5 n;
    public y21 o;

    @Override // defpackage.h3e
    public final long b(d0a d0aVar) {
        byte[] bArr = d0aVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            d0aVar.N(4);
            d0aVar.H();
        }
        int iF0 = db6.F0(i, d0aVar);
        d0aVar.M(0);
        return iF0;
    }

    @Override // defpackage.h3e
    public final boolean c(d0a d0aVar, long j, vea veaVar) {
        byte[] bArr = d0aVar.a;
        bi5 bi5Var = this.n;
        if (bi5Var == null) {
            bi5 bi5Var2 = new bi5(bArr, 17);
            this.n = bi5Var2;
            qr5 qr5VarA = bi5Var2.c(Arrays.copyOfRange(bArr, 9, d0aVar.c), null).a();
            qr5VarA.n = qv8.l("audio/ogg");
            veaVar.b = new rr5(qr5VarA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            y21 y21Var = this.o;
            if (y21Var != null) {
                y21Var.a = j;
                veaVar.c = y21Var;
            }
            ((rr5) veaVar.b).getClass();
            return false;
        }
        w84 w84VarW = dj6.W(d0aVar);
        bi5 bi5Var3 = new bi5(bi5Var.a, bi5Var.b, bi5Var.c, bi5Var.d, bi5Var.e, bi5Var.g, bi5Var.h, bi5Var.j, w84VarW, bi5Var.l);
        this.n = bi5Var3;
        y21 y21Var2 = new y21();
        y21Var2.c = bi5Var3;
        y21Var2.d = w84VarW;
        y21Var2.a = -1L;
        y21Var2.b = -1L;
        this.o = y21Var2;
        return true;
    }

    @Override // defpackage.h3e
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}

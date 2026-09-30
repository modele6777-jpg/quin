package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cs9 extends h3e {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(d0a d0aVar, byte[] bArr) {
        if (d0aVar.a() < bArr.length) {
            return false;
        }
        int i = d0aVar.b;
        byte[] bArr2 = new byte[bArr.length];
        d0aVar.k(bArr2, 0, bArr.length);
        d0aVar.M(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.h3e
    public final long b(d0a d0aVar) {
        byte[] bArr = d0aVar.a;
        return (((long) this.i) * vd0.Y(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.h3e
    public final boolean c(d0a d0aVar, long j, vea veaVar) {
        if (e(d0aVar, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(d0aVar.a, d0aVar.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListO = vd0.O(bArrCopyOf);
            if (((rr5) veaVar.b) == null) {
                qr5 qr5Var = new qr5();
                qr5Var.n = qv8.l("audio/ogg");
                qr5Var.o = qv8.l("audio/opus");
                qr5Var.I = i;
                qr5Var.K = 48000;
                qr5Var.r = arrayListO;
                veaVar.b = new rr5(qr5Var);
                return true;
            }
        } else {
            boolean zE = e(d0aVar, p);
            rr5 rr5Var = (rr5) veaVar.b;
            if (!zE) {
                rr5Var.getClass();
                return false;
            }
            rr5Var.getClass();
            if (!this.n) {
                this.n = true;
                d0aVar.N(8);
                su8 su8VarA = dzf.a(jy6.p((String[]) afc.l(d0aVar, false, false).a));
                if (su8VarA != null) {
                    qr5 qr5VarA = ((rr5) veaVar.b).a();
                    qr5VarA.l = su8VarA.b(((rr5) veaVar.b).m);
                    veaVar.b = new rr5(qr5VarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.h3e
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}

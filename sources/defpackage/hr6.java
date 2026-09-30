package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hr6 {
    public final f41 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public oi6[] e = new oi6[8];
    public int f = 7;

    public hr6(f41 f41Var) {
        this.a = f41Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                oi6 oi6Var = this.e[length];
                oi6Var.getClass();
                i -= oi6Var.c;
                int i4 = this.h;
                oi6 oi6Var2 = this.e[length];
                oi6Var2.getClass();
                this.h = i4 - oi6Var2.c;
                this.g--;
                i3++;
                length--;
            }
            oi6[] oi6VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(oi6VarArr, i5, oi6VarArr, i5 + i3, this.g);
            oi6[] oi6VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(oi6VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(oi6 oi6Var) {
        int i = oi6Var.c;
        int i2 = this.d;
        if (i > i2) {
            oi6[] oi6VarArr = this.e;
            qd0.h0(0, oi6VarArr.length, null, oi6VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        oi6[] oi6VarArr2 = this.e;
        if (i3 > oi6VarArr2.length) {
            oi6[] oi6VarArr3 = new oi6[oi6VarArr2.length * 2];
            System.arraycopy(oi6VarArr2, 0, oi6VarArr3, oi6VarArr2.length, oi6VarArr2.length);
            this.f = this.e.length - 1;
            this.e = oi6VarArr3;
            oi6VarArr2 = oi6VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        oi6VarArr2[i4] = oi6Var;
        this.g++;
        this.h += i;
    }

    public final void c(a71 a71Var) throws EOFException {
        a71Var.getClass();
        int[] iArr = et6.a;
        int iE = a71Var.e();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iE; i++) {
            byte bK = a71Var.k(i);
            byte[] bArr = ieg.a;
            j2 += (long) et6.b[bK & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iE2 = a71Var.e();
        f41 f41Var = this.a;
        if (i2 >= iE2) {
            e(a71Var.e(), 127, 0);
            f41Var.f1(a71Var);
            return;
        }
        f41 f41Var2 = new f41();
        int[] iArr2 = et6.a;
        int iE3 = a71Var.e();
        int i3 = 0;
        for (int i4 = 0; i4 < iE3; i4++) {
            byte bK2 = a71Var.k(i4);
            byte[] bArr2 = ieg.a;
            int i5 = bK2 & 255;
            int i6 = et6.a[i5];
            byte b = et6.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                f41Var2.i1((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            f41Var2.i1((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        a71 a71VarP0 = f41Var2.p0(f41Var2.b);
        e(a71VarP0.e(), 127, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        f41Var.f1(a71VarP0);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.c) {
            int i = this.b;
            if (i < this.d) {
                e(i, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            oi6 oi6Var = (oi6) arrayList.get(i2);
            a71 a71VarS = oi6Var.a.s();
            a71 a71Var = oi6Var.b;
            Integer num = (Integer) ir6.b.get(a71VarS);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    oi6[] oi6VarArr = ir6.a;
                    if (pa7.t(oi6VarArr[iIntValue].b, a71Var)) {
                        length = length2;
                    } else if (pa7.t(oi6VarArr[length2].b, a71Var)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.e.length;
                for (int i3 = this.f + 1; i3 < length3; i3++) {
                    oi6 oi6Var2 = this.e[i3];
                    oi6Var2.getClass();
                    if (pa7.t(oi6Var2.a, a71VarS)) {
                        oi6 oi6Var3 = this.e[i3];
                        oi6Var3.getClass();
                        if (pa7.t(oi6Var3.b, a71Var)) {
                            length2 = ir6.a.length + (i3 - this.f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f) + ir6.a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            } else if (length == -1) {
                this.a.i1(64);
                c(a71VarS);
                c(a71Var);
                b(oi6Var);
            } else {
                a71 a71Var2 = oi6.d;
                a71VarS.getClass();
                a71Var2.getClass();
                if (!a71VarS.n(0, a71Var2, a71Var2.e()) || pa7.t(oi6.i, a71VarS)) {
                    e(length, 63, 64);
                    c(a71Var);
                    b(oi6Var);
                } else {
                    e(length, 15, 0);
                    c(a71Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        f41 f41Var = this.a;
        if (i < i2) {
            f41Var.i1(i | i3);
            return;
        }
        f41Var.i1(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            f41Var.i1(128 | (i4 & 127));
            i4 >>>= 7;
        }
        f41Var.i1(i4);
    }
}

package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rr9 extends tq {
    public int m;
    public int o;
    public int q;
    public ni5[] l = new ni5[16];
    public int[] n = new int[16];
    public Object[] p = new Object[16];

    public final void R() {
        this.m = 0;
        this.o = 0;
        Arrays.fill(this.p, 0, this.q, (Object) null);
        this.q = 0;
    }

    public final void S(ac0 ac0Var, opd opdVar, bw bwVar, qr9 qr9Var) {
        if (this.m != 0) {
            k01 k01Var = new k01();
            k01Var.d = this;
            rr9 rr9Var = (rr9) k01Var.d;
            while (true) {
                ni5 ni5Var = rr9Var.l[k01Var.a];
                f46 f46VarF = ni5Var.f(k01Var);
                ac0 ac0Var2 = ac0Var;
                opd opdVar2 = opdVar;
                bw bwVar2 = bwVar;
                qr9 qr9Var2 = qr9Var;
                try {
                    ni5Var.d(k01Var, ac0Var2, opdVar2, bwVar2, qr9Var2);
                    int i = k01Var.a;
                    int i2 = rr9Var.m;
                    if (i < i2) {
                        ni5 ni5Var2 = rr9Var.l[i];
                        k01Var.b += ni5Var2.b;
                        k01Var.c += ni5Var2.c;
                        int i3 = i + 1;
                        k01Var.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        ac0Var = ac0Var2;
                        opdVar = opdVar2;
                        bwVar = bwVar2;
                        qr9Var = qr9Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (qr9Var2 == null) {
                        throw th;
                    }
                    xo1.S(th, new n25(f46VarF, opdVar2, qr9Var2, 16));
                    throw th;
                }
            }
        }
        R();
    }

    public final boolean T() {
        return this.m == 0;
    }

    public final void U(ni5 ni5Var) {
        int i = this.m;
        ni5[] ni5VarArr = this.l;
        int length = ni5VarArr.length;
        int i2 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i == length) {
            ni5[] ni5VarArr2 = new ni5[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(ni5VarArr, 0, ni5VarArr2, 0, i);
            this.l = ni5VarArr2;
        }
        int i3 = this.o;
        int i4 = ni5Var.b;
        int i5 = ni5Var.c;
        int i6 = i3 + i4;
        int[] iArr = this.n;
        int length2 = iArr.length;
        if (i6 > length2) {
            int i7 = (length2 > 1024 ? 1024 : length2) + length2;
            if (i7 >= i6) {
                i6 = i7;
            }
            int[] iArr2 = new int[i6];
            qd0.Y(0, 0, length2, iArr, iArr2);
            this.n = iArr2;
        }
        int i8 = this.q + i5;
        Object[] objArr = this.p;
        int length3 = objArr.length;
        if (i8 > length3) {
            if (length3 <= 1024) {
                i2 = length3;
            }
            int i9 = i2 + length3;
            if (i9 >= i8) {
                i8 = i9;
            }
            Object[] objArr2 = new Object[i8];
            System.arraycopy(objArr, 0, objArr2, 0, length3);
            this.p = objArr2;
        }
        ni5[] ni5VarArr3 = this.l;
        int i10 = this.m;
        this.m = i10 + 1;
        ni5VarArr3[i10] = ni5Var;
        this.o += ni5Var.b;
        this.q += i5;
    }
}

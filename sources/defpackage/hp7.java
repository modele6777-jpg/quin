package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hp7 implements br4 {
    public final gp7 a;

    public hp7(gp7 gp7Var) {
        this.a = gp7Var;
    }

    @Override // defpackage.ze5
    public final /* bridge */ /* synthetic */ ssf f() {
        return a(xo1.g);
    }

    @Override // defpackage.br4, defpackage.vz
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final gq9 a(y6f y6fVar) {
        int[] iArr;
        Object[] objArr;
        gp7 gp7Var = this.a;
        q69 q69Var = gp7Var.b;
        p69 p69Var = new p69(q69Var.e + 2);
        q69 q69Var2 = new q69(q69Var.e);
        int[] iArr2 = q69Var.b;
        Object[] objArr2 = q69Var.c;
        long[] jArr = q69Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            fp7 fp7Var = (fp7) objArr2[i5];
                            p69Var.c(i6);
                            q69Var2.i(i6, new usf((b00) y6fVar.a.d(fp7Var.a), fp7Var.b));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!q69Var.a(0)) {
            int i7 = p69Var.b;
            if (i7 < 0) {
                r3.i("Index must be between 0 and size");
                return null;
            }
            p69Var.d(i7 + 1);
            int[] iArr3 = p69Var.a;
            int i8 = p69Var.b;
            if (i8 != 0) {
                qd0.Y(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            p69Var.b++;
        }
        if (!q69Var.a(gp7Var.a)) {
            p69Var.c(gp7Var.a);
        }
        int i9 = p69Var.b;
        if (i9 != 0) {
            int[] iArr4 = p69Var.a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i9);
        }
        return new gq9(p69Var, q69Var2, gp7Var.a, hs4.c);
    }
}

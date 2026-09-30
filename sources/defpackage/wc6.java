package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wc6 {
    public final float[] a;
    public final int[] b;

    public wc6(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(wc6 wc6Var) {
        int i = 0;
        while (true) {
            int[] iArr = wc6Var.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = wc6Var.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final wc6 b(float[] fArr) {
        int iA;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iA = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iA = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iA = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iA = tm7.A((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iA;
        }
        return new wc6(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wc6.class != obj.getClass()) {
            return false;
        }
        wc6 wc6Var = (wc6) obj;
        return Arrays.equals(this.a, wc6Var.a) && Arrays.equals(this.b, wc6Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}

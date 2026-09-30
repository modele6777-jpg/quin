package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uc0 implements tc0, wc0 {
    public final float a;
    public final boolean b;
    public final vc0 c;
    public final float d;

    public uc0(float f, boolean z, vc0 vc0Var) {
        this.a = f;
        this.b = z;
        this.c = vc0Var;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0)) {
            return false;
        }
        uc0 uc0Var = (uc0) obj;
        return yi4.b(this.a, uc0Var.a) && this.b == uc0Var.b && pa7.t(this.c, uc0Var.c);
    }

    @Override // defpackage.tc0, defpackage.wc0
    public final float f() {
        return this.d;
    }

    public final int hashCode() {
        int iD = ub3.d(Float.hashCode(this.a) * 31, 31, this.b);
        vc0 vc0Var = this.c;
        return iD + (vc0Var == null ? 0 : vc0Var.hashCode());
    }

    @Override // defpackage.tc0
    public final void m(sw3 sw3Var, int i, int[] iArr, cv7 cv7Var, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iD0 = sw3Var.D0(this.a);
        boolean z = this.b && cv7Var == cv7.b;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iD0, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iD0, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        vc0 vc0Var = this.c;
        if (vc0Var == null || i2 <= 0) {
            return;
        }
        int iB = vc0Var.b(i2, cv7Var);
        if (z) {
            iB -= i2;
        }
        if (iB != 0) {
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iB;
            }
        }
    }

    public final String toString() {
        return (this.b ? "" : "Absolute") + "Arrangement#spacedAligned(" + yi4.c(this.a) + ", " + this.c + ")";
    }

    @Override // defpackage.wc0
    public final void w(sw3 sw3Var, int i, int[] iArr, int[] iArr2) {
        m(sw3Var, i, iArr, cv7.a, iArr2);
    }
}

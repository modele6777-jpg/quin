package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f58 extends ewf {
    public final q69 b;

    public f58() {
        q69 q69Var = v67.a;
        this.b = new q69();
    }

    @Override // defpackage.ewf
    public final void e() {
        q69 q69Var = this.b;
        int[] iArr = q69Var.b;
        Object[] objArr = q69Var.c;
        long[] jArr = q69Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        i79 i79Var = (i79) objArr[i4];
                        Object[] objArr2 = i79Var.a;
                        int i6 = i79Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            e58 e58Var = (e58) objArr2[i7];
                            rl1 rl1Var = e58Var.d;
                            if (rl1Var != null) {
                                rl1Var.cancel();
                            }
                            e58Var.d = null;
                            zk8 zk8Var = (zk8) e58Var.a.b;
                            zk8Var.b = true;
                            zk8Var.a = false;
                            zk8Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}

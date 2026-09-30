package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class haf extends cua {
    public long[] a;
    public int b;

    @Override // defpackage.cua
    public final Object a() {
        return new gaf(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.cua
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.cua
    public final int d() {
        return this.b;
    }
}

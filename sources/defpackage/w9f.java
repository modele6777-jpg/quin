package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w9f extends cua {
    public byte[] a;
    public int b;

    @Override // defpackage.cua
    public final Object a() {
        return new v9f(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.cua
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.cua
    public final int d() {
        return this.b;
    }
}

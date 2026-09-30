package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vt4 implements ut4 {
    public final int a;
    public int b = -1;
    public int c = -1;

    public vt4(int i) {
        this.a = i;
    }

    @Override // defpackage.ut4
    public final boolean i(CharSequence charSequence, int i, int i2, g9f g9fVar) {
        int i3 = this.a;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.b = i;
        this.c = i2;
        return false;
    }

    @Override // defpackage.ut4
    public final Object c() {
        return this;
    }
}

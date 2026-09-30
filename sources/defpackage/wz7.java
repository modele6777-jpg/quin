package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wz7 implements h0e {
    public final int a;
    public final int b;
    public final vz9 c;
    public int d;

    public wz7(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = new vz9(mh3.c0(Math.max(i4 - i3, 0), i4 + i2 + i3), i8c.f);
        this.d = i;
    }

    public final void c(int i) {
        if (i != this.d) {
            this.d = i;
            int i2 = this.a;
            int i3 = (i / i2) * i2;
            int i4 = this.b;
            this.c.setValue(mh3.c0(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.h0e
    public final Object getValue() {
        return (z67) this.c.getValue();
    }
}

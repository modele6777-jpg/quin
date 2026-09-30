package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qmb implements hu2 {
    public final int a;
    public final int b;
    public final int c;

    public qmb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.hu2
    public final int c() {
        return this.c;
    }

    @Override // defpackage.hu2
    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmb)) {
            return false;
        }
        qmb qmbVar = (qmb) obj;
        return this.a == qmbVar.a && this.b == qmbVar.b && this.c == qmbVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ub3.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return tec.g(this.c, ")", ib8.n(this.a, this.b, "ReferenceImage(reference=", ", width=", ", height="));
    }
}

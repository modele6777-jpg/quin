package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uuf {
    public static final uuf d = new uuf(0, 0);
    public final int a;
    public final int b;
    public final float c;

    static {
        pqf.D(0);
        pqf.D(1);
        pqf.D(3);
    }

    public uuf(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uuf) {
            uuf uufVar = (uuf) obj;
            if (this.a == uufVar.a && this.b == uufVar.b && this.c == uufVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public uuf(int i, int i2) {
        this(1.0f, i, i2);
    }
}

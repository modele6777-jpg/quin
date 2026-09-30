package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rh0 implements qsd {
    public final /* synthetic */ int a = 1;
    public int b;
    public long c;
    public int d;

    public rh0(int i, int i2, long j) {
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                sb.append(pqf.Q(this.b));
                sb.append(", size=");
                sb.append(this.c);
                sb.append(", minHeaderSize=");
                return tec.g(this.d, "}", sb);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ rh0() {
    }
}

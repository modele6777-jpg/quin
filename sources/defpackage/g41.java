package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g41 {
    public final /* synthetic */ int a = 0;
    public int b;

    public g41(int i) {
        this.b = i;
    }

    public static String b(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void a(int i) {
        this.b = i | this.b;
    }

    public boolean d(int i) {
        return (this.b & i) == i;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return b(this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g41() {
    }
}

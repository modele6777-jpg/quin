package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b77 {
    public int a = 0;

    public final String toString() {
        int i = this.a;
        int iHashCode = hashCode();
        tq.o(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "IntRef(element = " + i + ")@" + string;
    }
}

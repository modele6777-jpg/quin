package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mr5 implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public mr5(String str, int i, String str2, int i2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        mr5 mr5Var = (mr5) obj;
        mr5Var.getClass();
        int i = this.a - mr5Var.a;
        return i == 0 ? this.b - mr5Var.b : i;
    }
}

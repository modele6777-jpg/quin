package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bne extends sme {
    public final String b;
    public final int c;
    public final a26 d;

    public bne(Object obj, String str, int i, a26 a26Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = a26Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return tec.g(this.c, ")", sb);
    }
}

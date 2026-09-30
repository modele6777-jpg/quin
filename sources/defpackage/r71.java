package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r71 {
    public t71 a;
    public z9c b;
    public int c;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(String.valueOf(this.a));
        sb.append(" {...} (src=");
        int i = this.c;
        if (i != 1) {
            str = i != 2 ? "null" : "RenderOptions";
        } else {
            str = "Document";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}

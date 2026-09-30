package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ita {
    public static final ita c = new ita(hta.a, 0);
    public static final ita d = new ita(hta.f, 1);
    public final hta a;
    public final int b;

    public ita(hta htaVar, int i) {
        this.a = htaVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ita.class != obj.getClass()) {
            return false;
        }
        ita itaVar = (ita) obj;
        return this.a == itaVar.a && this.b == itaVar.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "slice";
        } else {
            str = "meet";
        }
        sb.append(str);
        return sb.toString();
    }
}

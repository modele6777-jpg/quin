package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class yp7 extends gq7 {
    public abstract Object a();

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof bq7) {
            string = "\"" + ((Object) ((bq7) this).a) + '\"';
        } else {
            string = a().toString();
        }
        return ub3.l(sb, string, ')');
    }
}

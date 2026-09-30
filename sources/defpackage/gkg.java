package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gkg {
    public final String a;

    public gkg(String str) {
        dlg dlgVar = dlg.b;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gkg)) {
            return false;
        }
        dlg dlgVar = dlg.b;
        return this.a.equals(((gkg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ dlg.b.hashCode();
    }
}

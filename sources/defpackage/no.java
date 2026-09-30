package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class no extends t4c {
    public final int a;

    public no(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof no) && ((no) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q8g implements p8g {
    public final String b;
    public final d47 c;
    public final d47 d;

    public q8g(String str) {
        this.b = str;
        this.c = new d47(str);
        this.d = new d47(str.concat(" maximum"));
    }

    public final String toString() {
        return this.b;
    }
}

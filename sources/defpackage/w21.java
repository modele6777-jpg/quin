package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w21 {
    public final /* synthetic */ int a;
    public long b;
    public long c;

    public w21() {
        this.a = 3;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b + "/" + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ w21(long j, long j2, int i, byte b) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public w21(long j, int i, long j2) {
        this.a = 1;
        this.b = j;
        this.c = j2;
    }
}

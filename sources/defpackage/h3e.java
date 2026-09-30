package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h3e {
    public k1f b;
    public n95 c;
    public bm9 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final zl9 a = new zl9();
    public vea j = new vea(11);

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(d0a d0aVar);

    public abstract boolean c(d0a d0aVar, long j, vea veaVar);

    public void d(boolean z) {
        if (z) {
            this.j = new vea(11);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}

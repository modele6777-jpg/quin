package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rq8 implements zk9 {
    public final b6c a;
    public final r98 b;
    public int c = -1;

    public rq8(b6c b6cVar, r98 r98Var) {
        this.a = b6cVar;
        this.b = r98Var;
    }

    @Override // defpackage.zk9
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }
}

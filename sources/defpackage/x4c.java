package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x4c extends g2 {
    public int c;
    public int d;
    public final /* synthetic */ y4c e;

    public x4c(y4c y4cVar) {
        this.e = y4cVar;
        this.c = y4cVar.d;
        this.d = y4cVar.c;
    }

    @Override // defpackage.g2
    public final void b() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        y4c y4cVar = this.e;
        Object[] objArr = y4cVar.a;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = 1;
        this.d = (i2 + 1) % y4cVar.b;
        this.c = i - 1;
    }
}

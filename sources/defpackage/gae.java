package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gae implements Runnable {
    public final /* synthetic */ iae a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ gae(iae iaeVar, int i, int i2) {
        this.a = iaeVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        iae iaeVar = this.a;
        int i = iaeVar.i;
        int i2 = this.b;
        boolean z2 = true;
        if (i != i2) {
            iaeVar.i = i2;
            z = true;
        } else {
            z = false;
        }
        int i3 = iaeVar.h;
        int i4 = this.c;
        if (i3 != i4) {
            iaeVar.h = i4;
        } else {
            z2 = z;
        }
        if (z2) {
            iaeVar.e();
        }
    }
}

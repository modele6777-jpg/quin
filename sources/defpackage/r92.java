package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r92 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ atb b;
    public final /* synthetic */ qtb c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ds e;

    public /* synthetic */ r92(atb atbVar, qtb qtbVar, long j, ds dsVar, int i) {
        this.a = i;
        this.b = atbVar;
        this.c = qtbVar;
        this.d = j;
        this.e = dsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ds dsVar = this.e;
        long j = this.d;
        qtb qtbVar = this.c;
        atb atbVar = this.b;
        switch (i) {
            case 0:
                atbVar.h0(qtbVar, j, dsVar);
                break;
            default:
                atbVar.R(qtbVar, j, dsVar);
                break;
        }
    }
}

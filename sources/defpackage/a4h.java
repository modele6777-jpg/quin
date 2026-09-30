package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a4h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ndh b;
    public final /* synthetic */ e5h c;

    public /* synthetic */ a4h(e5h e5hVar, ndh ndhVar, int i) {
        this.a = i;
        this.b = ndhVar;
        this.c = e5hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ndh ndhVar = this.b;
        e5h e5hVar = this.c;
        switch (i) {
            case 0:
                ich ichVar = e5hVar.d;
                ichVar.U();
                ichVar.X(ndhVar);
                break;
            case 1:
                ich ichVar2 = e5hVar.d;
                ichVar2.U();
                ichVar2.Z().A0();
                ichVar2.m0();
                oa7.x(ndhVar.a);
                ichVar2.d0(ndhVar);
                break;
            default:
                ich ichVar3 = e5hVar.d;
                ichVar3.U();
                ichVar3.o0(ndhVar);
                break;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xsf extends gu7 implements a26 {
    final /* synthetic */ ysf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsf(ysf ysfVar) {
        super(1);
        this.this$0 = ysfVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j;
        int iOrdinal = ((wv4) obj).ordinal();
        if (iOrdinal == 0) {
            o3f o3fVar = ((cx4) this.this$0.E0).b;
            j = y72.j;
        } else if (iOrdinal == 1) {
            ysf ysfVar = this.this$0;
            o3f o3fVar2 = ((cx4) ysfVar.E0).b;
            o3f o3fVar3 = ((f45) ysfVar.F0).c;
            j = y72.j;
        } else {
            if (iOrdinal != 2) {
                ap.c();
                return null;
            }
            ysf ysfVar2 = this.this$0;
            o3f o3fVar4 = ((f45) ysfVar2.F0).c;
            j = ysfVar2.G0.f;
        }
        return new y72(j);
    }
}

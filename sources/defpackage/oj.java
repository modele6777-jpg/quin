package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oj implements xga {
    public final /* synthetic */ pj a;

    public oj(pj pjVar) {
        this.a = pjVar;
    }

    @Override // defpackage.xga
    public final void a(uuf uufVar) {
        int i;
        uufVar.getClass();
        pj pjVar = this.a;
        if (pjVar.g) {
            return;
        }
        try {
            int i2 = uufVar.a;
            if (i2 <= 0 || i2 % 2 != 0 || (i = uufVar.b) <= 0) {
                throw new IllegalStateException("Alpha-packed video requires two equally sized horizontal planes");
            }
            pjVar.e = i2;
            pjVar.f = i;
            pjVar.e();
        } catch (Exception e) {
            ((vj) pjVar.p).d(e);
        }
    }

    @Override // defpackage.xga
    public final void q(lga lgaVar) {
        lgaVar.getClass();
        pj pjVar = this.a;
        if (pjVar.g) {
            return;
        }
        ((vj) pjVar.p).d(lgaVar);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tfh extends m4 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tfh(int i) {
        super(9);
        this.c = i;
    }

    @Override // defpackage.m4
    public final /* synthetic */ Object v0() {
        switch (this.c) {
            case 0:
                return new ufh();
            case 1:
                return new wfh();
            case 2:
                return new qgh();
            default:
                return new sgh();
        }
    }
}

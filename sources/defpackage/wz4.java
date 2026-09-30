package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wz4 extends yz4 {
    public final pl1 c;
    public final /* synthetic */ a05 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz4(a05 a05Var, long j, pl1 pl1Var) {
        super(j);
        this.d = a05Var;
        this.c = pl1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.F(this.d);
    }

    @Override // defpackage.yz4
    public final String toString() {
        return super.toString() + this.c;
    }
}

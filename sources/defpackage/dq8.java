package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dq8 implements xl2 {
    public final /* synthetic */ aq4 a;
    public final /* synthetic */ v98 b;
    public final /* synthetic */ qp8 c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ dq8(aq4 aq4Var, v98 v98Var, qp8 qp8Var, IOException iOException, boolean z) {
        this.a = aq4Var;
        this.b = v98Var;
        this.c = qp8Var;
        this.d = iOException;
        this.e = z;
    }

    @Override // defpackage.xl2
    public final void accept(Object obj) {
        fq8 fq8Var = (fq8) obj;
        aq4 aq4Var = this.a;
        fq8Var.o(aq4Var.a, aq4Var.b, this.b, this.c, this.d, this.e);
    }
}

package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v94 extends gbe implements l26 {
    int label;
    final /* synthetic */ x94 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v94(x94 x94Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = x94Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new v94(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        x94 x94Var = this.this$0;
        synchronized (x94Var.v) {
            try {
                if (!x94Var.X || x94Var.Y) {
                    return wef.a;
                }
                try {
                    x94Var.U();
                } catch (IOException unused) {
                    x94Var.Z = true;
                }
                try {
                    if (x94Var.x >= 2000) {
                        x94Var.g0();
                    }
                } catch (IOException unused2) {
                    x94Var.E0 = true;
                    x94Var.y = new xhb(new wz0());
                }
                return wef.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((v94) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class fg7 extends rg7 {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg7(dg7 dg7Var) {
        super(true);
        boolean z = true;
        O(dg7Var);
        Unsafe unsafe = ud0.a;
        long j = rg7.a;
        xy1 xy1Var = (xy1) unsafe.getObjectVolatile(this, j);
        yy1 yy1Var = xy1Var instanceof yy1 ? (yy1) xy1Var : null;
        if (yy1Var == null) {
            z = false;
            break;
        }
        rg7 rg7VarL = yy1Var.l();
        while (!rg7VarL.H()) {
            xy1 xy1Var2 = (xy1) ud0.a.getObjectVolatile(rg7VarL, j);
            yy1 yy1Var2 = xy1Var2 instanceof yy1 ? (yy1) xy1Var2 : null;
            if (yy1Var2 == null) {
                z = false;
                break;
            }
            rg7VarL = yy1Var2.l();
        }
        this.d = z;
    }

    @Override // defpackage.rg7
    public final boolean H() {
        return this.d;
    }

    @Override // defpackage.rg7
    public final boolean I() {
        return true;
    }
}

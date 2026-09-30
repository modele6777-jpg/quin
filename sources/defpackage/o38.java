package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o38 extends gbe implements l26 {
    final /* synthetic */ f6d $bitmapLease;
    final /* synthetic */ Context $context;
    final /* synthetic */ wt6 $shareManager;
    final /* synthetic */ gbd $shareType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o38(wt6 wt6Var, Context context, gbd gbdVar, f6d f6dVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$shareManager = wt6Var;
        this.$context = context;
        this.$shareType = gbdVar;
        this.$bitmapLease = f6dVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new o38(this.$shareManager, this.$context, this.$shareType, this.$bitmapLease, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        o38 o38Var;
        Throwable th;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            try {
                wt6 wt6Var = this.$shareManager;
                Context context = this.$context;
                Bitmap bitmap = this.$bitmapLease.a;
                this.label = 1;
                o38Var = this;
                try {
                    obj = wt6.b(wt6Var, context, bitmap, null, o38Var, 24);
                    bw2 bw2Var = bw2.a;
                    if (obj == bw2Var) {
                        return bw2Var;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    o38Var.$bitmapLease.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                o38Var = this;
                th = th;
                o38Var.$bitmapLease.close();
                throw th;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                jzb.q(obj);
                o38Var = this;
            } catch (Throwable th4) {
                th = th4;
                o38Var = this;
                o38Var.$bitmapLease.close();
                throw th;
            }
        }
        ((Boolean) obj).getClass();
        o38Var.$bitmapLease.close();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((o38) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

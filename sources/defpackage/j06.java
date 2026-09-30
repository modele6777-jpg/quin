package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j06 extends gbe implements l26 {
    final /* synthetic */ u06 $channel;
    final /* synthetic */ Context $context;
    final /* synthetic */ l06 $info;
    final /* synthetic */ d16 $payloadBuilder;
    final /* synthetic */ a16 $shareCoordinator;
    final /* synthetic */ e89 $sharing$delegate;
    final /* synthetic */ e89 $sheetInfo$delegate;
    final /* synthetic */ Bitmap $thumbnail;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j06(a16 a16Var, Context context, u06 u06Var, l06 l06Var, Bitmap bitmap, d16 d16Var, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$shareCoordinator = a16Var;
        this.$context = context;
        this.$channel = u06Var;
        this.$info = l06Var;
        this.$thumbnail = bitmap;
        this.$payloadBuilder = d16Var;
        this.$sheetInfo$delegate = e89Var;
        this.$sharing$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new j06(this.$shareCoordinator, this.$context, this.$channel, this.$info, this.$thumbnail, this.$payloadBuilder, this.$sheetInfo$delegate, this.$sharing$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        j06 j06Var;
        Throwable th;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            try {
                a16 a16Var = this.$shareCoordinator;
                Context context = this.$context;
                u06 u06Var = this.$channel;
                c16 c16VarN = qn4.n(this.$payloadBuilder, this.$info);
                ok3 ok3Var = new ok3(this.$sheetInfo$delegate, 21);
                i06 i06Var = new i06(this.$context, 0);
                this.label = 1;
                j06Var = this;
                try {
                    obj = a16Var.a(context, u06Var, c16VarN, ok3Var, i06Var, j06Var);
                    bw2 bw2Var = bw2.a;
                    if (obj == bw2Var) {
                        return bw2Var;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    j06Var.$sharing$delegate.setValue(Boolean.FALSE);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j06Var = this;
                th = th;
                j06Var.$sharing$delegate.setValue(Boolean.FALSE);
                throw th;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                jzb.q(obj);
                j06Var = this;
            } catch (Throwable th4) {
                th = th4;
                j06Var = this;
                j06Var.$sharing$delegate.setValue(Boolean.FALSE);
                throw th;
            }
        }
        if (pa7.t((h16) obj, e16.a)) {
            qn4.U(j06Var.$context, R.string.friend_coupon_copied);
        }
        j06Var.$sharing$delegate.setValue(Boolean.FALSE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((j06) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

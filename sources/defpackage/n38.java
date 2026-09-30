package defpackage;

import ai.askquin.R;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n38 extends gbe implements l26 {
    final /* synthetic */ t7 $accountInfoProvider;
    final /* synthetic */ f6d $bitmapLease;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $conversationId;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n38(String str, t7 t7Var, f6d f6dVar, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$conversationId = str;
        this.$accountInfoProvider = t7Var;
        this.$bitmapLease = f6dVar;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new n38(this.$conversationId, this.$accountInfoProvider, this.$bitmapLease, this.$context, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws PendingIntent.CanceledException {
        String string;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                bi biVar = (this.$conversationId.length() <= 0 || !ca2.a.a()) ? null : new bi(this.$conversationId, ((mo3) this.$accountInfoProvider).a());
                Bitmap bitmap = this.$bitmapLease.a;
                Context context = this.$context;
                this.L$0 = null;
                this.label = 1;
                obj = xo1.K(bitmap, context, biVar, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            if (((Uri) obj) == null || (string = this.$context.getString(R.string.image_save_success)) == null) {
                string = this.$context.getString(R.string.image_save_failed);
                string.getClass();
            }
            jcc.k(0, string);
            this.$bitmapLease.close();
            return wef.a;
        } catch (Throwable th) {
            this.$bitmapLease.close();
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((n38) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

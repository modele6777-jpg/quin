package defpackage;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidComposeView;
import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cq extends h36 implements n26 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                if (obj != null) {
                    r3.f();
                    return null;
                }
                AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
                Class cls = AndroidComposeView.X1;
                Resources resources = androidComposeView.getContext().getResources();
                return Boolean.valueOf(oq.a.a(androidComposeView, null, new me2(new vw3(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((ald) obj2).a, (a26) obj3)));
            case 1:
                a26 a26Var = ((r41) this.receiver).b;
                a26Var.getClass();
                vpf.q(a26Var, obj2, (pv2) obj3);
                return wefVar;
            default:
                Object obj4 = ((rw1) obj2).a;
                a26 a26Var2 = ((r41) this.receiver).b;
                a26Var2.getClass();
                Object objB = rw1.b(obj4);
                objB.getClass();
                vpf.q(a26Var2, objB, (pv2) obj3);
                return wefVar;
        }
    }
}

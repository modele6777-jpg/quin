package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r60 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r60(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                x16 x16Var = (x16) obj;
                if (x16Var != null) {
                    x16Var.invoke();
                }
                break;
            case 1:
                ((q80) obj).G();
                break;
            case 2:
                ((om9) obj).a();
                break;
            default:
                ((nze) obj).run();
                break;
        }
    }
}

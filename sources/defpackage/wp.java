package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;

    public /* synthetic */ wp(int i, x16 x16Var) {
        this.a = i;
        this.b = x16Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        x16 x16Var = this.b;
        switch (i) {
            case 0:
                Class cls = AndroidComposeView.X1;
                x16Var.invoke();
                break;
            case 1:
                Class cls2 = AndroidComposeView.X1;
                x16Var.invoke();
                break;
            case 2:
                x16Var.invoke();
                break;
            case 3:
                x16Var.invoke();
                break;
            case 4:
                x16Var.invoke();
                break;
            case 5:
                x16Var.invoke();
                break;
            case 6:
                x16Var.invoke();
                break;
            case 7:
                x16Var.invoke();
                break;
            default:
                x16Var.invoke();
                break;
        }
    }
}

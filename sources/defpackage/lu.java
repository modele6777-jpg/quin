package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lu implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ila b;

    public /* synthetic */ lu(ila ilaVar, int i) {
        this.a = i;
        this.b = ilaVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        ila ilaVar = this.b;
        switch (i) {
            case 0:
                bv7 bv7VarG = ((bv7) obj).G();
                bv7VarG.getClass();
                ilaVar.q(bv7VarG);
                break;
            case 1:
                ilaVar.m18setPopupContentSizefhxjrPA((e77) obj);
                ilaVar.r();
                break;
            default:
                x16 x16Var = (x16) obj;
                Handler handler = ilaVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = ilaVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new wp(6, x16Var));
                    }
                } else {
                    x16Var.invoke();
                }
                break;
        }
        return wefVar;
    }
}

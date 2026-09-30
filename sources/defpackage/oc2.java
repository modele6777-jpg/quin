package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oc2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ oc2(oc7 oc7Var, Context context, e89 e89Var, int i) {
        this.a = i;
        this.b = oc7Var;
        this.c = context;
        this.d = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.d;
        Context context = this.c;
        oc7 oc7Var = this.b;
        gbd gbdVar = (gbd) obj;
        switch (i) {
            case 0:
                gbdVar.getClass();
                e89Var.setValue(Boolean.FALSE);
                context.getClass();
                oc7Var.f(new jc7(oc7Var, gbdVar, context, null));
                break;
            default:
                gbdVar.getClass();
                e89Var.setValue(Boolean.FALSE);
                context.getClass();
                oc7Var.f(new jc7(oc7Var, gbdVar, context, null));
                break;
        }
        return wefVar;
    }
}

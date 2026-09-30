package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bz1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hxc b;

    public /* synthetic */ bz1(hxc hxcVar, int i) {
        this.a = i;
        this.b = hxcVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Throwable {
        Boolean boolValueOf;
        int i = this.a;
        boolean z = false;
        yye yyeVar = yye.b;
        yye yyeVar2 = yye.a;
        hxc hxcVar = this.b;
        switch (i) {
            case 0:
                i4f i4fVar = (i4f) obj;
                i4fVar.getClass();
                yz9 yz9Var = (yz9) i4fVar;
                yz9Var.E0 = true;
                yz9Var.Z.d(hxcVar);
                scc.k(yz9Var);
                return Boolean.FALSE;
            case 1:
                AutofillValue autofillValue = ((yr) obj).a;
                boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        yyeVar = yyeVar2;
                    }
                    exc.o(hxcVar, yyeVar);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                AutofillValue autofillValue2 = ((yr) obj).a;
                boolValueOf = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        yyeVar = yyeVar2;
                    }
                    exc.o(hxcVar, yyeVar);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}

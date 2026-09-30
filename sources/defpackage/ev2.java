package defpackage;

import android.view.autofill.AutofillValue;
import com.adjust.sdk.sig.r3;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ev2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fv2 b;

    public /* synthetic */ ev2(fv2 fv2Var, hxc hxcVar) {
        this.a = 3;
        this.b = fv2Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws IOException {
        int i = this.a;
        StringBuilder sb = null;
        boolean z = true;
        fv2 fv2Var = this.b;
        switch (i) {
            case 0:
                vz9 vz9Var = fv2Var.H0.t;
                Boolean bool = Boolean.TRUE;
                vz9Var.setValue(bool);
                fv2Var.H0.s.setValue(bool);
                r38 r38Var = fv2Var.H0;
                AutofillValue autofillValue = ((yr) obj).a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                fv2.o1(r38Var, (String) textValue, fv2Var.I0);
                return bool;
            case 1:
                List list = (List) obj;
                if (fv2Var.H0.d() != null) {
                    tte tteVarD = fv2Var.H0.d();
                    tteVarD.getClass();
                    list.add(tteVarD.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                fv2.o1(fv2Var.H0, ((k00) obj).b, fv2Var.I0);
                return Boolean.TRUE;
            default:
                k00 k00Var = (k00) obj;
                if (fv2Var.I0) {
                    jte jteVar = fv2Var.H0.e;
                    if (jteVar != null) {
                        List listI = t72.I(new ye5(), new ba2(k00Var, 1));
                        r38 r38Var2 = fv2Var.H0;
                        fz3 fz3Var = r38Var2.d;
                        ou2 ou2Var = r38Var2.v;
                        zse zseVarJ = fz3Var.j(listI);
                        jteVar.a(null, zseVarJ);
                        ou2Var.d(zseVarJ);
                    } else {
                        zse zseVar = fv2Var.G0;
                        String str = zseVar.a.b;
                        long j = zseVar.b;
                        int i2 = eue.c;
                        int i3 = (int) (j >> 32);
                        int i4 = (int) (j & 4294967295L);
                        str.getClass();
                        k00Var.getClass();
                        if (i4 >= i3) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i3);
                            sb.append((CharSequence) k00Var);
                            sb.append((CharSequence) str, i4, str.length());
                        } else {
                            r3.i(kv2.h(i4, i3, "End index (", ") is less than start index (", ")."));
                        }
                        String string = sb.toString();
                        int length = k00Var.b.length() + ((int) (fv2Var.G0.b >> 32));
                        fv2Var.H0.v.d(new zse(4, u3c.b(length, length), string));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ ev2(fv2 fv2Var, int i) {
        this.a = i;
        this.b = fv2Var;
    }
}

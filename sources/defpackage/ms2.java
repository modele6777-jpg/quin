package defpackage;

import ai.askquin.ui.conversation.dialogue.NewReadingState;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.divination.OverviewItem;
import android.content.Context;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ms2 implements a26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ ms2(g83 g83Var, aw2 aw2Var, e89 e89Var, Context context, gpf gpfVar, o9 o9Var, x16 x16Var) {
        this.d = g83Var;
        this.e = aw2Var;
        this.b = e89Var;
        this.f = context;
        this.g = gpfVar;
        this.v = o9Var;
        this.c = x16Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        float f;
        int i = this.a;
        e89 e89Var = this.b;
        wef wefVar = wef.a;
        Object obj2 = this.c;
        Object obj3 = this.v;
        Object obj4 = this.g;
        Object obj5 = this.d;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                r0 r0Var = (r0) obj5;
                String str = (String) obj;
                str.getClass();
                ynb.V(hwf.a(r0Var), null, null, new xs2((kzd) obj7, r0Var, str, (use) obj6, (xn5) obj4, (vsd) obj3, this.b, (e89) obj2, null), 3);
                return wefVar;
            case 1:
                a26 a26Var = (a26) obj7;
                j91 j91Var = (j91) obj6;
                Locale locale = (Locale) obj4;
                ie3 ie3Var = (ie3) obj3;
                e89 e89Var2 = (e89) obj2;
                zse zseVar = (zse) obj;
                k00 k00Var = zseVar.a;
                String str2 = k00Var.b;
                String str3 = k00Var.b;
                int length = str2.length();
                String str4 = ((be3) obj5).c;
                if (length <= str4.length()) {
                    for (int i2 = 0; i2 < str3.length(); i2++) {
                        if (Character.isDigit(str3.charAt(i2))) {
                        }
                    }
                    e89Var2.setValue(zseVar);
                    String string = v4e.o0(str3).toString();
                    if (string.length() != 0 && string.length() >= str4.length()) {
                        c91 c91VarC = j91Var.c(string, str4, locale);
                        e89Var.setValue(ie3Var.a(c91VarC, locale));
                        a26Var.d((((CharSequence) e89Var.getValue()).length() != 0 || c91VarC == null) ? null : Long.valueOf(c91VarC.d));
                    } else {
                        e89Var.setValue("");
                        a26Var.d(null);
                    }
                }
                return wefVar;
            case 2:
                d79 d79Var = (d79) obj5;
                se2 se2Var = (se2) obj7;
                a26 a26Var2 = (a26) obj6;
                a26 a26Var3 = (a26) obj4;
                a26 a26Var4 = (a26) obj3;
                my myVar = (my) obj;
                if (!((List) ((h0e) obj2).getValue()).contains(myVar.b())) {
                    return kn2.c0(bx4.a, e45.a);
                }
                String str5 = ((da9) myVar.b()).f;
                int iB = d79Var.b(str5);
                if (iB >= 0) {
                    f = d79Var.c[iB];
                } else {
                    d79Var.d(str5, 0.0f);
                    f = 0.0f;
                }
                if (!((da9) myVar.d()).f.equals(((da9) myVar.b()).f)) {
                    f = (((Boolean) se2Var.c.getValue()).booleanValue() || ((Boolean) e89Var.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                }
                d79Var.d(((da9) myVar.d()).f, f);
                return new cn2((bx4) a26Var2.d(myVar), (e45) a26Var3.d(myVar), f, (ild) a26Var4.d(myVar));
            case 3:
                g83 g83Var = (g83) obj5;
                aw2 aw2Var = (aw2) obj7;
                Context context = (Context) obj6;
                gpf gpfVar = (gpf) obj4;
                o9 o9Var = (o9) obj3;
                x16 x16Var = (x16) obj2;
                vh9 vh9Var = (vh9) obj;
                vh9Var.getClass();
                if (vh9Var.a) {
                    pa7.m(g83Var, aw2Var, this.b, context, gpfVar, o9Var, x16Var);
                } else {
                    ynb.V(lw2.a, null, null, new ki9(2, null), 3);
                    x16Var.invoke();
                }
                return wefVar;
            default:
                tr2 tr2Var = (tr2) obj6;
                r0 r0Var2 = (r0) obj5;
                t7 t7Var = (t7) obj4;
                aw2 aw2Var2 = (aw2) obj3;
                j4a j4aVar = (j4a) obj2;
                OverviewItem.NewReadingItem newReadingItem = (OverviewItem.NewReadingItem) obj;
                newReadingItem.getClass();
                jr jrVar = new jr(newReadingItem, (shb) obj7, tr2Var, r0Var2, 22);
                if (newReadingItem.getState() == NewReadingState.NotStarted) {
                    e89 e89Var3 = this.b;
                    if (!((Boolean) e89Var3.getValue()).booleanValue()) {
                        e89Var3.setValue(Boolean.TRUE);
                        mo3 mo3Var = (mo3) t7Var;
                        ynb.V(aw2Var2, null, null, new aw9(j4aVar, mo3Var, mo3Var.a(), r0Var2, r0Var2.E(), jrVar, tr2Var, e89Var3, null), 3);
                    }
                } else {
                    jrVar.invoke();
                }
                return wefVar;
        }
    }

    public /* synthetic */ ms2(be3 be3Var, e89 e89Var, a26 a26Var, j91 j91Var, Locale locale, ie3 ie3Var, e89 e89Var2) {
        this.d = be3Var;
        this.b = e89Var;
        this.e = a26Var;
        this.f = j91Var;
        this.g = locale;
        this.v = ie3Var;
        this.c = e89Var2;
    }

    public /* synthetic */ ms2(d79 d79Var, se2 se2Var, a26 a26Var, a26 a26Var2, a26 a26Var3, h0e h0eVar, e89 e89Var) {
        this.d = d79Var;
        this.e = se2Var;
        this.f = a26Var;
        this.g = a26Var2;
        this.v = a26Var3;
        this.c = h0eVar;
        this.b = e89Var;
    }

    public /* synthetic */ ms2(shb shbVar, tr2 tr2Var, r0 r0Var, t7 t7Var, aw2 aw2Var, e89 e89Var, j4a j4aVar) {
        this.e = shbVar;
        this.f = tr2Var;
        this.d = r0Var;
        this.g = t7Var;
        this.v = aw2Var;
        this.b = e89Var;
        this.c = j4aVar;
    }

    public /* synthetic */ ms2(r0 r0Var, kzd kzdVar, use useVar, xn5 xn5Var, vsd vsdVar, e89 e89Var, e89 e89Var2) {
        this.d = r0Var;
        this.e = kzdVar;
        this.f = useVar;
        this.g = xn5Var;
        this.v = vsdVar;
        this.b = e89Var;
        this.c = e89Var2;
    }
}

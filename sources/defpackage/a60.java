package defpackage;

import ai.askquin.ui.annual.model.AnnualActionFor;
import ai.askquin.ui.conversation.g;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.b;
import java.util.List;
import tech.chatmind.api.events.model.Popup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a60 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a60(Bitmap bitmap, boolean z, int i, a26 a26Var, e89 e89Var) {
        this.a = 11;
        this.d = bitmap;
        this.b = z;
        this.c = i;
        this.e = a26Var;
        this.f = e89Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        wef wefVar = wef.a;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qn4.c((AnnualActionFor) obj5, this.b, (a26) obj3, (x16) obj4, this.c, (l46) obj, k99.P(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                g.a((q7b) obj5, (da9) obj3, (z27) obj4, this.b, (l46) obj, k99.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                db6.d(this.b, (a26) obj3, (a26) obj5, (x16) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                vf3.o((x16) obj4, this.b, (j09) obj5, (dd2) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                rs0.k((egd) obj5, (x16) obj4, (psc) obj3, this.b, (l46) obj, k99.P(1), this.c);
                break;
            case 5:
                ((Integer) obj2).getClass();
                jgb.o((e83) obj5, (a26) obj3, (j09) obj4, this.b, (l46) obj, k99.P(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                db6.e((u06) obj5, (String) obj3, this.b, (x16) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                no6.c((String) obj5, (String) obj3, this.b, (j09) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                qka.b((Popup) obj5, this.b, (a26) obj3, (x16) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                jfb.b((List) obj5, (List) obj4, this.b, (a26) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).intValue();
                uyb.b((upc) obj5, this.b, (x16) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Bitmap bitmap = (Bitmap) obj5;
                a26 a26Var = (a26) obj3;
                e89 e89Var = (e89) obj4;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 2;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09VarC = b.c(g09.a, 1.0f);
                    boolean zS = g21.S(l46Var);
                    boolean z = this.b && ((Boolean) e89Var.getValue()).booleanValue();
                    boolean zG = l46Var.g(a26Var);
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (zG || objR == i8cVar) {
                        objR = new k50(a26Var, 15);
                        l46Var.p0(objR);
                    }
                    j09 j09VarY = dj6.y(this.c, (l26) objR, j09VarC, bitmap, "unified_screenshot", zS, z, true);
                    boolean zG2 = l46Var.g(e89Var);
                    Object objR2 = l46Var.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new w77(e89Var, 9);
                        l46Var.p0(objR2);
                    }
                    h7d.f(j09VarY, x82.b, 0.2f, 0.0f, (a26) objR2, af1.b0(-1224135254, new jxc(i3, bitmap), l46Var), l46Var, 197040, 8);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).intValue();
                d8c.j((fy9) obj5, (String) obj3, this.b, (x16) obj4, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                d8c.i(iP, (dd2) obj3, (x16) obj4, (l46) obj, (String) obj5, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                xdc.d((j09) obj5, this.b, (float[]) obj4, (a26) obj3, (l46) obj, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ a60(x16 x16Var, boolean z, j09 j09Var, dd2 dd2Var, int i) {
        this.a = 3;
        this.f = x16Var;
        this.b = z;
        this.d = j09Var;
        this.e = dd2Var;
        this.c = i;
    }

    public /* synthetic */ a60(egd egdVar, x16 x16Var, psc pscVar, boolean z, int i, int i2) {
        this.a = 4;
        this.d = egdVar;
        this.f = x16Var;
        this.e = pscVar;
        this.b = z;
        this.c = i2;
    }

    public /* synthetic */ a60(AnnualActionFor annualActionFor, boolean z, a26 a26Var, x16 x16Var, int i, int i2) {
        this.a = 0;
        this.d = annualActionFor;
        this.b = z;
        this.e = a26Var;
        this.f = x16Var;
        this.c = i;
    }

    public /* synthetic */ a60(int i, int i2, m26 m26Var, Object obj, Object obj2, boolean z) {
        this.a = i2;
        this.d = obj;
        this.b = z;
        this.f = obj2;
        this.e = m26Var;
        this.c = i;
    }

    public /* synthetic */ a60(Object obj, Object obj2, boolean z, Object obj3, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = z;
        this.c = i;
    }

    public /* synthetic */ a60(Object obj, String str, boolean z, Object obj2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = str;
        this.b = z;
        this.f = obj2;
        this.c = i;
    }

    public /* synthetic */ a60(List list, List list2, boolean z, a26 a26Var, int i) {
        this.a = 9;
        this.d = list;
        this.f = list2;
        this.b = z;
        this.e = a26Var;
        this.c = i;
    }

    public /* synthetic */ a60(Popup popup, boolean z, a26 a26Var, x16 x16Var, int i) {
        this.a = 8;
        this.d = popup;
        this.b = z;
        this.e = a26Var;
        this.f = x16Var;
        this.c = i;
    }

    public /* synthetic */ a60(boolean z, a26 a26Var, a26 a26Var2, x16 x16Var, int i) {
        this.a = 2;
        this.b = z;
        this.e = a26Var;
        this.d = a26Var2;
        this.f = x16Var;
        this.c = i;
    }
}

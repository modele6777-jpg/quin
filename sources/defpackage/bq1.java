package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bq1 implements l26 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ bq1(ii6 ii6Var, TarotSkinIdentify tarotSkinIdentify, mic micVar, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, j09 j09Var, int i) {
        this.c = ii6Var;
        this.f = tarotSkinIdentify;
        this.d = micVar;
        this.e = x16Var;
        this.g = x16Var2;
        this.b = x16Var3;
        this.v = x16Var4;
        this.w = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.w;
        Object obj6 = this.e;
        Object obj7 = this.v;
        Object obj8 = this.b;
        Object obj9 = this.d;
        Object obj10 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                uq1.f((List) obj10, (TarotCardType) obj9, (String) obj6, (TarotSkinIdentify) obj4, (l26) obj3, (a26) obj8, (a26) obj7, (j09) obj5, (l46) obj, k99.P(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                he3.a((Long) obj10, (a26) obj8, (j91) obj9, (z67) obj6, (ne3) obj4, (euc) obj3, (ke3) obj7, (fo5) obj5, (l46) obj, k99.P(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                no6.l((ii6) obj10, (TarotSkinIdentify) obj4, (mic) obj9, (x16) obj6, (x16) obj3, (x16) obj8, (x16) obj7, (j09) obj5, (l46) obj, k99.P(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                nk8.j((j09) obj5, (r91) obj9, (LocalDate) obj6, (List) obj10, (Map) obj3, (TarotSkinIdentify) obj4, (x16) obj7, (a26) obj8, (l46) obj, k99.P(1));
                break;
            case 4:
                List list = (List) obj10;
                wp9 wp9Var = (wp9) obj9;
                x16 x16Var = (x16) obj6;
                lve lveVar = (lve) obj4;
                Context context = (Context) obj3;
                bq9 bq9Var = (bq9) obj8;
                e89 e89Var = (e89) obj7;
                e89 e89Var2 = (e89) obj5;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    mfc mfcVar = (mfc) e89Var.getValue();
                    boolean zI = l46Var.i(lveVar) | l46Var.i(context);
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (zI || objR == i8cVar) {
                        objR = new it3(lveVar, context, e89Var2, 27);
                        l46Var.p0(objR);
                    }
                    a26 a26Var = (a26) objR;
                    boolean zI2 = l46Var.i(bq9Var);
                    Object objR2 = l46Var.R();
                    if (zI2 || objR2 == i8cVar) {
                        sk3 sk3Var = new sk3(0, bq9Var, bq9.class, "invoke", "invoke()V", 0, 29);
                        l46Var.p0(sk3Var);
                        objR2 = sk3Var;
                    }
                    cgg.i(mfcVar, list, wp9Var, x16Var, a26Var, (x16) ((ym7) objR2), !((Boolean) e89Var2.getValue()).booleanValue(), l46Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                onc.c((List) obj10, (List) obj9, (a26) obj8, (a26) obj7, (a26) obj6, (j09) obj5, (xw9) obj4, (l26) obj3, (l46) obj, k99.P(12583297));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ bq1(j09 j09Var, r91 r91Var, LocalDate localDate, List list, Map map, TarotSkinIdentify tarotSkinIdentify, x16 x16Var, a26 a26Var, int i) {
        this.w = j09Var;
        this.d = r91Var;
        this.e = localDate;
        this.c = list;
        this.g = map;
        this.f = tarotSkinIdentify;
        this.v = x16Var;
        this.b = a26Var;
    }

    public /* synthetic */ bq1(Long l, a26 a26Var, j91 j91Var, z67 z67Var, ne3 ne3Var, euc eucVar, ke3 ke3Var, fo5 fo5Var, int i) {
        this.c = l;
        this.b = a26Var;
        this.d = j91Var;
        this.e = z67Var;
        this.f = ne3Var;
        this.g = eucVar;
        this.v = ke3Var;
        this.w = fo5Var;
    }

    public /* synthetic */ bq1(List list, wp9 wp9Var, x16 x16Var, lve lveVar, Context context, bq9 bq9Var, e89 e89Var, e89 e89Var2) {
        this.c = list;
        this.d = wp9Var;
        this.e = x16Var;
        this.f = lveVar;
        this.g = context;
        this.b = bq9Var;
        this.v = e89Var;
        this.w = e89Var2;
    }

    public /* synthetic */ bq1(List list, List list2, a26 a26Var, a26 a26Var2, a26 a26Var3, j09 j09Var, xw9 xw9Var, l26 l26Var, int i) {
        this.c = list;
        this.d = list2;
        this.b = a26Var;
        this.v = a26Var2;
        this.e = a26Var3;
        this.w = j09Var;
        this.f = xw9Var;
        this.g = l26Var;
    }

    public /* synthetic */ bq1(List list, TarotCardType tarotCardType, String str, TarotSkinIdentify tarotSkinIdentify, l26 l26Var, a26 a26Var, a26 a26Var2, j09 j09Var, int i) {
        this.c = list;
        this.d = tarotCardType;
        this.e = str;
        this.f = tarotSkinIdentify;
        this.g = l26Var;
        this.b = a26Var;
        this.v = a26Var2;
        this.w = j09Var;
    }
}

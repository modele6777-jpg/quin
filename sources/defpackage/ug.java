package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.seasonal.SeasonalFollowUpRoute;
import ai.askquin.ui.share.SharedDivination;
import android.content.Context;
import android.graphics.Bitmap;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ug implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ ug(j09 j09Var, dd4 dd4Var, String str, String str2, String str3, String str4, String str5, int i) {
        this.a = 5;
        this.b = j09Var;
        this.e = dd4Var;
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.g = str4;
        this.v = str5;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        int i2 = 2;
        wef wefVar = wef.a;
        Object obj3 = this.v;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.e;
        Object obj9 = this.b;
        switch (i) {
            case 0:
                gh ghVar = (gh) obj9;
                String str = (String) obj7;
                String str2 = (String) obj6;
                p5a p5aVar = (p5a) obj8;
                Context context = (Context) obj5;
                fh fhVar = (fh) obj4;
                x16 x16Var = (x16) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(1 & iIntValue, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    boolean zG = l46Var.g(str) | l46Var.g(str2) | l46Var.i(p5aVar) | l46Var.i(context) | l46Var.i(fhVar);
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        kf kfVar = new kf((Object) context, str, (Object) str2, (Object) p5aVar, (Object) fhVar, 1);
                        l46Var.p0(kfVar);
                        objR = kfVar;
                    }
                    a26 a26Var = (a26) objR;
                    boolean zG2 = l46Var.g(str) | l46Var.g(str2) | l46Var.i(p5aVar) | l46Var.g(x16Var);
                    Object objR2 = l46Var.R();
                    if (zG2 || objR2 == i8cVar) {
                        rg rgVar = new rg(x16Var, str, str2, p5aVar, 1);
                        l46Var.p0(rgVar);
                        objR2 = rgVar;
                    }
                    dj6.f(ghVar, a26Var, (x16) objR2, l46Var, 8);
                }
                break;
            case 1:
                QuotaBlockReason quotaBlockReason = (QuotaBlockReason) obj9;
                tr2 tr2Var = (tr2) obj7;
                t7 t7Var = (t7) obj6;
                r0 r0Var = (r0) obj8;
                j09 j09Var = (j09) obj5;
                ep5 ep5Var = (ep5) obj4;
                sp5 sp5Var = (sp5) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    boolean zI = l46Var2.i(tr2Var);
                    Object objR3 = l46Var2.R();
                    if (zI || objR3 == i8cVar) {
                        objR3 = new at2(tr2Var);
                        l46Var2.p0(objR3);
                    }
                    x16 x16Var2 = (x16) ((ym7) objR3);
                    boolean zI2 = l46Var2.i(tr2Var) | l46Var2.i(t7Var) | l46Var2.i(r0Var);
                    Object objR4 = l46Var2.R();
                    if (zI2 || objR4 == i8cVar) {
                        objR4 = new bt2(tr2Var, t7Var, r0Var);
                        l46Var2.p0(objR4);
                    }
                    feg.e(quotaBlockReason, x16Var2, (x16) ((ym7) objR4), j09Var, r0Var.G(), ep5Var, sp5Var, l46Var2, 3072);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                feg.e((QuotaBlockReason) obj9, (x16) obj3, (x16) obj6, (j09) obj8, (String) obj7, (ep5) obj5, (sp5) obj4, (l46) obj, k99.P(3073));
                break;
            case 3:
                ka9 ka9Var = (ka9) obj9;
                orc orcVar = (orc) obj7;
                SeasonalFollowUpRoute seasonalFollowUpRoute = (SeasonalFollowUpRoute) obj6;
                SolarTerm solarTerm = (SolarTerm) obj8;
                h0e h0eVar = (h0e) obj5;
                h0e h0eVar2 = (h0e) obj4;
                h0e h0eVar3 = (h0e) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    grc grcVar = (grc) h0eVar.getValue();
                    boolean zI3 = l46Var3.i(ka9Var);
                    Object objR5 = l46Var3.R();
                    if (zI3 || objR5 == i8cVar) {
                        objR5 = new tmc(ka9Var, 5);
                        l46Var3.p0(objR5);
                    }
                    x16 x16Var3 = (x16) objR5;
                    boolean zI4 = l46Var3.i(orcVar) | l46Var3.i(seasonalFollowUpRoute) | l46Var3.e(solarTerm.ordinal());
                    Object objR6 = l46Var3.R();
                    if (zI4 || objR6 == i8cVar) {
                        objR6 = new smc(orcVar, seasonalFollowUpRoute, solarTerm, i2);
                        l46Var3.p0(objR6);
                    }
                    dnc.a(grcVar, x16Var3, (x16) objR6, af1.b0(1768838389, new iq1(seasonalFollowUpRoute, solarTerm, orcVar, ka9Var, h0eVar2, h0eVar3, 7), l46Var3), l46Var3, 3072);
                }
                break;
            case 4:
                SharedDivination sharedDivination = (SharedDivination) obj9;
                x6d x6dVar = (x6d) obj6;
                x16 x16Var4 = (x16) obj3;
                e89 e89Var = (e89) obj8;
                ihb ihbVar = (ihb) obj5;
                String str3 = (String) obj7;
                Bitmap bitmap = (Bitmap) obj4;
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    t4c.e(null, sharedDivination.getDivinationId(), x6dVar, new y43(x6dVar, i2), x16Var4, af1.b0(586774910, new hk6(e89Var, ihbVar, sharedDivination, x6dVar, str3, bitmap, 1), l46Var4), l46Var4, 197120, 1);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                eec.a((j09) obj9, (dd4) obj8, (String) obj7, (String) obj6, (String) obj5, (String) obj4, (String) obj3, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ug(QuotaBlockReason quotaBlockReason, x16 x16Var, x16 x16Var2, j09 j09Var, String str, ep5 ep5Var, sp5 sp5Var, int i) {
        this.a = 2;
        this.b = quotaBlockReason;
        this.v = x16Var;
        this.d = x16Var2;
        this.e = j09Var;
        this.c = str;
        this.f = ep5Var;
        this.g = sp5Var;
    }

    public /* synthetic */ ug(SharedDivination sharedDivination, x6d x6dVar, x16 x16Var, e89 e89Var, ihb ihbVar, String str, Bitmap bitmap) {
        this.a = 4;
        this.b = sharedDivination;
        this.d = x6dVar;
        this.v = x16Var;
        this.e = e89Var;
        this.f = ihbVar;
        this.c = str;
        this.g = bitmap;
    }

    public /* synthetic */ ug(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.v = obj7;
    }
}

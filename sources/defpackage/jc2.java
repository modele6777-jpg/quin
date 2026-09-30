package defpackage;

import java.util.List;
import tech.chatmind.api.ShareSummaryContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jc2 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ jc2(j09 j09Var, boolean z, boolean z2, a26 a26Var, String str, List list, List list2, ShareSummaryContent shareSummaryContent, int i) {
        this.f = j09Var;
        this.b = z;
        this.c = z2;
        this.g = a26Var;
        this.d = str;
        this.v = list;
        this.w = list2;
        this.x = shareSummaryContent;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iP = k99.P(i2 | 1);
                vd0.n(this.d, (String) obj7, (String) obj6, (yxd) obj5, this.b, this.c, (x16) obj4, (x16) obj3, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                p6d.e((j09) obj7, this.b, this.c, (a26) obj6, this.d, (List) obj5, (List) obj4, (ShareSummaryContent) obj3, (l46) obj, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                p8c.l((List) obj7, (List) obj6, this.b, this.c, this.d, (a26) obj5, (x16) obj4, (x16) obj3, (l46) obj, iP3);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ jc2(String str, String str2, String str3, yxd yxdVar, boolean z, boolean z2, x16 x16Var, x16 x16Var2, int i) {
        this.d = str;
        this.f = str2;
        this.g = str3;
        this.v = yxdVar;
        this.b = z;
        this.c = z2;
        this.w = x16Var;
        this.x = x16Var2;
        this.e = i;
    }

    public /* synthetic */ jc2(List list, List list2, boolean z, boolean z2, String str, a26 a26Var, x16 x16Var, x16 x16Var2, int i) {
        this.f = list;
        this.g = list2;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.v = a26Var;
        this.w = x16Var;
        this.x = x16Var2;
        this.e = i;
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class px6 implements a26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ px6(l26 l26Var, List list, boolean z, int i) {
        this.b = l26Var;
        this.e = list;
        this.d = z;
        this.c = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.c;
        boolean z = this.d;
        Object obj2 = this.e;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj3;
                List list = (List) obj2;
                une uneVar = (une) obj;
                eue eueVar = uneVar.v;
                if (eueVar != null) {
                    long j = eueVar.a;
                    int i3 = (int) (j >> 32);
                    vfh.z(uneVar, i3, (int) (j & 4294967295L), str);
                    if (str.length() > 0) {
                        uneVar.f(i3, str.length() + i3, list);
                    }
                } else {
                    int iG = eue.g(uneVar.g);
                    vfh.z(uneVar, iG, eue.f(uneVar.g), str);
                    if (str.length() > 0) {
                        uneVar.f(iG, str.length() + iG, list);
                    }
                }
                int iG2 = eue.g(uneVar.g);
                int length = i2 > 0 ? (iG2 + i2) - 1 : (iG2 + i2) - str.length();
                uneVar.e = z;
                int iO = mh3.o(length, 0, uneVar.c.length());
                uneVar.h(u3c.b(iO, iO));
                break;
            case 1:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a((String) obj3, "page_name");
                l1fVar.a(Integer.valueOf(i2 + 1), "card_index");
                l1fVar.a(Boolean.valueOf(z), "is_revisit");
                l1fVar.a((String) obj2, "seasonal_period");
                break;
            default:
                ((l26) obj3).z(Integer.valueOf(uyb.h(((Number) ((List) obj2).get(((Integer) obj).intValue())).intValue(), z)), Integer.valueOf(i2));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ px6(String str, int i, boolean z, String str2) {
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = str2;
    }

    public /* synthetic */ px6(String str, List list, int i, boolean z) {
        this.b = str;
        this.e = list;
        this.c = i;
        this.d = z;
    }
}

package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xkc implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SolarTerm b;
    public final /* synthetic */ String c;

    public /* synthetic */ xkc(int i, SolarTerm solarTerm, String str) {
        this.a = i;
        this.b = solarTerm;
        this.c = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        String str = this.c;
        SolarTerm solarTerm = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                l1fVar.getClass();
                String strD = n3d.d(solarTerm, "followup_send");
                if (strD != null) {
                    l1fVar.a(strD, "btn");
                }
                l1fVar.a(str, "pathway");
                break;
            default:
                l1fVar.getClass();
                String strD2 = n3d.d(solarTerm, "shareImage");
                if (strD2 != null) {
                    l1fVar.a(strD2, "btn");
                }
                l1fVar.a(str, "pathway");
                break;
        }
        return wefVar;
    }
}

package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ft5 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SolarTerm b;

    public /* synthetic */ ft5(int i, SolarTerm solarTerm) {
        this.a = i;
        this.b = solarTerm;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        SolarTerm solarTerm = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                l1fVar.getClass();
                String strD = n3d.d(solarTerm, "history");
                if (strD != null) {
                    l1fVar.a(strD, "btn");
                }
                l1fVar.a("seasonal_reading_intro", "pathway");
                break;
            case 1:
                l1fVar.getClass();
                String strD2 = n3d.d(solarTerm, "replay");
                if (strD2 != null) {
                    l1fVar.a(strD2, "btn");
                }
                l1fVar.a("seasonal_reading_intro", "pathway");
                break;
            case 2:
                l1fVar.getClass();
                String strD3 = n3d.d(solarTerm, "shareURL");
                if (strD3 != null) {
                    l1fVar.a(strD3, "btn");
                }
                String strD4 = n3d.d(solarTerm, "intro");
                if (strD4 != null) {
                    l1fVar.a(strD4, "pathway");
                }
                break;
            default:
                l1fVar.getClass();
                String strD5 = n3d.d(solarTerm, "shareImage");
                if (strD5 != null) {
                    l1fVar.a(strD5, "btn");
                }
                l1fVar.a("seasonal_reading_reading", "pathway");
                break;
        }
        return wefVar;
    }
}

package defpackage;

import tech.chatmind.api.DeviceTokenRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t74 implements w56 {
    public static final t74 a;
    private static final nyc descriptor;

    static {
        t74 t74Var = new t74();
        a = t74Var;
        gia giaVar = new gia("tech.chatmind.api.DeviceTokenRequest", t74Var, 2);
        giaVar.k("aliyunDeviceId", true);
        giaVar.k("permission", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DeviceTokenRequest deviceTokenRequest = (DeviceTokenRequest) obj;
        deviceTokenRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DeviceTokenRequest.write$Self$Quin_core_base_api_release(deviceTokenRequest, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                str = (String) zf2VarC.y(nycVar, 0, p4e.a, str);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                str2 = (String) zf2VarC.y(nycVar, 1, p4e.a, str2);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new DeviceTokenRequest(i, str, str2, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{t72.F(p4eVar), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}

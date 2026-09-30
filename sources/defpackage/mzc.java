package defpackage;

import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mzc {
    public final <T> xn7 serializer(final xn7 xn7Var) {
        xn7Var.getClass();
        return new w56() { // from class: lzc
            private final nyc descriptor;

            {
                gia giaVar = new gia("tech.chatmind.api.server.ServerResponse", this, 6);
                giaVar.k("login", true);
                giaVar.k("success", true);
                giaVar.k("error", true);
                giaVar.k("errorCode", true);
                giaVar.k("errorMessage", true);
                giaVar.k("data", false);
                this.descriptor = giaVar;
            }

            @Override // defpackage.xn7
            public final void a(ev4 ev4Var, Object obj) {
                ServerResponse serverResponse = (ServerResponse) obj;
                serverResponse.getClass();
                nyc nycVar = this.descriptor;
                ag2 ag2VarC = ev4Var.c(nycVar);
                ServerResponse.write$Self$Quin_core_base_api_release(serverResponse, ag2VarC, nycVar, xn7Var);
                ag2VarC.b(nycVar);
            }

            @Override // defpackage.w56
            public final xn7[] b() {
                return new xn7[]{xn7Var};
            }

            @Override // defpackage.xn7
            public final Object c(om3 om3Var) {
                nyc nycVar = this.descriptor;
                zf2 zf2VarC = om3Var.c(nycVar);
                boolean z = true;
                int i = 0;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                int iT = 0;
                String strO = null;
                Object objS = null;
                while (z) {
                    int iJ = zf2VarC.j(nycVar);
                    switch (iJ) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            z2 = zf2VarC.z(nycVar, 0);
                            i |= 1;
                            break;
                        case 1:
                            z3 = zf2VarC.z(nycVar, 1);
                            i |= 2;
                            break;
                        case 2:
                            z4 = zf2VarC.z(nycVar, 2);
                            i |= 4;
                            break;
                        case 3:
                            iT = zf2VarC.t(nycVar, 3);
                            i |= 8;
                            break;
                        case 4:
                            strO = zf2VarC.o(nycVar, 4);
                            i |= 16;
                            break;
                        case 5:
                            objS = zf2VarC.s(nycVar, 5, xn7Var, objS);
                            i |= 32;
                            break;
                        default:
                            s8f.f(iJ);
                            return null;
                    }
                }
                zf2VarC.b(nycVar);
                return new ServerResponse(i, z2, z3, z4, iT, strO, objS, (xyc) null);
            }

            @Override // defpackage.w56
            public final xn7[] d() {
                g11 g11Var = g11.a;
                return new xn7[]{g11Var, g11Var, g11Var, c77.a, p4e.a, xn7Var};
            }

            @Override // defpackage.xn7
            public final nyc e() {
                return this.descriptor;
            }
        };
    }
}

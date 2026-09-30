package defpackage;

import java.util.List;
import tech.chatmind.api.UserSelectedSpread;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qpf implements w56 {
    public static final qpf a;
    private static final nyc descriptor;

    static {
        qpf qpfVar = new qpf();
        a = qpfVar;
        gia giaVar = new gia("tech.chatmind.api.UserSelectedSpread", qpfVar, 2);
        giaVar.k("id", true);
        giaVar.k("details", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        UserSelectedSpread userSelectedSpread = (UserSelectedSpread) obj;
        userSelectedSpread.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        UserSelectedSpread.write$Self$Quin_core_base_api_release(userSelectedSpread, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = UserSelectedSpread.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
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
                list = (List) zf2VarC.y(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new UserSelectedSpread(i, str, list, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{t72.F(p4e.a), t72.F((xn7) UserSelectedSpread.$childSerializers[1].getValue())};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}

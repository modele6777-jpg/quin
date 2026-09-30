package defpackage;

import tech.chatmind.api.CountType;
import tech.chatmind.api.CountV2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tw2 implements w56 {
    public static final tw2 a;
    private static final nyc descriptor;

    static {
        tw2 tw2Var = new tw2();
        a = tw2Var;
        gia giaVar = new gia("tech.chatmind.api.CountV2", tw2Var, 3);
        giaVar.k("type", true);
        giaVar.k("usedCount", false);
        giaVar.k("totalCount", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        CountV2 countV2 = (CountV2) obj;
        countV2.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        CountV2.write$Self$Quin_core_base_api_release(countV2, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = CountV2.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        int iT2 = 0;
        CountType countType = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                countType = (CountType) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), countType);
                i |= 1;
            } else if (iJ == 1) {
                iT = zf2VarC.t(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                iT2 = zf2VarC.t(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new CountV2(i, countType, iT, iT2, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        c77 c77Var = c77.a;
        return new xn7[]{CountV2.$childSerializers[0].getValue(), c77Var, c77Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}

package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wy9 implements w56 {
    public static final wy9 a;
    private static final nyc descriptor;

    static {
        wy9 wy9Var = new wy9();
        a = wy9Var;
        gia giaVar = new gia("ai.askquin.qa.bridge.ParamSpec", wy9Var, 4);
        giaVar.k("name", false);
        giaVar.k("type", false);
        giaVar.k("required", true);
        giaVar.k("default", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ParamSpec paramSpec = (ParamSpec) obj;
        paramSpec.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ParamSpec.write$Self$Quin_qa_bridge(paramSpec, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = ParamSpec.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String strO = null;
        ParamType paramType = null;
        nh7 nh7Var = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                paramType = (ParamType) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), paramType);
                i |= 2;
            } else if (iJ == 2) {
                z2 = zf2VarC.z(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                nh7Var = (nh7) zf2VarC.y(nycVar, 3, qh7.a, nh7Var);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new ParamSpec(i, strO, paramType, z2, nh7Var, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a, ParamSpec.$childSerializers[1].getValue(), g11.a, t72.F(qh7.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}

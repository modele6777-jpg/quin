package defpackage;

import ai.askquin.qa.bridge.CapabilityDescriptor;
import ai.askquin.qa.bridge.Danger;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bm1 implements w56 {
    public static final bm1 a;
    private static final nyc descriptor;

    static {
        bm1 bm1Var = new bm1();
        a = bm1Var;
        gia giaVar = new gia("ai.askquin.qa.bridge.CapabilityDescriptor", bm1Var, 6);
        giaVar.k("id", false);
        giaVar.k("title", false);
        giaVar.k("namespacePath", false);
        giaVar.k("leaf", false);
        giaVar.k("danger", false);
        giaVar.k("params", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        CapabilityDescriptor capabilityDescriptor = (CapabilityDescriptor) obj;
        capabilityDescriptor.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        CapabilityDescriptor.write$Self$Quin_qa_bridge(capabilityDescriptor, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = CapabilityDescriptor.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        List list = null;
        String strO3 = null;
        Danger danger = null;
        List list2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = zf2VarC.o(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    strO3 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    danger = (Danger) zf2VarC.s(nycVar, 4, (xn7) lw7VarArr[4].getValue(), danger);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) zf2VarC.s(nycVar, 5, (xn7) lw7VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new CapabilityDescriptor(i, strO, strO2, list, strO3, danger, list2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = CapabilityDescriptor.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, lw7VarArr[2].getValue(), p4eVar, lw7VarArr[4].getValue(), lw7VarArr[5].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}

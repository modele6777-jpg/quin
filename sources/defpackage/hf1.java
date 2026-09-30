package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface hf1 {
    static nu3 b(gg1 gg1Var, th thVar, uh uhVar, vr0 vr0Var, List list, List list2, List list3, int i) {
        th thVar2 = (i & 1) != 0 ? null : thVar;
        uh uhVar2 = (i & 2) != 0 ? null : uhVar;
        vr0 vr0Var2 = (i & 4) != 0 ? null : vr0Var;
        List list4 = (i & 8) != 0 ? null : list;
        List list5 = (i & 16) != 0 ? null : list2;
        List list6 = (i & 32) != 0 ? null : list3;
        if (!gg1Var.a.a()) {
            return ho2.b(gg1Var.c, thVar2, uhVar2, vr0Var2, null, list4, list5, list6, 8);
        }
        r82.e(gg1Var, " after close.", "Cannot call update3A on ");
        return null;
    }
}

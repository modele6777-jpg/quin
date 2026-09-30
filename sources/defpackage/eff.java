package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eff extends aff {
    @Override // defpackage.aff
    public final cff a(Object obj) {
        v56 v56Var = (v56) obj;
        cff cffVar = v56Var.unknownFields;
        if (cffVar != cff.f) {
            return cffVar;
        }
        cff cffVar2 = new cff(0, new int[8], new Object[8], true);
        v56Var.unknownFields = cffVar2;
        return cffVar2;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q59 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vuc b;

    public /* synthetic */ q59(vuc vucVar, int i) {
        this.a = i;
        this.b = vucVar;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        vuc vucVar = this.b;
        switch (i) {
            case 0:
                guc gucVar = (guc) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int iIntValue = ((Integer) obj3).intValue();
                ((Boolean) obj4).getClass();
                boolean z = vucVar.c;
                if (zBooleanValue) {
                    return z ? gucVar.c(iIntValue, 0) : gucVar.c(iIntValue, gucVar.f.a.a.b.length());
                }
                return z ? gucVar.c(gucVar.f.a.a.b.length(), iIntValue) : gucVar.c(0, iIntValue);
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ((Integer) obj3).getClass();
                boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
                vuc vucVarD = ((x59) obj).d();
                if (vucVarD == null) {
                    return null;
                }
                uuc uucVar = vucVarD.b;
                uuc uucVar2 = vucVarD.a;
                if (zBooleanValue2) {
                    uuc uucVar3 = vucVar.a;
                    return zBooleanValue3 ? new vuc(uucVar3, uucVar2, true) : new vuc(uucVar3, uucVar, false);
                }
                uuc uucVar4 = vucVar.b;
                return zBooleanValue3 ? new vuc(uucVar, uucVar4, true) : new vuc(uucVar2, uucVar4, false);
        }
    }
}

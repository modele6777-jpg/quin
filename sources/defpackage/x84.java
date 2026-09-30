package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x84 implements u47 {
    @Override // defpackage.u47
    public final void a(une uneVar) {
        q0a q0aVar = uneVar.c;
        if (q0aVar.length() <= 6) {
            for (int i = 0; i < q0aVar.length(); i++) {
                if (Character.isDigit(q0aVar.charAt(i))) {
                }
            }
            return;
        }
        uneVar.e();
    }
}

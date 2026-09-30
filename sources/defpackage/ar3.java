package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ar3 implements npa {
    public final /* synthetic */ int a;

    @Override // defpackage.npa
    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            case 1:
                return ((String) obj) != null;
            default:
                x87 x87Var = (x87) obj;
                return x87Var.b.equals("com.apple.iTunes") && x87Var.c.equals("iTunSMPB");
        }
    }
}

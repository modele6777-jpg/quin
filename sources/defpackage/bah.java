package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bah extends qpg {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bah(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // defpackage.qpg
    public final vqg b(kxa kxaVar, List list) {
        int i = this.c;
        grg grgVar = vqg.v0;
        switch (i) {
            case 0:
                return grgVar;
            case 1:
            case 2:
                return this;
            case 3:
                return new vog(Double.valueOf(0.0d));
            default:
                return grgVar;
        }
    }
}

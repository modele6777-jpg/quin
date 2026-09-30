package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kx extends m4 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx(List list, int i) {
        super(2, list);
        this.c = i;
    }

    @Override // defpackage.sx
    public final du0 c0() {
        switch (this.c) {
            case 0:
                return new f82((List) this.b, 0);
            case 1:
                return new xc6((List) this.b, 0);
            case 2:
                return new f82((List) this.b, 2);
            case 3:
                return new xc6((List) this.b, 1);
            case 4:
                return new xc6((List) this.b, 2);
            case 5:
                return new h5d((List) this.b);
            default:
                return new f82((List) this.b, 3);
        }
    }
}

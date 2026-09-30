package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uwg extends oxg {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ vxg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwg(vxg vxgVar, String str, int i) {
        super(vxgVar, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = str;
                Objects.requireNonNull(vxgVar);
                this.g = vxgVar;
                super(vxgVar, true);
                break;
            case 2:
                this.f = str;
                Objects.requireNonNull(vxgVar);
                this.g = vxgVar;
                super(vxgVar, true);
                break;
            default:
                this.f = str;
                Objects.requireNonNull(vxgVar);
                this.g = vxgVar;
                break;
        }
    }

    @Override // defpackage.oxg
    public final void a() {
        switch (this.e) {
            case 0:
                mug mugVar = this.g.f;
                oa7.A(mugVar);
                mugVar.setUserId(this.f, this.a);
                break;
            case 1:
                mug mugVar2 = this.g.f;
                oa7.A(mugVar2);
                mugVar2.beginAdUnitExposure(this.f, this.b);
                break;
            default:
                mug mugVar3 = this.g.f;
                oa7.A(mugVar3);
                mugVar3.endAdUnitExposure(this.f, this.b);
                break;
        }
    }
}
